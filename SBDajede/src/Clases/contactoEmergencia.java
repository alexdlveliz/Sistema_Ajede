/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public contactoEmergencia()
    {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    public boolean insertar(String Hospital, String Enfermedad, int idAsociado)
    {
        try{
            String sql = "INSERT INTO antecedentesmedicos(Hospital, Enfermedad, Asociado_id)"
                    + "VALUES (?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Hospital);
            pst.setString(2, Enfermedad);
            pst.setInt(3, idAsociado);
            int n = pst.executeUpdate();
            return n != 0;
        } catch(SQLException ex)
        {
            Logger.getLogger(NivelEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }    
}
