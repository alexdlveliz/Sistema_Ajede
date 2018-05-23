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
//CREATE PROCEDURE InsertarAsociado(vDPI VARCHAR(15), vGenero BOOLEAN, vEmail VARCHAR(30), vFechaNacimiento DATE, vTallaPlayera VARCHAR(2),
//	vResidencia VARCHAR(45), vNombre VARCHAR(35), vApellido VARCHAR(35), vActivo BOOLEAN, vFacebook VARCHAR(25), vTipoSangre INT, vNivelEstudio INT,
//    vTelefono VARCHAR(12), vEstudia BOOLEAN, vlugarEstudio VARCHAR(100), vTrabaja BOOLEAN, vlugarTrabajo VARCHAR(100),
//    vHospital VARCHAR(30), vEnfermedad VARCHAR(30), vAlergia VARCHAR(45), vDPIEnc VARCHAR(15), vEmailEnc VARCHAR(30), vNombreEnc VARCHAR(30), 
//    vApellidoEnc VARCHAR(30), vResidenciaEnc VARCHAR(45), vNivelEstudioEnc INT, vEstudiaEnc BOOLEAN, vTrabajaEnc BOOLEAN, vlugarTrabajoEnc VARCHAR(100), 
//    vTelefonoEnc VARCHAR(12), vRelacion VARCHAR(20), vNombreEmer VARCHAR(30), vApellidoEmer VARCHAR(30), vTelefonoEmerg VARCHAR(12))
    public boolean insertar(String dpiA, boolean generoA, String correoA, String fechaNacA, String PlatyeraA, String residenciaA, 
            String nombreA, String apellidoA,  boolean activoA, String PerfilFBA, String tipoSangreA, String nivEstA,
            String telefonoA, boolean estudiaA, String lugarEstudioA, boolean trabajaA, String lugarTrabajoA,
            String hospital, String enfermedad, String alergia, String dpiE, String emailE, String nombreE, 
            String apellidoE, String residenciaE,String nivEstE, boolean estudiaE, boolean trabajaE, String lugartrabajoE,
            String telefonoE, String relacion, String nombreEmer, String apellidoEmer, String telefonoEmer)
    {
        try {
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
            procedimiento.setString(11, tipoSangreA);
            procedimiento.setString(12, nivEstA);
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
            procedimiento.setString(26, nivEstE);
            procedimiento.setBoolean(27, false);
            procedimiento.setBoolean(28, trabajaE);
            procedimiento.setString(29, lugartrabajoE);
            procedimiento.setString(30, telefonoE);
            procedimiento.setString(31, relacion);
            procedimiento.setString(32, nombreEmer);
            procedimiento.setString(33, apellidoEmer);
            procedimiento.setString(34, telefonoEmer);
            procedimiento.execute();
            //Fin procedimiento almacenado
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
