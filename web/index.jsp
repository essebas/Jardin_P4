<%-- 
    Document   : index
    Created on : 18-oct-2019, 13:53:10
    Author     : zebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="Templates/head.jsp"></jsp:include>
        <body>
        <jsp:include page="Templates/menu.jsp"></jsp:include>
        <div class="ui fluid container indexp">
            <div class="ui very padded segment">
                <h1 class="ui teal header">¡Matriculas Abiertas!</h1>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient</p>
                <button class="ui teal button" onclick="window.location.href='<%=request.getContextPath()%>/matricula.jsp'">
                    <i class="icon user"></i>
                    Comenzar Registro
                </button>
            </div>
        </div>
    </body>
</html>
