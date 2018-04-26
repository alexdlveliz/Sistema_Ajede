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

    public boolean insertar(String nombreA, String apellidoA, boolean generoA,String fechaNacA, String correoA, 
            String PlatyeraA,String residenciaA, boolean activoA, String PerfilFBA, String tipoSangreA, String nivEstA, 
            String dpiA, String telefonoA, boolean estudiaA, String lugarEstudioA, boolean trabajaA, String lugarTrabajoA,
            String hospital, String enfermedad, String alergia, String dpiE, String emailE, String nombreE, 
            String apellidoE, String residenciaE, int nivEstE, boolean estudiaE, boolean trabajaE, String lugartrabajoE,
            String telefonoE, String relacion, String nombreEmer, String apellidoEmer, String telefonoEmer)
    {
        try {
            int idNivEst = 0;
            String sql = "select id from nivelestudio where NivelEstudio= '" + nivEstA + "'";
            Statement St = con.createStatement();
            ResultSet Rs = St.executeQuery(sql);
            while (Rs.next()) {
                idNivEst = Rs.getInt("id");
            }
            int idTipoSan = 0;
            sql = "select id from tipodesangre where tipoSangre= '" + tipoSangreA + "'";
            St = con.createStatement();
            Rs = St.executeQuery(sql);
            while (Rs.next()) {
                idTipoSan = Rs.getInt("id");
            }
            
            int idNivEstEnc = 0;
            sql = "SELECT id FROM nivelestudio where NivelEstudio= '" + nivEstE + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                idNivEstEnc = rs.getInt("id");
            }
            
            //Este es el procedimiento almacenado
            CallableStatement procedimiento = con.prepareCall("{call InsertarAsociado(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            procedimiento.setString(1, dpiA);
            procedimiento.setBoolean(2, generoA);
            procedimiento.setString(3, correoA);
            procedimiento.setString(4, fechaNacA);
            procedimiento.setString(5, PlatyeraA);
            procedimiento.setString(6, residenciaA);
            procedimiento.setString(7, nombreA);
            procedimiento.setString(8, apellidoA);
            procedimiento.setBoolean(9, activoA);
            procedimiento.setString(10, PerfilFBA);
            procedimiento.setInt(11, idTipoSan);
            procedimiento.setInt(12, idNivEst);
            procedimiento.setString(13, telefonoA);
            procedimiento.setBoolean(14, estudiaA);
            procedimiento.setString(15, lugarEstudioA);
            procedimiento.setBoolean(16, trabajaA);
            procedimiento.setString(17, lugarTrabajoA);
            procedimiento.setString(18, hospital);
            procedimiento.setString(19, enfermedad);
            procedimiento.setString(20, alergia);
            procedimiento.setString(21, dpiE);
            procedimiento.setString(22, emailE);
            procedimiento.setString(23, nombreE);
            procedimiento.setString(24, apellidoE);
            procedimiento.setString(25, residenciaE);
            procedimiento.setInt(26, idNivEstEnc);
            procedimiento.setBoolean(27, false);
            procedimiento.setBoolean(28, trabajaE);
            procedimiento.setString(20, lugartrabajoE);
            procedimiento.setString(30, telefonoE);
            procedimiento.setString(31, relacion);
            procedimiento.setString(32, nombreEmer);
            procedimiento.setString(33, apellidoEmer);
            procedimiento.setString(34, telefonoEmer);
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
