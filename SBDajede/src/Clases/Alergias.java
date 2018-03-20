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
public class Alergias 
{
    private Connection con = null;
    private Conexion conexion;
    
    //Se hace la conexión a la base de datos
    public Alergias()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    //Método para insertar alergias del asociado
    public boolean insertar(String Alergias, int idAntecMedicos)
    {
        try{
            int id_AntecMedicos = 0;
            String sql = "SELECT id FROM antecedentesmedicos WHERE id='" + idAntecMedicos + "'";
            Statement st = con.createStatement();
            ResultSet Rs = st.executeQuery(sql);
            while(Rs.next())
            {
                id_AntecMedicos = Rs.getInt("id");
            }
            sql = "INSERT INTO alergias(Alergia, AntecedentesMedicos_id)"
                    + "VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Alergias);
            pst.setInt(2, id_AntecMedicos);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Obtener el id de Antecedentes Médicos
    public int obtenerIdAntMedicos()
    {
        int id = 0;
        try{
            String sql = "SELECT MAX(id) FROM antecedentesmedicos";
            System.out.println(sql);
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
}