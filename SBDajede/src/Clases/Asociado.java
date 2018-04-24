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
    
    public boolean telefonoAsociado(int id, String telefono)
    {
        try{                       
            String sql = "INSERT INTO telefono(telefono, Asociado_id)"
                    + "VALUES (?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, telefono);
            pst.setInt(2, id);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Método para insertar asociado
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
            
            //Este es el procedimiento almacenado
            CallableStatement procedimiento = con.prepareCall("{call InsertarAsociado(?,?,?,?,?,?,?,?,?,?,?,?)}");
            procedimiento.setString(1, dpi);
            procedimiento.setBoolean(2, genero);
            procedimiento.setString(3, correo);
            procedimiento.setString(4, fechaNac);
            procedimiento.setString(5, Platyera);
            procedimiento.setString(6, residencia);
            procedimiento.setString(7, nombre);
            procedimiento.setString(8, apellido);
            procedimiento.setBoolean(9, activo);
            procedimiento.setString(10, PerfilFB);
            procedimiento.setInt(11, idTipoSan);
            procedimiento.setInt(12, idNivEst);
            procedimiento.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Asociado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
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
