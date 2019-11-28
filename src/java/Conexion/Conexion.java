/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zebas
 */
public class Conexion {
    private static Connection conexion = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERDB = "root";
    private static final String PASSWORDDB = "";
    private static final String JDBC = "jdbc:mysql://localhost:3306/jardin_p4?zeroDateTimeBehavior=convertToNull";    
    
    private Conexion() throws InstantiationException, IllegalAccessException {
    }

    public static java.sql.Connection getConexion() throws InstantiationException, IllegalAccessException {
        try {
            if (conexion == null) {
                Runtime.getRuntime().addShutdownHook(new getClose());//Si el programa esta corriendo y lo cierra el usuario, ejecuta el metodo de desconexion
                Class.forName(DRIVER).newInstance();
                conexion = DriverManager.getConnection(JDBC, USERDB, PASSWORDDB);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Exeption: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Exeption: " + ex.getMessage());
        }
        return conexion;
    }

    static class getClose extends Thread {
        @Override
        public void run() {
            try {
                java.sql.Connection conn = Conexion.getConexion();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Error en la conexion: " + ex.getMessage());
            } catch (InstantiationException ex) {
                System.out.println("Error en la conexion: " + ex.getMessage());
            } catch (IllegalAccessException ex) {
                System.out.println("Error en la conexion: " + ex.getMessage());
            }
        }

    }
}
