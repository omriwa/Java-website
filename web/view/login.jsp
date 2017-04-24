<%-- 
    Document   : login
    Created on : Apr 1, 2017, 5:36:26 PM
    Author     : omri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "../WEB-INF/partials/header.jsp"%>
        <div class="fluid-container">
            
            <div class="form-box">
                
                <form action="/login" method="POST">
                    <input class="form-control" type="text" placeholder="user name" name="username">
                    <input class="form-control" type="password" placeholder="password" name="password">
                    <div>Remember Me <input type="checkbox" name="remember_me" value="true"></div>
                    <button class="btn btn-default" type="submit">Login</button>
                </form>
                
            </div>
            
        </div>
<%@include file = "../WEB-INF/partials/footer.jsp" %>

