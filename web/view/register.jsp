<%-- 
    Document   : register
    Created on : Apr 1, 2017, 5:38:07 PM
    Author     : omri
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "../WEB-INF/partials/header.jsp"%>
<script>
    <%@include file="../WEB-INF/javascript/regFormValid.js" %>
</script>
        <div class="fluid-container">
            
            <div class="form-box"><!--form div-->
                
                <form>
                    <input class="form-control" type="email" name="username" placeholder="choose email as username">
                    <input class="form-control" type="password" placeholder="password" name="password">
                    <button class="btn btn-default" onclick="sendRegForm()">Register</button>
                </form>
                
            </div>    
            
        </div>
<%@include file = "../WEB-INF/partials/footer.jsp" %>
