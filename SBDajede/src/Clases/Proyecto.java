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
public class Proyecto 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public Proyecto()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    //Método para insertar proyecto
    public boolean insertar(String nombre, String descripcion)
    {
        try{
            String sql = "INSERT INTO proyecto(nombreProyecto, descripcion)"
                    + "VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, descripcion);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
