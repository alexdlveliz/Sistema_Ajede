/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Asociado;
import Clases.antecedentesMedicos;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import rojerusan.RSPanelsSlider;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import java.awt.Color;

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
    

    /**
     * Creates new form agregarjf
     */
    private char c;
    private Asociado asociado;
    private antecedentesMedicos antecedentes;

    public agregarjf() {
        asociado = new Asociado();
        antecedentes = new antecedentesMedicos();
        initComponents();
        transparencia();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        cmbnivelestudioencargado.setModel(asociado.NivEst());
        cmbnivelestudioasociado.setModel(asociado.NivEst());

        if ((tamanio.width == 1920) && (tamanio.height == 1080)) //1920x1080
        {
            this.setSize(1568, 880);
            this.setLocationRelativeTo(null);
            jPanel1.setSize(1568, 880);
            rSPanelsSlider1.setSize(1568, 880);
            jpdatosp.setSize(1568, 880);
            lbdp.setSize(1568, 880);
            lbdlabo.setSize(1568,880);
            jpdlabo.setSize(1565,880);
            jpvoluntariado.setSize(1565,880);
            lbvoluntariado.setSize(1565,880);
            jpinfomed.setSize(1568,880);
            lbinfomed.setSize(1565, 880);
            jpdenca.setSize(1565,880);
            lbdatosenca.setSize(1565,880);
            jpconteme.setSize(1565,880);
            lbconteme.setSize(1565,880);
            lbdp.setIcon(dp1);
            lbdlabo.setIcon(dlabo1);
            lbvoluntariado.setIcon(voluntariado1);
            lbbeca.setIcon(beca1);
            lbinfomed.setIcon(infomed1);
            lbdatosenca.setIcon(datosenc1);
            lbconteme.setIcon(contacem1);
            
        }
        else if((tamanio.width == 1366) && (tamanio.height == 768)) //1366x768, 1708x960
        {
            this.setLocationRelativeTo(null);
            this.setSize(1250, 700);
            lbdp.setIcon(dp2);
            lbdlabo.setIcon(dlabo2);
            lbvoluntariado.setIcon(voluntariado2);
            lbbeca.setIcon(beca2);
            lbinfomed.setIcon(infomed2);
            lbdatosenca.setIcon(datosenc2);
            lbconteme.setIcon(contacem2);
            btnsiguienteinfomed.setLocation(1070, 450);
            btnaddtel.setLocation(870, 435);
            btnhomedp1.setLocation(1027, 0);
            btnsalirdp1.setLocation(1180, 0);
        }
//        this.setLocationRelativeTo(null);
//        this.setSize(1255, 705);
        
    }

    public void transparencia() {
        btnmenu.setOpaque(false);
        btnmenu.setBorderPainted(false);
        btnmenu.setContentAreaFilled(false);
        btnsiguienteinfomed.setOpaque(false);
        btnsiguienteinfomed.setBorderPainted(false);
        btnsiguienteinfomed.setContentAreaFilled(false);
        btnaddtel.setOpaque(false);
        btnaddtel.setBorderPainted(false);
        btnaddtel.setContentAreaFilled(false);
        btnsalirinfme.setOpaque(false);
        btnsalirinfme.setBorderPainted(false);
        btnsalirinfme.setContentAreaFilled(false);
        btnminimizarifme.setOpaque(false);
        btnminimizarifme.setBorderPainted(false);
        btnminimizarifme.setContentAreaFilled(false);
        btnhomeinfme.setOpaque(false);
        btnhomeinfme.setBorderPainted(false);
        btnhomeinfme.setContentAreaFilled(false);
        btnatrasdp.setOpaque(false);
        btnatrasdp.setBorderPainted(false);
        btnatrasdp.setContentAreaFilled(false);
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
        btnatrascontem.setOpaque(false);
        btnatrascontem.setBorderPainted(false);
        btnatrascontem.setContentAreaFilled(false);
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
        txtHospital.setBackground(new Color(0,0,0,0));
        txtPadecimiento1.setBackground(new Color(0,0,0,0));
        txtPadecimiento2.setBackground(new Color(0,0,0,0));
        txtPadecimiento3.setBackground(new Color(0,0,0,0));
        txtPadecimiento4.setBackground(new Color(0,0,0,0));
        txtAlergia1.setBackground(new Color(0,0,0,0));
        txtAlergia2.setBackground(new Color(0,0,0,0));
        txtAlergia3.setBackground(new Color(0,0,0,0));
        txtAlergia4.setBackground(new Color(0,0,0,0));
        txtAlergia5.setBackground(new Color(0,0,0,0));
        cmbtipodesangre.setBackground(new Color(0,0,0,0));
        txtNombreEncargado.setBackground(new Color(0,0,0,0));
        txtApellidoEncargado.setBackground(new Color(0,0,0,0));
        txtTelefonoEncargado.setBackground(new Color(0,0,0,0));
        cmbnivelestudioencargado.setBackground(new Color(0,0,0,0));
        txtDpiCuiEncargado.setBackground(new Color(0,0,0,0));
        txtResidenciaEncargado.setBackground(new Color(0,0,0,0));
        txtEmailEncargado.setBackground(new Color(0,0,0,0));
        txtTrabajoOcupacionEncargado.setBackground(new Color(0,0,0,0));
        txtLugarTrabajoEncargado.setBackground(new Color(0,0,0,0));
        txtNombreEmergencia.setBackground(new Color(0,0,0,0));
        txtApellidoEmergencia.setBackground(new Color(0,0,0,0));
        txtParentescoEmergencia.setBackground(new Color(0,0,0,0));
        txtTelefonoEmergencia.setBackground(new Color(0,0,0,0));
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
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jpdatosp = new javax.swing.JPanel();
        btnsiguienteinfomed = new javax.swing.JButton();
        btnaddtel = new javax.swing.JButton();
        btnhomedp1 = new javax.swing.JButton();
        btnsalirdp1 = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        textfieldnombres = new javax.swing.JTextField();
        textfieldedad = new javax.swing.JTextField();
        textfieldapellidos = new javax.swing.JTextField();
        cmbgenero = new javax.swing.JComboBox<>();
        datecfecha = new com.toedter.calendar.JDateChooser();
        textfielddpi = new javax.swing.JTextField();
        textfieldresidencia = new javax.swing.JTextField();
        textfieldcorreo = new javax.swing.JTextField();
        textfieldperfil = new javax.swing.JTextField();
        cmbtalla = new javax.swing.JComboBox<>();
        textfieldtelefono = new javax.swing.JTextField();
        lbdp = new javax.swing.JLabel();
        jpinfomed = new javax.swing.JPanel();
        btnhomeinfme = new javax.swing.JButton();
        btnminimizarifme = new javax.swing.JButton();
        btnsalirinfme = new javax.swing.JButton();
        btnsiguientedenc = new javax.swing.JButton();
        btnatrasdp = new javax.swing.JButton();
        txtHospital = new javax.swing.JTextField();
        txtPadecimiento1 = new javax.swing.JTextField();
        txtPadecimiento2 = new javax.swing.JTextField();
        txtPadecimiento3 = new javax.swing.JTextField();
        txtPadecimiento4 = new javax.swing.JTextField();
        txtAlergia1 = new javax.swing.JTextField();
        txtAlergia2 = new javax.swing.JTextField();
        txtAlergia3 = new javax.swing.JTextField();
        txtAlergia4 = new javax.swing.JTextField();
        txtAlergia5 = new javax.swing.JTextField();
        cmbtipodesangre = new javax.swing.JComboBox<>();
        lbinfomed = new javax.swing.JLabel();
        jpdenca = new javax.swing.JPanel();
        btnsiguienteconteme = new javax.swing.JButton();
        btnatrasinfme = new javax.swing.JButton();
        txtNombreEncargado = new javax.swing.JTextField();
        txtApellidoEncargado = new javax.swing.JTextField();
        txtTelefonoEncargado = new javax.swing.JTextField();
        cmbnivelestudioencargado = new javax.swing.JComboBox<>();
        txtDpiCuiEncargado = new javax.swing.JTextField();
        txtResidenciaEncargado = new javax.swing.JTextField();
        txtEmailEncargado = new javax.swing.JTextField();
        txtTrabajoOcupacionEncargado = new javax.swing.JTextField();
        txtLugarTrabajoEncargado = new javax.swing.JTextField();
        btnotrotelefonoencargado = new javax.swing.JButton();
        lbdatosenca = new javax.swing.JLabel();
        jpconteme = new javax.swing.JPanel();
        btnsiguientedlab = new javax.swing.JButton();
        btnatrasdenc = new javax.swing.JButton();
        txtNombreEmergencia = new javax.swing.JTextField();
        txtApellidoEmergencia = new javax.swing.JTextField();
        txtParentescoEmergencia = new javax.swing.JTextField();
        txtTelefonoEmergencia = new javax.swing.JTextField();
        textfieldtelefonoemergencia2 = new javax.swing.JTextField();
        textfieldtelefonoemergencia3 = new javax.swing.JTextField();
        textfieldtelefonoemergencia4 = new javax.swing.JTextField();
        textfieldtelefonoemergencia5 = new javax.swing.JTextField();
        lbconteme = new javax.swing.JLabel();
        jpdlabo = new javax.swing.JPanel();
        btnsiguientevolu = new javax.swing.JButton();
        btnatrascontem = new javax.swing.JButton();
        cmbnivelestudioasociado = new javax.swing.JComboBox<>();
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
        lbvoluntariado = new javax.swing.JLabel();
        jpbeca = new javax.swing.JPanel();
        lbbeca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(null);

        rSPanelsSlider1.setMinimumSize(new java.awt.Dimension(1275, 725));
        rSPanelsSlider1.setPreferredSize(new java.awt.Dimension(1250, 700));

        jpdatosp.setBackground(new java.awt.Color(18, 44, 62));
        jpdatosp.setName("datosp"); // NOI18N
        jpdatosp.setLayout(null);

        btnsiguienteinfomed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguienteinfomed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsiguienteinfomed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguienteinfomed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteinfomedActionPerformed(evt);
            }
        });
        jpdatosp.add(btnsiguienteinfomed);
        btnsiguienteinfomed.setBounds(1070, 450, 120, 90);

        btnaddtel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_35px_1.png"))); // NOI18N
        btnaddtel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_70px_1.png"))); // NOI18N
        jpdatosp.add(btnaddtel);
        btnaddtel.setBounds(870, 450, 110, 100);

        btnhomedp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_30px.png"))); // NOI18N
        btnhomedp1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px_1.png"))); // NOI18N
        btnhomedp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomedpActionPerformed(evt);
            }
        });
        jpdatosp.add(btnhomedp1);
        btnhomedp1.setBounds(1019, 0, 80, 70);

        btnsalirdp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_30px.png"))); // NOI18N
        btnsalirdp1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_70px.png"))); // NOI18N
        btnsalirdp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirdpActionPerformed(evt);
            }
        });
        jpdatosp.add(btnsalirdp1);
        btnsalirdp1.setBounds(1180, 0, 70, 70);

        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Home_70px.png"))); // NOI18N
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        jpdatosp.add(btnmenu);
        btnmenu.setBounds(653, 450, 120, 90);

        textfieldnombres.setBackground(new java.awt.Color(178, 248, 248));
        textfieldnombres.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
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
        textfieldedad.setBorder(null);
        textfieldedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldedadKeyTyped(evt);
            }
        });
        jpdatosp.add(textfieldedad);
        textfieldedad.setBounds(120, 300, 90, 30);

        textfieldapellidos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
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
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbgenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdatosp.add(cmbgenero);
        cmbgenero.setBounds(380, 300, 190, 29);

        datecfecha.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jpdatosp.add(datecfecha);
        datecfecha.setBounds(330, 360, 270, 40);

        textfielddpi.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfielddpi.setBorder(null);
        textfielddpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfielddpiKeyTyped(evt);
            }
        });
        jpdatosp.add(textfielddpi);
        textfielddpi.setBounds(170, 450, 400, 30);

        textfieldresidencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldresidencia.setBorder(null);
        jpdatosp.add(textfieldresidencia);
        textfieldresidencia.setBounds(210, 520, 360, 30);

        textfieldcorreo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldcorreo.setBorder(null);
        jpdatosp.add(textfieldcorreo);
        textfieldcorreo.setBounds(200, 590, 370, 30);

        textfieldperfil.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldperfil.setBorder(null);
        jpdatosp.add(textfieldperfil);
        textfieldperfil.setBounds(950, 180, 250, 30);

        cmbtalla.setBackground(new java.awt.Color(178, 248, 248));
        cmbtalla.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbtalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL" }));
        cmbtalla.setBorder(null);
        jpdatosp.add(cmbtalla);
        cmbtalla.setBounds(870, 250, 60, 27);

        textfieldtelefono.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefono.setBorder(null);
        jpdatosp.add(textfieldtelefono);
        textfieldtelefono.setBounds(880, 320, 250, 30);

        lbdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/datospersonales2.jpg"))); // NOI18N
        jpdatosp.add(lbdp);
        lbdp.setBounds(0, 0, 1270, 710);

        rSPanelsSlider1.add(jpdatosp, "card2");

        jpinfomed.setBackground(new java.awt.Color(18, 44, 62));
        jpinfomed.setName("jpinfomed"); // NOI18N
        jpinfomed.setLayout(null);

        btnhomeinfme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_30px.png"))); // NOI18N
        btnhomeinfme.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px_1.png"))); // NOI18N
        btnhomeinfme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeinfmeActionPerformed(evt);
            }
        });
        jpinfomed.add(btnhomeinfme);
        btnhomeinfme.setBounds(1019, 0, 80, 70);

        btnminimizarifme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_30px_1.png"))); // NOI18N
        btnminimizarifme.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_70px.png"))); // NOI18N
        btnminimizarifme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimizarifmeActionPerformed(evt);
            }
        });
        jpinfomed.add(btnminimizarifme);
        btnminimizarifme.setBounds(1100, 0, 80, 70);

        btnsalirinfme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_30px.png"))); // NOI18N
        btnsalirinfme.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_70px.png"))); // NOI18N
        btnsalirinfme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirinfmeActionPerformed(evt);
            }
        });
        jpinfomed.add(btnsalirinfme);
        btnsalirinfme.setBounds(1180, 0, 70, 70);

        btnsiguientedenc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_70px.png"))); // NOI18N
        btnsiguientedenc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Redo_100px.png"))); // NOI18N
        btnsiguientedenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguientedencActionPerformed(evt);
            }
        });
        jpinfomed.add(btnsiguientedenc);
        btnsiguientedenc.setBounds(1100, 470, 120, 90);

        btnatrasdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrasdp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrasdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasdpActionPerformed(evt);
            }
        });
        jpinfomed.add(btnatrasdp);
        btnatrasdp.setBounds(640, 460, 120, 110);

        txtHospital.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtHospital.setBorder(null);
        jpinfomed.add(txtHospital);
        txtHospital.setBounds(50, 250, 530, 23);

        txtPadecimiento1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPadecimiento1.setBorder(null);
        jpinfomed.add(txtPadecimiento1);
        txtPadecimiento1.setBounds(50, 413, 530, 30);

        txtPadecimiento2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPadecimiento2.setBorder(null);
        jpinfomed.add(txtPadecimiento2);
        txtPadecimiento2.setBounds(50, 460, 530, 29);

        txtPadecimiento3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPadecimiento3.setBorder(null);
        jpinfomed.add(txtPadecimiento3);
        txtPadecimiento3.setBounds(50, 513, 530, 30);

        txtPadecimiento4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPadecimiento4.setBorder(null);
        jpinfomed.add(txtPadecimiento4);
        txtPadecimiento4.setBounds(50, 560, 530, 30);

        txtAlergia1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtAlergia1.setBorder(null);
        jpinfomed.add(txtAlergia1);
        txtAlergia1.setBounds(820, 183, 390, 30);

        txtAlergia2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtAlergia2.setBorder(null);
        jpinfomed.add(txtAlergia2);
        txtAlergia2.setBounds(650, 232, 560, 30);

        txtAlergia3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtAlergia3.setBorder(null);
        jpinfomed.add(txtAlergia3);
        txtAlergia3.setBounds(650, 273, 560, 30);

        txtAlergia4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtAlergia4.setBorder(null);
        jpinfomed.add(txtAlergia4);
        txtAlergia4.setBounds(650, 320, 560, 30);

        txtAlergia5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtAlergia5.setBorder(null);
        jpinfomed.add(txtAlergia5);
        txtAlergia5.setBounds(650, 360, 470, 30);

        cmbtipodesangre.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbtipodesangre.setForeground(new java.awt.Color(255, 255, 255));
        cmbtipodesangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbtipodesangre.setBorder(null);
        jpinfomed.add(cmbtipodesangre);
        cmbtipodesangre.setBounds(790, 530, 270, 30);

        lbinfomed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/infomed2.jpg"))); // NOI18N
        jpinfomed.add(lbinfomed);
        lbinfomed.setBounds(0, -3, 1260, 710);

        rSPanelsSlider1.add(jpinfomed, "card3");

        jpdenca.setBackground(new java.awt.Color(18, 44, 62));
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

        txtNombreEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtNombreEncargado.setBorder(null);
        jpdenca.add(txtNombreEncargado);
        txtNombreEncargado.setBounds(160, 170, 440, 30);

        txtApellidoEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtApellidoEncargado.setBorder(null);
        jpdenca.add(txtApellidoEncargado);
        txtApellidoEncargado.setBounds(170, 230, 430, 40);

        txtTelefonoEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtTelefonoEncargado.setBorder(null);
        jpdenca.add(txtTelefonoEncargado);
        txtTelefonoEncargado.setBounds(270, 350, 330, 40);

        cmbnivelestudioencargado.setBackground(new java.awt.Color(178, 248, 248));
        cmbnivelestudioencargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbnivelestudioencargado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Diversificado", "Universitario", "Posgrado", "Otro" }));
        cmbnivelestudioencargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdenca.add(cmbnivelestudioencargado);
        cmbnivelestudioencargado.setBounds(254, 292, 340, 40);

        txtDpiCuiEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtDpiCuiEncargado.setBorder(null);
        jpdenca.add(txtDpiCuiEncargado);
        txtDpiCuiEncargado.setBounds(160, 440, 420, 40);

        txtResidenciaEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtResidenciaEncargado.setBorder(null);
        jpdenca.add(txtResidenciaEncargado);
        txtResidenciaEncargado.setBounds(200, 520, 380, 40);

        txtEmailEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtEmailEncargado.setBorder(null);
        jpdenca.add(txtEmailEncargado);
        txtEmailEncargado.setBounds(190, 580, 390, 40);

        txtTrabajoOcupacionEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtTrabajoOcupacionEncargado.setBorder(null);
        jpdenca.add(txtTrabajoOcupacionEncargado);
        txtTrabajoOcupacionEncargado.setBounds(660, 220, 550, 40);

        txtLugarTrabajoEncargado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtLugarTrabajoEncargado.setBorder(null);
        jpdenca.add(txtLugarTrabajoEncargado);
        txtLugarTrabajoEncargado.setBounds(660, 320, 550, 40);

        btnotrotelefonoencargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_35px.png"))); // NOI18N
        btnotrotelefonoencargado.setBorder(null);
        btnotrotelefonoencargado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Add_Phone_70px.png"))); // NOI18N
        btnotrotelefonoencargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotrotelefonoencargadoActionPerformed(evt);
            }
        });
        jpdenca.add(btnotrotelefonoencargado);
        btnotrotelefonoencargado.setBounds(870, 450, 120, 80);

        lbdatosenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/datosenc2.jpg"))); // NOI18N
        jpdenca.add(lbdatosenca);
        lbdatosenca.setBounds(0, -3, 1250, 710);

        rSPanelsSlider1.add(jpdenca, "card4");

        jpconteme.setBackground(new java.awt.Color(18, 44, 62));
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

        txtNombreEmergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtNombreEmergencia.setBorder(null);
        jpconteme.add(txtNombreEmergencia);
        txtNombreEmergencia.setBounds(170, 170, 430, 40);

        txtApellidoEmergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtApellidoEmergencia.setBorder(null);
        jpconteme.add(txtApellidoEmergencia);
        txtApellidoEmergencia.setBounds(170, 230, 430, 40);

        txtParentescoEmergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtParentescoEmergencia.setBorder(null);
        jpconteme.add(txtParentescoEmergencia);
        txtParentescoEmergencia.setBounds(320, 300, 280, 30);

        txtTelefonoEmergencia.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtTelefonoEmergencia.setBorder(null);
        jpconteme.add(txtTelefonoEmergencia);
        txtTelefonoEmergencia.setBounds(180, 360, 150, 30);

        textfieldtelefonoemergencia2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefonoemergencia2.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia2);
        textfieldtelefonoemergencia2.setBounds(50, 430, 530, 30);

        textfieldtelefonoemergencia3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefonoemergencia3.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia3);
        textfieldtelefonoemergencia3.setBounds(50, 480, 530, 30);

        textfieldtelefonoemergencia4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefonoemergencia4.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia4);
        textfieldtelefonoemergencia4.setBounds(50, 530, 530, 30);

        textfieldtelefonoemergencia5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textfieldtelefonoemergencia5.setBorder(null);
        jpconteme.add(textfieldtelefonoemergencia5);
        textfieldtelefonoemergencia5.setBounds(50, 570, 530, 30);

        lbconteme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/contaceme2.jpg"))); // NOI18N
        jpconteme.add(lbconteme);
        lbconteme.setBounds(0, -3, 1250, 710);
        lbconteme.getAccessibleContext().setAccessibleDescription("");

        rSPanelsSlider1.add(jpconteme, "card5");

        jpdlabo.setBackground(new java.awt.Color(18, 44, 62));
        jpdlabo.setToolTipText("");
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
        btnsiguientevolu.setBounds(1080, 460, 120, 90);

        btnatrascontem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_70px.png"))); // NOI18N
        btnatrascontem.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sa/icons8_Undo_100px.png"))); // NOI18N
        btnatrascontem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrascontemActionPerformed(evt);
            }
        });
        jpdlabo.add(btnatrascontem);
        btnatrascontem.setBounds(670, 440, 120, 110);

        cmbnivelestudioasociado.setBackground(new java.awt.Color(178, 248, 248));
        cmbnivelestudioasociado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cmbnivelestudioasociado.setBorder(null);
        cmbnivelestudioasociado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdlabo.add(cmbnivelestudioasociado);
        cmbnivelestudioasociado.setBounds(270, 180, 340, 40);

        textfieldlugardeestudio.setBorder(null);
        jpdlabo.add(textfieldlugardeestudio);
        textfieldlugardeestudio.setBounds(70, 320, 530, 30);

        textfieldocupacion.setBorder(null);
        jpdlabo.add(textfieldocupacion);
        textfieldocupacion.setBounds(70, 520, 530, 30);
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
        cmbnivelestudiovoluntario.setBounds(280, 190, 320, 22);

        textfieldlugardeestudio2.setBorder(null);
        jpdlabo.add(textfieldlugardeestudio2);
        textfieldlugardeestudio2.setBounds(70, 372, 530, 30);

        textfieldocupacion2.setBorder(null);
        jpdlabo.add(textfieldocupacion2);
        textfieldocupacion2.setBounds(70, 570, 530, 30);
        jpdlabo.add(textfieldlugartrabajo2);
        textfieldlugartrabajo2.setBounds(660, 310, 530, 30);

        lbdlabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/datoslaborales2.jpg"))); // NOI18N
        jpdlabo.add(lbdlabo);
        lbdlabo.setBounds(0, -3, 1250, 710);

        rSPanelsSlider1.add(jpdlabo, "card6");

        lbvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/voluntariado2.jpg"))); // NOI18N

        javax.swing.GroupLayout jpvoluntariadoLayout = new javax.swing.GroupLayout(jpvoluntariado);
        jpvoluntariado.setLayout(jpvoluntariadoLayout);
        jpvoluntariadoLayout.setHorizontalGroup(
            jpvoluntariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvoluntariadoLayout.createSequentialGroup()
                .addComponent(lbvoluntariado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpvoluntariadoLayout.setVerticalGroup(
            jpvoluntariadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpvoluntariadoLayout.createSequentialGroup()
                .addComponent(lbvoluntariado)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jpvoluntariado, "card7");

        lbbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/beca2.jpg"))); // NOI18N

        javax.swing.GroupLayout jpbecaLayout = new javax.swing.GroupLayout(jpbeca);
        jpbeca.setLayout(jpbecaLayout);
        jpbecaLayout.setHorizontalGroup(
            jpbecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbecaLayout.createSequentialGroup()
                .addComponent(lbbeca)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpbecaLayout.setVerticalGroup(
            jpbecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbecaLayout.createSequentialGroup()
                .addComponent(lbbeca)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jpbeca, "card8");

        jPanel1.add(rSPanelsSlider1);
        rSPanelsSlider1.setBounds(0, 0, 1250, 725);

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

    private boolean datosAsociado() {
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
        String nivEst = (String) cmbnivelestudioasociado.getSelectedItem();
        String tipoSangre = (String) cmbtipodesangre.getSelectedItem();
        boolean genero1 = false;
        if (genero.equals("Masculino")) {
            genero1 = true;
        }
        if (asociado.insertar(nombre, apellido, genero1, fecha, email, talla, residencia, true, PerfilFB, tipoSangre, nivEst, Dpi)) {
            JOptionPane.showMessageDialog(null, "Asociado Ingresado correctamente");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar el asociado");
            return false;
        }
    }
    
    private void informacionMedica()
    {
        String Hospital = txtHospital.getText();
        String Padecimienetos = txtPadecimiento1.getText() + " " + txtPadecimiento2.getText() + " " +
                txtPadecimiento3.getText() + " " + txtPadecimiento4.getText();
        String alergias = txtAlergia1.getText() + " " + txtAlergia2.getText() + " " + txtAlergia3.getText()
                + " " + txtAlergia4.getText() + " " + txtAlergia5.getText();
        int idAsociado = antecedentes.obtenerid();

        
        if(antecedentes.insertar(Hospital, Padecimienetos, idAsociado))
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        else
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
    }
    
    private void btnagregarasociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarasociadoActionPerformed
        /**
         * Proceso para agregar al asociado, todos los datos que están escritos
         * en este frame
         */
        if(datosAsociado())
            informacionMedica();
    }//GEN-LAST:event_btnagregarasociadoActionPerformed
    private void btnatrascontemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrascontemActionPerformed
        rSPanelsSlider1.setPanelSlider(jpconteme, RSPanelsSlider.DIRECT.RIGHT);

    }//GEN-LAST:event_btnatrascontemActionPerformed

    private void btnminimizardpActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setExtendedState(ICONIFIED);
    }                                              

    private void btnhomeinfmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeinfmeActionPerformed
        JOptionPane.showMessageDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);     
        this.dispose();
        menujf menu = new menujf();
        menu.setVisible(true);
    }//GEN-LAST:event_btnhomeinfmeActionPerformed
    private void btnsiguientevoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientevoluActionPerformed

    }//GEN-LAST:event_btnsiguientevoluActionPerformed
    private void btnminimizarifmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarifmeActionPerformed
         this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarifmeActionPerformed

    private void btnatrasdencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasdencActionPerformed
        rSPanelsSlider1.setPanelSlider(jpdenca, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasdencActionPerformed
    private void btnsalirinfmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirinfmeActionPerformed
        JOptionPane.showMessageDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);     
        this.dispose();
    }//GEN-LAST:event_btnsalirinfmeActionPerformed

    private void btnsiguientedlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientedlabActionPerformed
        if(validarContactoEmergencia())
            rSPanelsSlider1.setPanelSlider(jpdlabo, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientedlabActionPerformed

    private void btnatrasinfmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasinfmeActionPerformed
        rSPanelsSlider1.setPanelSlider(jpinfomed, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasinfmeActionPerformed

    private void btnsiguientecontemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientecontemeActionPerformed
        if(validarDatosEncargado())
            rSPanelsSlider1.setPanelSlider(jpconteme, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientecontemeActionPerformed

    private void btnatrasdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasdpActionPerformed
        rSPanelsSlider1.setPanelSlider(jpdatosp, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnatrasdpActionPerformed

    private void btnsiguientedencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguientedencActionPerformed
        rSPanelsSlider1.setPanelSlider(jpdenca, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguientedencActionPerformed

    private void textfielddpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfielddpiKeyTyped
        c = evt.getKeyChar();
        if (((int) c >= 0 && (int) c <= 47 && (int) c != 45) || ((int) c >= 58 && (int) c <= 255)) {
            evt.consume();
        }
    }//GEN-LAST:event_textfielddpiKeyTyped

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
    
    //Función que valida si todos los campos del encargado fueron ingresados
    private boolean validarDatosEncargado()
    {
        if(txtNombreEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Nombres aún vacío, favor de ingresar los nombres");
            txtNombreEncargado.requestFocus();
            return false;
        } else if(txtApellidoEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo apellidos aún vacío, favor de ingresar los apellidos");
            txtApellidoEncargado.requestFocus();
            return false;
        } else if(txtTelefonoEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo teléfono aún vacío, favor de ingresar el teléfono");
            txtTelefonoEncargado.requestFocus();
            return false;
        } else if(txtDpiCuiEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo DPI/CUI aún vacío, favor de llenarlo");
            txtDpiCuiEncargado.requestFocus();
            return false;
        } else if(txtResidenciaEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "campo Residencia aún vacío, favor de llenarlo");
            txtResidenciaEncargado.requestFocus();
            return false;
        } else if(txtEmailEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Correo electrónico aún vacío, favor de llenarlo");
            txtEmailEncargado.requestFocus();
            return false;
        } else if(txtTrabajoOcupacionEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Trabajo/Ocupación aún vacío, favor de llenarlo");
            txtTrabajoOcupacionEncargado.requestFocus();
            return false;
        } else if(txtLugarTrabajoEncargado.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Lugar de Trabajo/Ocupación aún vacío, favor de llenarlo");
            txtLugarTrabajoEncargado.requestFocus();
            return false;
        }else
            return true;
    }
    
    //Función para validar si los campos del contacto de emergencia fueron llenados
    private boolean validarContactoEmergencia()
    {
        if(txtNombreEmergencia.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Nombres aún vacío, favor de llenarlo");
            txtNombreEmergencia.requestFocus();
            return false;
        } else if(txtApellidoEmergencia.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Apellidos aún vacío, favor de llenarlo");
            txtApellidoEmergencia.requestFocus();
            return false;
        } else if(txtParentescoEmergencia.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Parentesco/Relación aún vacío, favor de llenarlo");
            txtParentescoEmergencia.requestFocus();
            return false;
        } else if(txtTelefonoEmergencia.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Campo Teléfono/Celular aún vacío, favor de llenarlo");
            txtTelefonoEmergencia.requestFocus();
            return false;
        }
        else
            return true;
    }
    private void btnsiguienteinfomedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteinfomedActionPerformed
        if (validarDatosPersonales()) {
            rSPanelsSlider1.setPanelSlider(jpinfomed, RSPanelsSlider.DIRECT.LEFT);
        }
    }//GEN-LAST:event_btnsiguienteinfomedActionPerformed

    private void btnhomedpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomedpActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);
        if (respuesta == 0) {
            menujf m = new menujf();
            m.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnhomedpActionPerformed

    private void btnsalirdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirdpActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir sin guardar cambios?", "¡¡¡ATENCIÓN!!!", WARNING_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnsalirdpActionPerformed

    private void btnotrotelefonoencargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotrotelefonoencargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnotrotelefonoencargadoActionPerformed

    /**
     * @param args the command line arguments
     */
    private final SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddtel;
    private javax.swing.JButton btnagregarasociado;
    private javax.swing.JButton btnatrascontem;
    private javax.swing.JButton btnatrasdenc;
    private javax.swing.JButton btnatrasdp;
    private javax.swing.JButton btnatrasinfme;
    private javax.swing.JButton btnhomedp1;
    private javax.swing.JButton btnhomeinfme;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnminimizarifme;
    private javax.swing.JButton btnotrotelefonoencargado;
    private javax.swing.JButton btnsalirdp1;
    private javax.swing.JButton btnsalirinfme;
    private javax.swing.JButton btnsiguienteconteme;
    private javax.swing.JButton btnsiguientedenc;
    private javax.swing.JButton btnsiguientedlab;
    private javax.swing.JButton btnsiguienteinfomed;
    private javax.swing.JButton btnsiguientevolu;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JComboBox<String> cmbnivelestudioasociado;
    private javax.swing.JComboBox<String> cmbnivelestudioencargado;
    private javax.swing.JComboBox<String> cmbnivelestudiovoluntario;
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
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTextField textfieldapellidos;
    private javax.swing.JTextField textfieldcorreo;
    private javax.swing.JTextField textfielddpi;
    private javax.swing.JTextField textfieldedad;
    private javax.swing.JTextField textfieldlugardeestudio;
    private javax.swing.JTextField textfieldlugardeestudio2;
    private javax.swing.JTextField textfieldlugartrabajo;
    private javax.swing.JTextField textfieldlugartrabajo2;
    private javax.swing.JTextField textfieldnombres;
    private javax.swing.JTextField textfieldocupacion;
    private javax.swing.JTextField textfieldocupacion2;
    private javax.swing.JTextField textfieldperfil;
    private javax.swing.JTextField textfieldresidencia;
    private javax.swing.JTextField textfieldtelefono;
    private javax.swing.JTextField textfieldtelefonoemergencia2;
    private javax.swing.JTextField textfieldtelefonoemergencia3;
    private javax.swing.JTextField textfieldtelefonoemergencia4;
    private javax.swing.JTextField textfieldtelefonoemergencia5;
    private javax.swing.JTextField txtAlergia1;
    private javax.swing.JTextField txtAlergia2;
    private javax.swing.JTextField txtAlergia3;
    private javax.swing.JTextField txtAlergia4;
    private javax.swing.JTextField txtAlergia5;
    private javax.swing.JTextField txtApellidoEmergencia;
    private javax.swing.JTextField txtApellidoEncargado;
    private javax.swing.JTextField txtDpiCuiEncargado;
    private javax.swing.JTextField txtEmailEncargado;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtLugarTrabajoEncargado;
    private javax.swing.JTextField txtNombreEmergencia;
    private javax.swing.JTextField txtNombreEncargado;
    private javax.swing.JTextField txtPadecimiento1;
    private javax.swing.JTextField txtPadecimiento2;
    private javax.swing.JTextField txtPadecimiento3;
    private javax.swing.JTextField txtPadecimiento4;
    private javax.swing.JTextField txtParentescoEmergencia;
    private javax.swing.JTextField txtResidenciaEncargado;
    private javax.swing.JTextField txtTelefonoEmergencia;
    private javax.swing.JTextField txtTelefonoEncargado;
    private javax.swing.JTextField txtTrabajoOcupacionEncargado;
    // End of variables declaration//GEN-END:variables
}
