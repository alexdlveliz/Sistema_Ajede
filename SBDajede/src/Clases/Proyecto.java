/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.CallableStatement;
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
    private ArrayList<Integer> Puestoid;

    public ArrayList<Integer> getPuestoid() {
        return Puestoid;
    }

    //Se hace la conexión a la base de datos
    public Proyecto() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }

    public DefaultComboBoxModel getEdades() {
        try {
            DefaultComboBoxModel datos = new DefaultComboBoxModel();
            String sql = "SELECT DISTINCT YEAR(CURDATE()) - YEAR(FechaNacimiento) + IF(DATE_FORMAT(CURDATE(), '%m-%d') > DATE_FORMAT(FechaNacimiento, '%m-%d'),0,- 1) AS EDAD FROM asociado ORDER BY EDAD;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos.addElement(rs.getObject("EDAD"));
            }
            datos.addElement("Todas las edades");
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel AnioInicio() {
        try {
            DefaultComboBoxModel datos = new DefaultComboBoxModel();
            String sql = "SELECT YEAR(fechaInicio) AS ANIO FROM ajede INNER JOIN asociado ON asociado.id = ajede.Asociado_id GROUP BY ANIO";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos.addElement(rs.getObject("ANIO"));
            }
            datos.addElement("Todos los años");
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel getPromocion() {
        try {
            DefaultComboBoxModel datos = new DefaultComboBoxModel();
            String sql = "SELECT Promocion FROM ajede GROUP BY Promocion;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            datos.addElement("Todos los años");
            while (rs.next()) {
                datos.addElement(rs.getObject("Promocion"));
            }
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel getPrograma() {
        try {
            DefaultComboBoxModel datos = new DefaultComboBoxModel();
            String sql = "SELECT * FROM programa";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            datos.addElement("Todos los programas");
            while (rs.next()) {
                datos.addElement(rs.getObject("nombrePrograma"));
            }
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

    public DefaultTableModel Voluntarios(JTable voluntariado, String nombre, JTable tabla) {
        try {
            String titulos[] = new String[4];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            boolean genero;
            String registros[] = new String[4];
            String sql = "SELECT id, Nombre, Apellido, Genero FROM asociado "
                    + "WHERE Nombre LIKE '%" + nombre + "%' AND Activo = TRUE;";
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
            for (int i = 0; i < voluntariado.getRowCount(); i++) {
                for (int j = 0; j < modelo.getRowCount(); j++) {
                    if (voluntariado.getValueAt(i, 0).equals(modelo.getValueAt(j, 0))) {
                        modelo.removeRow(j);
                    }
                }
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultTableModel volunatariado(int id, JTable tabla, String nombre) {
        try {
            String titulos[] = new String[4];
            for (byte i = 0; i < 4; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            Puestoid = new ArrayList<>();
            String registros[] = new String[4];
            String sql = "SELECT a.id, a.Nombre, a.Apellido, p.puesto, p.id FROM asociado a "
                    + "INNER JOIN voluntariado v ON a.id = v.Asociado_id "
                    + "INNER JOIN puestos p ON p.id = v.Puestos_id "
                    + "WHERE Proyecto_id = " + id
                    + " AND a.Nombre LIKE '%" + nombre + "%' "
                    + "ORDER BY Asociado_id;";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Puestoid.add(rs.getInt("p.id"));
                registros[0] = rs.getString("a.id");
                registros[1] = rs.getString("a.Nombre");
                registros[2] = rs.getString("a.Apellido");
                registros[3] = rs.getString("p.puesto");
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

    public boolean deleteVoluntariado(int idProyecto, int idAsociado) {
        try {
            String sql = "DELETE FROM voluntariado WHERE Asociado_id = ? and Proyecto_id =" + idProyecto;
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setInt(1, idAsociado);
            return Pst.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean insertarVoluntariado(int idProyecto, int idAsociado, float horas, int idPuesto) {
        try {
            /**
             * para insertar al voluntariado se debe tomar en cuenta que los
             * valores que se le insertan esta con ? porque desconocemos que
             * valores va a tomar
             */
            int idA = -1;
            String sql = "SELECT Asociado_id as idA FROM voluntariado v "
                    + "WHERE Proyecto_id = " + idProyecto + " And Asociado_id=" + idAsociado;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            PreparedStatement Pst;
            while (rs.next()) {
                idA = rs.getInt("idA");
            }
            if (idA != -1) {
                sql = "Update voluntariado Set puestos_id= ? where Asociado_id = " + idAsociado;
                Pst = con.prepareStatement(sql);
                Pst.setInt(1, idPuesto);
                int n = Pst.executeUpdate();
                return n != 0;
            } else {
                sql = "Insert into voluntariado(Proyecto_id, Asociado_id, Horas,puestos_id)"
                        + "Values(?,?,?,?)";
                Pst = con.prepareStatement(sql);
                Pst.setInt(1, idProyecto);
                Pst.setInt(2, idAsociado);
                Pst.setFloat(3, 0);
                Pst.setInt(4, idPuesto);
                int n = Pst.executeUpdate();
                return n != 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
