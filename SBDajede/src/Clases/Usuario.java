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

/**
 *
 * @author mynor
 */
public class Usuario {

    private Connection con = null;
    private final Conexion conexion;

    public Usuario() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }

    /**
     * metodo para insertar a los usuarios a la base de datos.
     *
     * @param nombre
     * @param apellido
     * @param contrasenia
     * @param Puesto
     * @param email
     * @return
     */
    public boolean insertar(String nombre, String apellido, String contrasenia, int Puesto, String email) {
        try {
            /**
             * Al ya obtener el id del puesto se hace la siguente sentencia sql
             * para insertar al usuario se debe tomar en cuenta que los valores
             * que se le insertan esta con ? porque desconocemos que valores va
             * a tomar
             *
             */
            String sql = "Insert into usuario(nombreusuario, contrasenia, nombre, apellido,puestos_id)"
                    + "Values(?,?,?,?,?)";
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setString(1, email);
            Pst.setString(2, contrasenia);
            Pst.setString(3, nombre);
            Pst.setString(4, apellido);
            Pst.setInt(5, Puesto);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Metodo que va a retornar a los puestos que existen en la base de datos se
     * retorna un DefaultComboBox
     *
     * @return
     */
    public DefaultComboBoxModel<String> puestos() {
        /**
         * Se declara un defaultcombobox despues se hace la consulta a la tabla
         * puestos para obtener todos los puestos que puede haber en la
         * asociacion.
         */
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        try {
            String sql = "SELECT * FROM puestos";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                if (Rs.getInt("id") != 1) {
                    modeloCombo.addElement(Rs.getString("puesto"));
                }
            }
            //se retorna el modelo,
            return modeloCombo;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloCombo;
    }

    /**
     * metodo que nos sirve para retornar en un combo box a todos los usuarios,
     * que en este caso sera para el login. Ignorando a los que son
     * administradores ya qie el administrador servirá nada mas para agregar mas
     * usuarios
     *
     * @param usuario
     * @param Password
     * @return
     */
    public boolean RestablecerContrasenia(int usuario, String Password) {
        try {
            String sql = "Update usuario Set contrasenia = ? where id = " + usuario;
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setString(1, Password);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public DefaultComboBoxModel usuarios() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        try {
            String sql = "SELECT * FROM usuario";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                modeloCombo.addElement(Rs.getString("nombreusuario"));
            }
            return modeloCombo;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloCombo;
    }

    /**
     * Este metodo recibe 2 parametros que es la contraseña y el usuario se hace
     * una consulta a la tabla usuarios para obtener la contraseña (encriptada
     * ya) y se compara con la contraseña que se recibe como parametro (igual ya
     * encriptada) si es igual regresa true si no false
     *
     * @param contrasenia
     * @param usuario
     * @return
     */
    public boolean verificarSesion(String contrasenia, String usuario) {
        try {
            String sql = "SELECT contrasenia FROM usuario where nombreusuario='" + usuario + "'";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            String pass = "";
            while (Rs.next()) {
                pass = Rs.getString("contrasenia");
            }
            System.out.println(pass);
            System.out.println(contrasenia);
            return pass.equals(contrasenia);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Object> datos(int id) {
        try {
            ArrayList<Object> info = new ArrayList<>();
            String sql = "SELECT * FROM usuario where id=" + id;
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                info.add(Rs.getString("Nombre"));
                info.add(Rs.getString("Apellido"));
                info.add(Rs.getString("nombreusuario"));
                info.add(Rs.getInt("puestos_id"));
            }
            return info;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean Update(String nombre, String apellido, String contrasenia, int Puesto, String email, int id) {
        try {
            String sql = "Update usuario Set nombreusuario = ?, contrasenia = ?, nombre = ?, apellido = ?, puestos_id = ? where id = ?";
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setString(1, email);
            Pst.setString(2, contrasenia);
            Pst.setString(3, nombre);
            Pst.setString(4, apellido);
            Pst.setInt(5, Puesto);
            Pst.setInt(6, id);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
