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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mynor
 */
public class Asociado {

    private Connection con = null;
    private final Conexion conexion;

    public Asociado() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    public boolean insertar(String nombre,String apellido, boolean genero,String fechaNac, String correo, String Platyera,
                            String residencia, boolean activo, String PerfilFB, String tipoSangre, String nivEst, String dpi)
    {
        try {
            int idNivEst = 0;
            String sql = "select id from nivelestudio where NivelEstudio= '" + nivEst + "'";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                idNivEst = Rs.getInt("id");
            }
            int idTipoSan = 0;
            sql = "select id from tipodesangre where tipoSangre= '" + tipoSangre + "'";
            St = con.createStatement();
            Rs = St.executeQuery(sql);
            while (Rs.next()) {
                idTipoSan = Rs.getInt("id");
            }
            sql = "Insert into asociado(Nombre, Apellido, Activo, Genero, DPI, FechaNacimiento, TallaPlayera, CorreoElectronico,"
                    + "Residencia, PerfilFacebook, TipoDeSangre_id, NivelEstudio_id)"
                    + "Values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement Pst = con.prepareStatement(sql);
            Pst.setString(1, nombre);
            Pst.setString(2, apellido);
            Pst.setBoolean(3, activo);
            Pst.setBoolean(4, genero);
            Pst.setString(5, dpi);
            Pst.setString(6, fechaNac);
            Pst.setString(7, Platyera);
            Pst.setString(8, correo);
            Pst.setString(9, residencia);
            Pst.setString(10, PerfilFB);
            Pst.setInt(11, idTipoSan);
            Pst.setInt(12, idNivEst);
            int n = Pst.executeUpdate();
            return n != 0;
        } catch (SQLException ex) {
            Logger.getLogger(Asociado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public DefaultComboBoxModel NivEst() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        try {
            String sql = "SELECT * FROM nivelestudio";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                modeloCombo.addElement(Rs.getString("NivelEstudio"));
            }
            return modeloCombo;
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloCombo;
    }
}
