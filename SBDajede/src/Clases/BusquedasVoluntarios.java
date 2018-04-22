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
import javax.swing.table.DefaultTableModel;
import rojerusan.RSTableMetro;

/**
 *
 * @author mynor
 */
public class BusquedasVoluntarios extends Proyecto{

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
    
    public DefaultTableModel BNombreApellido(String nombre, RSTableMetro tabla, String apellido) {
        try {
            String titulos[] = new String[6];
            for (byte i = 0; i < 6; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            String registros[] = new String[6];
            String sql = "Select * from asociado where Nombre LIKE '%" + nombre + "%' and Apellido LIKE '%" + apellido + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int cont = 0;
            while(rs.next())
            {
                cont++;
                registros[0]=String.valueOf(cont);
                registros[1]=rs.getString("Nombre");
                registros[2]=rs.getString("Apellido");
                registros[3]=rs.getString("DPI");
                registros[4] = rs.getString("Residencia");
                registros[5] = rs.getString("CorreoElectronico");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(BusquedasVoluntarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public DefaultTableModel BProyecto(RSTableMetro tablaProyecto, String id)
    {
        try {
            String titulos[] = new String[4];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tablaProyecto.getColumnName(i);
            }
            
            String registros[] = new String[4];
            String sql = "SELECT asociado.id, asociado.Nombre, asociado.Apellido, asociado.FechaNacimiento FROM asociado "
                    + "LEFT JOIN voluntariado ON asociado.id = voluntariado.Asociado_id LEFT JOIN "
                    + "proyecto ON voluntariado.Proyecto_id = proyecto.id WHERE proyecto.id LIKE '%" + id + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int cont = 0;
            while(rs.next())
            {
                cont++;
                registros[0]=String.valueOf(cont);
                registros[1]=rs.getString("Nombre");
                registros[2]=rs.getString("Apellido");
                registros[3]=rs.getString("FechaNacimiento");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(BusquedasVoluntarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public DefaultTableModel BGenero(RSTableMetro tablaProyecto, String genero)
    {
        try {
            String titulos[] = new String[6];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tablaProyecto.getColumnName(i);
            }
            int sexo = -1;
            String registros[] = new String[6];
            if(genero.equals("M"))
                sexo = 1;
            else if(genero.equals("F"))
                sexo = 0;
            String sql = "SELECT Nombre, Apellido,DPI, Residencia, CorreoElectronico FROM asociado "
                    + "WHERE Genero LIKE '%" + sexo + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int cont = 0;
            while(rs.next())
            {
                cont++;
                registros[0]=String.valueOf(cont);
                registros[1]=rs.getString("Nombre");
                registros[2]=rs.getString("Apellido");
                registros[3]=rs.getString("DPI");
                registros[4] = rs.getString("Residencia");
                registros[5] = rs.getString("CorreoElectronico");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(BusquedasVoluntarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public DefaultTableModel BEdad(RSTableMetro tablaProyecto, int edad)
    {
        try {
            String titulos[] = new String[7];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tablaProyecto.getColumnName(i);
            }
            String registros[] = new String[7];
            //SELECT Nombre, YEAR(CURDATE())-YEAR(FechaNacimiento) + IF(DATE_FORMAT(CURDATE(),'%m-%d')>DATE_FORMAT(FechaNacimiento, '%m-%d'),0,-1) AS EDAD FROM asociado WHERE YEAR(CURDATE())-YEAR(FechaNacimiento) + IF(DATE_FORMAT(CURDATE(),'%m-%d')>DATE_FORMAT(FechaNacimiento, '%m-%d'),0,-1) = 21
            String sql = "SELECT Nombre, Apellido, DPI, Residencia, CorreoElectronico, FechaNacimiento, YEAR(CURDATE())-YEAR(FechaNacimiento)"
                    + " + IF(DATE_FORMAT(CURDATE(),'%m-%d')>DATE_FORMAT(FechaNacimiento, '%m-%d'),0,-1) "
                    + "FROM asociado WHERE YEAR(CURDATE())-YEAR(FechaNacimiento)"
                    + " + IF(DATE_FORMAT(CURDATE(),'%m-%d')>DATE_FORMAT(FechaNacimiento, '%m-%d'),0,-1) LIKE '%" + edad + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int cont = 0;
            while(rs.next())
            {
                cont++;
                registros[0]=String.valueOf(cont);
                registros[1]=rs.getString("Nombre");
                registros[2]=rs.getString("Apellido");
                registros[3]=rs.getString("DPI");
                registros[4] = rs.getString("Residencia");
                registros[5] = rs.getString("CorreoElectronico");
                registros[6] = rs.getString("FechaNacimiento");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(BusquedasVoluntarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}