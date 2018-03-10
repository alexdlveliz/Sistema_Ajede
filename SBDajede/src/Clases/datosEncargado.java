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

/**
 *
 * @author hectortllo
 */
public class datosEncargado 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public datosEncargado()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    //Método para insertar datos a la tabla 'encargado'
    public boolean insertar(String dpi, String email, String nombre, String apellido, String residencia,
            String nivelEstudio)
    {
        try{
            int idNivelEst = 0;
            String sql = "SELECT NivelEstudio FROM nivelestudio where NivelEstudio= '" + nivelEstudio + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                idNivelEst = rs.getInt("id");
            }
            
            sql = "INSERT INTO contactoemergencia(Relacion, Nombre, Apelllido, Asociado_id)"
                    + "VALUES (?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, dpi);
            pst.setString(2, email);
            pst.setString(3, nombre);
            pst.setString(4, apellido);
            pst.setString(5, residencia);
            pst.setInt(6, idNivelEst);            
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
