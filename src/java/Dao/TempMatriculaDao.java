/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.TempMatricula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import Conexion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zebas
 */
public class TempMatriculaDao implements ITempMatriculaDao {

    @Override
    public List<TempMatricula> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(TempMatricula tempMatricula, int form) {
        int response = 0;
        PreparedStatement st = null;
        try {
            //Conexion.getConexion().setAutoCommit(false);
            Conexion.getConexion();
            String query = "INSERT INTO " + Constantes.TABLE_TEMPMATRICULA + "(";
            query = getColumQueri(form, query);
            st = Conexion.getConexion().prepareStatement(query);
            System.out.println(query);
            st.setInt(1, tempMatricula.getId_tempMatricula());
            switch (form) {
                case 1:
                    st.setString(2, tempMatricula.getKidName());
                    st.setString(3, tempMatricula.getKidName2());
                    st.setString(4, tempMatricula.getKidLastname());
                    st.setString(5, tempMatricula.getKidLastname2());
                    st.setDate(6, tempMatricula.getKidDate());
                    st.setString(7, tempMatricula.getKidBirthLocation());
                    st.setInt(8, tempMatricula.getKidDocumentType());
                    st.setString(9, tempMatricula.getKidDocument());
                    st.setString(10, tempMatricula.getKidDirection());
                    st.setString(11, tempMatricula.getKidRH());
                    st.setInt(12, tempMatricula.getKidGenero());
                    st.setInt(13, tempMatricula.getMotherStatus());
                    st.setInt(14, tempMatricula.getFatherStatus());
                    break;
                case 2:
                    st.setString(2, tempMatricula.getMotherName());
                    st.setString(3, tempMatricula.getMotherNam2());
                    st.setString(4, tempMatricula.getMotherLastname());
                    st.setString(5, tempMatricula.getMotherLastname2());
                    st.setDate(6, tempMatricula.getMotherDate());
                    st.setString(7, tempMatricula.getMotherBirthLocation());
                    st.setInt(8, tempMatricula.getMotherDocumentType());
                    st.setString(9, tempMatricula.getMotherDocument());
                    st.setString(10, tempMatricula.getMotherDirection());
                    st.setString(11, tempMatricula.getMotherRH());
                    st.setString(12, tempMatricula.getMotherPhone());
                    st.setInt(13, tempMatricula.getMotherEmployer());
                    st.setString(14, tempMatricula.getMotherEmployerType());
                    st.setDouble(15, tempMatricula.getMotherSalary());
                    st.setString(16, tempMatricula.getMotherEmail());
                    break;
                case 3:
                    st.setString(2, tempMatricula.getFatherName());
                    st.setString(3, tempMatricula.getFatherNam2());
                    st.setString(4, tempMatricula.getFatherLastname());
                    st.setString(5, tempMatricula.getFatherLastname2());
                    st.setDate(6, tempMatricula.getFatherDate());
                    st.setString(7, tempMatricula.getFatherBirthLocation());
                    st.setInt(8, tempMatricula.getFatherDocumentType());
                    st.setString(9, tempMatricula.getFatherDocument());
                    st.setString(10, tempMatricula.getFatherDirection());
                    st.setString(11, tempMatricula.getFatherRH());
                    st.setString(12, tempMatricula.getFatherPhone());
                    st.setInt(13, tempMatricula.getFatherEmployer());
                    st.setString(14, tempMatricula.getFatherEmployerType());
                    st.setDouble(15, tempMatricula.getFatherSalary());
                    st.setString(16, tempMatricula.getFatherEmail());
                    break;
                case 4:
                    st.setString(2, tempMatricula.getAcudientName());
                    st.setString(3, tempMatricula.getAcudientNam2());
                    st.setString(4, tempMatricula.getAcudientLastname());
                    st.setString(5, tempMatricula.getAcudientLastname2());
                    st.setDate(6, tempMatricula.getAcudientDate());
                    st.setString(7, tempMatricula.getAcudientBirthLocation());
                    st.setInt(8, tempMatricula.getAcudientDocumentType());
                    st.setString(9, tempMatricula.getAcudientDocument());
                    st.setString(10, tempMatricula.getAcudientDirection());
                    st.setString(11, tempMatricula.getAcudientRH());
                    st.setString(12, tempMatricula.getAcudientPhone());
                    st.setInt(13, tempMatricula.getAcudientEmployer());
                    st.setString(14, tempMatricula.getAcudientEmployerType());
                    st.setDouble(15, tempMatricula.getAcudientSalary());
                    st.setString(16, tempMatricula.getAcudientEmail());
                    st.setInt(17, tempMatricula.getAcudientGender());
                    st.setInt(18, tempMatricula.getAcudientParentezco());
                    st.setInt(19, tempMatricula.getAcudientCondicionDesp());
                    st.setInt(20, tempMatricula.getAcudientRU());
                    st.setInt(21, tempMatricula.getAcudientFA());
                    st.setInt(22, tempMatricula.getAcudientGE());
                    break;
                case 5:
                    st.setString(2, tempMatricula.getAttachmentFotoAs());
                    st.setString(3, tempMatricula.getAttachmentRegistroCivil());
                    st.setString(4, tempMatricula.getAttachmentCedulaMadre());
                    st.setString(5, tempMatricula.getAttachmentCedulaPadre());
                    st.setString(6, tempMatricula.getAttachmentCartaLaboMad());
                    st.setString(7, tempMatricula.getAttachmentCartaLaboPad());
                    st.setString(8, tempMatricula.getAttachmentReciboPublico());
                    st.setString(9, tempMatricula.getAttachmentExtrajuicio());
                    st.setString(10, tempMatricula.getAttachmentCertificadoEps());
                    st.setString(11, tempMatricula.getAttachmentCertificadoVac());
                    st.setString(12, tempMatricula.getAttachmentCertificadoCre());
                    st.setString(13, tempMatricula.getAttachmentExamMedGen());
                    st.setString(14, tempMatricula.getAttachmentExamVis());
                    st.setString(15, tempMatricula.getAttachmentExamAud());
                    st.setString(16, tempMatricula.getAttachmentExamOdon());
                    break;
            }
            System.out.println(query);
            System.out.println(st);
            //st.execute();
            //Conexion.getConexion().commit();
            st.executeUpdate();
            response = 1;
        } catch (SQLException e) {
            try {
                System.err.println("La transaccion no pudo realizarse: " + e.getMessage());
                Conexion.getConexion().rollback();
            } catch (InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(TempMatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("No pudo hacerse el rollback de la transaccion");
                System.err.println("Exception - UsuarioDAo: " + e.getMessage());
            }
            System.out.println("Exception - TempMatriculaDao: " + e.getMessage());
            response = 2;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TempMatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception - TempMatriculaDao: " + ex.getMessage());
            response = 2;
        } finally {
            try {
                //Conexion.getConexion().close();
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                System.out.println("Hubo un error intentando cerrar la conexion: " + e.getMessage());
            }
        }
        return response;
    }

    @Override
    public int actualizar(TempMatricula tempMatricula, int form) {
        int response = 0;
        PreparedStatement st = null;
        try {
            Conexion.getConexion();
            String query = "UPDATE " + Constantes.TABLE_TEMPMATRICULA + " SET ";
            switch (form) {
                case 1:
                    query = query
                            + Constantes.TABLE_TEMPMATRICULA_KIDNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDLASTNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDLASTNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDDATE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDBIRTHLOCATION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDDOCUMENTTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDDOCUMENT + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDDIRECTION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDRH + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_KIDGENERO + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERSTATUS + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERSTATUS + " = ? ";
                    break;
                case 2:
                    query = query
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERLASTNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERLASTNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERDATE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERBIRTHLOCATION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERDOCUMENTTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERDOCUMENT + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERRH + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERPHONE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHEREMAIL + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERDIRECTION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHEREMPLOYER + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHEREMPLOYERTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_MOTHERSALARY + " = ? ";
                    break;
                case 3:
                    query = query
                            + Constantes.TABLE_TEMPMATRICULA_FATHERNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERLASTNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERLASTNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERDATE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERBIRTHLOCATION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERDOCUMENTTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERDOCUMENT + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERRH + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERPHONE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHEREMAIL + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERDIRECTION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHEREMPLOYER + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHEREMPLOYERTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_FATHERSALARY + " = ? ";
                    break;
                case 4:
                    query = query
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTLASTNAME + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTLASTNAME2 + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDATE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTBIRTHLOCATION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDOCUMENTTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDOCUMENT + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTRH + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTGENDER + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTPHONE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTEMAIL + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDIRECTION + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTPARANTEZCO + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTCONDES + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTGRUETN + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTREDU + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTFAMACC + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTEMPLOYER + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTEMPLOYERTYPE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ACUDIENTSALARY + " = ? ";
                    break;
                case 5:
                    query = query
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTFOTOA + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTREGISTROCIVIL + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCERTIFICADOEPS + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCARNETVACUNAS + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCERTIFICADODES + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMMEDGEN + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMVIS + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMAUD + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMODO + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCEDULAMADRE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCARTALABORALM + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCEDULAPADRE + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCARTALABORALP + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTRECIBOPUBLICO + " = ?, "
                            + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXTRAJUICIOCAFAM + " = ? ,"
                            + Constantes.TABLE_TEMPMATRICULA_FORMSTATUS + " = ? ";
                    break;
                default:
            }
            query = query + "WHERE " + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + " = ?";
            st = Conexion.getConexion().prepareStatement(query);
            switch (form) {
                case 1:
                    st.setString(1, tempMatricula.getKidName());
                    st.setString(2, tempMatricula.getKidName2());
                    st.setString(3, tempMatricula.getKidLastname());
                    st.setString(4, tempMatricula.getKidLastname2());
                    st.setDate(5, tempMatricula.getKidDate());
                    st.setString(6, tempMatricula.getKidBirthLocation());
                    st.setInt(7, tempMatricula.getKidDocumentType());
                    st.setString(8, tempMatricula.getKidDocument());
                    st.setString(9, tempMatricula.getKidDirection());
                    st.setString(10, tempMatricula.getKidRH());
                    st.setInt(11, tempMatricula.getKidGenero());
                    st.setInt(12, tempMatricula.getMotherStatus());
                    st.setInt(13, tempMatricula.getFatherStatus());
                    st.setInt(14, tempMatricula.getId_tempMatricula());
                    break;
                case 2:
                    st.setString(1, tempMatricula.getMotherName());
                    st.setString(2, tempMatricula.getMotherNam2());
                    st.setString(3, tempMatricula.getMotherLastname());
                    st.setString(4, tempMatricula.getMotherLastname2());
                    st.setDate(5, tempMatricula.getMotherDate());
                    st.setString(6, tempMatricula.getMotherBirthLocation());
                    st.setInt(7, tempMatricula.getMotherDocumentType());
                    st.setString(8, tempMatricula.getMotherDocument());
                    st.setString(9, tempMatricula.getMotherRH());
                    st.setString(10, tempMatricula.getMotherPhone());
                    st.setString(11, tempMatricula.getMotherEmail());
                    st.setString(12, tempMatricula.getMotherDirection());
                    st.setInt(13, tempMatricula.getMotherEmployer());
                    st.setString(14, tempMatricula.getMotherEmployerType());
                    st.setDouble(15, tempMatricula.getMotherSalary());
                    st.setInt(16, tempMatricula.getId_tempMatricula());
                    break;
                case 3:
                    st.setString(1, tempMatricula.getFatherName());
                    st.setString(2, tempMatricula.getFatherNam2());
                    st.setString(3, tempMatricula.getFatherLastname());
                    st.setString(4, tempMatricula.getFatherLastname2());
                    st.setDate(5, tempMatricula.getFatherDate());
                    st.setString(6, tempMatricula.getFatherBirthLocation());
                    st.setInt(7, tempMatricula.getFatherDocumentType());
                    st.setString(8, tempMatricula.getFatherDocument());
                    st.setString(9, tempMatricula.getFatherRH());
                    st.setString(10, tempMatricula.getFatherPhone());
                    st.setString(11, tempMatricula.getFatherEmail());
                    st.setString(12, tempMatricula.getFatherDirection());
                    st.setInt(13, tempMatricula.getFatherEmployer());
                    st.setString(14, tempMatricula.getFatherEmployerType());
                    st.setDouble(15, tempMatricula.getFatherSalary());
                    st.setInt(16, tempMatricula.getId_tempMatricula());
                    break;
                case 4:
                    st.setString(1, tempMatricula.getAcudientName());
                    st.setString(2, tempMatricula.getAcudientNam2());
                    st.setString(3, tempMatricula.getAcudientLastname());
                    st.setString(4, tempMatricula.getAcudientLastname2());
                    st.setDate(5, tempMatricula.getAcudientDate());
                    st.setString(6, tempMatricula.getAcudientBirthLocation());
                    st.setInt(7, tempMatricula.getAcudientDocumentType());
                    st.setString(8, tempMatricula.getAcudientDocument());
                    st.setString(9, tempMatricula.getAcudientRH());
                    st.setInt(10, tempMatricula.getAcudientGender());
                    st.setString(11, tempMatricula.getAcudientPhone());
                    st.setString(12, tempMatricula.getAcudientEmail());
                    st.setString(13, tempMatricula.getAcudientDirection());
                    st.setInt(14, tempMatricula.getAcudientParentezco());
                    st.setInt(15, tempMatricula.getAcudientCondicionDesp());
                    st.setInt(16, tempMatricula.getAcudientGE());
                    st.setInt(17, tempMatricula.getAcudientRU());
                    st.setInt(18, tempMatricula.getAcudientFA());
                    st.setInt(19, tempMatricula.getAcudientEmployer());
                    st.setString(20, tempMatricula.getAcudientEmployerType());
                    st.setDouble(21, tempMatricula.getAcudientSalary());
                    st.setInt(22, tempMatricula.getId_tempMatricula());
                    break;
                case 5:
                    st.setString(1, tempMatricula.getAttachmentFotoAs());
                    st.setString(2, tempMatricula.getAttachmentRegistroCivil());
                    st.setString(3, tempMatricula.getAttachmentCertificadoEps());
                    st.setString(4, tempMatricula.getAttachmentCertificadoVac());
                    st.setString(5, tempMatricula.getAttachmentCertificadoCre());
                    st.setString(6, tempMatricula.getAttachmentExamMedGen());
                    st.setString(7, tempMatricula.getAttachmentExamVis());
                    st.setString(8, tempMatricula.getAttachmentExamAud());
                    st.setString(9, tempMatricula.getAttachmentExamOdon());
                    st.setString(10, tempMatricula.getAttachmentCedulaMadre());
                    st.setString(11, tempMatricula.getAttachmentCartaLaboMad());
                    st.setString(12, tempMatricula.getAttachmentCedulaPadre());
                    st.setString(13, tempMatricula.getAttachmentCartaLaboPad());
                    st.setString(14, tempMatricula.getAttachmentReciboPublico());
                    st.setString(15, tempMatricula.getAttachmentExtrajuicio());
                    st.setInt(16, tempMatricula.getFormStatus());
                    st.setInt(17, tempMatricula.getId_tempMatricula());
                    break;
                default:
            }
            System.out.println(query);
            System.out.println(st);
            //st.execute();
            st.executeUpdate();
            response = 1;
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error al actualizar el registro: " + ex.getMessage());
            response = 0;
        } catch (InstantiationException ex) {
            Logger.getLogger(TempMatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TempMatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //Conexion.getConexion().close();
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                System.out.println("Hubo un error intentando cerrar la conexion: " + e.getMessage());
            }
        }
        return response;
    }

    @Override
    public String eliminar(TempMatricula tempMatricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TempMatricula buscar(int id_tempMatricula) {
        TempMatricula tm = null;
        try {
            Conexion.getConexion().setAutoCommit(false);
            String sql = "SELECT * FROM " + Constantes.TABLE_TEMPMATRICULA + " WHERE " + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + " = ?";
            PreparedStatement st = Conexion.getConexion().prepareStatement(sql);
            st.setInt(1, id_tempMatricula);
            ResultSet rs = st.executeQuery();
            System.out.println(sql);
            System.out.println(st);
            while (rs.next()) {
                tm = new TempMatricula();
                tm.setId_tempMatricula(rs.getInt(Constantes.TABLE_TEMPMATRICULA_IDREGISTRO));

                tm.setKidName(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDNAME));
                tm.setKidName2(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDNAME2));
                tm.setKidLastname(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDLASTNAME));
                tm.setKidLastname2(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDLASTNAME2));
                tm.setKidDate(rs.getDate(Constantes.TABLE_TEMPMATRICULA_KIDDATE));
                tm.setKidBirthLocation(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDBIRTHLOCATION));
                tm.setKidDocumentType(rs.getInt(Constantes.TABLE_TEMPMATRICULA_KIDDOCUMENTTYPE));
                tm.setKidDocument(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDDOCUMENT));
                tm.setKidDirection(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDDIRECTION));
                tm.setKidRH(rs.getString(Constantes.TABLE_TEMPMATRICULA_KIDRH));
                tm.setKidGenero(rs.getInt(Constantes.TABLE_TEMPMATRICULA_KIDGENERO));

                tm.setMotherName(rs.getString(Constantes.TABLE_TEMPMATRICULA_MOTHERNAME));
                tm.setMotherLastname(rs.getString(Constantes.TABLE_TEMPMATRICULA_MOTHERLASTNAME));
                tm.setMotherDate(rs.getDate(Constantes.TABLE_TEMPMATRICULA_MOTHERDATE));
                tm.setMotherDocumentType(rs.getInt(Constantes.TABLE_TEMPMATRICULA_MOTHERDOCUMENTTYPE));
                tm.setMotherDocument(rs.getString(Constantes.TABLE_TEMPMATRICULA_MOTHERDOCUMENT));
                tm.setMotherDirection(rs.getString(Constantes.TABLE_TEMPMATRICULA_MOTHERDIRECTION));
                tm.setMotherPhone(rs.getString(Constantes.TABLE_TEMPMATRICULA_MOTHERPHONE));
                tm.setMotherEmail(rs.getString(Constantes.TABLE_TEMPMATRICULA_MOTHEREMAIL));
                                
                tm.setFormStatus(rs.getInt(Constantes.TABLE_TEMPMATRICULA_FORMSTATUS));
            }
        } catch (SQLException ex) {
            System.out.println("Exeption: " + ex.getMessage());
        } catch (InstantiationException ex) {
            Logger.getLogger(TempMatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TempMatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println("Exeption: " + ex.getMessage());
        }
        return tm;
    }

    private String getColumQueri(int form, String query) {
        switch (form) {
            case 1:
                query = query
                        + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDLASTNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDLASTNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDDATE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDBIRTHLOCATION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDDOCUMENTTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDDOCUMENT + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDDIRECTION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDRH + ", "
                        + Constantes.TABLE_TEMPMATRICULA_KIDGENERO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERSTATUS + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERSTATUS
                        + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                break;
            case 2:
                query = query
                        + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERLASTNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERLASTNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERDATE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERBIRTHLOCATION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERDOCUMENTTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERDOCUMENT + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERDIRECTION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERRH + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERPHONE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHEREMPLOYER + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHEREMPLOYERTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHERSALARY + ", "
                        + Constantes.TABLE_TEMPMATRICULA_MOTHEREMAIL
                        + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                break;
            case 3:
                query = query
                        + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERLASTNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERLASTNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERDATE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERBIRTHLOCATION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERDOCUMENTTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERDOCUMENT + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERDIRECTION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERRH + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERPHONE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHEREMPLOYER + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHEREMPLOYERTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHERSALARY + ", "
                        + Constantes.TABLE_TEMPMATRICULA_FATHEREMAIL
                        + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                break;
            case 4:
                query = query
                        + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTLASTNAME + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTLASTNAME2 + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDATE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTBIRTHLOCATION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDOCUMENTTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDOCUMENT + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTDIRECTION + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTRH + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTPHONE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTEMPLOYER + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTEMPLOYERTYPE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTSALARY + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTEMAIL + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTGENDER + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTPARANTEZCO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTCONDES + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTREDU + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTFAMACC + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ACUDIENTGRUETN
                        + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                break;
            case 5:
                query = query
                        + Constantes.TABLE_TEMPMATRICULA_IDREGISTRO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTFOTOA + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTREGISTROCIVIL + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCEDULAMADRE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCEDULAPADRE + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCARTALABORALM + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCARTALABORALP + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTRECIBOPUBLICO + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXTRAJUICIOCAFAM + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCERTIFICADOEPS + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCARNETVACUNAS + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTCERTIFICADODES + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMMEDGEN + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMVIS + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMAUD + ", "
                        + Constantes.TABLE_TEMPMATRICULA_ATTACHMENTEXAMODO
                        + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                break;
            default:
                System.out.println("Ya no hay una opccion disponible hdsrpm");
        }
        return query;
    }

}
