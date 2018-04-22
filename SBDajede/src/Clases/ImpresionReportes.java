/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
    private final Conexion conexion;
    private final ImageIcon reportes = new ImageIcon(new ImageIcon(getClass().getResource("/Reportes/report-icon.png")).getImage());
    private final Image image;

    public ImpresionReportes() {
        this.image = reportes.getImage();
        conexion = new Conexion();
        con = conexion.getConnection();
    }

    public boolean ReportGeneros(boolean genero) {
        try {
            String path = "src/Reportes/VoluntariosGeneros.jasper";
            Map parametro = new HashMap();
            parametro.put("Genero", genero);
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Voluntarios por género");
            jv.setIconImage(image);

            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportGenero() {
        try {
            String path = "src/Reportes/VoluntariosGenero.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setTitle("Voluntarios por géneros");
            jv.setIconImage(image);
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportDetProyecto() {
        try {
            String path = "src/Reportes/DetalleProyecto.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Detalle de proyectos");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportAI() {
        try {
            String path = "src/Reportes/VoluntariosAI.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios por activo/inactivo");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportA_I(boolean estado) {
        try {
            String path = "src/Reportes/VoluntariosA_I.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            Map parametro = new HashMap();
            parametro.put("estado", estado);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios por activo/inactivo");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportNivEst() {
        try {
            String path = "src/Reportes/VoluntarioNivEst.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios por nivel de estudio");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportEdad() {
        try {
            String path = "src/Reportes/VoluntarioEdad.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios por edades");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportEdades(int fecha) {
        try {
            String path = "src/Reportes/VoluntarioEdades.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            Map parametro = new HashMap();
            parametro.put("Fecha", fecha);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios por edad");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportExbecarios() {
        try {
            String path = "src/Reportes/VoluntariadoBeca.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios Exbecarios");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ReportNoExbecarios() {
        try {
            String path = "src/Reportes/VoluntariosNoBecarios.jasper";
            JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            jv.setIconImage(image);
            jv.setTitle("Voluntarios no Exbecados");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(ImpresionReportes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
