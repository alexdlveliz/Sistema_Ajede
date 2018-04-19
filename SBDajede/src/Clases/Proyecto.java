/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hectortllo
 */
public class Proyecto extends Usuario {

    private Connection con = null;
    private final Conexion conexion;
    private final ArrayList<Long> fechas;

    //Se hace la conexión a la base de datos
    public Proyecto() {
        conexion = new Conexion();
        con = conexion.getConnection();
        fechas = new ArrayList<>();
    }

    public ArrayList<Long> getFechas() {
        return fechas;
    }

    public DefaultComboBoxModel getEdades() {
        try {
            DefaultComboBoxModel datos = new DefaultComboBoxModel();
            String sql = "SELECT DISTINCT YEAR(FechaNacimiento) AS anio, YEAR(NOW()) as anioA FROM asociado ORDER BY anio DESC;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                fechas.add(rs.getLong("anio"));
                datos.addElement((rs.getInt("anioA") - rs.getInt("anio")));
            }
            datos.addElement("Todas las edades");
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Método para insertarProyecto proyecto
    public boolean insertarProyecto(String nombre, String descripcion) {
        try {
            String sql = "INSERT INTO proyecto(nombreProyecto, descripcion,finalizado)"
                    + "VALUES (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, descripcion);
            pst.setBoolean(3, false);
            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultTableModel Voluntarios(String nombre, JTable tabla) {
        try {
            String titulos[] = new String[4];
            for (byte i = 0; i < 3; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            boolean genero;
            String registros[] = new String[4];
            String sql = "select id, Nombre, Apellido, Genero, YEAR(NOW()) as anio from asociado where Nombre LIKE '%" + nombre + "%' and Activo=true";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                genero = rs.getBoolean("Genero");
                if (genero) {
                    registros[3] = "Masculino";
                } else {
                    registros[3] = "Femenino";
                }
                modelo.addRow(registros);
            }

            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultTableModel Proyectos(String nombre, JTable tabla) {
        try {
            String titulos[] = new String[3];
            for (byte i = 0; i < 3; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            boolean genero;
            String registros[] = new String[3];
            String sql = "Select id, nombreProyecto, descripcion  from proyecto where nombreProyecto LIKE '%" + nombre + "%' and finalizado=false";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                registros[0] = rs.getString("id");
                registros[1] = rs.getString("nombreProyecto");
                registros[2] = rs.getString("descripcion");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean insertarVoluntariado(int idProyecto, int idAsociado, float horas, int idPuesto) {
        try {
            /**
             * para insertar al voluntariado se debe tomar en cuenta que los
             * valores que se le insertan esta con ? porque desconocemos que
             * valores va a tomar
             *
             */
            String sql = "Insert into voluntariado(Proyecto_id, Asociado_id, Horas,puestos_id)"
                    + "Values(?,?,?,?)";
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setInt(1, idProyecto);
            Pst.setInt(2, idAsociado);
            Pst.setFloat(3, 0);
            Pst.setInt(4, idPuesto);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
