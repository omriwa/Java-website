<%-- 
    Document   : products
    Created on : Apr 3, 2017, 2:59:08 PM
    Author     : omri
--%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ include file="../WEB-INF/partials/header.jsp" %>
<script>
    <%@include file="..//WEB-INF/javascript/itemGalleryScript.js" %>
    <%@include file="..//WEB-INF/javascript/appController.js" %>
</script>
<div class="container"><!-- context -->
    
    <div class="row">
        
        <div class="col-md-2"><!-- menu -->
            <ul id="shopMenu">
                <li id="shopHeadLine">Menu</li>
                <li class="menu-option btn">Sizes <span class="badge label label-info">5</span></li>
                <li class="menu-option btn">Materials <span class="badge label label-info">5</span></li>
                <li class="menu-option btn">Tunnels <span class="badge label label-info">5</span></li>
                <li class="menu-option btn">Plugs <span class="badge label label-info">5</span></li>
                <li class="menu-option btn">Colors <span class="badge label label-info">5</span></li>
                <li class="menu-option btn">Price</li>
            </ul>
        </div>
        
        <div class="col-md-9"><!-- items view -->
            <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                  url="jdbc:mysql://localhost:3306/webdatabase"
                  user="root"  password="root"
            />
            <sql:query dataSource="${db}" var="items">
                SELECT * FROM items;
            </sql:query>
            
            <div class="row" id="itemsGallery">        
                <c:forEach var="item" items="${items.rows}">
                    <p></p>
                <div class="col-md-3 thumbnail item-box">
                    
                        <div class="thumbnail item-image">
                            <img src="<c:out value="${item.pic}"></c:out>">
                        </div>
                    
                        <div class="item-info"><!-- item info -->
                            <h4><c:out value="${item.name}"/></h4>
                            <p><c:out value="${item.info}"></c:out></p>
                            <p>Material: <c:out value="${item.material}"></c:out></p>
                            <p>Price: <c:out value="${item.price}"></c:out></p>
                        </div>

                        <div class="item-buttons"><!-- buttons -->
                            <button class="btn btn-md btn-info">Info</button>
                            <button class="btn btn-md btn-default">
                                    Add To Cart<span class="glyphicon glyphicon-shopping-cart"></span>
                            </button>
                        </div>
                                
                </div>           
            </c:forEach>                
            </div>
            
        </div>
        
    </div>
    
</div>
<%@ include file="../WEB-INF/partials/footer.jsp" %>
