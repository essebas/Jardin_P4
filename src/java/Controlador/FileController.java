/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.TempMatriculaDao;
import Modelo.TempMatricula;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;
import javax.security.auth.message.callback.PrivateKeyCallback;
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
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50)   // 50MB
@WebServlet(name = "FileController", urlPatterns = {"/FileController"})
public class FileController extends HttpServlet {

    private static final String SAVE_DIR = "uploadFiles";

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
        TempMatriculaDao tempMatriculaDao = new TempMatriculaDao();
        TempMatricula tempMatricula = new TempMatricula();
        String strIdRegistro = request.getParameter("idRegistro2");
        String strBtnClick = request.getParameter("btnInfo");
        //int idRegistro = Integer.parseInt(strIdRegistro);        
        int idRegistro = 0;
        if (strIdRegistro.equals("0") || strIdRegistro.equals("")) {
            Date date = new Date();
            idRegistro = (int) (date.getTime() / 1000);
        } else {
            idRegistro = Integer.parseInt(strIdRegistro);
        }
        String appPath = request.getServletContext().getRealPath("");
        String savePath = appPath + File.separator + SAVE_DIR + File.separator + idRegistro;
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
        System.out.println(fileSaveDir.getPath());

        try {
            tempMatricula.setId_tempMatricula(idRegistro);
            Part filePart = request.getPart("file");
            String att1 = crearArchivo(filePart, "FotoAspirante.jpg", request, String.valueOf(idRegistro));
            if (att1 != "") {
                tempMatricula.setAttachmentFotoAs(att1);
            }
            Part filePart2 = request.getPart("file2");
            String att2 = crearArchivo(filePart2, "RegistroCivil.pdf", request, String.valueOf(idRegistro));
            if (att2 != "") {
                tempMatricula.setAttachmentRegistroCivil(att2);
            }
            Part filePar3 = request.getPart("file3");
            String att3 = crearArchivo(filePar3, "CertificadoEps.pdf", request, String.valueOf(idRegistro));
            if (att3 != "") {
                tempMatricula.setAttachmentCertificadoEps(att3);
            }
            Part filePart4 = request.getPart("file4");
            String att4 = crearArchivo(filePart4, "CarnetVacunas.pdf", request, String.valueOf(idRegistro));
            if (att4 != "") {
                tempMatricula.setAttachmentCertificadoVac(att4);
            }
            Part filePart5 = request.getPart("file5");
            String att5 = crearArchivo(filePart5, "CertificadoCrecimiento.pdf", request, String.valueOf(idRegistro));
            if (att5 != "") {
                tempMatricula.setAttachmentCertificadoCre(att5);
            }
            Part filePart6 = request.getPart("file6");
            String att6 = crearArchivo(filePart6, "ExamenMG.pdf", request, String.valueOf(idRegistro));
            if (att6 != "") {
                tempMatricula.setAttachmentExamMedGen(att6);
            }
            Part filePart7 = request.getPart("file7");
            String att7 = crearArchivo(filePart7, "ExamenV.pdf", request, String.valueOf(idRegistro));
            if (att7 != "") {
                tempMatricula.setAttachmentExamVis(att7);
            }
            Part filePart8 = request.getPart("file8");
            String att8 = crearArchivo(filePart8, "ExamenAud.pdf", request, String.valueOf(idRegistro));
            if (att8 != "") {
                tempMatricula.setAttachmentExamAud(att8);
            }
            Part filePart9 = request.getPart("file9");
            String att9 = crearArchivo(filePart9, "ExamenOdon.pdf", request, String.valueOf(idRegistro));
            if (att9 != "") {
                tempMatricula.setAttachmentExamOdon(att9);
            }
            Part filePart10 = request.getPart("file10");
            String att10 = crearArchivo(filePart10, "CedulaMadre.pdf", request, String.valueOf(idRegistro));
            if (att10 != "") {
                tempMatricula.setAttachmentCedulaMadre(att10);
            }
            Part filePart11 = request.getPart("file11");
            String att11 = crearArchivo(filePart11, "CartaLaboralM.pdf", request, String.valueOf(idRegistro));
            if (att11 != "") {
                tempMatricula.setAttachmentCartaLaboMad(att11);
            }
            Part filePart12 = request.getPart("file12");
            String att12 = crearArchivo(filePart12, "CedulaPadre.pdf", request, String.valueOf(idRegistro));
            if (att12 != "") {
                tempMatricula.setAttachmentCedulaPadre(att12);
            }
            Part filePart13 = request.getPart("file13");
            String att13 = crearArchivo(filePart13, "CartaLaboralP.pdf", request, String.valueOf(idRegistro));
            if (att13 != "") {
                tempMatricula.setAttachmentCartaLaboPad(att13);
            }
            Part filePart14 = request.getPart("file14");
            String att14 = crearArchivo(filePart14, "ReciboPublic.pdf", request, String.valueOf(idRegistro));
            if (att14 != "") {
                tempMatricula.setAttachmentReciboPublico(att14);
            }
            Part filePart15 = request.getPart("file15");
            String att15 = crearArchivo(filePart15, "Extrajuicio.pdf", request, String.valueOf(idRegistro));
            if (att15 != "") {
                tempMatricula.setAttachmentExtrajuicio(att15);
            }
            if (strBtnClick.equals("enviar")) {
                tempMatricula.setFormStatus(1);
            }
            System.out.println(tempMatricula.toString());
            int result;
            if (idRegistro == 0) {
                result = tempMatriculaDao.insertar(tempMatricula, 5);
            } else {
                result = tempMatriculaDao.actualizar(tempMatricula, 5);
            }
            if (result == 1) {
                String statusMesagge = "";
                if (strBtnClick.equals("guardar")) {
                    TempMatricula tm = new TempMatricula();
                    tm = tempMatriculaDao.buscar(idRegistro);
                    if (tm != null) {
                        request.setAttribute("datosTemp", tm);
                        request.setAttribute("code", 3);
                        request.getRequestDispatcher("registroMatricula.jsp").forward(request, response);
                    } else {
                        request.setAttribute("statusCode", 2);
                        request.getRequestDispatcher("matricula.jsp").forward(request, response);
                    }
                } else if (strBtnClick.equals("enviar")) {
                    statusMesagge = "Estaremos evaluado tu solicitud para que el los proximos dias puedas conocer el resultado. Tambien puedes estar consultando el estado de tu registro en la opcion \"Estado de mi registro\"";
                    request.setAttribute("statusCode", 1);
                    request.setAttribute("statusMessage", statusMesagge);
                    request.getRequestDispatcher("matricula.jsp").forward(request, response);
                }
            }
        } catch (Exception e) {
            e.toString();
            //fileName = "";
        }

    }

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println(contentDisp);
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

    private String crearArchivo(Part filePart, String name, HttpServletRequest request, String fichero) throws IOException {
        if (filePart.getSize() > 0) {
            String fileName = name;
            String applicationPath = request.getServletContext().getRealPath("");
            String basePath = applicationPath + File.separator + SAVE_DIR + File.separator + fichero + File.separator;
            String result = fichero + File.separator;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                File outputFilePath = new File(basePath + fileName);
                inputStream = filePart.getInputStream();
                outputStream = new FileOutputStream(outputFilePath);
                int read = 0;
                final byte[] bytes = new byte[1024];
                while ((read = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
            } catch (Exception e) {
                e.toString();
                fileName = "";
                return "";
            } finally {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            return result + name;
        }
        return "";
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
