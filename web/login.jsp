<%-- 
    Document   : login
    Created on : 29-oct-2019, 17:01:04
    Author     : zebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="Templates/head.jsp"></jsp:include>
        <body>
        <jsp:include page="Templates/menu.jsp"></jsp:include>
        <div class="ui grid loginForm">
            <div class="four wide column"></div>
            <div class="eight wide column">                
                <div class="ui teal segment">                    
                    <h1 class="ui header">Login</h1>
                    <form class="ui form">                        
                        <div class="field">
                            <label>Correo</label>
                            <input type="text" name="first-name" placeholder="example@example.com">
                        </div>
                        <div class="field">
                            <label>Contraseña</label>
                            <input type="text" name="Correo" placeholder="****">
                        </div>
                        <div class="field">
                            <div class="ui checkbox">
                                <input type="checkbox" tabindex="0" class="hidden">
                                <label>Recordar mis datos</label>
                            </div>
                        </div>
                        <label class="rememberPass"><a href="#">¿Olvidaste tu contraseña?</a></label>
                        <button class="ui right floated teal button" type="submit">Ingresar</button>
                    </form>
                </div>
            </div>
            <div class="four wide column"></div>
        </div>        
    </body>
</html>
