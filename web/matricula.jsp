<%-- 
    Document   : matricula
    Created on : 29-oct-2019, 17:52:18
    Author     : zebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="Templates/head.jsp"></jsp:include>
    <%
        int code = 0;
        String message = "";
        if (request.getAttribute("statusCode") != null) {
            code = Integer.parseInt(request.getAttribute("statusCode").toString());
        }
        if (request.getAttribute("statusMessage") != null) {
            message = request.getAttribute("statusMessage").toString();
        }
    %>
    <body>
        <jsp:include page="Templates/menu.jsp"></jsp:include>
        <%%>
        <div class="ui grid matriculaOption">
            <div class="three wide column"></div>
            <div class="ten wide column">           
                <h1 class="ui header">Matricula</h1>
                <div class="ui placeholder segment">                    
                    <div class="ui two column stackable center aligned grid">
                        <div class="ui vertical divider">or</div>
                        <div class="middle aligned row">
                            <div class="column">
                                <div class="ui icon grey header">
                                    <i class="search icon"></i>
                                    Continuar llenando Registro
                                </div>
                                <div class="field">
                                    <form action="MatriculaController" method="get">
                                        <div class="ui search">                                        
                                            <div class="ui small action input">                                            
                                                <input type="text" placeholder="Numero de Registro" id="idRegistro" name="idRegistro">
                                                <button class="ui icon teal button" id="action" value="3" name="action">
                                                    <i class="search icon"></i>
                                                </button>                                            
                                            </div>                                        
                                        </div>
                                    </form>
                                </div>                                
                            </div>
                            <div class="column">
                                <div class="ui icon grey header">
                                    <i class="edit outline icon"></i>
                                    Nuevo Registro
                                </div>
                                <button class="ui teal button" onclick="window.location.href = '<%=request.getContextPath()%>/registroMatricula.jsp'">
                                    Continuar
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="three wide column"></div>
        </div>

        <div class="ui small basic modal formCompleted">
            <div class="ui icon header">
                <i class="inverted teal big clipboard check icon"></i>
                Informacion de Registro
            </div>
            <div class="content">
                <p><%out.print(message);%></p>
            </div>
            <div class="actions">                
                <div class="ui teal ok inverted button">
                    <i class="checkmark icon"></i>
                    Entendido
                </div>
            </div>
        </div>

        <script type="text/javascript">
            <%
                if (code == 1 || code == 2) {
            %>
            $('.basic.formCompleted.modal')
                    .modal('setting', 'closable', false)
                    .modal('show')
                    ;
            <%
                } else if (code == 3) {

                }
            %>
        </script>
    </body>
</html>
