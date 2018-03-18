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
public class OcupacionEncargado 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public OcupacionEncargado()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    //Método para insertar datos a la tabla 'encargado'
    public boolean insertar(String nombreOcupacion, String lugarOcupacion)
    {
        try{
            String sql = "INSERT INTO ocupacion(nombreOcupacion, lugarOcupacion)"
                    + "VALUES (?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombreOcupacion);
            pst.setString(2, lugarOcupacion);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
    
    //Método para insertar datos a la tabla 'detalleocupacion'
    public boolean insertarDetalleOcupacion(int encargadoId, int ocupacionId)
    {
        try{
            String sql = "INSERT INTO detalleocupacion(Encargado_id, Ocupacion_id)"
                    + "VALUES (?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, encargadoId);
            pst.setInt(2, ocupacionId);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}