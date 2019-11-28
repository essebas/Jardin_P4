/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.TempMatriculaDao;
import Modelo.TempMatricula;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author zebas
 */
@WebServlet(name = "MatriculaController", urlPatterns = {"/MatriculaController"})
public class MatriculaController extends HttpServlet {

    private static String UPLOAD_DIRECTORY = "documentos_aspirantes";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int accion = Integer.parseInt(request.getParameter("action"));
        switch (accion) {
            case 3:
                editarFormulario(request, response);
                break;
            default:
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("action") != null) {
            int accion = Integer.parseInt(request.getParameter("action"));
            switch (accion) {
                case 1:
                    crearRegistroMatricula(request, response);
                    break;
                case 2:
                    actualizarFormulario(request, response);
                    break;
                case 3:
                    editarFormulario(request, response);
                    break;
                default:
            }
        }
    }

    private void crearRegistroMatricula(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            TempMatriculaDao tempMatriculaDao = new TempMatriculaDao();
            int idForm = Integer.parseInt(request.getParameter("idForm"));
            TempMatricula tm = new TempMatricula();
            Date date = new Date();
            int idRegister = (int) (date.getTime() / 1000);
            tm = getTempMatriculaParameters(idForm, tm, request, idRegister);
            System.out.println(tm.toString());
            int result = tempMatriculaDao.insertar(tm, idForm);
            if (result == 1) {
                map.put("idRegistro", idRegister);
                write(response, map);
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    private void actualizarFormulario(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            TempMatriculaDao tempMatriculaDao = new TempMatriculaDao();
            TempMatricula tm = new TempMatricula();
            int idForm = Integer.parseInt(request.getParameter("idForm"));
            int idRegister = Integer.parseInt(request.getParameter("idRegistro"));
            tm = getTempMatriculaParameters(idForm, tm, request, idRegister);
            System.out.println(tm.toString());
            int result = tempMatriculaDao.actualizar(tm, idForm);
            String strResult = "";
            if (result == 1) {
                strResult = "Se han guardado todos los cambios";
            } else {
                strResult = "Ha ocurrido un error";
            }
            map.put("strMensage", strResult);
            write(response, map);
        } catch (Exception ex) {

        }
    }

    private void editarFormulario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idRegistro = Integer.parseInt(request.getParameter("idRegistro"));
        TempMatricula tm = null;
        TempMatriculaDao tmd = new TempMatriculaDao();
        tm = tmd.buscar(idRegistro);
        String statusMesagge = ""; 
        if (tm != null && tm.getFormStatus() == 0) {
            request.setAttribute("datosTemp", tm);
            request.setAttribute("code", 3);
            request.getRequestDispatcher("registroMatricula.jsp").forward(request, response);
        } else if (tm != null && tm.getFormStatus() == 1) {
            statusMesagge = "Tu solicitud ya ha sido enviada. Puedes consultar el estado de tu registro en la opcion \"Estado de mi registro\"";
            request.setAttribute("statusCode", 2);
            request.setAttribute("statusMessage", statusMesagge);
            request.getRequestDispatcher("matricula.jsp").forward(request, response);
        } else {
            request.setAttribute("statusCode", 3);
            request.getRequestDispatcher("matricula.jsp").forward(request, response);
        }
    }

    private TempMatricula getTempMatriculaParameters(int idForm, TempMatricula tm, HttpServletRequest request, int idRegister) throws ParseException {
        tm.setId_tempMatricula(idRegister);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        int empleo = 0;
        String strFecha = "";
        String tipoDocumento = "";
        String strEmpleo = "";
        String strGender = "";
        String strConDes = "";
        String strParentezco = "";
        String strRU = "";
        String strFA = "";
        String strGE = "";
        switch (idForm) {
            case 1:
                tm.setKidName(request.getParameter("fNombre"));
                tm.setKidName2(request.getParameter("sNombre"));
                tm.setKidLastname(request.getParameter("fApellido"));
                tm.setKidLastname2(request.getParameter("sApellido"));
                strFecha = request.getParameter("kFechaNac");
                if (!strFecha.equals("")) {
                    tm.setKidDate(new java.sql.Date(format.parse(strFecha).getTime()));
                }
                tm.setKidBirthLocation(request.getParameter("kBirthLo"));
                tipoDocumento = request.getParameter("kTipoDocumento");
                if (!tipoDocumento.equals("")) {
                    tm.setKidDocumentType(Integer.parseInt(tipoDocumento));
                }
                tm.setKidDocument(request.getParameter("kDocumento"));
                tm.setKidDirection(request.getParameter("kDireccion"));
                tm.setKidRH(request.getParameter("kSRH"));
                strGender = request.getParameter("kGenero");
                if (!strGender.equals("")) {
                    tm.setKidGenero(Integer.parseInt(strGender));
                }
                String strFamilyOption = request.getParameter("kFamilia");
                switch (strFamilyOption) {
                    case "1":
                        tm.setMotherStatus(1);
                        tm.setFatherStatus(0);
                        break;
                    case "2":
                        tm.setMotherStatus(0);
                        tm.setFatherStatus(1);
                        break;
                    case "3":
                        tm.setMotherStatus(1);
                        tm.setFatherStatus(1);
                        break;
                    default:
                        System.out.println("Se ha ingresado una opcion que no es valida");
                }

                break;
            case 2:
                tm.setMotherName(request.getParameter("mpNombre"));
                tm.setMotherNam2(request.getParameter("msNombre"));
                tm.setMotherLastname(request.getParameter("mpApellido"));
                tm.setMotherLastname2(request.getParameter("msApellido"));
                strFecha = request.getParameter("mFechaNac");
                if (!strFecha.equals("")) {
                    tm.setMotherDate(new java.sql.Date(format.parse(strFecha).getTime()));
                }
                tm.setMotherBirthLocation(request.getParameter("mLugarNac"));
                tipoDocumento = request.getParameter("mTipoDocumento");
                if (!tipoDocumento.equals("")) {
                    tm.setMotherDocumentType(Integer.parseInt(tipoDocumento));
                }
                tm.setMotherDocument(request.getParameter("mDocumento"));
                tm.setMotherRH(request.getParameter("mSRH"));
                tm.setMotherPhone(request.getParameter("mTelefono"));
                tm.setMotherEmail(request.getParameter("mCorreo"));
                tm.setMotherDirection(request.getParameter("mDireccion"));

                strEmpleo = request.getParameter("mTrabajo");
                if (!strEmpleo.equals("")) {
                    empleo = Integer.parseInt(strEmpleo);
                    tm.setMotherEmployer(empleo);
                    if (empleo == 1) {
                        tm.setMotherEmployerType(request.getParameter("mRolTrabajo"));
                        tm.setMotherSalary(Double.parseDouble(request.getParameter("mSalario")));
                    } else {
                        tm.setMotherEmployerType("");
                        tm.setMotherSalary(0);
                    }
                }
                break;
            case 3:
                tm.setFatherName(request.getParameter("ppNombre"));
                tm.setFatherNam2(request.getParameter("psNombre"));
                tm.setFatherLastname(request.getParameter("ppApellido"));
                tm.setFatherLastname2(request.getParameter("psApellido"));
                strFecha = request.getParameter("pFechaNac");
                if (!strFecha.equals("")) {
                    tm.setFatherDate(new java.sql.Date(format.parse(strFecha).getTime()));
                }
                tm.setFatherBirthLocation(request.getParameter("pLugarNac"));
                tipoDocumento = request.getParameter("pTipoDocumento");
                if (!tipoDocumento.equals("")) {
                    tm.setFatherDocumentType(Integer.parseInt(tipoDocumento));
                }
                tm.setFatherDocument(request.getParameter("pDocumento"));
                tm.setFatherRH(request.getParameter("pSRH"));
                tm.setFatherPhone(request.getParameter("pTelefono"));
                tm.setFatherEmail(request.getParameter("pCorreo"));
                tm.setFatherDirection(request.getParameter("pDireccion"));
                strEmpleo = request.getParameter("pTrabajo");
                if (!strEmpleo.equals("")) {
                    empleo = Integer.parseInt(strEmpleo);
                    tm.setFatherEmployer(empleo);
                    if (empleo == 1) {
                        tm.setFatherEmployerType(request.getParameter("pRolTrabajo"));
                        tm.setFatherSalary(Double.parseDouble(request.getParameter("pSalario")));
                    } else {
                        tm.setFatherEmployerType("");
                        tm.setFatherSalary(0);
                    }
                }
                break;
            case 4:
                tm.setAcudientName(request.getParameter("apNombre"));
                tm.setAcudientNam2(request.getParameter("asNombre"));
                tm.setAcudientLastname(request.getParameter("apApellido"));
                tm.setAcudientLastname2(request.getParameter("asApellido"));
                strFecha = request.getParameter("aFechaNac");
                if (!strFecha.equals("")) {
                    tm.setAcudientDate(new java.sql.Date(format.parse(strFecha).getTime()));
                }

                tm.setAcudientBirthLocation(request.getParameter("aLugarNac"));

                tipoDocumento = request.getParameter("aTipoDocumento");
                if (!tipoDocumento.equals("")) {
                    tm.setAcudientDocumentType(Integer.parseInt(tipoDocumento));
                }
                tm.setAcudientDocument(request.getParameter("aDocumento"));
                tm.setAcudientDirection(request.getParameter("aDireccion"));
                tm.setAcudientRH(request.getParameter("aSRH"));
                tm.setAcudientPhone(request.getParameter("aTelefono"));

                strEmpleo = request.getParameter("aTrabajo");
                if (!strEmpleo.equals("")) {
                    empleo = Integer.parseInt(strEmpleo);
                    tm.setAcudientEmployer(empleo);
                    if (empleo == 1) {
                        tm.setAcudientEmployerType(request.getParameter("aRolTrabajo"));
                        tm.setAcudientSalary(Double.parseDouble(request.getParameter("aSalario")));
                    } else {
                        tm.setAcudientEmployerType("");
                        tm.setAcudientSalary(0);
                    }
                }
                tm.setAcudientEmail(request.getParameter("aCorreo"));
                strGender = request.getParameter("aGender");
                if (!strGender.equals("")) {
                    tm.setAcudientGender(Integer.parseInt(strGender));
                }
                strParentezco = request.getParameter("aParent");
                if (!strParentezco.equals("")) {
                    tm.setAcudientParentezco(Integer.parseInt(strParentezco));
                }
                strConDes = request.getParameter("aDespla");
                if (!strConDes.equals("")) {
                    tm.setAcudientCondicionDesp(Integer.parseInt(strConDes));
                }
                strRU = request.getParameter("aRU");
                if (!strRU.equals("")) {
                    tm.setAcudientRU(Integer.parseInt(strRU));
                }
                strFA = request.getParameter("aFA");
                if (!strFA.equals("")) {
                    tm.setAcudientFA(Integer.parseInt(strFA));
                }
                strGE = request.getParameter("aGE");
                if (!strGE.equals("")) {
                    tm.setAcudientGE(Integer.parseInt(strGE));
                }
                break;
        }
        return tm;
    }

    /*private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf("=") + 2, content.length() - 1);
            }
        }
        return Constants.DEFAULT_FILENAME;
    }*/
    private void write(HttpServletResponse response, Map<String, Object> map) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(map));
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>       

}
