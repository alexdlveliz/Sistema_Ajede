/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Asociado;
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

/**
 *
 * @author Nahomi
 */
public class agregarjf extends javax.swing.JFrame {
    ImageIcon dp1= new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datospersonales1.jpg")).getImage());
    ImageIcon dp2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datospersonales2.jpg")).getImage());
    ImageIcon dlabo1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datoslaborales1.jpg")).getImage());
    ImageIcon dlabo2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datoslaborales2.jpg")).getImage());
    ImageIcon voluntariado1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/voluntariado1.jpg")).getImage());
    ImageIcon voluntariado2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/voluntariado2.jpg")).getImage());
    ImageIcon beca1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/beca1.jpg")).getImage());
    ImageIcon beca2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/beca2.jpg")).getImage());
    ImageIcon infomed1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/infomed1.jpg")).getImage());
    ImageIcon infomed2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/infomed2.jpg")).getImage());
    ImageIcon datosenc1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datosenc1.jpg")).getImage());
    ImageIcon datosenc2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/datosenc2.jpg")).getImage());
    ImageIcon contacem1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/contaceme1.jpg")).getImage());
    ImageIcon contacem2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/contaceme2.jpg")).getImage());
    Font fuente = new Font("Yu Gothic UI Light", Font.PLAIN,34);
    Font fuente2 = new Font("Yu Gothic UI Light", Font.PLAIN,28);
    

    /**
     * Creates new form agregarjf
     */
    private char c;
    private Asociado asociado;

    public agregarjf() {
        asociado = new Asociado();
        initComponents();
        //transparencia();
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
            lbdlabo.setSize(1565,880);
            jpdlabo.setSize(1565,880);
            jpvoluntariado.setSize(1565,880);
            lbvoluntariado.setSize(1565,880);
            jpinfomed.setSize(1565,880);
            lbinfomed.setSize(1565, 880);
            jpdenca.setSize(1565,880);
            lbdatosenca.setSize(1565,880);
            jpconteme.setSize(1565,880);
            lbconteme.setSize(1565,880);
            lbdp.setIcon(dp1);
            lbdlabo.setIcon(dlabo1);
            lbvoluntariado.setIcon(voluntariado1);
            lbbeca.setIcon(beca1);
            jpbeca.setSize(1565,880);
            lbbeca.setSize(1565,880);
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
            textfieldapellidos.setLocation(215,286);
            textfieldedad.setSize(110,44);
            textfieldedad.setLocation(160,369);
            textfieldedad.setFont(fuente);
            cmbgenero.setLocation(475,370);
            cmbgenero.setSize(270,44);
            cmbgenero.setFont(fuente);
            datecfecha.setLocation(420,455);
            datecfecha.setSize(320,44);
            datecfecha.setFont(fuente);
            textfielddpi.setLocation(220, 560);
            textfielddpi.setSize(500,44);
            textfielddpi.setFont(fuente);
            textfieldresidencia.setLocation(265,645);
            textfieldresidencia.setSize(455,44);
            textfieldresidencia.setFont(fuente);
            textfieldcorreo.setLocation(255, 735);
            textfieldcorreo.setSize(468,44);
            textfieldcorreo.setFont(fuente);
            btnmenu.setLocation(837, 567);
            btnsiguientedl.setLocation(1360, 567);
            btnaddtel.setLocation(1110, 560);
            textfieldtelefono.setLocation(1105, 393);
            textfieldtelefono.setSize(395, 44);
            textfieldtelefono.setFont(fuente);
            cmbtalla.setLocation(1100, 300);
            cmbtalla.setSize(395,44);
            cmbtalla.setFont(fuente);
            textfieldperfil.setLocation(1190, 224);
            textfieldperfil.setSize(310,44);
            textfieldperfil.setFont(fuente);
            cmbnivelestudiovoluntario.setLocation(350, 222);
            cmbnivelestudiovoluntario.setSize(410, 44);
            cmbnivelestudiovoluntario.setFont(fuente);
            textfieldlugardeestudio.setLocation(80, 400);
            textfieldlugardeestudio.setSize(670,50);
            textfieldlugardeestudio.setFont(fuente2);
            textfieldlugardeestudio2.setLocation(80, 456);
            textfieldlugardeestudio2.setSize(670,50);
            textfieldlugardeestudio2.setFont(fuente2);
            textfieldocupacion.setLocation(80, 644);
            textfieldocupacion.setSize(670,50);
            textfieldocupacion.setFont(fuente2);
            textfieldocupacion2.setLocation(80, 700);
            textfieldocupacion2.setSize(670,50);
            textfieldocupacion2.setFont(fuente2);
            textfieldlugartrabajo.setLocation(840, 310);
            textfieldlugartrabajo.setSize(650,50);
            textfieldlugartrabajo.setFont(fuente2);
            textfieldlugartrabajo2.setLocation(840, 383);
            textfieldlugartrabajo2.setSize(650,50);
            textfieldlugartrabajo2.setFont(fuente2);
            btnsiguientevolu.setLocation(1360, 567);
            btnatrasdp.setLocation(845, 567);
            cmbproyecto1.setLocation(123, 285);
            cmbproyecto1.setSize(610, 44);
            cmbproyecto1.setFont(fuente2);
            cmbproyecto2.setLocation(123, 347);
            cmbproyecto2.setSize(610, 44);
            cmbproyecto2.setFont(fuente2);
            cmbproyecto3.setLocation(123, 400);
            cmbproyecto3.setSize(610, 44);
            cmbproyecto3.setFont(fuente2);
            cmbproyecto4.setLocation(125, 453);
            cmbproyecto4.setSize(610, 44);
            cmbproyecto4.setFont(fuente2);
            cmbpuestop1.setLocation(880, 285);
            cmbpuestop1.setSize(610, 44);
            cmbpuestop1.setFont(fuente2);
            cmbpuestop2.setLocation(880, 347);
            cmbpuestop2.setSize(610, 44);
            cmbpuestop2.setFont(fuente2);
            cmbpuestop3.setLocation(880, 400);
            cmbpuestop3.setSize(610, 44);
            cmbpuestop3.setFont(fuente2);
            cmbpuestop4.setLocation(880, 453);
            cmbpuestop4.setSize(610, 44);
            cmbpuestop4.setFont(fuente2); 
            btnsiguientebeca.setLocation(1360, 578);
            txthorasp1.setLocation(146, 665);
            txthorasp1.setSize(230, 44);
            txthorasp1.setFont(fuente2);
            txthorasp2.setLocation(494, 665);
            txthorasp2.setSize(230, 44);
            txthorasp2.setFont(fuente2);
            txthorasp3.setLocation(146, 730);
            txthorasp3.setSize(230, 44);
            txthorasp3.setFont(fuente2);
            txthorasp4.setLocation(494, 730);
            txthorasp4.setSize(230, 44);
            txthorasp4.setFont(fuente2);
            btnatrasdlab.setLocation(845, 578);
            btnaddp.setLocation(1097, 580);
        }
        else if((tamanio.width == 1366) && (tamanio.height == 768)) //1366x768, 1708x960
        {
            this.setLocationRelativeTo(null);
            this.setSize(1250, 700);
            //lbdp.setIcon(dp2);
            lbdlabo.setIcon(dlabo2);
            lbvoluntariado.setIcon(voluntariado2);
            lbbeca.setIcon(beca2);
            lbinfomed.setIcon(infomed2);
            lbdatosenca.setIcon(datosenc2);
            lbconteme.setIcon(contacem2);
        }
        
    }

    public void transparencia() 
    {
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
        btnsiguientedlab.setOpaque(false);
        btnsiguientedlab.setBorderPainted(false);
        btnsiguientedlab.setContentAreaFilled(false);
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
        textfieldnombres.setBackground(new Color(0,0,0,0));
        textfieldapellidos.setBackground(new Color(0,0,0,0));
        textfieldedad.setBackground(new Color(0,0,0,0));
        cmbgenero.setBackground(new Color(0,0,0,0));
        datecfecha.setBackground(new Color(0,0,0,0));
        textfielddpi.setBackground(new Color(0,0,0,0));
        textfieldresidencia.setBackground(new Color(0,0,0,0));
        textfieldcorreo.setBackground(new Color(0,0,0,0));
        textfieldperfil.setBackground(new Color(0,0,0,0));
        cmbtalla.setBackground(new Color(0,0,0,0));
        textfieldtelefono.setBackground(new Color(0,0,0,0));
        textfieldhospital.setBackground(new Color(0,0,0,0));
        textfieldpadecimiento1.setBackground(new Color(0,0,0,0));
        textfieldpadecimiento2.setBackground(new Color(0,0,0,0));
        textfieldpadecimiento3.setBackground(new Color(0,0,0,0));
        textfieldpadecimiento4.setBackground(new Color(0,0,0,0));
        textfieldalergia1.setBackground(new Color(0,0,0,0));
        textfieldalergia2.setBackground(new Color(0,0,0,0));
        textfieldalergia3.setBackground(new Color(0,0,0,0));
        textfieldalergia4.setBackground(new Color(0,0,0,0));
        textfieldalergia5.setBackground(new Color(0,0,0,0));
        cmbtipodesangre.setBackground(new Color(0,0,0,0));
        textfieldnombreencargado.setBackground(new Color(0,0,0,0));
        textfieldapellidoencargado.setBackground(new Color(0,0,0,0));
        textfieldtelefonoencargado.setBackground(new Color(0,0,0,0));
        cmbnivelestudioencargado.setBackground(new Color(0,0,0,0));
        textfielddpiencargado.setBackground(new Color(0,0,0,0));
        textfieldresidenciaencargado.setBackground(new Color(0,0,0,0));
        textfieldcorreoencargado.setBackground(new Color(0,0,0,0));
        textfieldocupacionencargado.setBackground(new Color(0,0,0,0));
        textfieldlugarencargado.setBackground(new Color(0,0,0,0));
        textfieldnombreemergencia.setBackground(new Color(0,0,0,0));
        textfieldapellidoemergencia.setBackground(new Color(0,0,0,0));
        textfieldparentescoemergencia.setBackground(new Color(0,0,0,0));
        textfieldtelefonoemergencia1.setBackground(new Color(0,0,0,0));
        textfieldtelefonoemergencia2.setBackground(new Color(0,0,0,0));
        textfieldtelefonoemergencia3.setBackground(new Color(0,0,0,0));
        textfieldtelefonoemergencia4.setBackground(new Color(0,0,0,0));
        textfieldtelefonoemergencia5.setBackground(new Color(0,0,0,0));
        cmbnivelestudiovoluntario.setBackground(new Color(0,0,0,0));
        textfieldlugardeestudio.setBackground(new Color(0,0,0,0));
        textfieldocupacion.setBackground(new Color(0,0,0,0));
        textfieldlugartrabajo.setBackground(new Color(0,0,0,0));
        textfieldlugardeestudio2.setBackground(new Color(0,0,0,0));
        textfieldocupacion2.setBackground(new Color(0,0,0,0));
        textfieldlugartrabajo2.setBackground(new Color(0,0,0,0));
        cmbproyecto1.setBackground(new Color(0,0,0,0));
        cmbproyecto2.setBackground(new Color(0,0,0,0));
        cmbproyecto3.setBackground(new Color(0,0,0,0));
        cmbproyecto4.setBackground(new Color(0,0,0,0));
        cmbpuestop1.setBackground(new Color(0,0,0,0));
        cmbpuestop2.setBackground(new Color(0,0,0,0));
        cmbpuestop3.setBackground(new Color(0,0,0,0));
        cmbpuestop4.setBackground(new Color(0,0,0,0));
        txthorasp1.setBackground(new Color(0,0,0,0));
        txthorasp2.setBackground(new Color(0,0,0,0));
        txthorasp3.setBackground(new Color(0,0,0,0));
        txthorasp4.setBackground(new Color(0,0,0,0));
        
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
        datecfecha = new com.toedter.calendar.JDateChooser();
        textfieldresidencia = new javax.swing.JTextField();
        textfieldcorreo = new javax.swing.JTextField();
        textfieldperfil = new javax.swing.JTextField();
        cmbtalla = new javax.swing.JComboBox<>();
        textfieldtelefono = new javax.swing.JTextField();
        textfielddpi = new javax.swing.JTextField();
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
        btnsiguientedlab = new javax.swing.JButton();
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
        btnagregarasociado = new javax.swing.JButton();
        cmbnivelestudiovoluntario = new javax.swing.JComboBox<>();
        textfieldlugardeestudio2 = new javax.swing.JTextField();
        textfieldocupacion2 = new javax.swing.JTextField();
        textfieldlugartrabajo2 = new javax.swing.JTextField();
        lbdlabo = new javax.swing.JLabel();
        jpvoluntariado = new javax.swing.JPanel();
        cmbproyecto1 = new javax.swing.JComboBox<>();
        cmbproyecto2 = new javax.swing.JComboBox<>();
        cmbproyecto3 = new javax.swing.JComboBox<>();
        cmbproyecto4 = new javax.swing.JComboBox<>();
        cmbpuestop1 = new javax.swing.JComboBox<>();
        cmbpuestop2 = new javax.swing.JComboBox<>();
        cmbpuestop3 = new javax.swing.JComboBox<>();
        cmbpuestop4 = new javax.swing.JComboBox<>();
        txthorasp1 = new javax.swing.JTextField();
        txthorasp2 = new javax.swing.JTextField();
        txthorasp3 = new javax.swing.JTextField();
        txthorasp4 = new javax.swing.JTextField();
        btnatrasdlab = new javax.swing.JButton();
        btnsiguientebeca = new javax.swing.JButton();
        btnaddp = new javax.swing.JButton();
        lbvoluntariado = new javax.swing.JLabel();
        jpbeca = new javax.swing.JPanel();
        lbbeca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1565, 880));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1255, 705));

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
        slider.setMinimumSize(new java.awt.Dimension(1275, 725));
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
        textfieldnombres.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldnombres.setForeground(new java.awt.Color(29, 78, 111));
        textfieldnombres.setBorder(null);
        textfieldnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldnombresKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldnombres);
        textfieldnombres.setBounds(170, 170, 430, 30);

        textfieldedad.setBackground(new java.awt.Color(178, 248, 248));
        textfieldedad.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldedad.setForeground(new java.awt.Color(25, 92, 134));
        textfieldedad.setBorder(null);
        textfieldedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldedadKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldedad);
        textfieldedad.setBounds(120, 300, 90, 30);

        textfieldapellidos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldapellidos.setForeground(new java.awt.Color(25, 92, 134));
        textfieldapellidos.setBorder(null);
        textfieldapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldapellidosKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldapellidos);
        textfieldapellidos.setBounds(170, 230, 420, 30);

        cmbgenero.setBackground(new java.awt.Color(178, 248, 248));
        cmbgenero.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbgenero.setForeground(new java.awt.Color(25, 92, 134));
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbgenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdatosp.add(cmbgenero);
        cmbgenero.setBounds(380, 260, 190, 29);

        datecfecha.setForeground(new java.awt.Color(25, 92, 134));
        datecfecha.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpdatosp.add(datecfecha);
        datecfecha.setBounds(330, 360, 270, 40);

        textfieldresidencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldresidencia.setForeground(new java.awt.Color(25, 92, 134));
        textfieldresidencia.setBorder(null);
        jpdatosp.add(textfieldresidencia);
        textfieldresidencia.setBounds(210, 520, 360, 30);

        textfieldcorreo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldcorreo.setForeground(new java.awt.Color(25, 92, 134));
        textfieldcorreo.setBorder(null);
        jpdatosp.add(textfieldcorreo);
        textfieldcorreo.setBounds(200, 590, 370, 30);

        textfieldperfil.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldperfil.setForeground(new java.awt.Color(25, 92, 134));
        textfieldperfil.setBorder(null);
        jpdatosp.add(textfieldperfil);
        textfieldperfil.setBounds(950, 180, 250, 30);

        cmbtalla.setBackground(new java.awt.Color(178, 248, 248));
        cmbtalla.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbtalla.setForeground(new java.awt.Color(25, 92, 134));
        cmbtalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL" }));
        cmbtalla.setBorder(null);
        jpdatosp.add(cmbtalla);
        cmbtalla.setBounds(870, 250, 60, 27);

        textfieldtelefono.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefono.setForeground(new java.awt.Color(25, 92, 134));
        textfieldtelefono.setBorder(null);
        jpdatosp.add(textfieldtelefono);
        textfieldtelefono.setBounds(880, 320, 250, 30);

        textfielddpi.setForeground(new java.awt.Color(25, 92, 134));
        textfielddpi.setBorder(null);
        jpdatosp.add(textfielddpi);
        textfielddpi.setBounds(180, 440, 390, 30);

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
        btnsiguientedenc.setBounds(1100, 470, 120, 90);

        btnatrasbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasbeca.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasbeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasbecaActionPerformed(evt);
            }
        });
        jpinfomed.add(btnatrasbeca);
        btnatrasbeca.setBounds(640, 460, 120, 110);

        textfieldhospital.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldhospital.setBorder(null);
        jpinfomed.add(textfieldhospital);
        textfieldhospital.setBounds(50, 250, 530, 23);

        textfieldpadecimiento1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldpadecimiento1.setBorder(null);
        jpinfomed.add(textfieldpadecimiento1);
        textfieldpadecimiento1.setBounds(50, 413, 530, 30);

        textfieldpadecimiento2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldpadecimiento2.setBorder(null);
        jpinfomed.add(textfieldpadecimiento2);
        textfieldpadecimiento2.setBounds(50, 460, 530, 29);

        textfieldpadecimiento3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldpadecimiento3.setBorder(null);
        jpinfomed.add(textfieldpadecimiento3);
        textfieldpadecimiento3.setBounds(50, 513, 530, 30);

        textfieldpadecimiento4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldpadecimiento4.setBorder(null);
        jpinfomed.add(textfieldpadecimiento4);
        textfieldpadecimiento4.setBounds(50, 560, 530, 30);

        textfieldalergia1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldalergia1.setBorder(null);
        jpinfomed.add(textfieldalergia1);
        textfieldalergia1.setBounds(820, 183, 390, 30);

        textfieldalergia2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldalergia2.setBorder(null);
        jpinfomed.add(textfieldalergia2);
        textfieldalergia2.setBounds(650, 232, 560, 30);

        textfieldalergia3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldalergia3.setBorder(null);
        jpinfomed.add(textfieldalergia3);
        textfieldalergia3.setBounds(650, 273, 560, 30);

        textfieldalergia4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldalergia4.setBorder(null);
        jpinfomed.add(textfieldalergia4);
        textfieldalergia4.setBounds(650, 320, 560, 30);

        textfieldalergia5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldalergia5.setBorder(null);
        jpinfomed.add(textfieldalergia5);
        textfieldalergia5.setBounds(650, 360, 470, 30);

        cmbtipodesangre.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbtipodesangre.setForeground(new java.awt.Color(255, 255, 255));
        cmbtipodesangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbtipodesangre.setBorder(null);
        jpinfomed.add(cmbtipodesangre);
        cmbtipodesangre.setBounds(790, 530, 270, 30);

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
        textfieldnombreencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldnombreencargado.setBorder(null);
        jpdenca.add(textfieldnombreencargado);
        textfieldnombreencargado.setBounds(160, 170, 440, 30);

        textfieldapellidoencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldapellidoencargado.setBorder(null);
        jpdenca.add(textfieldapellidoencargado);
        textfieldapellidoencargado.setBounds(170, 230, 430, 40);

        textfieldtelefonoencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefonoencargado.setBorder(null);
        jpdenca.add(textfieldtelefonoencargado);
        textfieldtelefonoencargado.setBounds(270, 350, 330, 40);

        cmbnivelestudioencargado.setBackground(new java.awt.Color(178, 248, 248));
        cmbnivelestudioencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbnivelestudioencargado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Diversificado", "Universitario", "Posgrado", "Otro" }));
        cmbnivelestudioencargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdenca.add(cmbnivelestudioencargado);
        cmbnivelestudioencargado.setBounds(254, 292, 340, 40);

        textfielddpiencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfielddpiencargado.setBorder(null);
        jpdenca.add(textfielddpiencargado);
        textfielddpiencargado.setBounds(160, 440, 420, 40);

        textfieldresidenciaencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldresidenciaencargado.setBorder(null);
        jpdenca.add(textfieldresidenciaencargado);
        textfieldresidenciaencargado.setBounds(200, 520, 380, 40);

        textfieldcorreoencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldcorreoencargado.setBorder(null);
        jpdenca.add(textfieldcorreoencargado);
        textfieldcorreoencargado.setBounds(190, 580, 390, 40);

        textfieldocupacionencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldocupacionencargado.setBorder(null);
        jpdenca.add(textfieldocupacionencargado);
        textfieldocupacionencargado.setBounds(660, 220, 550, 40);

        textfieldlugarencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldlugarencargado.setBorder(null);
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

        btnsiguientedlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguientedlab.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguientedlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientedlabActionPerformed(evt);
            }
        });
        jpconteme.add(btnsiguientedlab);
        btnsiguientedlab.setBounds(1080, 460, 120, 90);

        btnatrasdenc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasdenc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasdenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasdencActionPerformed(evt);
            }
        });
        jpconteme.add(btnatrasdenc);
        btnatrasdenc.setBounds(670, 440, 120, 110);

        textfieldnombreemergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldnombreemergencia);
        textfieldnombreemergencia.setBounds(170, 160, 430, 40);

        textfieldapellidoemergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldapellidoemergencia);
        textfieldapellidoemergencia.setBounds(170, 230, 430, 40);

        textfieldparentescoemergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldparentescoemergencia);
        textfieldparentescoemergencia.setBounds(320, 300, 280, 30);

        textfieldtelefonoemergencia1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldtelefonoemergencia1);
        textfieldtelefonoemergencia1.setBounds(180, 360, 150, 30);

        textfieldtelefonoemergencia2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldtelefonoemergencia2);
        textfieldtelefonoemergencia2.setBounds(50, 430, 530, 30);

        textfieldtelefonoemergencia3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldtelefonoemergencia3);
        textfieldtelefonoemergencia3.setBounds(50, 480, 530, 30);

        textfieldtelefonoemergencia4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldtelefonoemergencia4);
        textfieldtelefonoemergencia4.setBounds(50, 530, 530, 30);

        textfieldtelefonoemergencia5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpconteme.add(textfieldtelefonoemergencia5);
        textfieldtelefonoemergencia5.setBounds(50, 570, 530, 30);

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
        textfieldlugardeestudio.setText("Lugar de estudio 1");
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
        textfieldocupacion.setText("Ocupación/trabajo 1");
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
        textfieldlugartrabajo.setText("Lugar de trabajo 1");
        textfieldlugartrabajo.setBorder(null);
        textfieldlugartrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldlugartrabajoMouseClicked(evt);
            }
        });
        jpdlabo.add(textfieldlugartrabajo);
        textfieldlugartrabajo.setBounds(660, 250, 530, 30);

        btnagregarasociado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Checkmark_30px.png"))); // NOI18N
        btnagregarasociado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Checkmark_50px.png"))); // NOI18N
        btnagregarasociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarasociadoActionPerformed(evt);
            }
        });
        jpdlabo.add(btnagregarasociado);
        btnagregarasociado.setBounds(880, 450, 90, 80);

        cmbnivelestudiovoluntario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpdlabo.add(cmbnivelestudiovoluntario);
        cmbnivelestudiovoluntario.setBounds(280, 180, 330, 30);

        textfieldlugardeestudio2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldlugardeestudio2.setForeground(new java.awt.Color(25, 92, 134));
        textfieldlugardeestudio2.setText("Lugar de estudio 2");
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
        textfieldocupacion2.setText("Ocupación/trabajo 2");
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
        textfieldlugartrabajo2.setText("Lugar de trabajo 2");
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

        cmbproyecto1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbproyecto1.setForeground(new java.awt.Color(25, 92, 134));
        cmbproyecto1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvoluntariado.add(cmbproyecto1);
        cmbproyecto1.setBounds(100, 230, 480, 30);

        cmbproyecto2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbproyecto2.setForeground(new java.awt.Color(25, 92, 134));
        cmbproyecto2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvoluntariado.add(cmbproyecto2);
        cmbproyecto2.setBounds(100, 280, 480, 30);

        cmbproyecto3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbproyecto3.setForeground(new java.awt.Color(25, 92, 134));
        cmbproyecto3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvoluntariado.add(cmbproyecto3);
        cmbproyecto3.setBounds(100, 320, 480, 30);

        cmbproyecto4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbproyecto4.setForeground(new java.awt.Color(25, 92, 134));
        cmbproyecto4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbproyecto4.setVerifyInputWhenFocusTarget(false);
        jpvoluntariado.add(cmbproyecto4);
        cmbproyecto4.setBounds(100, 367, 480, 30);

        cmbpuestop1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbpuestop1.setForeground(new java.awt.Color(25, 92, 134));
        cmbpuestop1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbpuestop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpuestop1ActionPerformed(evt);
            }
        });
        jpvoluntariado.add(cmbpuestop1);
        cmbpuestop1.setBounds(710, 230, 470, 30);

        cmbpuestop2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbpuestop2.setForeground(new java.awt.Color(25, 92, 134));
        cmbpuestop2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvoluntariado.add(cmbpuestop2);
        cmbpuestop2.setBounds(710, 280, 470, 30);

        cmbpuestop3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbpuestop3.setForeground(new java.awt.Color(25, 92, 134));
        cmbpuestop3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvoluntariado.add(cmbpuestop3);
        cmbpuestop3.setBounds(710, 320, 470, 30);

        cmbpuestop4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbpuestop4.setForeground(new java.awt.Color(25, 92, 134));
        cmbpuestop4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvoluntariado.add(cmbpuestop4);
        cmbpuestop4.setBounds(710, 360, 470, 40);

        txthorasp1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txthorasp1.setForeground(new java.awt.Color(25, 92, 134));
        jpvoluntariado.add(txthorasp1);
        txthorasp1.setBounds(120, 533, 170, 30);

        txthorasp2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txthorasp2.setForeground(new java.awt.Color(25, 92, 134));
        jpvoluntariado.add(txthorasp2);
        txthorasp2.setBounds(400, 533, 170, 30);

        txthorasp3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txthorasp3.setForeground(new java.awt.Color(25, 92, 134));
        jpvoluntariado.add(txthorasp3);
        txthorasp3.setBounds(120, 583, 170, 30);

        txthorasp4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txthorasp4.setForeground(new java.awt.Color(25, 92, 134));
        jpvoluntariado.add(txthorasp4);
        txthorasp4.setBounds(400, 583, 170, 30);

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
        jpvoluntariado.add(btnsiguientebeca);
        btnsiguientebeca.setBounds(1070, 450, 120, 100);
        jpvoluntariado.add(btnaddp);
        btnaddp.setBounds(860, 450, 130, 70);

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

        lbbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/beca2.jpg"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datosAsociado() {
        String nombre = textfieldnombres.getText();
        String apellido = textfieldapellidos.getText();
        String Dpi = textfielddpi.getText();
        String genero = (String) cmbgenero.getSelectedItem();
        String fecha = getFecha(datecfecha);
        String talla = (String) cmbtalla.getSelectedItem();
        String PerfilFB = textfieldperfil.getText();
        String telefono = textfieldtelefono.getText();
        String email = textfieldcorreo.getText();
        String residencia = textfieldresidencia.getText();
        String nivEst = (String) cmbnivelestudiovoluntario.getSelectedItem();
        String tipoSangre = (String) cmbtipodesangre.getSelectedItem();
        boolean genero1 = false;
        if (genero.equals("Masculino")) {
            genero1 = true;
        }
        if (asociado.insertar(nombre, apellido, genero1, fecha, email, talla, residencia, true, PerfilFB, tipoSangre, nivEst, Dpi)) {
            JOptionPane.showMessageDialog(null, "Asociado Ingresado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar el asociado");
        }
    }
    private void btnagregarasociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarasociadoActionPerformed
        /**
         * Proceso para agregar al asociado, todos los datos que están escritos
         * en este frame
         */
        datosAsociado();
    }//GEN-LAST:event_btnagregarasociadoActionPerformed
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

    private void btnsiguientedlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientedlabActionPerformed
        slider.setPanelSlider(jpdlabo, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientedlabActionPerformed

    private void btnatrasinfmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasinfmeActionPerformed
        slider.setPanelSlider(jpinfomed, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasinfmeActionPerformed

    private void btnsiguientecontemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientecontemeActionPerformed
        slider.setPanelSlider(jpconteme, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientecontemeActionPerformed

    private void btnatrasbecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasbecaActionPerformed
        slider.setPanelSlider(jpdatosp, RSPanelsSlider.DIRECT.RIGHT);
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

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return formato.format(jd.getDate());
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
            JOptionPane.showMessageDialog(null, "El campo nombre esta vacio, favor de ingresar los nombres");
            textfieldnombres.requestFocus();
            return false;
        } else if (textfieldapellidos.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "El campo apellido esta vacio, favor de ingresar los apellidos");
            textfieldapellidos.requestFocus();
            return false;
        } else if (getFecha(datecfecha) == null) {
            JOptionPane.showMessageDialog(null, "El campo fecha esta vacio, favor de ingresar la fecha de nacimiento");
            datecfecha.requestFocus();
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

    private void cmbpuestop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpuestop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpuestop1ActionPerformed

    private void btnatrasdlabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasdlabMouseClicked
        slider.setPanelSlider(jpdlabo, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasdlabMouseClicked

    private void btnsiguientebecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguientebecaMouseClicked
        slider.setPanelSlider(jpbeca, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientebecaMouseClicked

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
    private javax.swing.JButton btnagregarasociado;
    private javax.swing.JButton btnatrasbeca;
    private javax.swing.JButton btnatrasdenc;
    private javax.swing.JButton btnatrasdlab;
    private javax.swing.JButton btnatrasdp;
    private javax.swing.JButton btnatrasinfme;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnotrotelefonoencargado;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsiguientebeca;
    private javax.swing.JButton btnsiguienteconteme;
    private javax.swing.JButton btnsiguientedenc;
    private javax.swing.JButton btnsiguientedl;
    private javax.swing.JButton btnsiguientedlab;
    private javax.swing.JButton btnsiguientevolu;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JComboBox<String> cmbnivelestudioencargado;
    private javax.swing.JComboBox<String> cmbnivelestudiovoluntario;
    private javax.swing.JComboBox<String> cmbproyecto1;
    private javax.swing.JComboBox<String> cmbproyecto2;
    private javax.swing.JComboBox<String> cmbproyecto3;
    private javax.swing.JComboBox<String> cmbproyecto4;
    private javax.swing.JComboBox<String> cmbpuestop1;
    private javax.swing.JComboBox<String> cmbpuestop2;
    private javax.swing.JComboBox<String> cmbpuestop3;
    private javax.swing.JComboBox<String> cmbpuestop4;
    private javax.swing.JComboBox<String> cmbtalla;
    private javax.swing.JComboBox<String> cmbtipodesangre;
    private com.toedter.calendar.JDateChooser datecfecha;
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
    private rojerusan.RSPanelsSlider slider;
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
    private javax.swing.JTextField txthorasp1;
    private javax.swing.JTextField txthorasp2;
    private javax.swing.JTextField txthorasp3;
    private javax.swing.JTextField txthorasp4;
    // End of variables declaration//GEN-END:variables
}
