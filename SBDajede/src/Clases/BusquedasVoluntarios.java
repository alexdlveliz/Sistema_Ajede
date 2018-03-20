/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mynor
 */
public class BusquedasVoluntarios {

    private Connection con;
    private Conexion conexion;

    public BusquedasVoluntarios() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }

    public DefaultTableModel BNombre(String nombre, JTable tabla, String apellido) {
        try {
            String titulos[] = new String[6];
            for (byte i = 0; i < 6; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            boolean genero;
            String registros[] = new String[6];
            String sql = "Select * from asociado where Nombre LIKE '%" + nombre + "%' and Apellido LIKE '%" + apellido + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                registros[0]=rs.getString("Nombre");
                registros[1]=rs.getString("Apellido");
                registros[2]=rs.getString("DPI");
                registros[3]=rs.getString("CorreoElectronico");
                genero=rs.getBoolean("Genero");
                if(genero)
                    registros[4]="Masculino";
                else
                    registros[4]="Femenino";
                registros[5]=rs.getString("FechaNacimiento");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(BusquedasVoluntarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
