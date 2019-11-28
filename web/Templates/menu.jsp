<%-- 
    Document   : menu
    Created on : 18-oct-2019, 13:48:18
    Author     : zebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="ui teal five item inverted menu">
    <a class="item">Español</a>
    <a class="item">+57 311905843</a>
    <a class="item">smarty@example.com</a>
    <a class="item">Lun — Vie: 8.00 AM — 18.00 PM</a>
    <a class="item" href="<%=request.getContextPath()%>/login.jsp">Login</a>
</div>
<div class="ui basic segment indexmenu">    
    <img class="ui small image" src="<%=request.getContextPath()%>/img/logo.svg">
    <!--<div class="ui teal secondary menu">                
        <div class="item">
            <a class="header" href="#">Inicio</a>
        </div>
        <div class="item">
            <a class="header" href="#">Programas</a>
        </div>
        <div class="item">
            <a class="header" href="#">Clases</a>
        </div>
        <div class="item">
            <a class="header" href="#">Noticias</a>
        </div>
        <div class="item">
            <a class="header" href="#">Eventos</a>
        </div>
        <div class="item">
            <a class="header" href="#">Contacto</a>
        </div>        
    </div>-->
    <div class="ui grid">
        <div class="six column row">
            <div class="column">
                <a class="header" href="<%=request.getContextPath()%>/index.jsp">Inicio</a>
            </div>
            <div class="column">
                <a class="header" href="#">Programas</a>
            </div>
            <div class="column">
                <a class="header" href="#">Clases</a>
            </div>
            <div class="column">
                <a class="header" href="#">Noticias</a>
            </div>
            <div class="column">
                <a class="header" href="#">Eventos</a>
            </div>
            <div class="column">
                <a class="header" href="#">Contacto</a>
            </div>
        </div>
    </div>
</div>

