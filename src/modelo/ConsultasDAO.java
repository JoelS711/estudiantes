/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author JoelS
 */
public class ConsultasDAO {

    Conexion con = new Conexion();
    public javax.swing.JTextArea txtsalida = null;

    public boolean ingresarEstudiante(EstudiantesDTO est) {
        PreparedStatement ps = null;
        String sqlite = "INSERT INTO estudiantes (nombre, apellido, fecha_nac, correo_ins, correo_per, celular, fijo, programa) VALUES(?,?,?,?,?,?,?,?)";
        try {
            ps = con.connect().prepareStatement(sqlite);
            ps.setString(1, est.getNombres());
            ps.setString(2, est.getApellidos());
            ps.setString(3, est.getFec_nac());
            ps.setString(4, est.getCor_ins());
            ps.setString(5, est.getCor_per());
            ps.setLong(6, est.getCelular());
            ps.setLong(7, est.getFijo());
            ps.setString(8, est.getPrograma());
            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }

    }

    public boolean modificarEstudiante(EstudiantesDTO est) {
        PreparedStatement ps = null;
        String sqlite = "UPDATE estudiantes SET correo_per=?, celular=?, fijo=?, programa=? WHERE correo_ins=?";
        try {
            ps = con.connect().prepareStatement(sqlite);
            ps.setString(1, est.getCor_per());
            ps.setLong(2, est.getCelular());
            ps.setLong(3, est.getFijo());
            ps.setString(4, est.getPrograma());
            ps.setString(5, est.getCor_ins());
            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }

    }

    public boolean eliminarEstudiante(EstudiantesDTO est) {
        PreparedStatement ps = null;
        String sqlite = "DELETE FROM estudiantes WHERE correo_ins=?";
        try {
            ps = con.connect().prepareStatement(sqlite);
            ps.setString(1, est.getCor_ins());
            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();
        }

    }

    public boolean buscarEstudiante(EstudiantesDTO est) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sqlite = "SELECT * FROM estudiantes WHERE correo_ins=?";
        try {
            ps = con.connect().prepareStatement(sqlite);
            ps.setString(1, est.getCor_ins());
            rs = ps.executeQuery();
            while (rs.next()) {
                est.setNombres(rs.getString("nombre"));
                est.setApellidos(rs.getString("apellido"));
                est.setFec_nac(rs.getString("fecha_nac"));
                est.setCor_ins(rs.getString("correo_ins"));
                est.setCor_per(rs.getString("correo_per"));
                est.setCelular(rs.getLong("celular"));
                est.setFijo(rs.getLong("fijo"));
                est.setPrograma(rs.getString("programa"));
                return true;

            }

            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();

        }

    }

    public boolean mostrarEstudiante(EstudiantesDTO est) {
        String sqlite = "SELECT * FROM estudiantes";
        String texto = "";
        txtsalida = new javax.swing.JTextArea();
        txtsalida.setColumns(40);
        txtsalida.setRows(20);
//        String titulos = "Nombres   |    Apellidos    |  FechaNacimiento   |   CorreoInstitucional    |    CorreoPersonal    |   Celular     |   Fijo      |     Programa";
//        txtsalida.append(titulos);

        try {
            Statement st = con.connect().createStatement();
            ResultSet rs = st.executeQuery(sqlite);

            while (rs.next()) {
                texto = "\n" +"\n" + rs.getString("nombre") + "\n" + rs.getString("apellido") + "\n" + rs.getString("fecha_nac") + "\n" + rs.getString("correo_ins") + "\n" + rs.getString("correo_per") + "\n" + rs.getString("celular") + "\n" + rs.getString("fijo") + "\n" + rs.getString("programa");

                txtsalida.append(texto);
            }
            JOptionPane.showMessageDialog(null, new JScrollPane(txtsalida));
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            con.close();

        }

    }
}
