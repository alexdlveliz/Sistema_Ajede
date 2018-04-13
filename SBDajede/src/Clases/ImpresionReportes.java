/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author mynor
 */
public class ImpresionReportes {

    private Connection con = null;
    private Conexion conexion;

    public ImpresionReportes() {
        conexion = new Conexion();
        con = conexion.getConnection();
    }
    
    public boolean ReportGenero(){
        try {
            String path="src/Reportes/VoluntariosGenero.jasper";
            JasperReport jr=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            JasperViewer jv = new JasperViewer(jp,false);
            
            jv.setVisible(true);
            jv.setTitle("Voluntarios por género");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean ReportAI(){
        try {
            String path="src/Reportes/VoluntariosAI.jasper";
            JasperReport jr=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            JasperViewer jv = new JasperViewer(jp,false);
            
            jv.setVisible(true);
            jv.setTitle("Voluntarios por activo/inactivo");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean ReportNivEst(){
        try {
            String path="src/Reportes/VoluntarioNivEst.jasper";
            JasperReport jr=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,con);
            JasperViewer jv = new JasperViewer(jp,false);
            
            jv.setVisible(true);
            jv.setTitle("Voluntarios por nivel de estudio");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
