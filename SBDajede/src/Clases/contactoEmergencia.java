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
public class contactoEmergencia 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public contactoEmergencia()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    //Método para insertar datos al contacto de emergencia
    public boolean insertar(String relacion, String nombre, String apellido, int AsociadioId, String telefono)
    {
        try{
            int idAsociado = 0;
            String sql = "SELECT id FROM asociado WHERE id='" + AsociadioId + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                idAsociado = rs.getInt("id");
            }
            sql = "INSERT INTO contactoemergencia(Relacion, Nombre, Apelllido, Asociado_id)"
                    + "VALUES (?,?,?,?)";
            String sql2 = "INSERT INTO telefono(telefono, contactoEmergencia_id)"
                    + "VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst.setString(1, relacion);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setInt(4, idAsociado);
            pst2.setString(1, telefono);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return false;
    }    
}
