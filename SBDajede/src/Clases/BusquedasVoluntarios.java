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
import rojerusan.RSTableMetro;

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

    public DefaultTableModel BNombre(String nombre, RSTableMetro tabla, String apellido, boolean activo) {
        try {
            String titulos[] = new String[6];
            for (byte i = 0; i < 6; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            boolean genero;
            String registros[] = new String[6];
            String sql = "Select * from asociado where Nombre LIKE '%" + nombre + "%' and Apellido LIKE '%" + apellido + "%' and Activo="+activo;
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
    
    public DefaultTableModel BProyecto(RSTableMetro tablaProyecto, String proyecto)
    {
        try {
            String titulos[] = new String[6];
            for (byte i = 0; i < 4; i++) {
                titulos[i] = tablaProyecto.getColumnName(i);
            }
            
            boolean finalizado;
            String registros[] = new String[4];
            String sql = "Select * from proyecto where id LIKE '%" + proyecto + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                registros[0]=rs.getString("id");
                registros[1]=rs.getString("nombreProyecto");
                registros[2]=rs.getString("descripcion");
                finalizado=rs.getBoolean("finalizado");
                if(finalizado)
                    registros[3]="Finalizado";
                else
                    registros[3]="No finalizado";
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(BusquedasVoluntarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
