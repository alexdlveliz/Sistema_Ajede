/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;

/**
 *
 * @author mynor
 */
public class Asociado {

    private Connection con = null;
    private Conexion conexion;

    public Asociado() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }

}
