<%-- 
    Document   : header
    Created on : Apr 2, 2017, 2:34:50 PM
    Author     : omri
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="app">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Samp Web Project</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous">
        </script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css?family=Palanquin:500" rel="stylesheet">
        <style>
            <%@ include file="../css/custom_css_v1.css" %>
        </style>
    </head>
    <body ng-controller="ctrl">
        <nav class="navbar navbar-inverse navbar-static-top">
            <ul class="nav navbar-nav">

                <li><a href="/">Home</a></li>
                <li><a href="/products">products</a></li>
                <% if(request.getSession(false).getAttribute("user") != null){
                        String output ="<li class=\"right-nav-item\"><a href=\"/logout\">logout</a><span>";
                        output += " logged as " + request.getSession(false).getAttribute("user");
                        output += "</span></li>";
                        out.println(output);
                    }
                    else{
                        out.println("<li class=\"right-nav-item\"><a href=\"/login\">login</a></li>");
                        out.println("<li class=\"right-nav-item\"><a href=\"/register\">register</a></li>");
                    }
                %>
                
            </ul>
        </nav>
                
                <% if(request.getAttribute("userMessage") != null){ %>
                <p class="usermessage badinput-message"><%out.print(request.getAttribute("userMessage"));%></p>
                <%}%>
                
                        
        
            

