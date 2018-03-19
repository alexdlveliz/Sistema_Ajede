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
    public boolean insertar(String relacion, String nombre, String apellido, int AsociadioId)
    {
        try{
            int idAsociado = 0;
            //Se busca en la tabla asociado la persona a la que corresponde el id que viene por parámetro
            String sql = "SELECT id FROM asociado WHERE id='" + AsociadioId + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                idAsociado = rs.getInt("id");
            }
            sql = "INSERT INTO contactoemergencia(Relacion, Nombre, Apellido, Asociado_id)"
                    + "VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, relacion);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setInt(4, idAsociado);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return false;
    }
    
    public int obteneridAsociado()
    {
        int id = 0;
        try{
            String sql = "SELECT MAX(id) FROM asociado";     
            Statement st = con.createStatement();
            ResultSet Rs = st.executeQuery(sql);
            if(Rs.next())
            {
                id = (Rs.getInt(1));
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public int obteneridContactoEmergencia()
    {
        int id = 0;
        try{
            String sql = "SELECT MAX(id) FROM contactoemergencia";     
            Statement st = con.createStatement();
            ResultSet Rs = st.executeQuery(sql);
            if(Rs.next())
            {
                id = (Rs.getInt(1)+1);
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public boolean telefonoEmergencia(int id, String telefono)
    {
        try{                       
            String sql = "INSERT INTO telefono(telefono, contactoEmergencia_id)"
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
}
