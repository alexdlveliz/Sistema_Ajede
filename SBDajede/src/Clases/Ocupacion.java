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
public class Ocupacion 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public Ocupacion()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
        
    public int obteneridOcupacion()
    {
        int id = 0;
        try{
            String sql = "SELECT MAX(id) FROM ocupacion";
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
    
    public boolean insertarOcupacionAsociado(int AsociadoId, boolean estudia, String lugarEstudio,
            boolean trabaja, String lugarTrabajo)
    {
        try{
            String sql = "INSERT INTO Ocupacion(Asociado_id, estudia, lugarEstudio, trabaja, lugarTrabajo)"
                    + "VALUES (?,?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, AsociadoId);
            pst.setBoolean(2, estudia);
            pst.setString(3, lugarEstudio);
            pst.setBoolean(4, trabaja);
            pst.setString(5, lugarTrabajo);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean insertarOcupacionEncargado(int EncargadoId, boolean estudia, String lugarEstudio,
            boolean trabaja, String lugarTrabajo)
    {
        try{
            String sql = "INSERT INTO Ocupacion(Encargado_id, estudia, lugarEstudio, trabaja, lugarTrabajo)"
                    + "VALUES (?,?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, EncargadoId);
            pst.setBoolean(2, estudia);
            pst.setString(3, lugarEstudio);
            pst.setBoolean(4, trabaja);
            pst.setString(5, lugarTrabajo);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}