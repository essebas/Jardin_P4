<%-- 
    Document   : registroMatricula
    Created on : 30-oct-2019, 15:33:43
    Author     : zebas
--%>

<%@page import="Modelo.TempMatricula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="Templates/head.jsp"></jsp:include>
    <%
        String[] kidNames = new String[0];
        String[] kidLastNames = null;
        String[] motherNames = null;
        String[] motherLastNames = null;
        int code = 0;
        TempMatricula tm = null;
        if (request.getAttribute("code") != null) {
            code = Integer.parseInt(request.getAttribute("code").toString());
            if (code == 3) {
                tm = (TempMatricula) request.getAttribute("datosTemp");
            }
        }
    %>
    <body>
        <jsp:include page="Templates/menu.jsp"></jsp:include>
        <%%>
        <div class="ui grid matricula">
            <div class="three wide column"></div>
            <input hidden="" value="" id="idRegistro" name="idRegistro">
            <div class="ten wide column">
                <!-- Steps -->
                <div class="ui five top attached ordered steps">
                    <a class="active step" data-tab="first" 
                       data-html="<h3 class='ui header'>
                       <i class='yellow exclamation triangle icon'></i>
                       <div class='content'>
                       Te faltan datos
                       </div>
                       </h3>">
                        <div class="content">
                            <div class="title">Niño</div>
                            <div class="description">Texto de ayuda</div>
                        </div>
                    </a>
                    <a class=" step" data-tab="second" 
                       data-html="<h3 class='ui header'>
                       <i class='yellow exclamation triangle icon'></i>
                       <div class='content'>
                       Te faltan datos
                       </div>
                       </h3>">
                        <div class="content">
                            <div class="title">Madre</div>
                            <div class="description">Texto de ayuda</div>
                        </div>
                    </a>
                    <a class=" step" data-tab="third" 
                       data-html="<h3 class='ui header'>
                       <i class='yellow exclamation triangle icon'></i>
                       <div class='content'>
                       Te faltan datos
                       </div>
                       </h3>">
                        <div class="content">
                            <div class="title">Padre</div>
                            <div class="description">Texto de ayuda</div>
                        </div>
                    </a>
                    <a class=" step" data-tab="fourth" 
                       data-html="<h3 class='ui header'>
                       <i class='yellow exclamation triangle icon'></i>
                       <div class='content'>
                       Te faltan datos
                       </div>
                       </h3>">
                        <div class="content">
                            <div class="title">Acudiente</div>
                            <div class="description">Texto de ayuda</div>
                        </div>
                    </a>
                    <a class=" step" data-tab="fifth" 
                       data-html="<h3 class='ui header'>
                       <i class='yellow exclamation triangle icon'></i>
                       <div class='content'>
                       Te faltan datos
                       </div>
                       </h3>">
                        <div class="content">
                            <div class="title">Adjuntos</div>
                            <div class="description">Texto de ayuda</div>
                        </div>
                    </a>
                </div>
                <!-- Steps -->     

                <!-- Kid Form -->
                <div class="ui bottom attached active tab segment" data-tab="first">
                    <div class="ui form matriculaForm">
                        <div class="ui error message"></div>
                        <h3 class="ui dividing header">
                            Datos del Infante:
                        </h3>
                        <div class="ui segment">                                
                            <h4 class='ui header'>
                                <i class='yellow exclamation triangle icon'></i>
                                <div class='content'>
                                    Este campo es opcional
                                </div>
                            </h4>                                
                            <div class="inline fields" id="radioFamilyCondition">
                                <label>Seleccione una opcion en caso de ser:</label>
                                <div class="field">
                                    <div class="ui radio checkbox optional">
                                        <input type="radio" name="familyCon" value="1" tabindex="0" class="hidden">
                                        <label>Madre cabeza de hogar</label>
                                    </div>
                                </div>
                                <div class="field">
                                    <div class="ui radio checkbox optional">
                                        <input type="radio" name="familyCon" value="2" tabindex="0" class="hidden">
                                        <label>Padre cabeza de hogar</label>
                                    </div>
                                </div>
                                <div class="field">
                                    <div class="ui radio checkbox optional">
                                        <input type="radio" name="familyCon" value="3" tabindex="0" class="hidden" checked="checked">
                                        <label>Ninguna</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <label>Nombres:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="fName" id="fName" placeholder="Primer Nombre" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidName());
                                               } %>"/>
                                </div>
                                <div class="field">
                                    <input type="text" name="sName" id="sName" placeholder="Segundo Nombre" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidName2());
                                               }%>">
                                </div>
                            </div>                            
                        </div>
                        <div class="field">
                            <label>Apellidos:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="fLastname" id="fLastname" placeholder="Primer Apellido" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidLastname());
                                               }%>">
                                </div>
                                <div class="field">
                                    <input type="text" name="sLastname" id="sLastname" placeholder="Segundo Apellido" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidLastname2());
                                               }%>">
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <div class="two fields">
                                <div class="field">
                                    <label>Fecha Nacimiento:</label>
                                    <div class="ui calendar pickerDate">
                                        <div class="ui input left icon">
                                            <i class="calendar icon"></i>
                                            <input type="text" placeholder="Fecha" readonly="true" id="kDate" name="kDate" 
                                                   value="<%if (code == 3 && tm.getKidDate() != null) {
                                                           out.print(tm.getKidDate().toString());
                                                       }%>">
                                        </div>
                                    </div>
                                </div>
                                <div class="field">
                                    <label>Lugar de Nacimiento:</label>
                                    <div class="ui selection dropdown">
                                        <input type="hidden" name="kLugarNacimiento" id="kLugarNacimiento" 
                                               value="<%if (code == 3) {
                                                       out.print(tm.getKidBirthLocation());
                                                   }%>">
                                        <i class="dropdown icon"></i>
                                        <div class="default text" data-value="0">Seleccione...</div>
                                        <div class="menu">
                                            <div class="item" data-value="Bogota">Bogota</div>
                                            <div class="item" data-value="Medellin">Medellin</div>
                                        </div>
                                    </div>
                                </div>
                            </div>                            
                        </div>
                        <div class="fields">
                            <div class="four wide field">
                                <label>Tipo de Documento:</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="kDocumentType" id="kDocumentType" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidDocumentType());
                                               }%>">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Tarjeta de Identidad</div>
                                        <div class="item" data-value="2">Cedula de Ciudadania</div>
                                        <div class="item" data-value="3">Cedula de Extrajeria</div>
                                    </div>
                                </div>
                            </div>
                            <div class="six wide field">
                                <label>Numero de Documento:</label>
                                <input type="text" name="kDocument" placeholder="" id="kDocument" 
                                       value="<%if (code == 3) {
                                               out.print(tm.getKidDocument());
                                           }%>">
                            </div>                            
                            <div class="two wide field">
                                <label>RH:</label>
                                <input type="text" name="kRH" maxlength="16" placeholder="" id="kRH" 
                                       value="<%if (code == 3) {
                                               out.print(tm.getKidRH());
                                           }%>">
                            </div>
                            <div class="four wide field">
                                <label>Genero:</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="kGenero" id="kGenero" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidGenero());
                                               }%>">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Masculino</div>
                                        <div class="item" data-value="2">Femenino</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <label>Direccion de Recidencia</label>
                            <input type="text" name="kDirection" placeholder="Direccion - Torre - Apartamento" id="kDirection" 
                                   value="<%if (code == 3) {
                                           out.print(tm.getKidDirection());
                                       }%>">
                        </div>
                        <button class="ui right floated teal button" id="btnNextK">Siguiente</button>
                        <button class="ui right floated blue button" id="btnSaveK">Guardar</button>                        
                    </div>
                </div>
                <!-- Kid Form -->

                <!-- Mother Form -->
                <div class="ui bottom attached tab segment" data-tab="second">                    
                    <div class="ui form matriculaFormM">
                        <div class="ui error message"></div>
                        <h3 class="ui dividing header">
                            Datos de la Madre: 
                        </h3>
                        <div class="field">
                            <label>Nombres:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="mName" id="mName" placeholder="Primer Nombre">
                                </div>
                                <div class="field">
                                    <input type="text" name="mName2" id="mName2" placeholder="Segundo Nombre">
                                </div>
                            </div>                            
                        </div>
                        <div class="field">
                            <label>Apellidos:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="mLastName" id="mLastName" placeholder="Primer Apellido">
                                </div>
                                <div class="field">
                                    <input type="text" name="mLastName2" id="mLastName2" placeholder="Segundo Apellido">
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <div class="two fields">
                                <div class="field">
                                    <label>Fecha Nacimiento:</label>
                                    <div class="ui calendar pickerDate">
                                        <div class="ui input left icon">
                                            <i class="calendar icon"></i>
                                            <input type="text" placeholder="Fecha" readonly="true" id="mDate" name="mDate" 
                                                   value="<%if (code == 3 && tm.getKidDate() != null) {
                                                           out.print(tm.getKidDate().toString());
                                                       }%>">
                                        </div>
                                    </div>
                                </div>
                                <div class="field">
                                    <label>Lugar de Nacimiento:</label>
                                    <div class="ui selection dropdown">
                                        <input type="hidden" name="mLugarNacimiento" id="mLugarNacimiento" 
                                               value="<%if (code == 3) {
                                                       out.print(tm.getKidBirthLocation());
                                                   }%>">
                                        <i class="dropdown icon"></i>
                                        <div class="default text" data-value="0">Seleccione...</div>
                                        <div class="menu">
                                            <div class="item" data-value="Bogota">Bogota</div>
                                            <div class="item" data-value="Medellin">Medellin</div>
                                        </div>
                                    </div>
                                </div>    
                            </div>
                        </div>
                        <div class="fields">
                            <div class="four wide field">
                                <label>Tipo de Documento:</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="mDocumentType" id="mDocumentType">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Tarjeta de Identidad</div>
                                        <div class="item" data-value="2">Cedula de Ciudadania</div>
                                        <div class="item" data-value="3">Cedula de Extrajeria</div>
                                    </div>
                                </div>
                            </div>
                            <div class="six wide field">
                                <label>Numero de Documento:</label>
                                <input type="text" name="mDocument" id="mDocument" placeholder="">
                            </div>                            
                            <div class="six wide field">
                                <label>RH:</label>
                                <input type="text" name="mRH" id="mRH" placeholder="">
                            </div>                            
                        </div>
                        <div class="fields">
                            <div class="six wide field">
                                <label>Telefono:</label>
                                <input type="number" name="mPhone" id="mPhone" placeholder="">
                            </div>
                            <div class="ten wide field">
                                <label>Correo:</label>
                                <input type="email" name="mEmail" id="mEmail" placeholder="example@example.com">
                            </div>
                        </div>                        
                        <div class="field">
                            <label>Direccion de Recidencia</label>
                            <input type="text" name="mDirection" placeholder="Direccion - Torre - Apartamento" id="mDirection" 
                                   value="<%if (code == 3) {
                                           out.print(tm.getKidDirection());
                                       }%>">
                        </div>                        
                        <div class="inline fields" id="radioEmployer">
                            <label>Condicion Laboral:</label>
                            <div class="field">
                                <div class="ui radio checkbox employ">
                                    <input type="radio" name="empleo" value="1" tabindex="0" class="hidden">
                                    <label>Empleado</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox employ">
                                    <input type="radio" name="empleo" value="2" tabindex="0" class="hidden">
                                    <label>Desempleado</label>
                                </div>
                            </div>
                        </div>

                        <div class="ui segment employer">
                            <div class="fields">
                                <div class="ten wide field">
                                    <label>Cargo o labor realizada:</label>
                                    <input type="text" name="mEmployerType" id="mEmployerType" placeholder="Analista, Ingenier@, Contador@, ... etc">
                                </div>
                                <div class="six wide field">
                                    <label>Salario:</label>
                                    <input type="number" name="mSalary" id="mSalary" placeholder="2000000">
                                </div>
                            </div>
                        </div>

                        <button class="ui labeled icon teal basic button" id="btnPrevM">
                            <i class="bordered inverted teal left arrow icon"></i>
                            Regresar
                        </button>
                        <button class="ui right floated teal button" id="btnNextM">Siguiente</button>
                        <button class="ui right floated blue button" id="btnSaveM">Guardar</button>
                    </div>
                </div>
                <!-- Mother Form -->

                <!-- Father Form -->
                <div class="ui bottom attached tab segment" data-tab="third">
                    <div class="ui form matriculaFormP">
                        <div class="ui error message"></div>
                        <h3 class="ui dividing header">
                            Datos del Padre:
                        </h3>
                        <div class="field">
                            <label>Nombres:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="fName" id="fName" placeholder="Primer Nombre">
                                </div>
                                <div class="field">
                                    <input type="text" name="fName2" id="fName2" placeholder="Segundo Nombre">
                                </div>
                            </div>                            
                        </div>
                        <div class="field">
                            <label>Apellidos:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="fLastName" id="fLastName" placeholder="Primer Apellido">
                                </div>
                                <div class="field">
                                    <input type="text" name="fLastName2" id="fLastName2" placeholder="Segundo Apellido">
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <div class="two fields">
                                <div class="field">
                                    <label>Fecha Nacimiento:</label>
                                    <div class="ui calendar pickerDate">
                                        <div class="ui input left icon">
                                            <i class="calendar icon"></i>
                                            <input type="text" placeholder="Fecha" readonly="true" id="fDate" name="fDate" 
                                                   value="<%if (code == 3 && tm.getKidDate() != null) {
                                                           out.print(tm.getKidDate().toString());
                                                       }%>">
                                        </div>
                                    </div>
                                </div>
                                <div class="field">
                                    <label>Lugar de Nacimiento:</label>
                                    <div class="ui selection dropdown">
                                        <input type="hidden" name="fLugarNacimiento" id="fLugarNacimiento" 
                                               value="<%if (code == 3) {
                                                       out.print(tm.getKidBirthLocation());
                                                   }%>">
                                        <i class="dropdown icon"></i>
                                        <div class="default text" data-value="0">Seleccione...</div>
                                        <div class="menu">
                                            <div class="item" data-value="Bogota">Bogota</div>
                                            <div class="item" data-value="Medellin">Medellin</div>
                                        </div>
                                    </div>
                                </div>    
                            </div>
                        </div>
                        <div class="fields">
                            <div class="four wide field">
                                <label>Tipo de Documento:</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="fDocumentType" id="fDocumentType">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Tarjeta de Identidad</div>
                                        <div class="item" data-value="2">Cedula de Ciudadania</div>
                                        <div class="item" data-value="3">Cedula de Extrajeria</div>
                                    </div>
                                </div>
                            </div>
                            <div class="six wide field">
                                <label>Numero de Documento:</label>
                                <input type="text" name="fDocument" id="fDocument" placeholder="">
                            </div>                            
                            <div class="six wide field">
                                <label>RH:</label>
                                <input type="text" name="fRH" id="fRH" placeholder="">
                            </div>                            
                        </div>
                        <div class="fields">
                            <div class="six wide field">
                                <label>Telefono:</label>
                                <input type="number" name="fPhone" id="fPhone" placeholder="">
                            </div>
                            <div class="ten wide field">
                                <label>Correo:</label>
                                <input type="email" name="fEmail" id="fEmail" placeholder="example@example.com">
                            </div>
                        </div>
                        <div class="field">
                            <label>Direccion de Recidencia</label>
                            <input type="text" name="fDirection" placeholder="Direccion - Torre - Apartamento" id="fDirection" 
                                   value="<%if (code == 3) {
                                           out.print(tm.getKidDirection());
                                       }%>">
                        </div>
                        <div class="inline fields" id="fradioEmployer">
                            <label>Condicion Laboral:</label>
                            <div class="field">
                                <div class="ui radio checkbox employ">
                                    <input type="radio" name="fempleo" value="1" tabindex="0" class="hidden">
                                    <label>Empleado</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox employ">
                                    <input type="radio" name="fempleo" value="2" tabindex="0" class="hidden">
                                    <label>Desempleado</label>
                                </div>
                            </div>
                        </div>

                        <div class="ui segment fEmployer">
                            <div class="fields">
                                <div class="ten wide field">
                                    <label>Cargo o labor realizada:</label>
                                    <input type="text" name="fEmployerType" id="fEmployerType" placeholder="Analista, Ingenier@, Contador@, ... etc">
                                </div>
                                <div class="six wide field">
                                    <label>Salario:</label>
                                    <input type="number" name="fSalary" id="fSalary" placeholder="2000000">
                                </div>
                            </div>
                        </div>

                        <button class="ui labeled icon teal basic button" id="btnPrevF">
                            <i class="bordered inverted teal left arrow icon"></i>
                            Regresar
                        </button>                        
                        <button class="ui right floated teal button" id="btnNextP">Siguiente</button>
                        <button class="ui right floated blue button" id="btnSaveP">Guardar</button>
                    </div>
                </div>
                <!-- Father Form -->

                <!-- Accudient Form -->
                <div class="ui bottom attached tab segment" data-tab="fourth">                    
                    <div class="ui form matriculaFormA">
                        <div class="ui error message"></div>
                        <h3 class="ui dividing header">
                            Datos del Acudiente:
                        </h3>
                        <div class="field">
                            <label>Nombres:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="aName" id="aName" placeholder="Primer Nombre">
                                </div>
                                <div class="field">
                                    <input type="text" name="aName2" id="aName2" placeholder="Segundo Nombre">
                                </div>
                            </div>                            
                        </div>
                        <div class="field">
                            <label>Apellidos:</label>
                            <div class="two fields">
                                <div class="field">
                                    <input type="text" name="aLastName" id="aLastName" placeholder="Primer Apellido">
                                </div>
                                <div class="field">
                                    <input type="text" name="aLastName2" id="aLastName2" placeholder="Segundo Apellido">
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <div class="two fields">
                                <div class="field">
                                    <label>Fecha Nacimiento:</label>
                                    <div class="ui calendar pickerDate">
                                        <div class="ui input left icon">
                                            <i class="calendar icon"></i>
                                            <input type="text" placeholder="Fecha" readonly="true" id="aDate" name="aDate" 
                                                   value="<%if (code == 3 && tm.getKidDate() != null) {
                                                           out.print(tm.getKidDate().toString());
                                                       }%>">
                                        </div>
                                    </div>
                                </div>
                                <div class="field">
                                    <label>Lugar de Nacimiento:</label>
                                    <div class="ui selection dropdown">
                                        <input type="hidden" name="aLugarNacimiento" id="aLugarNacimiento" 
                                               value="<%if (code == 3) {
                                                       out.print(tm.getKidBirthLocation());
                                                   }%>">
                                        <i class="dropdown icon"></i>
                                        <div class="default text" data-value="0">Seleccione...</div>
                                        <div class="menu">
                                            <div class="item" data-value="Bogota">Bogota</div>
                                            <div class="item" data-value="Medellin">Medellin</div>
                                        </div>
                                    </div>
                                </div>    
                            </div>
                        </div>

                        <div class="fields">
                            <div class="four wide field">
                                <label>Tipo de Documento:</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="aDocumentType" id="aDocumentType" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidDocumentType());
                                               }%>">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Tarjeta de Identidad</div>
                                        <div class="item" data-value="2">Cedula de Ciudadania</div>
                                        <div class="item" data-value="3">Cedula de Extrajeria</div>
                                    </div>
                                </div>
                            </div>
                            <div class="six wide field">
                                <label>Numero de Documento:</label>
                                <input type="text" name="aDocument" placeholder="" id="aDocument" 
                                       value="<%if (code == 3) {
                                               out.print(tm.getKidDocument());
                                           }%>">
                            </div>                            
                            <div class="two wide field">
                                <label>RH:</label>
                                <input type="text" name="aRH" maxlength="3" placeholder="" id="aRH" 
                                       value="<%if (code == 3) {
                                               out.print(tm.getKidRH());
                                           }%>">
                            </div>
                            <div class="four wide field">
                                <label>Genero:</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="aGenero" id="aGenero" 
                                           value="<%if (code == 3) {
                                                   out.print(tm.getKidGenero());
                                               }%>">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Masculino</div>
                                        <div class="item" data-value="2">Femenino</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="fields">
                            <div class="six wide field">
                                <label>Telefono:</label>
                                <input type="number" name="aPhone" id="aPhone" placeholder="">
                            </div>
                            <div class="ten wide field">
                                <label>Correo:</label>
                                <input type="email" name="aEmail" id="aEmail" placeholder="example@example.com">
                            </div>
                        </div>
                        <div class="field">
                            <label>Direccion de Recidencia</label>
                            <input type="text" name="aDirection" placeholder="Direccion - Torre - Apartamento" id="aDirection" 
                                   value="<%if (code == 3) {
                                           out.print(tm.getKidDirection());
                                       }%>">
                        </div>   


                        <div class="field">
                            <label>Parentezco:</label>
                            <div class="ui selection dropdown">
                                <input type="hidden" name="parentezco" id="parentezco">
                                <i class="dropdown icon"></i>
                                <div class="default text">Seleccione...</div>
                                <div class="menu">
                                    <div class="item" data-value="1">Parentezto a</div>
                                    <div class="item" data-value="0">Parentezto b</div>
                                    <div class="item" data-value="2">Parentezto c</div>
                                </div>
                            </div>
                        </div>                            


                        <div class="two fields">
                            <div class="field">
                                <label>¿Condicion de desplazamiento?</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="desplazamiento" id="desplazamiento">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Ninguno</div>
                                        <div class="item" data-value="2">Dezplazamiento a</div>
                                        <div class="item" data-value="3">Dezplazamiento b</div>
                                    </div>
                                </div>
                            </div>

                            <div class="field">                                
                                <label>¿Pertenece a algun grupo etnico?</label>
                                <div class="ui selection dropdown">
                                    <input type="hidden" name="grupoE" id="grupoE">
                                    <i class="dropdown icon"></i>
                                    <div class="default text" data-value="0">Seleccione...</div>
                                    <div class="menu">
                                        <div class="item" data-value="1">Ninguno</div>
                                        <div class="item" data-value="2">Grupo a</div>
                                        <div class="item" data-value="3">Grupo b</div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="inline fields" id="aRedU">
                            <label for="fruit">¿Pertenece a RED UNIDOS?</label>
                            <div class="field">
                                <div class="ui radio checkbox form4">
                                    <input type="radio" name="redUnidos" value="0" tabindex="0" class="hidden">
                                    <label>NO</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox form4">
                                    <input type="radio" name="redUnidos" value="1" tabindex="0" class="hidden">
                                    <label>SI</label>
                                </div>
                            </div>                            
                        </div>

                        <div class="inline fields" id="aFamAcc">
                            <label for="fruit">¿Pertenece a FAMILIAS EN ACCION?</label>
                            <div class="field">
                                <div class="ui radio checkbox form4">
                                    <input type="radio" name="fAccion" tabindex="0" value="0" class="hidden">
                                    <label>NO</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox form4">
                                    <input type="radio" name="fAccion" tabindex="0" value="1" class="hidden">
                                    <label>SI</label>
                                </div>
                            </div>                            
                        </div>

                        <div class="inline fields" id="aRadioEmployer">
                            <label>Condicion Laboral:</label>
                            <div class="field">
                                <div class="ui radio checkbox employ">
                                    <input type="radio" name="aempleo" value="1" tabindex="0" class="hidden">
                                    <label>Empleado</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox employ">
                                    <input type="radio" name="aempleo" value="2" tabindex="0" class="hidden">
                                    <label>Desempleado</label>
                                </div>
                            </div>
                        </div>

                        <div class="ui segment aEmployer">
                            <div class="fields">
                                <div class="ten wide field">
                                    <label>Cargo o labor realizada:</label>
                                    <input type="text" name="aEmployerType" id="aEmployerType" placeholder="Analista, Ingenier@, Contador@, ... etc">
                                </div>
                                <div class="six wide field">
                                    <label>Salario:</label>
                                    <input type="number" name="aSalary" id="aSalary" placeholder="2000000">
                                </div>
                            </div>
                        </div>

                        <button class="ui labeled icon teal basic button" id="btnPrevA">
                            <i class="bordered inverted teal left arrow icon"></i>
                            Regresar
                        </button>
                        <button class="ui right floated teal button" id="btnNextA">Siguiente</button>
                        <button class="ui right floated blue button" id="btnSaveA">Guardar</button>
                    </div>
                </div>
                <!-- Accudient Form -->

                <!-- Attached Form-->
                <div class="ui bottom attached tab segment" data-tab="fifth">
                    <form class="ui form matriculaFormAtt" method="post" action="FileController" enctype="multipart/form-data">
                        <input hidden="" value="" id="idRegistro2" name="idRegistro2">
                        <div class="ui error message"></div>
                        <h3 class="ui dividing header">
                            Archivos adjuntos:
                        </h3>
                        <h4 class="ui header">Aspirante:</h4>
                        <!--<form method="post" action="FileController" enctype="multipart/form-data">-->
                        <input  hidden="true" value="0" id="idRegistro" name="idRegistro">
                        <div class="two fields">
                            <div class="field">
                                <label>Foto Aspirante:</label>

                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="image/*" id="file" name="file" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>                                                                       
                            </div>
                            <div class="field">
                                <label>Registro Civil:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>                                    
                                    <input type="file" accept="application/pdf" id="file2" name="file2" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>                            
                        <div class="two fields">
                            <div class="field">
                                <label>Certificado EPS:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file3" name="file3" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Carnet Vacunas:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file4" name="file4" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="field">
                            <label>Certificado Crecimiento Desarrollo:</label>
                            <div class="ui action mini input upDocument">
                                <input type="text" placeholder="Subir archivo..." readonly>
                                <input type="file" accept="application/pdf" id="file5" name="file5" size="30">
                                <div class="ui icon disabled button">
                                    <i class="attach icon"></i>
                                </div>
                            </div>
                        </div>
                        <div class="two fields">
                            <div class="field">
                                <label>Examen Medico General:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file6" name="file6" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Examen Visual:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file7" name="file7" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="two fields">
                            <div class="field">
                                <label>Examen Auditivo:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file8" name="file8" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Examen Odontologico:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file9" name="file9" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <h4 class="ui header">Otros documentos:</h4>
                        <div class="two fields">
                            <div class="field">
                                <label>Cedula Madre:</label>
                                <div class="ui action mini input upDocument" id="inputFileM">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file10" name="file10" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Carta Laboral Madre:</label>
                                <div class="ui action mini input upDocument" id="inputFileM2">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file11" name="file11" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="two fields">
                            <div class="field">
                                <label>Cedula Padre:</label>
                                <div class="ui action mini input upDocument" id="inputFileP">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file12" name="file12" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Carta Laboral Padre:</label>
                                <div class="ui action mini input upDocument" id="inputFileP2">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file13" name="file13" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="two fields">
                            <div class="field">
                                <label>Recibo Publico Residencia:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file14" name="file14" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Extrajuicio:</label>
                                <div class="ui action mini input upDocument">
                                    <input type="text" placeholder="Subir archivo..." readonly>
                                    <input type="file" accept="application/pdf" id="file15" name="file15" size="30">
                                    <div class="ui icon disabled button">
                                        <i class="attach icon"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <input hidden="" value="" id="btnInfo" name="btnInfo">
                        <div class="ui labeled icon teal basic button" id="btnPrevAd">
                            <i class="bordered inverted teal left arrow icon"></i>
                            Regresar
                        </div>
                        <div class="ui right floated blue button" id="btnSaveAd">Guardar</div>
                        <div class="ui right floated green button" id="btnNextAd">Enviar Matricula</div>
                    </form>
                </div>
                <!-- Attached Form -->

            </div>
            <div class="three wide column"></div>
        </div>

        <!-- Modales -->
        <div class="ui small modal guardado">
            <i class="close icon"></i>
            <div class="header">
                Gardado de Matricula
            </div>
            <div class="content">                
                <div class="description">
                    <div class="ui header">Proceso de guardado temporal</div>
                    <p>Este es un proceso que hemos diseñado para tu comodidad, 
                        entendemos que puede que no tengas toda la informacion en el momento. Por esto
                        guardaremos todos los datos que has introducido para que en un futoro continues desde donde lo dejaste.
                    </p>
                    <br>
                    <div class="ui center aligned container">
                        <div class="ui small header">Codigo de registro</div>
                        <div class="ui medium header" id="displayCode">0</div>
                    </div>
                    <br>
                    <p>Guarda este codigo para que puedas retomar este formulario.</p>
                </div>
            </div>
            <div class="actions">                
                <div class="ui positive right labeled icon button">
                    Entendido
                    <i class="checkmark icon"></i>
                </div>
            </div>
        </div>
        <!-- Modales -->

        <script type="text/javascript">

            // AREA DE PRUEBAS

            // AREA DE PRUEBAS     

            function sendDataForm1() {
                var action;
                var idFormRegister = $('#idRegistro').val();
                console.log("El id de la matricula es: " + idFormRegister);
                if (idFormRegister == "") {
                    action = 1;
                } else {
                    action = 2;
                }
                var form = 1;
                var kFamilyOption = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                var kfName = $('#fName').val();
                var ksName = $('#sName').val();
                var kfLastname = $('#fLastname').val();
                var ksLastname = $('#sLastname').val();
                var kDate = $('#kDate').val();
                var kBirthLocation = $('#kLugarNacimiento').val();
                var kDocumentType = $('#kDocumentType').val();
                var kDocument = $('#kDocument').val();
                var kDirection = $('#kDirection').val();
                var kRH = $('#kRH').val();
                var kGenero = $('#kGenero').val();
                $.ajax({
                    beforeSend: function () {
                        $('#btnSaveK').addClass("loading");
                    },
                    type: 'POST',
                    async: false,
                    url: 'MatriculaController',
                    data: {
                        idRegistro: idFormRegister,
                        action: action,
                        idForm: form,
                        fNombre: kfName,
                        sNombre: ksName,
                        fApellido: kfLastname,
                        sApellido: ksLastname,
                        kFechaNac: kDate,
                        kBirthLo: kBirthLocation,
                        kTipoDocumento: kDocumentType,
                        kDocumento: kDocument,
                        kDireccion: kDirection,
                        kSRH: kRH,
                        kGenero: kGenero,
                        kFamilia: kFamilyOption
                    },
                    success: function (data) {
                        idFormRegister = $('#idRegistro').val();
                        setTimeout(function () {
                            if (idFormRegister == "") {
                                result = data.idRegistro;
                                $('#displayCode').html(result);
                                $('.small.modal').modal('show');
                                $('#idRegistro').val(result);
                                $('#idRegistro2').val(result);
                                console.log("Se enviaron datos por primera vez, se retorna el id: " + result);
                            } else {
                                result = data.strMensage;
                                console.log(result);
                            }
                            $('#btnSaveK').removeClass("loading");
                        }, 1000);
                    }
                });
            }

            function sendDataForm2() {
                var action = 1;
                var idFormRegister = $('#idRegistro').val();
                console.log("El id de la matricula es: " + idFormRegister);
                if (idFormRegister == "") {
                    action = 1;
                } else {
                    action = 2;
                }
                var form = 2;
                var mfName = $('#mName').val();
                var msName = $('#mName2').val();
                var mfLastname = $('#mLastName').val();
                var msLastname = $('#mLastName2').val();
                var mDate = $('#mDate').val();
                var mBirthLocation = $('#mLugarNacimiento').val();
                var mDocumentType = $('#mDocumentType').val();
                var mDocument = $('#mDocument').val();
                var mRH = $('#mRH').val();
                var mPhone = $('#mPhone').val();
                var mEmail = $('#mEmail').val();
                var mDirection = $('#mDirection').val();
                var mJob = $('#radioEmployer').find('[name="empleo"]:checked').val();
                var mJobType = "";
                var mSalary = 0;
                if (mJob == 1) {
                    mJobType = $('#mEmployerType').val();
                    mSalary = $('#mSalary').val();
                } else if (mJob == null) {
                    mJob = "";
                }

                $.ajax({
                    beforeSend: function () {
                        $('#btnSaveM').addClass("loading");
                    },
                    type: 'POST',
                    async: false,
                    url: 'MatriculaController',
                    data: {
                        idRegistro: idFormRegister,
                        action: action,
                        idForm: form,
                        mpNombre: mfName,
                        msNombre: msName,
                        mpApellido: mfLastname,
                        msApellido: msLastname,
                        mFechaNac: mDate,
                        mLugarNac: mBirthLocation,
                        mTipoDocumento: mDocumentType,
                        mDocumento: mDocument,
                        mSRH: mRH,
                        mTelefono: mPhone,
                        mCorreo: mEmail,
                        mDireccion: mDirection,
                        mTrabajo: mJob,
                        mRolTrabajo: mJobType,
                        mSalario: mSalary
                    },
                    success: function (data) {
                        idFormRegister = $('#idRegistro').val();
                        setTimeout(function () {
                            if (idFormRegister == "") {
                                result = data.idRegistro;
                                $('#displayCode').html(result);
                                $('.small.modal').modal('show');
                                $('#idRegistro').val(result);
                                $('#idRegistro2').val(result);
                                console.log("Se enviaron datos por primera vez, se retorna el id: " + result);
                            } else {
                                result = data.strMensage;
                                console.log(result);
                            }
                            $('#btnSaveM').removeClass("loading");
                        }, 1000);
                    }
                });
            }

            function sendDataForm3() {
                var action = 1;
                var idFormRegister = $('#idRegistro').val();
                console.log("El id de la matricula es: " + idFormRegister);
                if (idFormRegister == "") {
                    action = 1;
                } else {
                    action = 2;
                }
                var form = 3;
                var pfName = $('#fName').val();
                var psName = $('#fName2').val();
                var pfLastname = $('#fLastName').val();
                var psLastname = $('#fLastName2').val();
                var pDate = $('#fDate').val();
                var pBirthLocation = $('#fLugarNacimiento').val();
                var pDocumentType = $('#fDocumentType').val();
                var pDocument = $('#fDocument').val();
                var pRH = $('#fRH').val();
                var pPhone = $('#fPhone').val();
                var pEmail = $('#fEmail').val();
                var pDirection = $('#fDirection').val();
                var pJob = $('#fradioEmployer').find('[name="fempleo"]:checked').val();
                var pJobType = "";
                var pSalary = 0;
                if (pJob == 1) {
                    pJobType = $('#fEmployerType').val();
                    pSalary = $('#fSalary').val();
                } else if (pJob == null) {
                    pJob = "";
                }

                $.ajax({
                    beforeSend: function () {
                        $('#btnSaveP').addClass("loading");
                    },
                    type: 'POST',
                    async: false,
                    url: 'MatriculaController',
                    data: {
                        idRegistro: idFormRegister,
                        action: action,
                        idForm: form,
                        ppNombre: pfName,
                        psNombre: psName,
                        ppApellido: pfLastname,
                        psApellido: psLastname,
                        pFechaNac: pDate,
                        pLugarNac: pBirthLocation,
                        pTipoDocumento: pDocumentType,
                        pDocumento: pDocument,
                        pSRH: pRH,
                        pTelefono: pPhone,
                        pCorreo: pEmail,
                        pDireccion: pDirection,
                        pTrabajo: pJob,
                        pRolTrabajo: pJobType,
                        pSalario: pSalary
                    },
                    success: function (data) {
                        idFormRegister = $('#idRegistro').val();
                        setTimeout(function () {
                            if (idFormRegister == "") {
                                result = data.idRegistro;
                                $('#displayCode').html(result);
                                $('.small.modal').modal('show');
                                $('#idRegistro').val(result);
                                $('#idRegistro2').val(result);
                                console.log("Se enviaron datos por primera vez, se retorna el id: " + result);
                            } else {
                                result = data.strMensage;
                                console.log(result);
                            }
                            $('#btnSaveP').removeClass("loading");
                        }, 1000);
                    }
                });
            }

            function sendDataForm4() {
                var action = 1;
                var idFormRegister = $('#idRegistro').val();
                console.log("El id de la matricula es: " + idFormRegister);
                if (idFormRegister == "") {
                    action = 1;
                } else {
                    action = 2;
                }
                var form = 4;
                var afName = $('#aName').val();
                var asName = $('#aName2').val();
                var afLastname = $('#aLastName').val();
                var asLastname = $('#aLastName2').val();
                var aDate = $('#aDate').val();
                var aBirthLocation = $('#aLugarNacimiento').val();
                var aDocumentType = $('#aDocumentType').val();
                var aDocument = $('#aDocument').val();
                var aRH = $('#aRH').val();
                var aPhone = $('#aPhone').val();
                var aEmail = $('#aEmail').val();
                var aDirection = $('#aDirection').val();
                var aGenero = $('#aGenero').val();
                var aParentezco = $('#parentezco').val();
                var aDesplazamiento = $('#desplazamiento').val();
                var aGEtnico = $('#grupoE').val();
                var aJob = $('#aRadioEmployer').find('[name="aempleo"]:checked').val();
                var aRedU = $('#aRedU').find('[name="redUnidos"]:checked').val();
                if (aRedU == null) {
                    aRedU = "";
                }
                var aFamAcc = $('#aFamAcc').find('[name="fAccion"]:checked').val();
                if (aFamAcc == null) {
                    aFamAcc = "";
                }
                var aJobType = "";
                var aSalary = 0;
                if (aJob == 1) {
                    aJobType = $('#aEmployerType').val();
                    aSalary = $('#aSalary').val();
                } else if (aJob == null) {
                    aJob = "";
                }

                $.ajax({
                    beforeSend: function () {
                        $('#btnSaveA').addClass("loading");
                    },
                    type: 'POST',
                    async: false,
                    url: 'MatriculaController',
                    data: {
                        idRegistro: idFormRegister,
                        action: action,
                        idForm: form,
                        apNombre: afName,
                        asNombre: asName,
                        apApellido: afLastname,
                        asApellido: asLastname,
                        aFechaNac: aDate,
                        aLugarNac: aBirthLocation,
                        aTipoDocumento: aDocumentType,
                        aDocumento: aDocument,
                        aDireccion: aDirection,
                        aSRH: aRH,
                        aTelefono: aPhone,
                        aTrabajo: aJob,
                        aRolTrabajo: aJobType,
                        aSalario: aSalary,
                        aCorreo: aEmail,
                        aGender: aGenero,
                        aParent: aParentezco,
                        aDespla: aDesplazamiento,
                        aRU: aRedU,
                        aFA: aFamAcc,
                        aGE: aGEtnico
                    },
                    success: function (data) {
                        idFormRegister = $('#idRegistro').val();
                        setTimeout(function () {
                            if (idFormRegister == "") {
                                result = data.idRegistro;
                                $('#displayCode').html(result);
                                $('.small.modal').modal('show');
                                $('#idRegistro').val(result);
                                $('#idRegistro2').val(result);
                                console.log("Se enviaron datos por primera vez, se retorna el id: " + result);
                            } else {
                                result = data.strMensage;
                                console.log(result);
                            }
                            $('#btnSaveA').removeClass("loading");
                        }, 1000);
                    }
                });
            }

            function checkForm1() {
                getFormKDefault();
            }

            function checkForm2() {
                res = $('#radioEmployer').find('[name="empleo"]:checked').val();
                if (res == '1') {
                    getFormMEmployer();
                } else {
                    getFormMDefault();
                }
            }

            function checkForm3() {
                resf = $('#fradioEmployer').find('[name="fempleo"]:checked').val();
                if (res == '1') {
                    getFormPEmployer();
                } else {
                    getFormPDefault();
                }
            }

            function checkForm4() {
                resa = $('#aRadioEmployer').find('[name="aempleo"]:checked').val();
                if (res == '1') {
                    getFormAEmployer();
                } else {
                    getFormADefault();
                }
            }

            function checkForm5() {
                res = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                switch (res) {
                    case "1":
                        getFormAttOnlyMother();
                        $('#inputFileP').addClass('disabled');
                        $('#inputFileP2').addClass('disabled');
                        break;
                    case "2":
                        getFormAttOnlyFather();
                        $('#inputFileM').addClass('disabled');
                        $('#inputFileM2').addClass('disabled');
                        break;
                    case "3":
                        getFormAttDefault();
                        $('#inputFileM').removeClass('disabled');
                        $('#inputFileM2').removeClass('disabled');
                        $('#inputFileP').removeClass('disabled');
                        $('#inputFileP2').removeClass('disabled');
                        break;
                }
            }

            $(document).ready(function () {
                //Load default forms validators
                getFormKDefault();
                //Load default forms validators

                $('.ui.segment.employer').hide();
                $('.ui.segment.fEmployer').hide();
                $('.ui.segment.aEmployer').hide();

                $('.pickerDate').calendar({
                    type: 'date',
                    formatter: {
                        date: function (date, settings) {
                            if (!date)
                                return '';
                            var day = date.getDate();
                            var month = date.getMonth() + 1;
                            var year = date.getFullYear();
                            return day + '/' + month + '/' + year;
                        }
                    }
                });
                $('.ui.dropdown')
                        .dropdown()
                        ;
                $('.steps .step')
                        .tab()
                        ;

                $('a[data-tab="second"]').click(function () {
                    checkForm2();
                });

                $('a[data-tab="third"]').click(function () {
                    checkForm3();
                });

                $('a[data-tab="fourth"]').click(function () {
                    checkForm4();
                });

                $('a[data-tab="fifth"]').click(function () {
                    checkForm5();
                });

            });

            $('.radio.checkbox.form4').checkbox();

            $('.ui.radio.checkbox.optional').checkbox({
                onChecked: function () {
                    res = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                    switch (res) {
                        case "1":
                            $('a[data-tab="third"]').addClass('disabled');
                            $('a[data-tab="second"]').removeClass('disabled');
                            $('.form.matriculaFormP').form('destroy');
                            break;
                        case "2":
                            $('a[data-tab="second"]').addClass('disabled');
                            $('a[data-tab="third"]').removeClass('disabled');
                            $('.form.matriculaFormM').form('destroy');
                            break;
                        case "3":
                            $('a[data-tab="second"]').removeClass('disabled');
                            $('a[data-tab="third"]').removeClass('disabled');
                            break;
                    }
                }
            });

            $('.ui.radio.checkbox.employ')
                    .checkbox({
                        onChecked: function () {
                            res = $('#radioEmployer').find('[name="empleo"]:checked').val();
                            resf = $('#fradioEmployer').find('[name="fempleo"]:checked').val();
                            resa = $('#aRadioEmployer').find('[name="aempleo"]:checked').val();
                            if (res == 1) {
                                $('.form.matriculaFormM').form('destroy');
                                $('.ui.segment.employer').show();
                                getFormMEmployer();
                            } else {
                                $('.form.matriculaFormM').form('destroy');
                                $('.ui.segment.employer').hide();
                                getFormMDefault();
                            }
                            if (resf == 1) {
                                $('.form.matriculaFormP').form('destroy');
                                $('.ui.segment.fEmployer').show();
                                getFormPEmployer();
                            } else {
                                $('.form.matriculaFormP').form('destroy');
                                $('.ui.segment.fEmployer').hide();
                                getFormPDefault();
                            }
                            if (resa == 1) {

                                $('.form.matriculaFormA').form('destroy');
                                $('.ui.segment.aEmployer').show();
                                getFormAEmployer();
                            } else {
                                $('.form.matriculaFormA').form('destroy');
                                $('.ui.segment.aEmployer').hide();
                                getFormADefault();
                            }
                        }
                    });
            $('#btnNextK').click(function () {
                statusFamily = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                if (statusFamily == '2') {
                    $(this).tab('change tab', 'third');
                    $('a[data-tab="third"]').addClass('active');
                } else {
                    $(this).tab('change tab', 'second');
                    $('a[data-tab="second"]').addClass('active');
                }
                $('a[data-tab="first"]').removeClass('active');
                $('.form.matriculaForm').form('submit');
                getFormMDefault();
            });
            $('#btnNextM').click(function () {
                statusFamily = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                if (statusFamily == '1') {
                    $(this).tab('change tab', 'fourth');
                    $('a[data-tab="fourth"]').addClass('active');
                } else {
                    $(this).tab('change tab', 'third');
                    $('a[data-tab="third"]').addClass('active');
                }
                $('a[data-tab="second"]').removeClass('active');
                $('.form.matriculaFormM').form('submit');
                getFormPDefault();
            });
            $('#btnNextP').click(function () {
                $(this).tab('change tab', 'fourth');
                $('a[data-tab="third"]').removeClass('active');
                $('a[data-tab="fourth"]').addClass('active');
                $('.form.matriculaFormP').form('submit');
                getFormADefault();
            });
            $('#btnNextA').click(function () {
                $(this).tab('change tab', 'fifth');
                $('a[data-tab="fourth"]').removeClass('active');
                $('a[data-tab="fifth"]').addClass('active');
                $('.form.matriculaFormA').form('submit');
                checkForm5();
            });
            $('#btnNextAd').click(function () {
                //Prueba
                //$('#idRegistro2').val('1574905404');
                $('#btnInfo').val('enviar');
                var kFamilyOption = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                var form1 = false;
                var form2 = true;
                var form3 = true;
                var form4 = false;
                var form5 = false;
                checkForm1();
                switch (kFamilyOption) {
                    case '1':
                        checkForm2();
                        form2 = $('.form.matriculaFormM').form('validate form');
                        break;
                    case '2':
                        checkForm3();
                        form3 = $('.form.matriculaFormP').form('validate form');
                        break;
                    case '3':
                        checkForm2();
                        checkForm3();
                        form2 = $('.form.matriculaFormM').form('validate form');
                        form3 = $('.form.matriculaFormP').form('validate form');
                        break;
                    default:
                }
                checkForm4();
                checkForm5();
                form1 = $('.form.matriculaForm').form('validate form');
                form4 = $('.form.matriculaFormA').form('validate form');
                form5 = $('.form.matriculaFormAtt').form('validate form');
                console.log('Resultados de los formularios: ');
                console.log('Aspirante: ' + form1);
                console.log('Madre: ' + form2);
                console.log('Padre: ' + form3);
                console.log('Acudiente: ' + form4);
                console.log('Adjuntos: ' + form5);
                if (form1 && form2 && form3 && form4 && form5) {
                    alert("La hiciste we se va a enviar el registro");
                    sendDataForm1();
                    switch (kFamilyOption) {
                        case '1':
                            sendDataForm2();
                            break;
                        case '2':
                            sendDataForm3();
                            break;
                        case '3':
                            sendDataForm2();
                            sendDataForm3();
                            break;
                        default :
                    }
                    sendDataForm4();
                    $('.form.matriculaFormAtt').form('submit');
                } else {
                    alert("Pinche pendejo, fijate y completa esa mierda");
                }
            });

            $('#btnSaveAd').click(function () {
                //Prueba
                //$('#idRegistro2').val('1574905404');
                $('#btnInfo').val('guardar');
                $('.form.matriculaFormAtt').form('destroy');
                $('.form.matriculaFormAtt').form('submit');
            });

            $('#btnPrevM').click(function () {
                $(this).tab('change tab', 'first');
                $('a[data-tab="second"]').removeClass('active');
                $('a[data-tab="first"]').addClass('active');
            });
            $('#btnPrevF').click(function () {
                statusFamily = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                if (statusFamily == '2') {
                    $(this).tab('change tab', 'first');
                    $('a[data-tab="first"]').addClass('active');
                } else {
                    $(this).tab('change tab', 'second');
                    $('a[data-tab="second"]').addClass('active');
                }
                $('a[data-tab="third"]').removeClass('active');
            });
            $('#btnPrevA').click(function () {
                statusFamily = $('#radioFamilyCondition').find('[name="familyCon"]:checked').val();
                if (statusFamily == '1') {
                    $(this).tab('change tab', 'second');
                    $('a[data-tab="second"]').addClass('active');
                } else {
                    $(this).tab('change tab', 'third');
                    $('a[data-tab="third"]').addClass('active');
                }
                $('a[data-tab="fourth"]').removeClass('active');
            });
            $('#btnPrevAd').click(function () {
                $(this).tab('change tab', 'fourth');
                $('a[data-tab="fifth"]').removeClass('active');
                $('a[data-tab="fourth"]').addClass('active');
            });
            $("input:text").click(function () {
                $(this).parent().find("input:file").click();
            });
            $('input:file', '.ui.action.input')
                    .on('change', function (e) {
                        var name = e.target.files[0].name;
                        $('input:text', $(e.target).parent()).val(name);
                    });

            idRegistro = 0;
            $('#btnSaveK').click(function () {
                sendDataForm1();
            });

            $('#btnSaveM').click(function () {
                sendDataForm2();
            });
            $('#btnSaveP').click(function () {
                sendDataForm3();
            });

            $('#btnSaveA').click(function () {
                sendDataForm4();
            });

        </script>
    </body>
</html>
