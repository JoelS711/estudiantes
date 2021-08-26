/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoelS
 */
public class Conexion {

    static String url = "C:/Users/JoelS/3D Objects/Bases de Datos Sqlite3/bd_estudiantes.db";
    static String bd = "bd_estudiantes.db";
    Connection connection = null;
    public String cadena1 = "Conectado a base de datos";
    public String result;

    public Connection getConnect() {
        Connection conn = null;
        return conn;
    }

    public String getBd() {
        return this.result;
    }

    public Conexion() {
    }

    public Connection connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connection != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
