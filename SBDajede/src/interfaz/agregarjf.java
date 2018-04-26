/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Alergias;
import Clases.Asociado;
import Clases.Ocupacion;
import Clases.antecedentesMedicos;
import Clases.contactoEmergencia;
import Clases.datosEncargado;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import rojerusan.RSPanelsSlider;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import rojeru_san.componentes.RSDateChooser;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Nahomi
 */
public class agregarjf extends javax.swing.JFrame {

    ImageIcon dp1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datospersonales1.jpg")).getImage());
    ImageIcon dp2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datospersonales2.jpg")).getImage());
    ImageIcon dlabo1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datoslaborales1.jpg")).getImage());
    ImageIcon dlabo2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datoslaborales2.jpg")).getImage());
    ImageIcon voluntariado1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/voluntariado1.jpg")).getImage());
    ImageIcon voluntariado2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/voluntariado2.jpg")).getImage());
    ImageIcon beca1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/ajede1.jpg")).getImage());
    ImageIcon beca2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/ajede2.jpg")).getImage());
    ImageIcon infomed1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/infomed1.jpg")).getImage());
    ImageIcon infomed2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/infomed2.jpg")).getImage());
    ImageIcon datosenc1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datosenc1.jpg")).getImage());
    ImageIcon datosenc2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datosenc2.jpg")).getImage());
    ImageIcon contacem1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/contaceme1.jpg")).getImage());
    ImageIcon contacem2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/contaceme2.jpg")).getImage());
    Font fuente = new Font("Yu Gothic UI Light", Font.PLAIN, 34);
    Font fuente2 = new Font("Yu Gothic UI Light", Font.PLAIN, 28);

    /**
     * Creates new form agregarjf
     */
    private char c;
    private Asociado asociado;
    private antecedentesMedicos antecedentes;
    private Alergias Alergias;
    private contactoEmergencia contacto;
    private datosEncargado encargado;
    private Ocupacion ocupacionE;

    public agregarjf() {
        asociado = new Asociado();
        antecedentes = new antecedentesMedicos();
        Alergias = new Alergias();
        contacto = new contactoEmergencia();
        encargado = new datosEncargado();
        ocupacionE = new Ocupacion();
        initComponents();
        this.setLocationRelativeTo(null);
        transparencia();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        cmbnivelestudioencargado.setModel(asociado.NivEst());
        cmbnivelestudiovoluntario.setModel(asociado.NivEst());

        if ((tamanio.width == 1920) && (tamanio.height == 1080)) //1920x1080
        {
            this.setSize(1565, 880);
            this.setLocationRelativeTo(null);
            jPanel1.setSize(1565, 880);
            slider.setSize(1565, 880);
            jpdatosp.setSize(1595, 890);
            lbdp.setSize(1595, 890);
            lbdlabo.setSize(1565, 880);
            jpdlabo.setSize(1565, 880);
            jpvoluntariado.setSize(1565, 880);
            lbvoluntariado.setSize(1565, 880);
            jpinfomed.setSize(1565, 880);
            lbinfomed.setSize(1565, 880);
            jpdenca.setSize(1565, 880);
            lbdatosenca.setSize(1565, 880);
            jpconteme.setSize(1565, 880);
            lbconteme.setSize(1565, 880);
            lbdp.setIcon(dp1);
            lbdlabo.setIcon(dlabo1);
            lbvoluntariado.setIcon(voluntariado1);
            lbbeca.setIcon(beca1);
            jpbeca.setSize(1565, 880);
            lbbeca.setSize(1565, 880);
            lbinfomed.setIcon(infomed1);
            lbdatosenca.setIcon(datosenc1);
            lbconteme.setIcon(contacem1);
            btnsalir.setVisible(true);
            btnsalir.requestFocus();
            btnsalir.setLocation(1480, 10);
            btnminimizar.setLocation(1398, 10);
            btnhome.setLocation(1320, 10);
            textfieldnombres.setLocation(215, 209);
            textfieldnombres.setSize(500, 44);
            textfieldnombres.setFont(fuente);
            textfieldapellidos.setSize(510, 44);
            textfieldapellidos.setFont(fuente);
            textfieldapellidos.setLocation(215, 286);
            textfieldedad.setSize(110, 44);
            textfieldedad.setLocation(160, 369);
            textfieldedad.setFont(fuente);
            cmbgenero.setLocation(475, 370);
            cmbgenero.setSize(270, 44);
            cmbgenero.setFont(fuente);
            fechas.setLocation(420, 455);
            fechas.setSize(320, 44);
            fechas.setFont(fuente);
            textfielddpi.setLocation(220, 560);
            textfielddpi.setSize(500, 44);
            textfielddpi.setFont(fuente);
            textfieldresidencia.setLocation(265, 645);
            textfieldresidencia.setSize(455, 44);
            textfieldresidencia.setFont(fuente);
            textfieldcorreo.setLocation(255, 735);
            textfieldcorreo.setSize(468, 44);
            textfieldcorreo.setFont(fuente);
            btnmenu.setLocation(837, 567);
            btnsiguientedl.setLocation(1360, 567);
            btnaddtel.setLocation(1110, 560);
            textfieldtelefono.setLocation(1105, 393);
            textfieldtelefono.setSize(395, 44);
            textfieldtelefono.setFont(fuente);
            cmbtalla.setLocation(1100, 300);
            cmbtalla.setSize(395, 44);
            cmbtalla.setFont(fuente);
            textfieldperfil.setLocation(1190, 224);
            textfieldperfil.setSize(310, 44);
            textfieldperfil.setFont(fuente);
            cmbnivelestudiovoluntario.setLocation(350, 222);
            cmbnivelestudiovoluntario.setSize(410, 44);
            cmbnivelestudiovoluntario.setFont(fuente);
            textfieldlugardeestudio.setLocation(80, 400);
            textfieldlugardeestudio.setSize(670, 50);
            textfieldlugardeestudio.setFont(fuente);
            textfieldlugardeestudio2.setLocation(80, 456);
            textfieldlugardeestudio2.setSize(670, 50);
            textfieldlugardeestudio2.setFont(fuente);
            textfieldocupacion.setLocation(80, 644);
            textfieldocupacion.setSize(670, 50);
            textfieldocupacion.setFont(fuente);
            textfieldocupacion2.setLocation(80, 700);
            textfieldocupacion2.setSize(670, 50);
            textfieldocupacion2.setFont(fuente);
            textfieldlugartrabajo.setLocation(840, 310);
            textfieldlugartrabajo.setSize(650, 50);
            textfieldlugartrabajo.setFont(fuente);
            textfieldlugartrabajo2.setLocation(840, 383);
            textfieldlugartrabajo2.setSize(650, 50);
            textfieldlugartrabajo2.setFont(fuente);
            btnsiguientevolu.setLocation(1360, 567);
            btnatrasdp.setLocation(845, 567);
            btnsiguientebeca.setLocation(1360, 578);
            btnatrasdlab.setLocation(845, 578);
            btnaddp.setLocation(1097, 580);
            ptxt.setLocation(90, 300);
            ptxt.setSize(635, 44);
            ptxt.setFont(fuente);
            scrollp.setLocation(90, 360);
            scrollp.setSize(635, 435);
            scrollp.setFont(fuente);
            finicio.setLocation(300, 305);
            finicio.setSize(410, 50);
            finicio.setFont(fuente);
            fdesercion.setLocation(300, 415);
            fdesercion.setSize(410, 50);
            fdesercion.setFont(fuente);
            scrollp1.setLocation(815, 270);
            scrollp1.setSize(680, 250);
            scrollp1.setFont(fuente);
            cmbactivosina.setLocation(390, 563);
            cmbactivosina.setSize(321, 50);
            cmbactivosina.setFont(fuente);
            cmbexbecario.setLocation(390, 640);
            cmbexbecario.setSize(321, 50);
            cmbexbecario.setFont(fuente);
            btnatrasvoluntariado.setLocation(850, 590);
            btnsiguienteinfomed.setLocation(1350, 590);
            textfieldhospital.setLocation(60, 295);
            textfieldhospital.setSize(675, 44);
            textfieldhospital.setFont(fuente);
            textfieldalergia1.setLocation(1035, 216);
            textfieldalergia1.setSize(482, 44);
            textfieldalergia1.setFont(fuente);
            textfieldalergia2.setLocation(820, 279);
            textfieldalergia2.setSize(695, 44);
            textfieldalergia2.setFont(fuente);
            textfieldalergia3.setLocation(820, 334);
            textfieldalergia3.setSize(695, 44);
            textfieldalergia3.setFont(fuente);
            textfieldalergia4.setLocation(820, 384);
            textfieldalergia4.setSize(695, 44);
            textfieldalergia4.setFont(fuente);
            textfieldalergia5.setLocation(820, 444);
            textfieldalergia5.setSize(590, 44);
            textfieldalergia5.setFont(fuente);
            textfieldpadecimiento1.setLocation(65, 514);
            textfieldpadecimiento1.setSize(655, 44);
            textfieldpadecimiento1.setFont(fuente);
            textfieldpadecimiento2.setLocation(67, 574);
            textfieldpadecimiento2.setSize(655, 44);
            textfieldpadecimiento2.setFont(fuente);
            textfieldpadecimiento3.setLocation(67, 634);
            textfieldpadecimiento3.setSize(665, 44);
            textfieldpadecimiento3.setFont(fuente);
            textfieldpadecimiento4.setLocation(67, 689);
            textfieldpadecimiento4.setSize(665, 44);
            textfieldpadecimiento4.setFont(fuente);
            btnatrasbeca.setLocation(815, 590);
            btnsiguientedenc.setLocation(1355, 590);
            cmbtipodesangre.setLocation(1000, 661);
            cmbtipodesangre.setFont(fuente);
            cmbtipodesangre.setSize(280, 50);
            textfieldnombreencargado.setLocation(215, 210);
            textfieldnombreencargado.setSize(530, 44);
            textfieldnombreencargado.setFont(fuente);
            textfieldapellidoencargado.setLocation(220, 290);
            textfieldapellidoencargado.setSize(530, 44);
            textfieldapellidoencargado.setFont(fuente);
            cmbnivelestudioencargado.setLocation(310, 365);
            cmbnivelestudioencargado.setSize(430, 50);
            cmbnivelestudioencargado.setFont(fuente);
            textfieldtelefonoencargado.setLocation(345, 443);
            textfieldtelefonoencargado.setSize(410, 40);
            textfieldtelefonoencargado.setFont(fuente);
            textfielddpiencargado.setLocation(210, 562);
            textfielddpiencargado.setSize(520, 40);
            textfielddpiencargado.setFont(fuente);
            textfieldresidenciaencargado.setLocation(250, 647);
            textfieldresidenciaencargado.setSize(480, 44);
            textfieldresidenciaencargado.setFont(fuente);
            textfieldcorreoencargado.setLocation(250, 732);
            textfieldcorreoencargado.setSize(485, 44);
            textfieldcorreoencargado.setFont(fuente);
            textfieldocupacionencargado.setLocation(815, 275);
            textfieldocupacionencargado.setSize(700, 44);
            textfieldocupacionencargado.setFont(fuente);
            textfieldlugarencargado.setLocation(815, 405);
            textfieldlugarencargado.setSize(700, 44);
            textfieldlugarencargado.setFont(fuente);
            btnatrasinfme.setLocation(840, 570);
            btnsiguienteconteme.setLocation(1355, 570);
            btnotrotelefonoencargado.setLocation(1103, 570);
            btnsiguienteconteme.setSize(120, 110);
            textfieldnombreemergencia.setLocation(215, 205);
            textfieldnombreemergencia.setSize(530, 44);
            textfieldnombreemergencia.setFont(fuente);
            textfieldapellidoemergencia.setLocation(215, 285);
            textfieldapellidoemergencia.setSize(530, 44);
            textfieldapellidoemergencia.setFont(fuente);
            textfieldparentescoemergencia.setLocation(410, 362);
            textfieldparentescoemergencia.setSize(340, 44);
            textfieldparentescoemergencia.setFont(fuente);
            textfieldtelefonoemergencia1.setLocation(220, 443);
            textfieldtelefonoemergencia1.setSize(190, 44);
            textfieldtelefonoemergencia1.setFont(fuente);
            textfieldtelefonoemergencia2.setLocation(60, 540);
            textfieldtelefonoemergencia2.setSize(670, 44);
            textfieldtelefonoemergencia2.setFont(fuente);
            textfieldtelefonoemergencia3.setLocation(60, 600);
            textfieldtelefonoemergencia3.setSize(670, 44);
            textfieldtelefonoemergencia3.setFont(fuente);
            textfieldtelefonoemergencia4.setLocation(60, 657);
            textfieldtelefonoemergencia4.setSize(670, 44);
            textfieldtelefonoemergencia4.setFont(fuente);
            textfieldtelefonoemergencia5.setLocation(60, 710);
            textfieldtelefonoemergencia5.setSize(670, 44);
            textfieldtelefonoemergencia5.setFont(fuente);
            btnatrasdenc.setLocation(850, 575);
            btnguardar.setLocation(1345, 575);
        } else if ((tamanio.width == 1366) && (tamanio.height == 768)) //1366x768, 1708x960
        {
            this.setLocationRelativeTo(null);
            this.setSize(1250, 700);
            //lbdp.setIcon(dp2);
//            lbdlabo.setIcon(dlabo2);
//            //lbvoluntariado.setIcon(voluntariado2);
//            lbbeca.setIcon(beca2);
//            lbinfomed.setIcon(infomed2);
//            lbdatosenca.setIcon(datosenc2);
//            lbconteme.setIcon(contacem2);
        }

    }

    public void transparencia() {
        btnmenu.setOpaque(false);
        btnmenu.setBorderPainted(false);
        btnmenu.setContentAreaFilled(false);
        btnhome.setOpaque(false);
        btnhome.setBorderPainted(false);
        btnhome.setContentAreaFilled(false);
        btnsalir.setOpaque(false);
        btnsalir.setBorderPainted(false);
        btnsalir.setContentAreaFilled(false);
        btnsiguientedl.setOpaque(false);
        btnsiguientedl.setBorderPainted(false);
        btnsiguientedl.setContentAreaFilled(false);
        btnaddtel.setOpaque(false);
        btnaddtel.setBorderPainted(false);
        btnaddtel.setContentAreaFilled(false);
        btnminimizar.setOpaque(false);
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btnatrasbeca.setOpaque(false);
        btnatrasbeca.setBorderPainted(false);
        btnatrasbeca.setContentAreaFilled(false);
        btnsiguientedenc.setOpaque(false);
        btnsiguientedenc.setBorderPainted(false);
        btnsiguientedenc.setContentAreaFilled(false);
        btnsiguienteconteme.setOpaque(false);
        btnsiguienteconteme.setBorderPainted(false);
        btnsiguienteconteme.setContentAreaFilled(false);
        btnguardar.setOpaque(false);
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnsiguientevolu.setOpaque(false);
        btnsiguientevolu.setBorderPainted(false);
        btnsiguientevolu.setContentAreaFilled(false);
        btnatrasinfme.setOpaque(false);
        btnatrasinfme.setBorderPainted(false);
        btnatrasinfme.setContentAreaFilled(false);
        btnatrasdenc.setOpaque(false);
        btnatrasdenc.setBorderPainted(false);
        btnatrasdenc.setContentAreaFilled(false);
        btnatrasdp.setOpaque(false);
        btnatrasdp.setBorderPainted(false);
        btnatrasdp.setContentAreaFilled(false);
        btnatrasdlab.setOpaque(false);
        btnatrasdlab.setBorderPainted(false);
        btnatrasdlab.setContentAreaFilled(false);
        btnsiguientebeca.setOpaque(false);
        btnsiguientebeca.setBorderPainted(false);
        btnsiguientebeca.setContentAreaFilled(false);
        btnaddp.setOpaque(false);
        btnaddp.setBorderPainted(false);
        btnaddp.setContentAreaFilled(false);

        textfieldnombres.setBackground(new Color(0, 0, 0, 0));
        textfieldapellidos.setBackground(new Color(0, 0, 0, 0));
        textfieldedad.setBackground(new Color(0, 0, 0, 0));
        cmbgenero.setBackground(new Color(0, 0, 0, 0));
        fechas.setBackground(new Color(0, 0, 0, 0));
        textfielddpi.setBackground(new Color(0, 0, 0, 0));
        textfieldresidencia.setBackground(new Color(0, 0, 0, 0));
        textfieldcorreo.setBackground(new Color(0, 0, 0, 0));
        textfieldperfil.setBackground(new Color(0, 0, 0, 0));
        cmbtalla.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefono.setBackground(new Color(0, 0, 0, 0));
        textfieldhospital.setBackground(new Color(0, 0, 0, 0));
        textfieldpadecimiento1.setBackground(new Color(0, 0, 0, 0));
        textfieldpadecimiento2.setBackground(new Color(0, 0, 0, 0));
        textfieldpadecimiento3.setBackground(new Color(0, 0, 0, 0));
        textfieldpadecimiento4.setBackground(new Color(0, 0, 0, 0));
        textfieldalergia1.setBackground(new Color(0, 0, 0, 0));
        textfieldalergia2.setBackground(new Color(0, 0, 0, 0));
        textfieldalergia3.setBackground(new Color(0, 0, 0, 0));
        textfieldalergia4.setBackground(new Color(0, 0, 0, 0));
        textfieldalergia5.setBackground(new Color(0, 0, 0, 0));
        cmbtipodesangre.setBackground(new Color(0, 0, 0, 0));
        textfieldnombreencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldapellidoencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefonoencargado.setBackground(new Color(0, 0, 0, 0));
        cmbnivelestudioencargado.setBackground(new Color(0, 0, 0, 0));
        textfielddpiencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldresidenciaencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldcorreoencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldocupacionencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldlugarencargado.setBackground(new Color(0, 0, 0, 0));
        textfieldnombreemergencia.setBackground(new Color(0, 0, 0, 0));
        textfieldapellidoemergencia.setBackground(new Color(0, 0, 0, 0));
        textfieldparentescoemergencia.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefonoemergencia1.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefonoemergencia2.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefonoemergencia3.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefonoemergencia4.setBackground(new Color(0, 0, 0, 0));
        textfieldtelefonoemergencia5.setBackground(new Color(0, 0, 0, 0));
        cmbnivelestudiovoluntario.setBackground(new Color(0, 0, 0, 0));
        textfieldlugardeestudio.setBackground(new Color(0, 0, 0, 0));
        textfieldocupacion.setBackground(new Color(0, 0, 0, 0));
        textfieldlugartrabajo.setBackground(new Color(0, 0, 0, 0));
        textfieldlugardeestudio2.setBackground(new Color(0, 0, 0, 0));
        textfieldocupacion2.setBackground(new Color(0, 0, 0, 0));
        textfieldlugartrabajo2.setBackground(new Color(0, 0, 0, 0));
        btnatrasvoluntariado.setOpaque(false);
        btnatrasvoluntariado.setBorderPainted(false);
        btnatrasvoluntariado.setContentAreaFilled(false);
        btnsiguienteinfomed.setOpaque(false);
        btnsiguienteinfomed.setBorderPainted(false);
        btnsiguienteinfomed.setContentAreaFilled(false);
        btnatrasdlab.setOpaque(false);
        btnatrasdlab.setBorderPainted(false);
        btnatrasdlab.setContentAreaFilled(false);
        btnsiguientebeca.setOpaque(false);
        btnsiguientebeca.setBorderPainted(false);
        btnsiguientebeca.setContentAreaFilled(false);
        btnaddp.setOpaque(false);
        btnaddp.setBorderPainted(false);
        btnaddp.setContentAreaFilled(false);
        btnotrotelefonoencargado.setOpaque(false);
        btnotrotelefonoencargado.setBorderPainted(false);
        btnotrotelefonoencargado.setContentAreaFilled(false);
        ptxt.setBackground(new Color(0, 0, 0, 0));
        cmbexbecario.setBackground(new Color(0, 0, 0, 0));
        cmbactivosina.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsalir = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnminimizar = new javax.swing.JButton();
        slider = new rojerusan.RSPanelsSlider();
        jpdatosp = new javax.swing.JPanel();
        btnsiguientedl = new javax.swing.JButton();
        btnaddtel = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        textfieldnombres = new javax.swing.JTextField();
        textfieldedad = new javax.swing.JTextField();
        textfieldapellidos = new javax.swing.JTextField();
        cmbgenero = new javax.swing.JComboBox<>();
        textfieldresidencia = new javax.swing.JTextField();
        textfieldcorreo = new javax.swing.JTextField();
        textfieldperfil = new javax.swing.JTextField();
        cmbtalla = new javax.swing.JComboBox<>();
        textfieldtelefono = new javax.swing.JTextField();
        textfielddpi = new javax.swing.JTextField();
        fechas = new rojeru_san.componentes.RSDateChooser();
        lbdp = new javax.swing.JLabel();
        jpinfomed = new javax.swing.JPanel();
        btnsiguientedenc = new javax.swing.JButton();
        btnatrasbeca = new javax.swing.JButton();
        textfieldhospital = new javax.swing.JTextField();
        textfieldpadecimiento1 = new javax.swing.JTextField();
        textfieldpadecimiento2 = new javax.swing.JTextField();
        textfieldpadecimiento3 = new javax.swing.JTextField();
        textfieldpadecimiento4 = new javax.swing.JTextField();
        textfieldalergia1 = new javax.swing.JTextField();
        textfieldalergia2 = new javax.swing.JTextField();
        textfieldalergia3 = new javax.swing.JTextField();
        textfieldalergia4 = new javax.swing.JTextField();
        textfieldalergia5 = new javax.swing.JTextField();
        cmbtipodesangre = new javax.swing.JComboBox<>();
        lbinfomed = new javax.swing.JLabel();
        jpdenca = new javax.swing.JPanel();
        btnsiguienteconteme = new javax.swing.JButton();
        btnatrasinfme = new javax.swing.JButton();
        textfieldnombreencargado = new javax.swing.JTextField();
        textfieldapellidoencargado = new javax.swing.JTextField();
        textfieldtelefonoencargado = new javax.swing.JTextField();
        cmbnivelestudioencargado = new javax.swing.JComboBox<>();
        textfielddpiencargado = new javax.swing.JTextField();
        textfieldresidenciaencargado = new javax.swing.JTextField();
        textfieldcorreoencargado = new javax.swing.JTextField();
        textfieldocupacionencargado = new javax.swing.JTextField();
        textfieldlugarencargado = new javax.swing.JTextField();
        btnotrotelefonoencargado = new javax.swing.JButton();
        lbdatosenca = new javax.swing.JLabel();
        jpconteme = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        btnatrasdenc = new javax.swing.JButton();
        textfieldnombreemergencia = new javax.swing.JTextField();
        textfieldapellidoemergencia = new javax.swing.JTextField();
        textfieldparentescoemergencia = new javax.swing.JTextField();
        textfieldtelefonoemergencia1 = new javax.swing.JTextField();
        textfieldtelefonoemergencia2 = new javax.swing.JTextField();
        textfieldtelefonoemergencia3 = new javax.swing.JTextField();
        textfieldtelefonoemergencia4 = new javax.swing.JTextField();
        textfieldtelefonoemergencia5 = new javax.swing.JTextField();
        lbconteme = new javax.swing.JLabel();
        jpdlabo = new javax.swing.JPanel();
        btnsiguientevolu = new javax.swing.JButton();
        btnatrasdp = new javax.swing.JButton();
        textfieldlugardeestudio = new javax.swing.JTextField();
        textfieldocupacion = new javax.swing.JTextField();
        textfieldlugartrabajo = new javax.swing.JTextField();
        cmbnivelestudiovoluntario = new javax.swing.JComboBox<>();
        textfieldlugardeestudio2 = new javax.swing.JTextField();
        textfieldocupacion2 = new javax.swing.JTextField();
        textfieldlugartrabajo2 = new javax.swing.JTextField();
        lbdlabo = new javax.swing.JLabel();
        jpvoluntariado = new javax.swing.JPanel();
        btnatrasdlab = new javax.swing.JButton();
        btnsiguientebeca = new javax.swing.JButton();
        btnaddp = new javax.swing.JButton();
        ptxt = new javax.swing.JTextField();
        scrollp = new javax.swing.JScrollPane();
        tableproyecto = new rojerusan.RSTableMetro();
        lbvoluntariado = new javax.swing.JLabel();
        jpbeca = new javax.swing.JPanel();
        btnatrasvoluntariado = new javax.swing.JButton();
        btnsiguienteinfomed = new javax.swing.JButton();
        cmbexbecario = new javax.swing.JComboBox<>();
        cmbactivosina = new javax.swing.JComboBox<>();
        scrollp1 = new javax.swing.JScrollPane();
        tableproyecto1 = new rojerusan.RSTableMetro();
        fdesercion = new rojeru_san.componentes.RSYearDate();
        finicio = new rojeru_san.componentes.RSYearDate();
        lbbeca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1565, 880));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1565, 880));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(null);

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_30px.png"))); // NOI18N
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_70px.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir);
        btnsalir.setBounds(1180, 0, 70, 70);

        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_30px.png"))); // NOI18N
        btnhome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px_1.png"))); // NOI18N
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomedpActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome);
        btnhome.setBounds(1019, 0, 80, 70);

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_30px_1.png"))); // NOI18N
        btnminimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_70px.png"))); // NOI18N
        btnminimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnminimizar);
        btnminimizar.setBounds(1100, 0, 80, 70);

        slider.setMaximumSize(new java.awt.Dimension(1565, 880));
        slider.setMinimumSize(new java.awt.Dimension(1250, 700));
        slider.setPreferredSize(new java.awt.Dimension(1250, 700));

        jpdatosp.setBackground(new java.awt.Color(18, 44, 62));
        jpdatosp.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpdatosp.setName("datosp"); // NOI18N
        jpdatosp.setLayout(null);

        btnsiguientedl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguientedl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsiguientedl.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguientedl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientedlActionPerformed(evt);
            }
        });
        jpdatosp.add(btnsiguientedl);
        btnsiguientedl.setBounds(1070, 450, 120, 100);

        btnaddtel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_35px.png"))); // NOI18N
        btnaddtel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_70px.png"))); // NOI18N
        jpdatosp.add(btnaddtel);
        btnaddtel.setBounds(870, 450, 110, 100);

        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Home_70px.png"))); // NOI18N
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jpdatosp.add(btnmenu);
        btnmenu.setBounds(653, 440, 130, 100);

        textfieldnombres.setBackground(new java.awt.Color(178, 248, 248));
        textfieldnombres.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldnombres.setForeground(new java.awt.Color(29, 78, 111));
        textfieldnombres.setBorder(null);
        textfieldnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldnombresKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldnombres);
        textfieldnombres.setBounds(170, 165, 430, 30);

        textfieldedad.setBackground(new java.awt.Color(178, 248, 248));
        textfieldedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldedad.setForeground(new java.awt.Color(25, 92, 134));
        textfieldedad.setBorder(null);
        textfieldedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldedadKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldedad);
        textfieldedad.setBounds(120, 290, 90, 30);

        textfieldapellidos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldapellidos.setForeground(new java.awt.Color(25, 92, 134));
        textfieldapellidos.setBorder(null);
        textfieldapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldapellidosKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldapellidos);
        textfieldapellidos.setBounds(170, 226, 420, 30);

        cmbgenero.setBackground(new java.awt.Color(178, 248, 248));
        cmbgenero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbgenero.setForeground(new java.awt.Color(25, 92, 134));
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbgenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdatosp.add(cmbgenero);
        cmbgenero.setBounds(390, 287, 190, 38);

        textfieldresidencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldresidencia.setForeground(new java.awt.Color(25, 92, 134));
        textfieldresidencia.setBorder(null);
        jpdatosp.add(textfieldresidencia);
        textfieldresidencia.setBounds(210, 507, 360, 40);

        textfieldcorreo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        textfieldcorreo.setForeground(new java.awt.Color(25, 92, 134));
        textfieldcorreo.setBorder(null);
        jpdatosp.add(textfieldcorreo);
        textfieldcorreo.setBounds(200, 577, 370, 40);

        textfieldperfil.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        textfieldperfil.setForeground(new java.awt.Color(25, 92, 134));
        textfieldperfil.setBorder(null);
        jpdatosp.add(textfieldperfil);
        textfieldperfil.setBounds(950, 170, 250, 30);

        cmbtalla.setBackground(new java.awt.Color(178, 248, 248));
        cmbtalla.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbtalla.setForeground(new java.awt.Color(25, 92, 134));
        cmbtalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL" }));
        cmbtalla.setBorder(null);
        jpdatosp.add(cmbtalla);
        cmbtalla.setBounds(870, 235, 60, 36);

        textfieldtelefono.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldtelefono.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefono.setBorder(null);
        jpdatosp.add(textfieldtelefono);
        textfieldtelefono.setBounds(880, 310, 250, 30);

        textfielddpi.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfielddpi.setForeground(new java.awt.Color(25, 92, 134));
        textfielddpi.setBorder(null);
        jpdatosp.add(textfielddpi);
        textfielddpi.setBounds(180, 430, 390, 40);

        fechas.setColorBackground(new java.awt.Color(22, 54, 77));
        fechas.setColorDiaActual(new java.awt.Color(0, 255, 255));
        fechas.setFuente(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jpdatosp.add(fechas);
        fechas.setBounds(330, 353, 270, 40);

        lbdp.setForeground(new java.awt.Color(25, 92, 134));
        lbdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/datospersonales2.jpg"))); // NOI18N
        jpdatosp.add(lbdp);
        lbdp.setBounds(0, -5, 1250, 700);

        slider.add(jpdatosp, "card2");

        jpinfomed.setBackground(new java.awt.Color(18, 44, 62));
        jpinfomed.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpinfomed.setName("jpinfomed"); // NOI18N
        jpinfomed.setLayout(null);

        btnsiguientedenc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguientedenc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguientedenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientedencActionPerformed(evt);
            }
        });
        jpinfomed.add(btnsiguientedenc);
        btnsiguientedenc.setBounds(1070, 470, 120, 90);

        btnatrasbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasbeca.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasbeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasbecaActionPerformed(evt);
            }
        });
        jpinfomed.add(btnatrasbeca);
        btnatrasbeca.setBounds(640, 460, 120, 110);

        textfieldhospital.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        textfieldhospital.setForeground(new java.awt.Color(25, 92, 134));
        textfieldhospital.setBorder(null);
        jpinfomed.add(textfieldhospital);
        textfieldhospital.setBounds(50, 233, 530, 40);

        textfieldpadecimiento1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldpadecimiento1.setBorder(null);
        jpinfomed.add(textfieldpadecimiento1);
        textfieldpadecimiento1.setBounds(50, 403, 530, 40);

        textfieldpadecimiento2.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        textfieldpadecimiento2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldpadecimiento2.setBorder(null);
        jpinfomed.add(textfieldpadecimiento2);
        textfieldpadecimiento2.setBounds(50, 449, 530, 40);

        textfieldpadecimiento3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldpadecimiento3.setForeground(new java.awt.Color(25, 92, 134));
        textfieldpadecimiento3.setBorder(null);
        jpinfomed.add(textfieldpadecimiento3);
        textfieldpadecimiento3.setBounds(50, 503, 530, 40);

        textfieldpadecimiento4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldpadecimiento4.setForeground(new java.awt.Color(25, 92, 134));
        textfieldpadecimiento4.setBorder(null);
        jpinfomed.add(textfieldpadecimiento4);
        textfieldpadecimiento4.setBounds(50, 550, 530, 40);

        textfieldalergia1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        textfieldalergia1.setForeground(new java.awt.Color(25, 92, 134));
        textfieldalergia1.setBorder(null);
        jpinfomed.add(textfieldalergia1);
        textfieldalergia1.setBounds(820, 173, 390, 40);

        textfieldalergia2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldalergia2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldalergia2.setBorder(null);
        jpinfomed.add(textfieldalergia2);
        textfieldalergia2.setBounds(650, 222, 560, 40);

        textfieldalergia3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldalergia3.setForeground(new java.awt.Color(25, 92, 134));
        textfieldalergia3.setBorder(null);
        jpinfomed.add(textfieldalergia3);
        textfieldalergia3.setBounds(650, 263, 560, 40);

        textfieldalergia4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldalergia4.setForeground(new java.awt.Color(25, 92, 134));
        textfieldalergia4.setBorder(null);
        jpinfomed.add(textfieldalergia4);
        textfieldalergia4.setBounds(650, 312, 560, 32);

        textfieldalergia5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldalergia5.setBorder(null);
        jpinfomed.add(textfieldalergia5);
        textfieldalergia5.setBounds(650, 350, 470, 40);

        cmbtipodesangre.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        cmbtipodesangre.setForeground(new java.awt.Color(25, 92, 134));
        cmbtipodesangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbtipodesangre.setBorder(null);
        jpinfomed.add(cmbtipodesangre);
        cmbtipodesangre.setBounds(790, 530, 230, 30);

        lbinfomed.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbinfomed.setForeground(new java.awt.Color(25, 92, 134));
        lbinfomed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/infomed2.jpg"))); // NOI18N
        lbinfomed.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpinfomed.add(lbinfomed);
        lbinfomed.setBounds(0, -3, 1250, 700);

        slider.add(jpinfomed, "card3");

        jpdenca.setBackground(new java.awt.Color(18, 44, 62));
        jpdenca.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpdenca.setName("jpdenca"); // NOI18N
        jpdenca.setLayout(null);

        btnsiguienteconteme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguienteconteme.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguienteconteme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientecontemeActionPerformed(evt);
            }
        });
        jpdenca.add(btnsiguienteconteme);
        btnsiguienteconteme.setBounds(1080, 460, 120, 90);

        btnatrasinfme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasinfme.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasinfme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasinfmeActionPerformed(evt);
            }
        });
        jpdenca.add(btnatrasinfme);
        btnatrasinfme.setBounds(670, 450, 120, 110);

        textfieldnombreencargado.setBackground(new java.awt.Color(255, 0, 255));
        textfieldnombreencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldnombreencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldnombreencargado.setBorder(null);
        textfieldnombreencargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldnombreencargadoKeyTyped(evt);
            }
        });
        jpdenca.add(textfieldnombreencargado);
        textfieldnombreencargado.setBounds(160, 168, 440, 30);

        textfieldapellidoencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldapellidoencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldapellidoencargado.setBorder(null);
        textfieldapellidoencargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldapellidoencargadoKeyTyped(evt);
            }
        });
        jpdenca.add(textfieldapellidoencargado);
        textfieldapellidoencargado.setBounds(170, 233, 430, 30);

        textfieldtelefonoencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldtelefonoencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefonoencargado.setBorder(null);
        jpdenca.add(textfieldtelefonoencargado);
        textfieldtelefonoencargado.setBounds(270, 350, 330, 40);

        cmbnivelestudioencargado.setBackground(new java.awt.Color(178, 248, 248));
        cmbnivelestudioencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbnivelestudioencargado.setForeground(new java.awt.Color(25, 92, 134));
        cmbnivelestudioencargado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Diversificado", "Universitario", "Posgrado", "Otro" }));
        cmbnivelestudioencargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdenca.add(cmbnivelestudioencargado);
        cmbnivelestudioencargado.setBounds(254, 290, 340, 40);

        textfielddpiencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfielddpiencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfielddpiencargado.setBorder(null);
        jpdenca.add(textfielddpiencargado);
        textfielddpiencargado.setBounds(160, 440, 420, 40);

        textfieldresidenciaencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldresidenciaencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldresidenciaencargado.setBorder(null);
        jpdenca.add(textfieldresidenciaencargado);
        textfieldresidenciaencargado.setBounds(200, 520, 380, 40);

        textfieldcorreoencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldcorreoencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldcorreoencargado.setBorder(null);
        jpdenca.add(textfieldcorreoencargado);
        textfieldcorreoencargado.setBounds(190, 580, 390, 40);

        textfieldocupacionencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldocupacionencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldocupacionencargado.setBorder(null);
        textfieldocupacionencargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldocupacionencargadoKeyTyped(evt);
            }
        });
        jpdenca.add(textfieldocupacionencargado);
        textfieldocupacionencargado.setBounds(660, 220, 550, 40);

        textfieldlugarencargado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldlugarencargado.setForeground(new java.awt.Color(25, 92, 134));
        textfieldlugarencargado.setBorder(null);
        textfieldlugarencargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldlugarencargadoKeyTyped(evt);
            }
        });
        jpdenca.add(textfieldlugarencargado);
        textfieldlugarencargado.setBounds(660, 320, 550, 40);

        btnotrotelefonoencargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_35px.png"))); // NOI18N
        btnotrotelefonoencargado.setBorder(null);
        btnotrotelefonoencargado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_70px.png"))); // NOI18N
        jpdenca.add(btnotrotelefonoencargado);
        btnotrotelefonoencargado.setBounds(870, 450, 120, 70);

        lbdatosenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/datosenc2.jpg"))); // NOI18N
        lbdatosenca.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpdenca.add(lbdatosenca);
        lbdatosenca.setBounds(0, -3, 1250, 700);

        slider.add(jpdenca, "card4");

        jpconteme.setBackground(new java.awt.Color(18, 44, 62));
        jpconteme.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpconteme.setName("jpconteme"); // NOI18N
        jpconteme.setLayout(null);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jpconteme.add(btnguardar);
        btnguardar.setBounds(1060, 450, 150, 130);

        btnatrasdenc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasdenc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasdenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasdencActionPerformed(evt);
            }
        });
        jpconteme.add(btnatrasdenc);
        btnatrasdenc.setBounds(670, 440, 120, 110);

        textfieldnombreemergencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldnombreemergencia.setForeground(new java.awt.Color(25, 92, 134));
        textfieldnombreemergencia.setBorder(null);
        textfieldnombreemergencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldnombreemergenciaKeyTyped(evt);
            }
        });
        jpconteme.add(textfieldnombreemergencia);
        textfieldnombreemergencia.setBounds(170, 160, 430, 40);

        textfieldapellidoemergencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldapellidoemergencia.setForeground(new java.awt.Color(25, 92, 134));
        textfieldapellidoemergencia.setBorder(null);
        textfieldapellidoemergencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldapellidoemergenciaKeyTyped(evt);
            }
        });
        jpconteme.add(textfieldapellidoemergencia);
        textfieldapellidoemergencia.setBounds(170, 225, 430, 40);

        textfieldparentescoemergencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldparentescoemergencia.setForeground(new java.awt.Color(25, 92, 134));
        textfieldparentescoemergencia.setBorder(null);
        textfieldparentescoemergencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldparentescoemergenciaKeyTyped(evt);
            }
        });
        jpconteme.add(textfieldparentescoemergencia);
        textfieldparentescoemergencia.setBounds(320, 288, 280, 40);

        textfieldtelefonoemergencia1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldtelefonoemergencia1.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefonoemergencia1.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia1);
        textfieldtelefonoemergencia1.setBounds(173, 355, 150, 30);

        textfieldtelefonoemergencia2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldtelefonoemergencia2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefonoemergencia2.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia2);
        textfieldtelefonoemergencia2.setBounds(50, 430, 530, 30);

        textfieldtelefonoemergencia3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldtelefonoemergencia3.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefonoemergencia3.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia3);
        textfieldtelefonoemergencia3.setBounds(50, 473, 530, 30);

        textfieldtelefonoemergencia4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldtelefonoemergencia4.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefonoemergencia4.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia4);
        textfieldtelefonoemergencia4.setBounds(50, 520, 530, 30);

        textfieldtelefonoemergencia5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        textfieldtelefonoemergencia5.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefonoemergencia5.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia5);
        textfieldtelefonoemergencia5.setBounds(50, 567, 530, 30);

        lbconteme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/contaceme2.jpg"))); // NOI18N
        lbconteme.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpconteme.add(lbconteme);
        lbconteme.setBounds(0, -3, 1250, 700);
        lbconteme.getAccessibleContext().setAccessibleDescription("");

        slider.add(jpconteme, "card5");

        jpdlabo.setBackground(new java.awt.Color(18, 44, 62));
        jpdlabo.setToolTipText("");
        jpdlabo.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpdlabo.setName("jpdlabo"); // NOI18N
        jpdlabo.setLayout(null);

        btnsiguientevolu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguientevolu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguientevolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientevoluActionPerformed(evt);
            }
        });
        jpdlabo.add(btnsiguientevolu);
        btnsiguientevolu.setBounds(1070, 450, 130, 110);

        btnatrasdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasdp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasdpActionPerformed(evt);
            }
        });
        jpdlabo.add(btnatrasdp);
        btnatrasdp.setBounds(670, 440, 120, 110);

        textfieldlugardeestudio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldlugardeestudio.setForeground(new java.awt.Color(25, 92, 134));
        textfieldlugardeestudio.setToolTipText("");
        textfieldlugardeestudio.setBorder(null);
        textfieldlugardeestudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldlugardeestudioMouseClicked(evt);
            }
        });
        jpdlabo.add(textfieldlugardeestudio);
        textfieldlugardeestudio.setBounds(70, 320, 530, 40);

        textfieldocupacion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldocupacion.setForeground(new java.awt.Color(25, 92, 134));
        textfieldocupacion.setBorder(null);
        textfieldocupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldocupacionMouseClicked(evt);
            }
        });
        jpdlabo.add(textfieldocupacion);
        textfieldocupacion.setBounds(70, 520, 530, 40);

        textfieldlugartrabajo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldlugartrabajo.setForeground(new java.awt.Color(25, 92, 134));
        textfieldlugartrabajo.setBorder(null);
        textfieldlugartrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldlugartrabajoMouseClicked(evt);
            }
        });
        jpdlabo.add(textfieldlugartrabajo);
        textfieldlugartrabajo.setBounds(660, 250, 530, 30);

        cmbnivelestudiovoluntario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpdlabo.add(cmbnivelestudiovoluntario);
        cmbnivelestudiovoluntario.setBounds(280, 180, 330, 30);

        textfieldlugardeestudio2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldlugardeestudio2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldlugardeestudio2.setBorder(null);
        textfieldlugardeestudio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldlugardeestudio2MouseClicked(evt);
            }
        });
        textfieldlugardeestudio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldlugardeestudio2ActionPerformed(evt);
            }
        });
        jpdlabo.add(textfieldlugardeestudio2);
        textfieldlugardeestudio2.setBounds(70, 362, 530, 40);

        textfieldocupacion2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldocupacion2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldocupacion2.setBorder(null);
        textfieldocupacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldocupacion2MouseClicked(evt);
            }
        });
        jpdlabo.add(textfieldocupacion2);
        textfieldocupacion2.setBounds(70, 560, 530, 40);

        textfieldlugartrabajo2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldlugartrabajo2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldlugartrabajo2.setBorder(null);
        textfieldlugartrabajo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldlugartrabajo2MouseClicked(evt);
            }
        });
        jpdlabo.add(textfieldlugartrabajo2);
        textfieldlugartrabajo2.setBounds(660, 310, 530, 30);

        lbdlabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/datoslaborales2.jpg"))); // NOI18N
        lbdlabo.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpdlabo.add(lbdlabo);
        lbdlabo.setBounds(0, -3, 1250, 700);

        slider.add(jpdlabo, "card6");

        jpvoluntariado.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpvoluntariado.setName("jpvoluntariado"); // NOI18N
        jpvoluntariado.setLayout(null);

        btnatrasdlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasdlab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasdlab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnatrasdlabMouseClicked(evt);
            }
        });
        jpvoluntariado.add(btnatrasdlab);
        btnatrasdlab.setBounds(660, 450, 130, 100);

        btnsiguientebeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguientebeca.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguientebeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguientebecaMouseClicked(evt);
            }
        });
        btnsiguientebeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientebecaActionPerformed(evt);
            }
        });
        jpvoluntariado.add(btnsiguientebeca);
        btnsiguientebeca.setBounds(1080, 450, 120, 100);

        btnaddp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Plus_50px.png"))); // NOI18N
        btnaddp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Plus_75px.png"))); // NOI18N
        jpvoluntariado.add(btnaddp);
        btnaddp.setBounds(860, 450, 140, 70);

        ptxt.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        ptxt.setForeground(new java.awt.Color(25, 92, 134));
        ptxt.setBorder(null);
        jpvoluntariado.add(ptxt);
        ptxt.setBounds(70, 240, 510, 40);

        tableproyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Proyecto", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableproyecto.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tableproyecto.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tableproyecto.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tableproyecto.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tableproyecto.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tableproyecto.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tableproyecto.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tableproyecto.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tableproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tableproyecto.setRowHeight(22);
        tableproyecto.getTableHeader().setReorderingAllowed(false);
        scrollp.setViewportView(tableproyecto);
        if (tableproyecto.getColumnModel().getColumnCount() > 0) {
            tableproyecto.getColumnModel().getColumn(1).setHeaderValue("Proyecto");
            tableproyecto.getColumnModel().getColumn(2).setHeaderValue("Descripción");
        }

        jpvoluntariado.add(scrollp);
        scrollp.setBounds(60, 290, 520, 350);

        lbvoluntariado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbvoluntariado.setForeground(new java.awt.Color(25, 92, 134));
        lbvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/voluntariado2.jpg"))); // NOI18N
        lbvoluntariado.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpvoluntariado.add(lbvoluntariado);
        lbvoluntariado.setBounds(0, 0, 1250, 700);

        slider.add(jpvoluntariado, "card7");

        jpbeca.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpbeca.setName("jpbeca"); // NOI18N
        jpbeca.setLayout(null);

        btnatrasvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasvoluntariado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasvoluntariado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnatrasvoluntariadoMouseClicked(evt);
            }
        });
        jpbeca.add(btnatrasvoluntariado);
        btnatrasvoluntariado.setBounds(670, 460, 110, 80);

        btnsiguienteinfomed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguienteinfomed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguienteinfomed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguienteinfomedMouseClicked(evt);
            }
        });
        jpbeca.add(btnsiguienteinfomed);
        btnsiguienteinfomed.setBounds(1080, 460, 120, 80);

        cmbexbecario.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbexbecario.setForeground(new java.awt.Color(25, 92, 134));
        cmbexbecario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpbeca.add(cmbexbecario);
        cmbexbecario.setBounds(320, 510, 250, 40);

        cmbactivosina.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbactivosina.setForeground(new java.awt.Color(25, 92, 134));
        cmbactivosina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpbeca.add(cmbactivosina);
        cmbactivosina.setBounds(320, 450, 250, 40);

        tableproyecto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Programa"
            }
        ));
        tableproyecto1.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tableproyecto1.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tableproyecto1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tableproyecto1.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tableproyecto1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tableproyecto1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tableproyecto1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tableproyecto1.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tableproyecto1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto1.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto1.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto1.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tableproyecto1.setRowHeight(22);
        tableproyecto1.getTableHeader().setReorderingAllowed(false);
        scrollp1.setViewportView(tableproyecto1);

        jpbeca.add(scrollp1);
        scrollp1.setBounds(663, 220, 540, 190);

        fdesercion.setColorBackground(new java.awt.Color(22, 54, 77));
        jpbeca.add(fdesercion);
        fdesercion.setBounds(240, 337, 330, 30);

        finicio.setColorBackground(new java.awt.Color(22, 54, 77));
        jpbeca.add(finicio);
        finicio.setBounds(240, 250, 330, 30);

        lbbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/ajede2.jpg"))); // NOI18N
        lbbeca.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpbeca.add(lbbeca);
        lbbeca.setBounds(0, 0, 1250, 700);

        slider.add(jpbeca, "card8");

        jPanel1.add(slider);
        slider.setBounds(0, 0, 1250, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se inserta el asociado y su ocupación
    private boolean datosAsociado() {
        //Datos tabla asociado
        boolean estudiaA = false;
        String lugarEstudioA = "";
        boolean trabajaA = false;
        String lugarTrabajoA = "";
        String nombreA = textfieldnombres.getText();
        String apellidoA = textfieldapellidos.getText();
        String DpiA = textfielddpi.getText();
        String generoA = (String) cmbgenero.getSelectedItem();
        String fechaA = getFecha(fechas);
        String tallaA = (String) cmbtalla.getSelectedItem();
        String PerfilFBA = textfieldperfil.getText();
        String telefonoA = textfieldtelefono.getText();
        String emailA = textfieldcorreo.getText();
        String residenciaA = textfieldresidencia.getText();
        String nivEstA = (String) cmbnivelestudiovoluntario.getSelectedItem();
        String tipoSangreA = (String) cmbtipodesangre.getSelectedItem();
        if((textfieldlugardeestudio.getText().length() != 0) || (textfieldlugardeestudio2.getText().length() != 0))
        {
            estudiaA = true;
            lugarEstudioA = textfieldlugardeestudio.getText() + textfieldlugardeestudio2.getText();
        }
        if((textfieldocupacion.getText().length() != 0) || (textfieldocupacion2.getText().length() != 0))
        {
            trabajaA = true;
            lugarTrabajoA = textfieldlugartrabajo.getText() + textfieldlugartrabajo2.getText();
        }    

        boolean genero1 = false;
        if (generoA.equals("Masculino")) {
            genero1 = true;
        }
        //------------------------------------------Datos frame Antecedentes Médicos-----------------------------------
        //
        String Hospital = textfieldhospital.getText();
        String padecimientos = textfieldpadecimiento1.getText() + " " + textfieldpadecimiento2.getText()
                + " " + textfieldpadecimiento3.getText() + " " + textfieldpadecimiento4.getText();
        String alergias = textfieldalergia1.getText() + " " + textfieldalergia2.getText() + " "
                + textfieldalergia3.getText() + " " + textfieldalergia4.getText() + " " + textfieldalergia5.getText();
        //-------------------------------------------Datos frame Encargado----------------------------------------
        boolean ocupacionEnc = false;
        String nombreEncargado = textfieldnombreencargado.getText();
        String apellidoEncargado = textfieldapellidoencargado.getText();
        String nivelEstudioEnc = (String) cmbnivelestudioencargado.getSelectedItem();
        String telefonoEncargado = textfieldtelefonoencargado.getText();
        String dpiEnc = textfielddpiencargado.getText();
        String residenciaEncargado = textfieldresidenciaencargado.getText();
        String emailEncargado = textfieldcorreoencargado.getText();
        if(textfieldocupacionencargado.getText().length() != 0)
            ocupacionEnc = true;
        String lugarOcupacionEnc = textfieldlugarencargado.getText();
        //-----------------------------------------Datos frame contacto emergencia-------------------------------------
        String nombreEmer = textfieldnombreemergencia.getText();
        String apellidoEmer = textfieldapellidoemergencia.getText();
        String parentesco = textfieldparentescoemergencia.getText();
        String telefonoEmer = textfieldtelefonoemergencia1.getText();

        if(asociado.insertar(DpiA, genero1, emailA, fechaA, tallaA, residenciaA, nombreA, apellidoA, true, PerfilFBA, tipoSangreA, nivEstA,
                telefonoA, estudiaA, lugarEstudioA, trabajaA, lugarTrabajoA, Hospital, padecimientos, alergias, dpiEnc, emailEncargado, nombreEncargado, 
                apellidoEncargado, residenciaEncargado, nivelEstudioEnc, false, ocupacionEnc, lugarOcupacionEnc, telefonoEncargado, parentesco, nombreEmer, 
                apellidoEmer, telefonoEmer))
        {
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            return true;
        }
        else
            return false;
    }

    

    private void btnatrasdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasdpActionPerformed
        slider.setPanelSlider(jpdatosp, RSPanelsSlider.DIRECT.RIGHT);

    }//GEN-LAST:event_btnatrasdpActionPerformed

    private void btnminimizardpActionPerformed(java.awt.event.ActionEvent evt) {
        this.setExtendedState(ICONIFIED);
    }

    private void btnsiguientevoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientevoluActionPerformed
        slider.setPanelSlider(jpvoluntariado, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientevoluActionPerformed
    private void btnminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarActionPerformed

    private void btnatrasdencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasdencActionPerformed
        slider.setPanelSlider(jpdenca, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasdencActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        /**
         * Proceso para agregar al asociado, todos los datos que están escritos
         * en este frame
         */

        //Acá se ingresan todos los datos del asociado
        if (validarContactoEmergencia()) {
            if (datosAsociado()) {
                this.dispose();
                menujf menu = new menujf();
                menu.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnatrasinfmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasinfmeActionPerformed
        slider.setPanelSlider(jpinfomed, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasinfmeActionPerformed

    private void btnsiguientecontemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientecontemeActionPerformed
        if (validarDatosEncargado()) {
            slider.setPanelSlider(jpconteme, RSPanelsSlider.DIRECT.LEFT);
        }
    }//GEN-LAST:event_btnsiguientecontemeActionPerformed

    private void btnatrasbecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasbecaActionPerformed
        slider.setPanelSlider(jpbeca, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasbecaActionPerformed

    private void btnsiguientedencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientedencActionPerformed
        slider.setPanelSlider(jpdenca, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientedencActionPerformed

    private void textfieldapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldapellidosKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldapellidosKeyTyped

    private void textfieldedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldedadKeyTyped
        c = evt.getKeyChar();
        if (((int) c >= 0 && (int) c <= 47) || ((int) c >= 58 && (int) c <= 255)) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldedadKeyTyped

    private void textfieldnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldnombresKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldnombresKeyTyped

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);
        if (respuesta == 0) {
            menujf m = new menujf();
            m.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnmenuActionPerformed

    public String getFecha(RSDateChooser jd) {
        if (jd.getDatoFecha() != null) {
            return formato.format(jd.getDatoFecha());
        } else {
            return null;
        }
    }

    public Date StringFecha(String fecha) {
        SimpleDateFormat formato1 = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaE = null;
        try {
            fechaE = formato1.parse(fecha);
            return fechaE;
        } catch (ParseException e) {
        }
        return null;
    }

    private boolean validarDatosPersonales() {
        if (textfieldnombres.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo nombre está vacío, favor de ingresar el nombre",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldnombres.requestFocus();
            return false;
        } else if (textfieldapellidos.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo apellido esta vacio, favor de ingresar los apellidos",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldapellidos.requestFocus();
            return false;
        } else if (getFecha(fechas) == null) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo fecha esta vacio, favor de ingresar la fecha de nacimiento",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            fechas.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    private boolean validarDatosEncargado() {
        if (textfieldnombreencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo nombre está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldnombreencargado.requestFocus();
            return false;
        } else if (textfieldapellidoencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo apellido está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldapellidoencargado.requestFocus();
            return false;
        } else if (textfieldtelefonoencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo teléfono está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldtelefono.requestFocus();
            return false;
        } else if (textfielddpiencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo DPI/CUI está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfielddpiencargado.requestFocus();
            return false;
        } else if (textfieldresidenciaencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo Residencia está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldresidenciaencargado.requestFocus();
            return false;
        } else if (textfieldocupacionencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo Trabajo/Ocupación está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldocupacionencargado.requestFocus();
            return false;
        } else if (textfieldlugarencargado.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo Lugar de Trabajo/Ocupación está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldlugarencargado.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    private boolean validarContactoEmergencia() {
        if (textfieldnombreemergencia.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo nombre está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldnombreemergencia.requestFocus();
            return false;
        } else if (textfieldapellidoemergencia.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo apellido está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldapellidoemergencia.requestFocus();
            return false;
        } else if (textfieldparentescoemergencia.getText().length() == 0) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "El campo Parentesco/Relación está vacío, favor de llenarlo",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            textfieldparentescoemergencia.requestFocus();
            return false;
        } else {
            return true;
        }
    }
    private void btnsiguientedlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientedlActionPerformed
        if (validarDatosPersonales()) {
            slider.setPanelSlider(jpdlabo, RSPanelsSlider.DIRECT.LEFT);
        }
    }//GEN-LAST:event_btnsiguientedlActionPerformed

    private void btnhomedpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomedpActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);
        if (respuesta == 0) {
            menujf m = new menujf();
            m.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnhomedpActionPerformed
    /**/
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void textfieldlugardeestudio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldlugardeestudio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldlugardeestudio2ActionPerformed

    private void textfieldocupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldocupacionMouseClicked
        textfieldocupacion.setText("");
    }//GEN-LAST:event_textfieldocupacionMouseClicked

    private void textfieldlugardeestudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldlugardeestudioMouseClicked
        textfieldlugardeestudio.setText("");
    }//GEN-LAST:event_textfieldlugardeestudioMouseClicked

    private void textfieldlugardeestudio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldlugardeestudio2MouseClicked
        textfieldlugardeestudio2.setText("");
    }//GEN-LAST:event_textfieldlugardeestudio2MouseClicked

    private void textfieldocupacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldocupacion2MouseClicked
        textfieldocupacion2.setText("");
    }//GEN-LAST:event_textfieldocupacion2MouseClicked

    private void textfieldlugartrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldlugartrabajoMouseClicked
        textfieldlugartrabajo.setText("");
    }//GEN-LAST:event_textfieldlugartrabajoMouseClicked

    private void textfieldlugartrabajo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldlugartrabajo2MouseClicked
        textfieldlugartrabajo2.setText("");
    }//GEN-LAST:event_textfieldlugartrabajo2MouseClicked

    private void btnatrasdlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasdlabMouseClicked
        slider.setPanelSlider(jpdlabo, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasdlabMouseClicked

    private void btnsiguientebecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguientebecaMouseClicked
        slider.setPanelSlider(jpbeca, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientebecaMouseClicked

    private void btnatrasvoluntariadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasvoluntariadoMouseClicked
        slider.setPanelSlider(jpvoluntariado, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasvoluntariadoMouseClicked

    private void btnsiguienteinfomedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteinfomedMouseClicked
        slider.setPanelSlider(jpinfomed, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguienteinfomedMouseClicked

    private void textfieldnombreencargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldnombreencargadoKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldnombreencargadoKeyTyped

    private void textfieldapellidoencargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldapellidoencargadoKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldapellidoencargadoKeyTyped

    private void textfieldocupacionencargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldocupacionencargadoKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldocupacionencargadoKeyTyped

    private void textfieldlugarencargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldlugarencargadoKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldlugarencargadoKeyTyped

    private void textfieldnombreemergenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldnombreemergenciaKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldnombreemergenciaKeyTyped

    private void textfieldapellidoemergenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldapellidoemergenciaKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldapellidoemergenciaKeyTyped

    private void textfieldparentescoemergenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldparentescoemergenciaKeyTyped
        c = evt.getKeyChar();
        if ((int) c >= 0 && (int) c <= 64 && (int) c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_textfieldparentescoemergenciaKeyTyped

    private void btnsiguientebecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientebecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsiguientebecaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new agregarjf().setVisible(true);
            }
        });
    }
    private final SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddp;
    private javax.swing.JButton btnaddtel;
    private javax.swing.JButton btnatrasbeca;
    private javax.swing.JButton btnatrasdenc;
    private javax.swing.JButton btnatrasdlab;
    private javax.swing.JButton btnatrasdp;
    private javax.swing.JButton btnatrasinfme;
    private javax.swing.JButton btnatrasvoluntariado;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnotrotelefonoencargado;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsiguientebeca;
    private javax.swing.JButton btnsiguienteconteme;
    private javax.swing.JButton btnsiguientedenc;
    private javax.swing.JButton btnsiguientedl;
    private javax.swing.JButton btnsiguienteinfomed;
    private javax.swing.JButton btnsiguientevolu;
    private javax.swing.JComboBox<String> cmbactivosina;
    private javax.swing.JComboBox<String> cmbexbecario;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JComboBox<String> cmbnivelestudioencargado;
    private javax.swing.JComboBox<String> cmbnivelestudiovoluntario;
    private javax.swing.JComboBox<String> cmbtalla;
    private javax.swing.JComboBox<String> cmbtipodesangre;
    private rojeru_san.componentes.RSYearDate fdesercion;
    private rojeru_san.componentes.RSDateChooser fechas;
    private rojeru_san.componentes.RSYearDate finicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpbeca;
    private javax.swing.JPanel jpconteme;
    private javax.swing.JPanel jpdatosp;
    private javax.swing.JPanel jpdenca;
    private javax.swing.JPanel jpdlabo;
    private javax.swing.JPanel jpinfomed;
    private javax.swing.JPanel jpvoluntariado;
    private javax.swing.JLabel lbbeca;
    private javax.swing.JLabel lbconteme;
    private javax.swing.JLabel lbdatosenca;
    private javax.swing.JLabel lbdlabo;
    private javax.swing.JLabel lbdp;
    private javax.swing.JLabel lbinfomed;
    private javax.swing.JLabel lbvoluntariado;
    private javax.swing.JTextField ptxt;
    private javax.swing.JScrollPane scrollp;
    private javax.swing.JScrollPane scrollp1;
    private rojerusan.RSPanelsSlider slider;
    private rojerusan.RSTableMetro tableproyecto;
    private rojerusan.RSTableMetro tableproyecto1;
    private javax.swing.JTextField textfieldalergia1;
    private javax.swing.JTextField textfieldalergia2;
    private javax.swing.JTextField textfieldalergia3;
    private javax.swing.JTextField textfieldalergia4;
    private javax.swing.JTextField textfieldalergia5;
    private javax.swing.JTextField textfieldapellidoemergencia;
    private javax.swing.JTextField textfieldapellidoencargado;
    private javax.swing.JTextField textfieldapellidos;
    private javax.swing.JTextField textfieldcorreo;
    private javax.swing.JTextField textfieldcorreoencargado;
    private javax.swing.JTextField textfielddpi;
    private javax.swing.JTextField textfielddpiencargado;
    private javax.swing.JTextField textfieldedad;
    private javax.swing.JTextField textfieldhospital;
    private javax.swing.JTextField textfieldlugardeestudio;
    private javax.swing.JTextField textfieldlugardeestudio2;
    private javax.swing.JTextField textfieldlugarencargado;
    private javax.swing.JTextField textfieldlugartrabajo;
    private javax.swing.JTextField textfieldlugartrabajo2;
    private javax.swing.JTextField textfieldnombreemergencia;
    private javax.swing.JTextField textfieldnombreencargado;
    private javax.swing.JTextField textfieldnombres;
    private javax.swing.JTextField textfieldocupacion;
    private javax.swing.JTextField textfieldocupacion2;
    private javax.swing.JTextField textfieldocupacionencargado;
    private javax.swing.JTextField textfieldpadecimiento1;
    private javax.swing.JTextField textfieldpadecimiento2;
    private javax.swing.JTextField textfieldpadecimiento3;
    private javax.swing.JTextField textfieldpadecimiento4;
    private javax.swing.JTextField textfieldparentescoemergencia;
    private javax.swing.JTextField textfieldperfil;
    private javax.swing.JTextField textfieldresidencia;
    private javax.swing.JTextField textfieldresidenciaencargado;
    private javax.swing.JTextField textfieldtelefono;
    private javax.swing.JTextField textfieldtelefonoemergencia1;
    private javax.swing.JTextField textfieldtelefonoemergencia2;
    private javax.swing.JTextField textfieldtelefonoemergencia3;
    private javax.swing.JTextField textfieldtelefonoemergencia4;
    private javax.swing.JTextField textfieldtelefonoemergencia5;
    private javax.swing.JTextField textfieldtelefonoencargado;
    // End of variables declaration//GEN-END:variables
}
