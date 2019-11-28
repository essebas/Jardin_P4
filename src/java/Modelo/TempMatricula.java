/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author zebas
 */
public class TempMatricula {

    private int id_tempMatricula;
    private String kidName;
    private String kidName2;
    private String kidLastname;
    private String kidLastname2;
    private Date kidDate;
    private String kidBirthLocation;
    private int kidDocumentType;
    private String kidDocument;
    private String kidDirection;
    private String kidRH;
    private int kidGenero;

    private String motherName;
    private String motherNam2;
    private String motherLastname;
    private String motherLastname2;
    private Date motherDate;
    private String motherBirthLocation;
    private int motherDocumentType;
    private String motherDocument;
    private String motherDirection;
    private String motherRH;
    private String motherPhone;
    private int motherEmployer;
    private String motherEmployerType;
    private double motherSalary;
    private String motherEmail;

    private String fatherName;
    private String fatherNam2;
    private String fatherLastname;
    private String fatherLastname2;
    private Date fatherDate;
    private String fatherBirthLocation;
    private int fatherDocumentType;
    private String fatherDocument;
    private String fatherDirection;
    private String fatherRH;
    private String fatherPhone;
    private int fatherEmployer;
    private String fatherEmployerType;
    private double fatherSalary;
    private String fatherEmail;

    private String acudientName;
    private String acudientNam2;
    private String acudientLastname;
    private String acudientLastname2;
    private Date acudientDate;
    private String acudientBirthLocation;
    private int acudientDocumentType;
    private String acudientDocument;
    private String acudientDirection;
    private String acudientRH;
    private String acudientPhone;
    private int acudientEmployer;
    private String acudientEmployerType;
    private double acudientSalary;
    private String acudientEmail;
    private int acudientGender;
    private int acudientParentezco;
    private int acudientCondicionDesp;
    private int acudientRU;
    private int acudientFA;
    private int acudientGE;

    private String attachmentFotoAs;
    private String attachmentRegistroCivil;
    private String attachmentCedulaMadre;
    private String attachmentCedulaPadre;
    private String attachmentCartaLaboMad;
    private String attachmentCartaLaboPad;
    private String attachmentReciboPublico;
    private String attachmentExtrajuicio;
    private String attachmentCertificadoEps;
    private String attachmentCertificadoVac;
    private String attachmentCertificadoCre;
    private String attachmentExamMedGen;
    private String attachmentExamVis;
    private String attachmentExamAud;
    private String attachmentExamOdon;

    private int motherStatus;
    private int fatherStatus;
    private int formStatus;

    public TempMatricula() {
        this.kidName = "";
        this.kidName2 = "";
        this.kidLastname = "";
        this.kidDate = null;
        this.kidBirthLocation = "";
        this.kidDocumentType = 0;
        this.kidDocument = "";
        this.kidRH = "";
        this.kidGenero = 0;

        this.motherName = "";
        this.motherLastname = "";
        this.motherDate = null;
        this.motherBirthLocation = "";
        this.motherDocumentType = 0;
        this.motherDocument = "";
        this.motherDirection = "";
        this.motherPhone = "";
        this.motherEmployer = 0;
        this.motherEmployerType = "";
        this.motherSalary = 0;
        this.motherEmail = "";

        this.fatherName = "";
        this.fatherNam2 = "";
        this.fatherLastname = "";
        this.fatherLastname2 = "";
        this.fatherDate = null;
        this.fatherBirthLocation = "";
        this.fatherDocumentType = 0;
        this.fatherDocument = "";
        this.fatherDirection = "";
        this.fatherRH = "";
        this.fatherPhone = "";
        this.fatherEmployer = 0;
        this.fatherEmployerType = "";
        this.fatherSalary = 0;
        this.fatherEmail = "";

        this.acudientName = "";
        this.acudientNam2 = "";
        this.acudientLastname = "";
        this.acudientLastname2 = "";
        this.acudientDate = null;
        this.acudientBirthLocation = "";
        this.acudientDocumentType = 0;
        this.acudientDocument = "";
        this.acudientDirection = "";
        this.acudientRH = "";
        this.acudientPhone = "";
        this.acudientEmployer = 0;
        this.acudientEmployerType = "";
        this.acudientSalary = 0;
        this.acudientEmail = "";
        this.acudientGender = 0;
        this.acudientParentezco = 0;
        this.acudientCondicionDesp = 0;
        this.acudientRU = 0;
        this.acudientFA = 0;
        this.acudientGE = 0;

        this.attachmentFotoAs = "";
        this.attachmentRegistroCivil = "";
        this.attachmentCedulaMadre = "";
        this.attachmentCedulaPadre = "";
        this.attachmentCartaLaboMad = "";
        this.attachmentCartaLaboPad = "";
        this.attachmentReciboPublico = "";
        this.attachmentExtrajuicio = "";
        this.attachmentCertificadoEps = "";
        this.attachmentCertificadoVac = "";
        this.attachmentCertificadoCre = "";
        this.attachmentExamMedGen = "";
        this.attachmentExamVis = "";
        this.attachmentExamAud = "";
        this.attachmentExamOdon = "";

        this.motherStatus = 0;
        this.fatherStatus = 0;
        this.formStatus = 0;
    }

    public TempMatricula(int id_tempMatricula, String kidName, String kidLastname, Date kidDate, int kidDocumentType, String kidDocument, String kidRH, int kidGenero, String motherName, String motherLastname, Date motherDate, int motherDocumentType, String motherDocument, String motherDirection, int motherPhone, String motherEmail) {
        this.id_tempMatricula = id_tempMatricula;
        this.kidName = kidName;
        this.kidLastname = kidLastname;
        this.kidDate = kidDate;
        this.kidDocumentType = kidDocumentType;
        this.kidDocument = kidDocument;
        this.kidRH = kidRH;
        this.kidGenero = kidGenero;
        this.motherName = motherName;
        this.motherLastname = motherLastname;
        this.motherDate = motherDate;
        this.motherDocumentType = motherDocumentType;
        this.motherDocument = motherDocument;
        this.motherDirection = motherDirection;
        this.motherPhone = "";
        this.motherEmail = motherEmail;
    }

    public int getMotherStatus() {
        return motherStatus;
    }

    public void setMotherStatus(int motherStatus) {
        this.motherStatus = motherStatus;
    }

    public int getFatherStatus() {
        return fatherStatus;
    }

    public void setFatherStatus(int fatherStatus) {
        this.fatherStatus = fatherStatus;
    }

    public int getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(int formStatus) {
        this.formStatus = formStatus;
    }
    
    

    public String getAttachmentFotoAs() {
        return attachmentFotoAs;
    }

    public void setAttachmentFotoAs(String attachmentFotoAs) {
        this.attachmentFotoAs = attachmentFotoAs;
    }

    public String getAttachmentRegistroCivil() {
        return attachmentRegistroCivil;
    }

    public void setAttachmentRegistroCivil(String attachmentRegistroCivil) {
        this.attachmentRegistroCivil = attachmentRegistroCivil;
    }

    public String getAttachmentCedulaMadre() {
        return attachmentCedulaMadre;
    }

    public void setAttachmentCedulaMadre(String attachmentCedulaMadre) {
        this.attachmentCedulaMadre = attachmentCedulaMadre;
    }

    public String getAttachmentCedulaPadre() {
        return attachmentCedulaPadre;
    }

    public void setAttachmentCedulaPadre(String attachmentCedulaPadre) {
        this.attachmentCedulaPadre = attachmentCedulaPadre;
    }

    public String getAttachmentCartaLaboMad() {
        return attachmentCartaLaboMad;
    }

    public void setAttachmentCartaLaboMad(String attachmentCartaLaboMad) {
        this.attachmentCartaLaboMad = attachmentCartaLaboMad;
    }

    public String getAttachmentCartaLaboPad() {
        return attachmentCartaLaboPad;
    }

    public void setAttachmentCartaLaboPad(String attachmentCartaLaboPad) {
        this.attachmentCartaLaboPad = attachmentCartaLaboPad;
    }

    public String getAttachmentReciboPublico() {
        return attachmentReciboPublico;
    }

    public void setAttachmentReciboPublico(String attachmentReciboPublico) {
        this.attachmentReciboPublico = attachmentReciboPublico;
    }

    public String getAttachmentExtrajuicio() {
        return attachmentExtrajuicio;
    }

    public void setAttachmentExtrajuicio(String attachmentExtrajuicio) {
        this.attachmentExtrajuicio = attachmentExtrajuicio;
    }

    public String getAttachmentCertificadoEps() {
        return attachmentCertificadoEps;
    }

    public void setAttachmentCertificadoEps(String attachmentCertificadoEps) {
        this.attachmentCertificadoEps = attachmentCertificadoEps;
    }

    public String getAttachmentCertificadoVac() {
        return attachmentCertificadoVac;
    }

    public void setAttachmentCertificadoVac(String attachmentCertificadoVac) {
        this.attachmentCertificadoVac = attachmentCertificadoVac;
    }

    public String getAttachmentCertificadoCre() {
        return attachmentCertificadoCre;
    }

    public void setAttachmentCertificadoCre(String attachmentCertificadoCre) {
        this.attachmentCertificadoCre = attachmentCertificadoCre;
    }

    public String getAttachmentExamMedGen() {
        return attachmentExamMedGen;
    }

    public void setAttachmentExamMedGen(String attachmentExamMedGen) {
        this.attachmentExamMedGen = attachmentExamMedGen;
    }

    public String getAttachmentExamVis() {
        return attachmentExamVis;
    }

    public void setAttachmentExamVis(String attachmentExamVis) {
        this.attachmentExamVis = attachmentExamVis;
    }

    public String getAttachmentExamAud() {
        return attachmentExamAud;
    }

    public void setAttachmentExamAud(String attachmentExamAud) {
        this.attachmentExamAud = attachmentExamAud;
    }

    public String getAttachmentExamOdon() {
        return attachmentExamOdon;
    }

    public void setAttachmentExamOdon(String attachmentExamOdon) {
        this.attachmentExamOdon = attachmentExamOdon;
    }

    public String getAcudientName() {
        return acudientName;
    }

    public void setAcudientName(String acudientName) {
        this.acudientName = acudientName;
    }

    public String getAcudientNam2() {
        return acudientNam2;
    }

    public void setAcudientNam2(String acudientNam2) {
        this.acudientNam2 = acudientNam2;
    }

    public String getAcudientLastname() {
        return acudientLastname;
    }

    public void setAcudientLastname(String acudientLastname) {
        this.acudientLastname = acudientLastname;
    }

    public String getAcudientLastname2() {
        return acudientLastname2;
    }

    public void setAcudientLastname2(String acudientLastname2) {
        this.acudientLastname2 = acudientLastname2;
    }

    public Date getAcudientDate() {
        return acudientDate;
    }

    public void setAcudientDate(Date acudientDate) {
        this.acudientDate = acudientDate;
    }

    public String getAcudientBirthLocation() {
        return acudientBirthLocation;
    }

    public void setAcudientBirthLocation(String acudientBirthLocation) {
        this.acudientBirthLocation = acudientBirthLocation;
    }

    public int getAcudientDocumentType() {
        return acudientDocumentType;
    }

    public void setAcudientDocumentType(int acudientDocumentType) {
        this.acudientDocumentType = acudientDocumentType;
    }

    public String getAcudientDocument() {
        return acudientDocument;
    }

    public void setAcudientDocument(String acudientDocument) {
        this.acudientDocument = acudientDocument;
    }

    public String getAcudientDirection() {
        return acudientDirection;
    }

    public void setAcudientDirection(String acudientDirection) {
        this.acudientDirection = acudientDirection;
    }

    public String getAcudientRH() {
        return acudientRH;
    }

    public void setAcudientRH(String acudientRH) {
        this.acudientRH = acudientRH;
    }

    public String getAcudientPhone() {
        return acudientPhone;
    }

    public void setAcudientPhone(String acudientPhone) {
        this.acudientPhone = acudientPhone;
    }

    public int getAcudientEmployer() {
        return acudientEmployer;
    }

    public void setAcudientEmployer(int acudientEmployer) {
        this.acudientEmployer = acudientEmployer;
    }

    public String getAcudientEmployerType() {
        return acudientEmployerType;
    }

    public void setAcudientEmployerType(String acudientEmployerType) {
        this.acudientEmployerType = acudientEmployerType;
    }

    public double getAcudientSalary() {
        return acudientSalary;
    }

    public void setAcudientSalary(double acudientSalary) {
        this.acudientSalary = acudientSalary;
    }

    public String getAcudientEmail() {
        return acudientEmail;
    }

    public void setAcudientEmail(String acudientEmail) {
        this.acudientEmail = acudientEmail;
    }

    public int getAcudientGender() {
        return acudientGender;
    }

    public void setAcudientGender(int acudientGender) {
        this.acudientGender = acudientGender;
    }

    public int getAcudientParentezco() {
        return acudientParentezco;
    }

    public void setAcudientParentezco(int acudientParentezco) {
        this.acudientParentezco = acudientParentezco;
    }

    public int getAcudientCondicionDesp() {
        return acudientCondicionDesp;
    }

    public void setAcudientCondicionDesp(int acudientCondicionDesp) {
        this.acudientCondicionDesp = acudientCondicionDesp;
    }

    public int getAcudientRU() {
        return acudientRU;
    }

    public void setAcudientRU(int acudientRU) {
        this.acudientRU = acudientRU;
    }

    public int getAcudientFA() {
        return acudientFA;
    }

    public void setAcudientFA(int acudientFA) {
        this.acudientFA = acudientFA;
    }

    public int getAcudientGE() {
        return acudientGE;
    }

    public void setAcudientGE(int acudientGE) {
        this.acudientGE = acudientGE;
    }

    public int getMotherEmployer() {
        return motherEmployer;
    }

    public void setMotherEmployer(int motherEmployer) {
        this.motherEmployer = motherEmployer;
    }

    public String getMotherEmployerType() {
        return motherEmployerType;
    }

    public void setMotherEmployerType(String motherEmployerType) {
        this.motherEmployerType = motherEmployerType;
    }

    public double getMotherSalary() {
        return motherSalary;
    }

    public void setMotherSalary(double motherSalary) {
        this.motherSalary = motherSalary;
    }

    public String getMotherRH() {
        return motherRH;
    }

    public void setMotherRH(String motherRH) {
        this.motherRH = motherRH;
    }

    public String getKidDirection() {
        return kidDirection;
    }

    public void setKidDirection(String kidDirection) {
        this.kidDirection = kidDirection;
    }

    public String getKidBirthLocation() {
        return kidBirthLocation;
    }

    public void setKidBirthLocation(String kidBirthLocation) {
        this.kidBirthLocation = kidBirthLocation;
    }

    public String getMotherBirthLocation() {
        return motherBirthLocation;
    }

    public void setMotherBirthLocation(String motherBirthLocation) {
        this.motherBirthLocation = motherBirthLocation;
    }

    public String getKidLastname2() {
        return kidLastname2;
    }

    public void setKidLastname2(String kidLastname2) {
        this.kidLastname2 = kidLastname2;
    }

    public String getMotherNam2() {
        return motherNam2;
    }

    public void setMotherNam2(String motherNam2) {
        this.motherNam2 = motherNam2;
    }

    public String getMotherLastname2() {
        return motherLastname2;
    }

    public void setMotherLastname2(String motherLastname2) {
        this.motherLastname2 = motherLastname2;
    }

    public String getKidName2() {
        return kidName2;
    }

    public void setKidName2(String kidName2) {
        this.kidName2 = kidName2;
    }

    public int getId_tempMatricula() {
        return id_tempMatricula;
    }

    public void setId_tempMatricula(int id_tempMatricula) {
        this.id_tempMatricula = id_tempMatricula;
    }

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }

    public String getKidLastname() {
        return kidLastname;
    }

    public void setKidLastname(String kidLastname) {
        this.kidLastname = kidLastname;
    }

    public Date getKidDate() {
        return kidDate;
    }

    public void setKidDate(Date kidDate) {
        this.kidDate = kidDate;
    }

    public int getKidDocumentType() {
        return kidDocumentType;
    }

    public void setKidDocumentType(int kidDocumentType) {
        this.kidDocumentType = kidDocumentType;
    }

    public String getKidDocument() {
        return kidDocument;
    }

    public void setKidDocument(String kidDocument) {
        this.kidDocument = kidDocument;
    }

    public String getKidRH() {
        return kidRH;
    }

    public void setKidRH(String kidRH) {
        this.kidRH = kidRH;
    }

    public int getKidGenero() {
        return kidGenero;
    }

    public void setKidGenero(int kidGenero) {
        this.kidGenero = kidGenero;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherLastname() {
        return motherLastname;
    }

    public void setMotherLastname(String motherLastname) {
        this.motherLastname = motherLastname;
    }

    public Date getMotherDate() {
        return motherDate;
    }

    public void setMotherDate(Date motherDate) {
        this.motherDate = motherDate;
    }

    public int getMotherDocumentType() {
        return motherDocumentType;
    }

    public void setMotherDocumentType(int motherDocumentType) {
        this.motherDocumentType = motherDocumentType;
    }

    public String getMotherDocument() {
        return motherDocument;
    }

    public void setMotherDocument(String motherDocument) {
        this.motherDocument = motherDocument;
    }

    public String getMotherDirection() {
        return motherDirection;
    }

    public void setMotherDirection(String motherDirection) {
        this.motherDirection = motherDirection;
    }

    public String getMotherPhone() {
        return motherPhone;
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
    }

    public String getMotherEmail() {
        return motherEmail;
    }

    public void setMotherEmail(String motherEmail) {
        this.motherEmail = motherEmail;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherNam2() {
        return fatherNam2;
    }

    public void setFatherNam2(String fatherNam2) {
        this.fatherNam2 = fatherNam2;
    }

    public String getFatherLastname() {
        return fatherLastname;
    }

    public void setFatherLastname(String fatherLastname) {
        this.fatherLastname = fatherLastname;
    }

    public String getFatherLastname2() {
        return fatherLastname2;
    }

    public void setFatherLastname2(String fatherLastname2) {
        this.fatherLastname2 = fatherLastname2;
    }

    public Date getFatherDate() {
        return fatherDate;
    }

    public void setFatherDate(Date fatherDate) {
        this.fatherDate = fatherDate;
    }

    public String getFatherBirthLocation() {
        return fatherBirthLocation;
    }

    public void setFatherBirthLocation(String fatherBirthLocation) {
        this.fatherBirthLocation = fatherBirthLocation;
    }

    public int getFatherDocumentType() {
        return fatherDocumentType;
    }

    public void setFatherDocumentType(int fatherDocumentType) {
        this.fatherDocumentType = fatherDocumentType;
    }

    public String getFatherDocument() {
        return fatherDocument;
    }

    public void setFatherDocument(String fatherDocument) {
        this.fatherDocument = fatherDocument;
    }

    public String getFatherDirection() {
        return fatherDirection;
    }

    public void setFatherDirection(String fatherDirection) {
        this.fatherDirection = fatherDirection;
    }

    public String getFatherRH() {
        return fatherRH;
    }

    public void setFatherRH(String fatherRH) {
        this.fatherRH = fatherRH;
    }

    public String getFatherPhone() {
        return fatherPhone;
    }

    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
    }

    public int getFatherEmployer() {
        return fatherEmployer;
    }

    public void setFatherEmployer(int fatherEmployer) {
        this.fatherEmployer = fatherEmployer;
    }

    public String getFatherEmployerType() {
        return fatherEmployerType;
    }

    public void setFatherEmployerType(String fatherEmployerType) {
        this.fatherEmployerType = fatherEmployerType;
    }

    public double getFatherSalary() {
        return fatherSalary;
    }

    public void setFatherSalary(double fatherSalary) {
        this.fatherSalary = fatherSalary;
    }

    public String getFatherEmail() {
        return fatherEmail;
    }

    public void setFatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
    }

}
