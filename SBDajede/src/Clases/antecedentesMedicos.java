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
public class antecedentesMedicos 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public antecedentesMedicos()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    //Método para insertar los antecedentes médicos del asociado
    public boolean insertar(String Hospital, String Enfermedad, int idAsociado)
    {
        try{
            int id_Asociado = 0;
            String sql = "SELECT id FROM asociado WHERE id='" + idAsociado + "'";
            Statement st = con.createStatement();
            ResultSet Rs = st.executeQuery(sql);
            while(Rs.next())
            {
                id_Asociado = Rs.getInt("id");
            }
            sql = "INSERT INTO antecedentesmedicos(Hospital, Enfermedad, Asociado_id)"
                    + "VALUES (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Hospital);
            pst.setString(2, Enfermedad);
            pst.setInt(3, id_Asociado);
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
}