/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omri
 */
public class DatabaseConnector {
    
    private Connection connection = null;
    private Statement state = null;
    private String databaseUrl = null , username = null , password = null;
    
    public DatabaseConnector(String url ,String userN , String pass){
        databaseUrl = url;
        username = userN;
        password = pass;
        //make connection
        try{
            connection = DriverManager.getConnection(databaseUrl , username , password);
        }
        catch(SQLException e){//connection faild
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
    }
    
    public boolean writeQuery(String query){
        if(connection != null){
            try {
                state = connection.createStatement();
                state.execute(query);
                return true;
            } 
            catch (SQLException ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
            
        else{
            return false;
        }
    }
    /*check if user exists , if yes return 1 if not 0  and error -1*/
    public int isUserExists(String query){
        if(connection != null){
            try {
                state = connection.createStatement();
                ResultSet rs = state.executeQuery(query);
                if(rs.first())
                    return 1;
                else
                    return 0;
            } 
            catch (SQLException ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
                return -1;
            }
            
        }
            
        else{
            return -1;
        }
    }
    
    public void closeConnection(){
        try {
            connection.close();
            try {
                this.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getRecords(String query){
        try{
            state = connection.createStatement();
            return state.executeQuery(query);
        }
        catch(Exception e){
            return null;
        }
    }
    
}
