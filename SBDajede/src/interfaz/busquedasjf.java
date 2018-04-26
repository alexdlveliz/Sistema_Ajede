/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.BusquedasVoluntarios;
import Clases.Conexion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojeru_san.componentes.RSDateChooser;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class busquedasjf extends javax.swing.JFrame {

    ImageIcon menuboe = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/opcbm1.jpg")).getImage());
    ImageIcon menureportes = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/mrreportes1.jpg")).getImage());
    ImageIcon menubusquedas = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/mbusquedas1.jpg")).getImage());
    ImageIcon bvoluntariado = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/bvoluntariado1.jpg")).getImage());
    ImageIcon evoluntariado = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/voluntariadom1.jpg")).getImage());
    ImageIcon edp1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/edproyectos1.jpg")).getImage());
    ImageIcon evol = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/evoluntariado1.jpg")).getImage());
    ImageIcon bproyectos = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/proyectos1.jpg")).getImage());
    ImageIcon eproyectos = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/proyectos1.jpg")).getImage());
    ImageIcon vacinac = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vactnact1.jpg")).getImage()); //vactinact1
    ImageIcon vanio = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vainicio1.jpg")).getImage());
    ImageIcon vedad = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vedad1.jpg")).getImage());
    ImageIcon vexbnexb = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vexbnexb1.jpg")).getImage());
    ImageIcon vgenero = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vgenero1.jpg")).getImage());
    ImageIcon vinfog = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vinfog1.jpg")).getImage());
    ImageIcon vocupacion = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vocupacion1.jpg")).getImage());
    ImageIcon vprograma = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vprograma1.jpg")).getImage());
    ImageIcon vpromo = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vpromocion1.jpg")).getImage());
    String id = "";
    /**
     * Creates new form busquedasjf en SBDAjede
     */
    private BusquedasVoluntarios busquedas;
    private Boolean activo = true;

    public busquedasjf() {
        busquedas = new BusquedasVoluntarios();
        initComponents();
        cmbedad.setModel(busquedas.getEdades());
        cmbanio.setModel(busquedas.AnioInicio());
        cmbapromocion.setModel(busquedas.getPromocion());
        cmbprograma.setModel(busquedas.getPrograma());
        transparencia();
        JTEditarProyecto.setModel(busquedas.EditarProyecto(JTEditarProyecto, ""));
        tablebvnombre.setModel(busquedas.BNombre("", tablebvnombre, "", true));
        tablebbvproyecto.setModel(busquedas.BProyecto(tablebbvproyecto, lblIdProyecto.getText()));
        tablebvgeneral.setModel(busquedas.BNombreApellido("", tablebvgeneral, ""));
        tablebvgenero.setModel(busquedas.BGenero(tablebvgenero, "M"));
        tablebvedad.setModel(busquedas.BEdad(tablebvedad, (Integer) cmbedad.getSelectedItem()));
        tablebvanioi.setModel(busquedas.BAnioInicio(tablebvanioi, (Integer) cmbanio.getSelectedItem()));
        tablebvpromo.setModel(busquedas.BPromocion(tablebvpromo, ""));
        tablebvprograma.setModel(busquedas.BPrograma(tablebvprograma, ""));
        tablebvexbecarios.setModel(busquedas.BExbecario("", tablebvexbecarios, "", true));
        tablebvocupacion.setModel(busquedas.BOcupacion(tablebvocupacion, "ET"));
        colocarProyectos();
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        transparencia();
        if ((tamanio.width == 1920) && (tamanio.height == 1080)) {
            this.setSize(1560, 880);
            this.setLocationRelativeTo(null);
            jPanel1.setSize(1565, 880);
            rSPanelsSlider1.setSize(1565, 880);
            jpmenuboe.setSize(1565, 880);
            lbmenuboe.setSize(1565, 880);
            lbmenuboe.setIcon(menuboe);
            jpmenua.setSize(1565, 880);
            lbmenua.setSize(1565, 880);
            lbmenua.setIcon(menubusquedas);
            jpvactivosina.setSize(1565, 880);
            lbvnombre.setSize(1565, 880);
            lbvnombre.setIcon(vacinac);
            jpgeneral.setSize(1565, 880);
            lbgeneral.setSize(1565, 880);
            lbgeneral.setIcon(vinfog);
            jpvexbnexb.setSize(1565, 880);
            lbexbnexb.setSize(1565, 880);
            lbexbnexb.setIcon(vexbnexb);
            jpvanio.setSize(1565, 880);
            lbvanio.setSize(1565, 880);
            lbvanio.setIcon(vanio);
            jpvedad.setSize(1565, 880);
            lbvedad.setSize(1565, 880);
            lbvedad.setIcon(vedad);
            jpvgenero.setSize(1565, 880);
            lbvgenero.setSize(1565, 880);
            lbvgenero.setIcon(vgenero);
            jpvprograma.setSize(1565, 880);
            lbvprograma.setSize(1565, 880);
            lbvprograma.setIcon(vprograma);
            jpvpromocionbeca.setSize(1565, 880);
            lbvpromocionbeca.setSize(1565, 880);
            lbvpromocionbeca.setIcon(vpromo);
            jpvocupacion.setSize(1565, 880);
            lbvocupacion.setSize(1565, 880);
            lbvocupacion.setIcon(vocupacion);
            jpbproyecto.setSize(1565, 880);
            lbbproyectos.setSize(1565, 880);
            lbbproyectos.setIcon(bproyectos);
            jpeproyecto.setSize(1565, 880);
            lbeproyectos.setSize(1565, 880);
            lbeproyectos.setIcon(eproyectos);
            jpbvoluntariado.setSize(1565, 880);
            lbbvoluntariado.setSize(1565, 880);
            lbbvoluntariado.setIcon(bvoluntariado);
            jpevoluntariado.setSize(1565, 880);
            lbevoluntariado.setSize(1565, 880);
            lbevoluntariado.setIcon(evoluntariado);
            btnsalir.setLocation(1487, 0);
            btnminimizar.setLocation(1412, 0);
            btnhome.setLocation(1340, 0);
            btnregresar.setLocation(1270, 0);
            cmbbusoed.setLocation(569, 235);
            cmbbusoed.setSize(415, 40);
            btnbevoluntarios.setLocation(330, 465);
            btnbeproyecto.setLocation(690, 465);
            btnbevoluntariado.setLocation(1050, 465);
            btnbvnombre.setLocation(87, 280);
            btnbvanio.setLocation(395, 280);
            btnbvactivosina.setLocation(710, 280);
            btnbvedad.setLocation(1020, 280);
            btnbvgenero.setLocation(1320, 280);
            btnbvocupacion.setLocation(87, 590);
            btnbvprograma.setLocation(385, 590);
            btnbvpromocionbeca.setLocation(705, 590);
            btnbvexbecarios.setLocation(1020, 590);
            btnrmenua.setLocation(1333, 590); //1030,590
        }

    }

    public void transparencia() {
        cmbbusoed.setBackground(new Color(0, 0, 0, 0));
        btnbevoluntariado.setOpaque(false);
        btnbevoluntariado.setContentAreaFilled(false);
        btnbevoluntariado.setBorderPainted(false);
        btnbevoluntarios.setOpaque(false);
        btnbevoluntarios.setContentAreaFilled(false);
        btnbevoluntarios.setBorderPainted(false);
        btnbeproyecto.setOpaque(false);
        btnbeproyecto.setContentAreaFilled(false);
        btnbeproyecto.setBorderPainted(false);
        btnbvnombre.setOpaque(false);
        btnbvnombre.setContentAreaFilled(false);
        btnbvnombre.setBorderPainted(false);
        btnbvexbecarios.setOpaque(false);
        btnbvexbecarios.setContentAreaFilled(false);
        btnbvexbecarios.setBorderPainted(false);
        btnbvactivosina.setOpaque(false);
        btnbvactivosina.setContentAreaFilled(false);
        btnbvactivosina.setBorderPainted(false);
        btnbvanio.setOpaque(false);
        btnbvanio.setContentAreaFilled(false);
        btnbvanio.setBorderPainted(false);
        btnbvedad.setOpaque(false);
        btnbvedad.setContentAreaFilled(false);
        btnbvedad.setBorderPainted(false);
        btnbvgenero.setOpaque(false);
        btnbvgenero.setContentAreaFilled(false);
        btnbvgenero.setBorderPainted(false);
        btnbvprograma.setOpaque(false);
        btnbvprograma.setContentAreaFilled(false);
        btnbvprograma.setBorderPainted(false);
        btnbvpromocionbeca.setOpaque(false);
        btnbvpromocionbeca.setContentAreaFilled(false);
        btnbvpromocionbeca.setBorderPainted(false);
        btnbvocupacion.setOpaque(false);
        btnbvocupacion.setContentAreaFilled(false);
        btnbvocupacion.setBorderPainted(false);
        btnrmenua.setOpaque(false);
        btnrmenua.setContentAreaFilled(false);
        btnrmenua.setBorderPainted(false);
        txtbvnombre.setBackground(new Color(0, 0, 0, 0));
        txtApellido.setBackground(new Color(0, 0, 0, 0));
        cmbactivo.setBackground(new Color(0, 0, 0, 0));
        txtbapellidosg.setBackground(new Color(0, 0, 0, 0));
        txtbnombreg.setBackground(new Color(0, 0, 0, 0));
        txtnvexbnexb.setBackground(new Color(0, 0, 0, 0));
        cmbexbnexb.setBackground(new Color(0, 0, 0, 0));
        cmbgenero.setBackground(new Color(0, 0, 0, 0));
        cmbedad.setBackground(new Color(0, 0, 0, 0));
        cmbanio.setBackground(new Color(0, 0, 0, 0));
        cmbprograma.setBackground(new Color(0, 0, 0, 0));
        cmbapromocion.setBackground(new Color(0, 0, 0, 0));
        cmbocupacion.setBackground(new Color(0, 0, 0, 0));
        txtproyecto.setBackground(new Color(0, 0, 0, 0));
        txtbmiembros.setBackground(new Color(0, 0, 0, 0));
        txtbproyecto.setBackground(new Color(0, 0, 0, 0));
        txtbvoluntarios.setBackground(new Color(0, 0, 0, 0));
        txtemiembros.setBackground(new Color(0, 0, 0, 0));
        txteproyecto.setBackground(new Color(0, 0, 0, 0));
        txtevoluntarios.setBackground(new Color(0, 0, 0, 0));
        txtADescripcion.setBackground(new Color(0, 0, 0, 0));
        cmbnomproyecto.setBackground(new Color(0, 0, 0, 0));
        txtnombreproyecto.setBackground(new Color(0, 0, 0, 0));
        btnevoluntariadog.setOpaque(false);
        btnevoluntariadog.setContentAreaFilled(false);
        btnevoluntariadog.setBorderPainted(false);
        btnmenuboe.setOpaque(false);
        btnmenuboe.setContentAreaFilled(false);
        btnmenuboe.setBorderPainted(false);
        btnmenubused.setOpaque(false);
        btnmenubused.setContentAreaFilled(false);
        btnmenubused.setBorderPainted(false);
        btnguardareproyect.setOpaque(false);
        btnguardareproyect.setContentAreaFilled(false);
        btnguardareproyect.setBorderPainted(false);
        btnsalir.setOpaque(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setBorderPainted(false);
        btnminimizar.setOpaque(false);
        btnminimizar.setContentAreaFilled(false);
        btnminimizar.setBorderPainted(false);
        btnhome.setOpaque(false);
        btnhome.setContentAreaFilled(false);
        btnhome.setBorderPainted(false);
        btnregresar.setOpaque(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.setBorderPainted(false);
        btnmenube.setOpaque(false);
        btnmenube.setContentAreaFilled(false);
        btnmenube.setBorderPainted(false);
        btnguardarcambiosdp.setOpaque(false);
        btnguardarcambiosdp.setContentAreaFilled(false);
        btnguardarcambiosdp.setBorderPainted(false);
        textfieldnombres.setBackground(new Color(0, 0, 0, 0));
        textfieldapellidos.setBackground(new Color(0, 0, 0, 0));
        cmbgenero1.setBackground(new Color(0, 0, 0, 0));
        textfieldedad.setBackground(new Color(0, 0, 0, 0));
        textfielddpi.setBackground(new Color(0, 0, 0, 0));
        textfieldresidencia.setBackground(new Color(0, 0, 0, 0));
        textfieldcorreo.setBackground(new Color(0, 0, 0, 0));
        textfieldperfil.setBackground(new Color(0, 0, 0, 0));
        cmbtalla.setBackground(new Color(0, 0, 0, 0));
        cmbactivoina.setBackground(new Color(0, 0, 0, 0));
        txtADescripcion.setBackground(new Color(0, 0, 0, 0));
        cmbbproyectos.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popInfoGen = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnsalir = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnminimizar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jpmenuboe = new javax.swing.JPanel();
        cmbbusoed = new javax.swing.JComboBox<>();
        btnbevoluntariado = new javax.swing.JButton();
        btnbevoluntarios = new javax.swing.JButton();
        btnbeproyecto = new javax.swing.JButton();
        lbmenuboe = new javax.swing.JLabel();
        jpmenua = new javax.swing.JPanel();
        btnbvnombre = new javax.swing.JButton();
        btnbvexbecarios = new javax.swing.JButton();
        btnbvactivosina = new javax.swing.JButton();
        btnbvanio = new javax.swing.JButton();
        btnbvedad = new javax.swing.JButton();
        btnbvgenero = new javax.swing.JButton();
        btnbvprograma = new javax.swing.JButton();
        btnbvpromocionbeca = new javax.swing.JButton();
        btnbvocupacion = new javax.swing.JButton();
        btnrmenua = new javax.swing.JButton();
        lbmenua = new javax.swing.JLabel();
        jpvactivosina = new javax.swing.JPanel();
        txtbvnombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbactivo = new javax.swing.JComboBox<>();
        scrolln = new javax.swing.JScrollPane();
        tablebvnombre = new rojerusan.RSTableMetro();
        lbvnombre = new javax.swing.JLabel();
        jpgeneral = new javax.swing.JPanel();
        txtbapellidosg = new javax.swing.JTextField();
        txtbnombreg = new javax.swing.JTextField();
        scrollg = new javax.swing.JScrollPane();
        tablebvgeneral = new rojerusan.RSTableMetro();
        lbgeneral = new javax.swing.JLabel();
        jpvexbnexb = new javax.swing.JPanel();
        txtnvexbnexb = new javax.swing.JTextField();
        txtavexbnexb = new javax.swing.JTextField();
        cmbexbnexb = new javax.swing.JComboBox<>();
        scrollgex = new javax.swing.JScrollPane();
        tablebvexbecarios = new rojerusan.RSTableMetro();
        lbexbnexb = new javax.swing.JLabel();
        jpvanio = new javax.swing.JPanel();
        cmbanio = new javax.swing.JComboBox<>();
        scrollgai = new javax.swing.JScrollPane();
        tablebvanioi = new rojerusan.RSTableMetro();
        lbvanio = new javax.swing.JLabel();
        jpvedad = new javax.swing.JPanel();
        cmbedad = new rojerusan.RSComboMetro();
        scrolled = new javax.swing.JScrollPane();
        tablebvedad = new rojerusan.RSTableMetro();
        lbvedad = new javax.swing.JLabel();
        jpvgenero = new javax.swing.JPanel();
        cmbgenero = new javax.swing.JComboBox<>();
        scrollge = new javax.swing.JScrollPane();
        tablebvgenero = new rojerusan.RSTableMetro();
        lbvgenero = new javax.swing.JLabel();
        jpvprograma = new javax.swing.JPanel();
        cmbprograma = new javax.swing.JComboBox<>();
        scrollpro = new javax.swing.JScrollPane();
        tablebvprograma = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        lbvprograma = new javax.swing.JLabel();
        jpvpromocionbeca = new javax.swing.JPanel();
        cmbapromocion = new javax.swing.JComboBox<>();
        scrollpromo = new javax.swing.JScrollPane();
        tablebvpromo = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbvpromocionbeca = new javax.swing.JLabel();
        jpvocupacion = new javax.swing.JPanel();
        cmbocupacion = new javax.swing.JComboBox<>();
        scrollocup = new javax.swing.JScrollPane();
        tablebvocupacion = new rojerusan.RSTableMetro();
        lbvocupacion = new javax.swing.JLabel();
        jpbproyecto = new javax.swing.JPanel();
        txtproyecto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTEditarProyecto = new rojerusan.RSTableMetro();
        lbbproyectos = new javax.swing.JLabel();
        jpbvoluntariado = new javax.swing.JPanel();
        txtbmiembros = new javax.swing.JTextField();
        txtbproyecto = new javax.swing.JTextField();
        txtbvoluntarios = new javax.swing.JTextField();
        scrollgvproy = new javax.swing.JScrollPane();
        tablevproy = new rojerusan.RSTableMetro();
        scrollvvol = new javax.swing.JScrollPane();
        tablevvol = new rojerusan.RSTableMetro();
        scrollvmiembros = new javax.swing.JScrollPane();
        tablevmiembros = new rojerusan.RSTableMetro();
        lbbvoluntariado = new javax.swing.JLabel();
        jpevoluntariado = new javax.swing.JPanel();
        txtemiembros = new javax.swing.JTextField();
        txteproyecto = new javax.swing.JTextField();
        txtevoluntarios = new javax.swing.JTextField();
        btnevoluntariadog = new javax.swing.JButton();
        btnmenuboe = new javax.swing.JButton();
        scrollveproy = new javax.swing.JScrollPane();
        tableveproy = new rojerusan.RSTableMetro();
        scrollvevol = new javax.swing.JScrollPane();
        tablevevol = new rojerusan.RSTableMetro();
        scrollvmiembros1 = new javax.swing.JScrollPane();
        tablevemiembros = new rojerusan.RSTableMetro();
        lbevoluntariado = new javax.swing.JLabel();
        jpeproyecto = new javax.swing.JPanel();
        btnmenubused = new javax.swing.JButton();
        btnguardareproyect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        cmbnomproyecto = new javax.swing.JComboBox<>();
        txtnombreproyecto = new javax.swing.JTextField();
        lbeproyectos = new javax.swing.JLabel();
        lbl_id_proyecto = new javax.swing.JLabel();
        jpedp = new javax.swing.JPanel();
        textfieldnombres = new javax.swing.JTextField();
        textfieldapellidos = new javax.swing.JTextField();
        cmbgenero1 = new javax.swing.JComboBox<>();
        textfieldedad = new javax.swing.JTextField();
        fechas = new rojeru_san.componentes.RSDateChooser();
        textfielddpi = new javax.swing.JTextField();
        textfieldresidencia = new javax.swing.JTextField();
        textfieldcorreo = new javax.swing.JTextField();
        textfieldperfil = new javax.swing.JTextField();
        cmbtalla = new javax.swing.JComboBox<>();
        btnmenube = new javax.swing.JButton();
        btnguardarcambiosdp = new javax.swing.JButton();
        cmbactivoina = new javax.swing.JComboBox<>();
        lbedp = new javax.swing.JLabel();
        lbl_id_asociado = new javax.swing.JLabel();
        jpbbproyecto = new javax.swing.JPanel();
        scrollbbproy = new javax.swing.JScrollPane();
        tablebbvproyecto = new rojerusan.RSTableMetro();
        cmbbproyectos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblIdProyecto = new javax.swing.JLabel();

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Editar datos generales");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        popInfoGen.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem2.setText("Editar Proyecto");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jPopupMenu1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1565, 880));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(1565, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 700));
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

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Back_30px.png"))); // NOI18N
        btnregresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Back_70px.png"))); // NOI18N
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar);
        btnregresar.setBounds(940, 0, 80, 70);

        rSPanelsSlider1.setMaximumSize(new java.awt.Dimension(1565, 880));
        rSPanelsSlider1.setMinimumSize(new java.awt.Dimension(1250, 700));
        rSPanelsSlider1.setPreferredSize(new java.awt.Dimension(1250, 700));

        jpmenuboe.setName("jpmenuboe"); // NOI18N
        jpmenuboe.setLayout(null);

        cmbbusoed.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        cmbbusoed.setForeground(new java.awt.Color(255, 255, 255));
        cmbbusoed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Editar" }));
        jpmenuboe.add(cmbbusoed);
        cmbbusoed.setBounds(457, 185, 330, 40);

        btnbevoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Hand_70px.png"))); // NOI18N
        btnbevoluntariado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Hand_100px.png"))); // NOI18N
        btnbevoluntariado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbevoluntariadoMouseClicked(evt);
            }
        });
        jpmenuboe.add(btnbevoluntariado);
        btnbevoluntariado.setBounds(830, 360, 170, 130);

        btnbevoluntarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Contacts_70px.png"))); // NOI18N
        btnbevoluntarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Contacts_100px.png"))); // NOI18N
        btnbevoluntarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbevoluntariosMouseClicked(evt);
            }
        });
        btnbevoluntarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbevoluntariosActionPerformed(evt);
            }
        });
        jpmenuboe.add(btnbevoluntarios);
        btnbevoluntarios.setBounds(250, 360, 170, 130);

        btnbeproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Construction_70px_1.png"))); // NOI18N
        btnbeproyecto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Construction_100px_1.png"))); // NOI18N
        btnbeproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbeproyectoMouseClicked(evt);
            }
        });
        jpmenuboe.add(btnbeproyecto);
        btnbeproyecto.setBounds(540, 360, 170, 130);

        lbmenuboe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/opcbm2.jpg"))); // NOI18N
        jpmenuboe.add(lbmenuboe);
        lbmenuboe.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpmenuboe, "card12");

        jpmenua.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpmenua.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpmenua.setName("jpmenua"); // NOI18N
        jpmenua.setLayout(null);

        btnbvnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/nombre.png"))); // NOI18N
        btnbvnombre.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/nombredos.png"))); // NOI18N
        btnbvnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvnombreMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvnombre);
        btnbvnombre.setBounds(60, 220, 150, 100);

        btnbvexbecarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/exbecarios.png"))); // NOI18N
        btnbvexbecarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/exbecariosdos.png"))); // NOI18N
        btnbvexbecarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvexbecariosMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvexbecarios);
        btnbvexbecarios.setBounds(790, 460, 160, 80);

        btnbvactivosina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/activos.png"))); // NOI18N
        btnbvactivosina.setToolTipText("");
        btnbvactivosina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/activosdos.png"))); // NOI18N
        btnbvactivosina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvactivosinaMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvactivosina);
        btnbvactivosina.setBounds(550, 210, 150, 80);

        btnbvanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/anio.png"))); // NOI18N
        btnbvanio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/aniodos.png"))); // NOI18N
        btnbvanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvanioMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvanio);
        btnbvanio.setBounds(300, 210, 150, 90);

        btnbvedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/edad.png"))); // NOI18N
        btnbvedad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/edaddos.png"))); // NOI18N
        btnbvedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvedadMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvedad);
        btnbvedad.setBounds(790, 230, 160, 90);

        btnbvgenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/genero.png"))); // NOI18N
        btnbvgenero.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/generodos.png"))); // NOI18N
        btnbvgenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvgeneroMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvgenero);
        btnbvgenero.setBounds(1030, 230, 160, 90);

        btnbvprograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/programa.png"))); // NOI18N
        btnbvprograma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/programados.png"))); // NOI18N
        btnbvprograma.setVerifyInputWhenFocusTarget(false);
        btnbvprograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvprogramaMouseClicked(evt);
            }
        });
        btnbvprograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbvprogramaActionPerformed(evt);
            }
        });
        jpmenua.add(btnbvprograma);
        btnbvprograma.setBounds(290, 460, 170, 90);

        btnbvpromocionbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/promocion.png"))); // NOI18N
        btnbvpromocionbeca.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/promociondos.png"))); // NOI18N
        btnbvpromocionbeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvpromocionbecaMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvpromocionbeca);
        btnbvpromocionbeca.setBounds(540, 460, 170, 90);

        btnbvocupacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/trabajando.png"))); // NOI18N
        btnbvocupacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/trabajandodos.png"))); // NOI18N
        btnbvocupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvocupacionMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvocupacion);
        btnbvocupacion.setBounds(50, 460, 170, 100);

        btnrmenua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnrmenua.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnrmenua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmenuaActionPerformed(evt);
            }
        });
        jpmenua.add(btnrmenua);
        btnrmenua.setBounds(1040, 470, 130, 90);

        lbmenua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/menubusquedastam2.jpg"))); // NOI18N
        jpmenua.add(lbmenua);
        lbmenua.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpmenua, "card9");

        jpvactivosina.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpvactivosina.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpvactivosina.setName("jpvactivosina"); // NOI18N
        jpvactivosina.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpvactivosina.setLayout(null);

        txtbvnombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvnombre.setBorder(null);
        txtbvnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbvnombreKeyPressed(evt);
            }
        });
        jpvactivosina.add(txtbvnombre);
        txtbvnombre.setBounds(310, 180, 340, 40);

        txtApellido.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });
        jpvactivosina.add(txtApellido);
        txtApellido.setBounds(310, 250, 340, 40);

        cmbactivo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbactivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmbactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbactivoActionPerformed(evt);
            }
        });
        jpvactivosina.add(cmbactivo);
        cmbactivo.setBounds(850, 220, 190, 30);

        tablebvnombre = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvnombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Email", "Género"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvnombre.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvnombre.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvnombre.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvnombre.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvnombre.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvnombre.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvnombre.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvnombre.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvnombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvnombre.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvnombre.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvnombre.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvnombre.setRowHeight(22);
        tablebvnombre.getTableHeader().setReorderingAllowed(false);
        scrolln.setViewportView(tablebvnombre);
        if (tablebvnombre.getColumnModel().getColumnCount() > 0) {
            tablebvnombre.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvnombre.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablebvnombre.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jpvactivosina.add(scrolln);
        scrolln.setBounds(110, 320, 1030, 310);

        lbvnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vactnact2.jpg"))); // NOI18N
        jpvactivosina.add(lbvnombre);
        lbvnombre.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvactivosina, "card3");

        jpgeneral.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpgeneral.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpgeneral.setName("jpgeneral"); // NOI18N
        jpgeneral.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpgeneral.setLayout(null);

        txtbapellidosg.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbapellidosg.setBorder(null);
        txtbapellidosg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbapellidosgKeyPressed(evt);
            }
        });
        jpgeneral.add(txtbapellidosg);
        txtbapellidosg.setBounds(310, 230, 410, 40);

        txtbnombreg.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbnombreg.setBorder(null);
        txtbnombreg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbnombregKeyPressed(evt);
            }
        });
        jpgeneral.add(txtbnombreg);
        txtbnombreg.setBounds(310, 170, 410, 40);

        tablebvgeneral = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvgeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvgeneral.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvgeneral.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvgeneral.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvgeneral.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvgeneral.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvgeneral.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvgeneral.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvgeneral.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvgeneral.setComponentPopupMenu(popInfoGen);
        tablebvgeneral.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvgeneral.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvgeneral.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvgeneral.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvgeneral.setRowHeight(22);
        tablebvgeneral.getTableHeader().setReorderingAllowed(false);
        tablebvgeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebvgeneralMouseClicked(evt);
            }
        });
        tablebvgeneral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablebvgeneralKeyPressed(evt);
            }
        });
        scrollg.setViewportView(tablebvgeneral);
        if (tablebvgeneral.getColumnModel().getColumnCount() > 0) {
            tablebvgeneral.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvgeneral.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablebvgeneral.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jpgeneral.add(scrollg);
        scrollg.setBounds(110, 300, 1030, 340);

        lbgeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vinfog2.jpg"))); // NOI18N
        jpgeneral.add(lbgeneral);
        lbgeneral.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpgeneral, "card4");

        jpvexbnexb.setName("jpvexbnexb"); // NOI18N
        jpvexbnexb.setLayout(null);

        txtnvexbnexb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtnvexbnexb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnvexbnexbKeyPressed(evt);
            }
        });
        jpvexbnexb.add(txtnvexbnexb);
        txtnvexbnexb.setBounds(300, 180, 350, 50);

        txtavexbnexb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtavexbnexb.setBorder(null);
        txtavexbnexb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtavexbnexbKeyPressed(evt);
            }
        });
        jpvexbnexb.add(txtavexbnexb);
        txtavexbnexb.setBounds(300, 250, 350, 50);

        cmbexbnexb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbexbnexb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exbecario", "No Exbecario" }));
        cmbexbnexb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbexbnexbActionPerformed(evt);
            }
        });
        jpvexbnexb.add(cmbexbnexb);
        cmbexbnexb.setBounds(840, 220, 210, 40);

        tablebvexbecarios = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvexbecarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "Programa", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvexbecarios.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvexbecarios.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvexbecarios.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvexbecarios.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvexbecarios.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvexbecarios.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvexbecarios.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvexbecarios.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvexbecarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvexbecarios.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvexbecarios.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvexbecarios.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvexbecarios.setRowHeight(22);
        tablebvexbecarios.getTableHeader().setReorderingAllowed(false);
        scrollgex.setViewportView(tablebvexbecarios);
        if (tablebvexbecarios.getColumnModel().getColumnCount() > 0) {
            tablebvexbecarios.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvexbecarios.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablebvexbecarios.getColumnModel().getColumn(0).setMaxWidth(100);
            tablebvexbecarios.getColumnModel().getColumn(4).setMinWidth(75);
            tablebvexbecarios.getColumnModel().getColumn(4).setPreferredWidth(150);
            tablebvexbecarios.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jpvexbnexb.add(scrollgex);
        scrollgex.setBounds(110, 330, 1030, 310);

        lbexbnexb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vexbnb2.jpg"))); // NOI18N
        jpvexbnexb.add(lbexbnexb);
        lbexbnexb.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvexbnexb, "card5");

        jpvanio.setName("jpvanio"); // NOI18N
        jpvanio.setLayout(null);

        cmbanio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbanioActionPerformed(evt);
            }
        });
        jpvanio.add(cmbanio);
        cmbanio.setBounds(240, 200, 200, 40);

        tablebvanioi = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvanioi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvanioi.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvanioi.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvanioi.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvanioi.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvanioi.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvanioi.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvanioi.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvanioi.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvanioi.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvanioi.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvanioi.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvanioi.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvanioi.setRowHeight(22);
        tablebvanioi.getTableHeader().setReorderingAllowed(false);
        scrollgai.setViewportView(tablebvanioi);
        if (tablebvanioi.getColumnModel().getColumnCount() > 0) {
            tablebvanioi.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvanioi.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablebvanioi.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jpvanio.add(scrollgai);
        scrollgai.setBounds(110, 260, 1030, 380);

        lbvanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vanio2.jpeg"))); // NOI18N
        jpvanio.add(lbvanio);
        lbvanio.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvanio, "card8");

        jpvedad.setName("jpvedad"); // NOI18N
        jpvedad.setLayout(null);

        cmbedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbedadActionPerformed(evt);
            }
        });
        jpvedad.add(cmbedad);
        cmbedad.setBounds(250, 190, 200, 32);

        tablebvedad = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia", "Email", "Fecha de nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvedad.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvedad.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvedad.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvedad.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvedad.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvedad.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvedad.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvedad.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvedad.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvedad.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvedad.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvedad.setRowHeight(22);
        tablebvedad.getTableHeader().setReorderingAllowed(false);
        scrolled.setViewportView(tablebvedad);
        if (tablebvedad.getColumnModel().getColumnCount() > 0) {
            tablebvedad.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvedad.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablebvedad.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jpvedad.add(scrolled);
        scrolled.setBounds(110, 260, 1030, 370);

        lbvedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbvedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vedad2.jpg"))); // NOI18N
        jpvedad.add(lbvedad);
        lbvedad.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvedad, "card9");

        jpvgenero.setName("jpvgenero"); // NOI18N
        jpvgenero.setLayout(null);

        cmbgenero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgeneroActionPerformed(evt);
            }
        });
        jpvgenero.add(cmbgenero);
        cmbgenero.setBounds(250, 180, 260, 30);

        tablebvgenero = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvgenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvgenero.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvgenero.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvgenero.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvgenero.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvgenero.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvgenero.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvgenero.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvgenero.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvgenero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvgenero.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvgenero.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvgenero.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvgenero.setRowHeight(22);
        tablebvgenero.getTableHeader().setReorderingAllowed(false);
        scrollge.setViewportView(tablebvgenero);
        if (tablebvgenero.getColumnModel().getColumnCount() > 0) {
            tablebvgenero.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvgenero.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablebvgenero.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jpvgenero.add(scrollge);
        scrollge.setBounds(110, 250, 1030, 380);

        lbvgenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vgenero2.jpg"))); // NOI18N
        jpvgenero.add(lbvgenero);
        lbvgenero.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvgenero, "card10");

        jpvprograma.setName("jpvprograma"); // NOI18N
        jpvprograma.setLayout(null);

        cmbprograma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbprograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbprogramaActionPerformed(evt);
            }
        });
        jpvprograma.add(cmbprograma);
        cmbprograma.setBounds(310, 190, 340, 50);

        tablebvprograma = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvprograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvprograma.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvprograma.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvprograma.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvprograma.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvprograma.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvprograma.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvprograma.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvprograma.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvprograma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvprograma.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvprograma.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvprograma.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvprograma.setRowHeight(22);
        tablebvprograma.getTableHeader().setReorderingAllowed(false);
        scrollpro.setViewportView(tablebvprograma);
        if (tablebvprograma.getColumnModel().getColumnCount() > 0) {
            tablebvprograma.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvprograma.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablebvprograma.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jpvprograma.add(scrollpro);
        scrollpro.setBounds(110, 260, 1030, 380);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel1.setText("Programa");
        jpvprograma.add(jLabel1);
        jLabel1.setBounds(120, 190, 170, 50);

        lbvprograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vprograma2.jpg"))); // NOI18N
        jpvprograma.add(lbvprograma);
        lbvprograma.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvprograma, "card11");

        jpvpromocionbeca.setName("jpvpromocionbeca"); // NOI18N
        jpvpromocionbeca.setLayout(null);

        cmbapromocion.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        cmbapromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbapromocionActionPerformed(evt);
            }
        });
        jpvpromocionbeca.add(cmbapromocion);
        cmbapromocion.setBounds(370, 180, 210, 40);

        tablebvpromo = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvpromo.setBackground(new java.awt.Color(186, 253, 244));
        tablebvpromo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvpromo.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvpromo.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvpromo.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvpromo.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvpromo.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvpromo.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvpromo.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvpromo.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvpromo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvpromo.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvpromo.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvpromo.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvpromo.setRowHeight(22);
        tablebvpromo.getTableHeader().setReorderingAllowed(false);
        scrollpromo.setViewportView(tablebvpromo);
        if (tablebvpromo.getColumnModel().getColumnCount() > 0) {
            tablebvpromo.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvpromo.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablebvpromo.getColumnModel().getColumn(0).setMaxWidth(80);
            tablebvpromo.getColumnModel().getColumn(5).setHeaderValue("Email");
        }

        jpvpromocionbeca.add(scrollpromo);
        scrollpromo.setBounds(110, 260, 1030, 370);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 26)); // NOI18N
        jLabel3.setText("Promoción");
        jpvpromocionbeca.add(jLabel3);
        jLabel3.setBounds(210, 177, 140, 50);

        jPanel2.setBackground(new java.awt.Color(186, 253, 244));
        jPanel2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jpvpromocionbeca.add(jPanel2);
        jPanel2.setBounds(210, 190, 140, 30);

        lbvpromocionbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vpromocion2.jpg"))); // NOI18N
        jpvpromocionbeca.add(lbvpromocionbeca);
        lbvpromocionbeca.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvpromocionbeca, "card12");

        jpvocupacion.setName("jpvocupacion"); // NOI18N
        jpvocupacion.setLayout(null);

        cmbocupacion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbocupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudia y trabaja", "Estudia", "Trabaja" }));
        cmbocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbocupacionActionPerformed(evt);
            }
        });
        jpvocupacion.add(cmbocupacion);
        cmbocupacion.setBounds(300, 180, 420, 40);

        tablebvocupacion = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tablebvocupacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "DPI", "Residencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebvocupacion.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebvocupacion.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebvocupacion.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebvocupacion.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebvocupacion.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebvocupacion.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebvocupacion.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebvocupacion.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebvocupacion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvocupacion.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvocupacion.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebvocupacion.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebvocupacion.setRowHeight(22);
        tablebvocupacion.getTableHeader().setReorderingAllowed(false);
        scrollocup.setViewportView(tablebvocupacion);
        if (tablebvocupacion.getColumnModel().getColumnCount() > 0) {
            tablebvocupacion.getColumnModel().getColumn(0).setMinWidth(50);
            tablebvocupacion.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablebvocupacion.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jpvocupacion.add(scrollocup);
        scrollocup.setBounds(110, 270, 1030, 370);

        lbvocupacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vocupacion2.jpg"))); // NOI18N
        jpvocupacion.add(lbvocupacion);
        lbvocupacion.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvocupacion, "card13");

        jpbproyecto.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpbproyecto.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpbproyecto.setName("jpbproyecto"); // NOI18N
        jpbproyecto.setLayout(null);

        txtproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtproyecto.setBorder(null);
        jpbproyecto.add(txtproyecto);
        txtproyecto.setBounds(310, 200, 320, 30);
        JTEditarProyecto = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        JTEditarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nombre", "Descripción", "Finalizado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTEditarProyecto.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        JTEditarProyecto.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        JTEditarProyecto.setColorBordeHead(new java.awt.Color(255, 255, 255));
        JTEditarProyecto.setColorFilasBackgound1(new java.awt.Color(163, 214, 254));
        JTEditarProyecto.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        JTEditarProyecto.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        JTEditarProyecto.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        JTEditarProyecto.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        JTEditarProyecto.setComponentPopupMenu(jPopupMenu1);
        JTEditarProyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        JTEditarProyecto.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        JTEditarProyecto.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        JTEditarProyecto.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        JTEditarProyecto.setRowHeight(20);
        JTEditarProyecto.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTEditarProyecto);

        jpbproyecto.add(jScrollPane2);
        jScrollPane2.setBounds(100, 250, 1050, 390);

        lbbproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/proyectos2.jpg"))); // NOI18N
        jpbproyecto.add(lbbproyectos);
        lbbproyectos.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpbproyecto, "card13");

        jpbvoluntariado.setMaximumSize(new java.awt.Dimension(1566, 880));
        jpbvoluntariado.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpbvoluntariado.setName("jpbvoluntariado"); // NOI18N
        jpbvoluntariado.setLayout(null);

        txtbmiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbmiembros.setBorder(null);
        jpbvoluntariado.add(txtbmiembros);
        txtbmiembros.setBounds(230, 405, 370, 40);

        txtbproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbproyecto.setBorder(null);
        jpbvoluntariado.add(txtbproyecto);
        txtbproyecto.setBounds(200, 110, 400, 40);

        txtbvoluntarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvoluntarios.setBorder(null);
        jpbvoluntariado.add(txtbvoluntarios);
        txtbvoluntarios.setBounds(830, 110, 370, 40);

        tablevproy.setModel(new javax.swing.table.DefaultTableModel(
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
        tablevproy.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablevproy.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablevproy.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablevproy.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablevproy.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablevproy.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablevproy.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablevproy.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablevproy.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevproy.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevproy.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevproy.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablevproy.setRowHeight(22);
        tablevproy.getTableHeader().setReorderingAllowed(false);
        scrollgvproy.setViewportView(tablevproy);

        jpbvoluntariado.add(scrollgvproy);
        scrollgvproy.setBounds(50, 170, 550, 210);
        tablevvol.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nombre", "Apellido", "Género"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablevvol.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablevvol.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablevvol.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablevvol.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablevvol.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablevvol.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablevvol.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablevvol.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablevvol.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevvol.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevvol.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevvol.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablevvol.setRowHeight(22);
        tablevvol.getTableHeader().setReorderingAllowed(false);
        scrollvvol.setViewportView(tablevvol);

        jpbvoluntariado.add(scrollvvol);
        scrollvvol.setBounds(640, 170, 550, 210);

        tablevmiembros.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nombres", "Apellidos", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablevmiembros.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablevmiembros.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablevmiembros.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablevmiembros.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablevmiembros.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablevmiembros.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablevmiembros.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablevmiembros.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablevmiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevmiembros.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevmiembros.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevmiembros.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablevmiembros.setRowHeight(22);
        tablevmiembros.getTableHeader().setReorderingAllowed(false);
        scrollvmiembros.setViewportView(tablevmiembros);

        jpbvoluntariado.add(scrollvmiembros);
        scrollvmiembros.setBounds(50, 460, 550, 210);

        lbbvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vbvoluntariado1.jpg"))); // NOI18N
        jpbvoluntariado.add(lbbvoluntariado);
        lbbvoluntariado.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpbvoluntariado, "card14");

        jpevoluntariado.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpevoluntariado.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpevoluntariado.setName("jpevoluntariado"); // NOI18N
        jpevoluntariado.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpevoluntariado.setLayout(null);

        txtemiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtemiembros.setBorder(null);
        jpevoluntariado.add(txtemiembros);
        txtemiembros.setBounds(230, 405, 370, 40);

        txteproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txteproyecto.setBorder(null);
        jpevoluntariado.add(txteproyecto);
        txteproyecto.setBounds(200, 110, 400, 40);

        txtevoluntarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtevoluntarios.setBorder(null);
        jpevoluntariado.add(txtevoluntarios);
        txtevoluntarios.setBounds(830, 110, 370, 40);

        btnevoluntariadog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnevoluntariadog.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        jpevoluntariado.add(btnevoluntariadog);
        btnevoluntariadog.setBounds(750, 490, 150, 100);

        btnmenuboe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnmenuboe.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        jpevoluntariado.add(btnmenuboe);
        btnmenuboe.setBounds(970, 500, 160, 100);

        tableveproy.setModel(new javax.swing.table.DefaultTableModel(
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
        tableveproy.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tableveproy.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tableveproy.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tableveproy.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tableveproy.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tableveproy.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tableveproy.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tableveproy.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tableveproy.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableveproy.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableveproy.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableveproy.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tableveproy.setRowHeight(22);
        tableveproy.getTableHeader().setReorderingAllowed(false);
        scrollveproy.setViewportView(tableveproy);

        jpevoluntariado.add(scrollveproy);
        scrollveproy.setBounds(50, 170, 550, 210);

        tablevevol.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nombre", "Apellido", "Género"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablevevol.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablevevol.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablevevol.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablevevol.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablevevol.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablevevol.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablevevol.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablevevol.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablevevol.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevevol.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevevol.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevevol.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablevevol.setRowHeight(22);
        tablevevol.getTableHeader().setReorderingAllowed(false);
        scrollvevol.setViewportView(tablevevol);

        jpevoluntariado.add(scrollvevol);
        scrollvevol.setBounds(640, 170, 550, 210);

        tablevemiembros.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nombres", "Apellidos", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablevemiembros.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablevemiembros.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablevemiembros.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablevemiembros.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablevemiembros.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablevemiembros.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablevemiembros.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablevemiembros.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablevemiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevemiembros.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevemiembros.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevemiembros.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablevemiembros.setRowHeight(22);
        tablevemiembros.getTableHeader().setReorderingAllowed(false);
        scrollvmiembros1.setViewportView(tablevemiembros);

        jpevoluntariado.add(scrollvmiembros1);
        scrollvmiembros1.setBounds(50, 460, 550, 210);

        lbevoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/voluntariadom2.jpg"))); // NOI18N
        jpevoluntariado.add(lbevoluntariado);
        lbevoluntariado.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpevoluntariado, "card15");

        jpeproyecto.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpeproyecto.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpeproyecto.setName("jpeproyecto"); // NOI18N
        jpeproyecto.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpeproyecto.setLayout(null);

        btnmenubused.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnmenubused.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        jpeproyecto.add(btnmenubused);
        btnmenubused.setBounds(1040, 520, 150, 90);

        btnguardareproyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnguardareproyect.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        jpeproyecto.add(btnguardareproyect);
        btnguardareproyect.setBounds(860, 520, 140, 90);

        txtADescripcion.setColumns(20);
        txtADescripcion.setRows(5);
        txtADescripcion.setBorder(null);
        jScrollPane1.setViewportView(txtADescripcion);

        jpeproyecto.add(jScrollPane1);
        jScrollPane1.setBounds(70, 370, 730, 280);

        cmbnomproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbnomproyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpeproyecto.add(cmbnomproyecto);
        cmbnomproyecto.setBounds(570, 250, 220, 30);

        txtnombreproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtnombreproyecto.setBorder(null);
        jpeproyecto.add(txtnombreproyecto);
        txtnombreproyecto.setBounds(80, 250, 480, 30);

        lbeproyectos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbeproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/edproyectos2.jpg"))); // NOI18N
        jpeproyecto.add(lbeproyectos);
        lbeproyectos.setBounds(0, 0, 1250, 700);
        jpeproyecto.add(lbl_id_proyecto);
        lbl_id_proyecto.setBounds(470, 174, 50, 30);

        rSPanelsSlider1.add(jpeproyecto, "card16");

        jpedp.setFocusTraversalPolicyProvider(true);
        jpedp.setName("jpeddp"); // NOI18N
        jpedp.setLayout(null);

        textfieldnombres.setBackground(new java.awt.Color(178, 248, 248));
        textfieldnombres.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldnombres.setForeground(new java.awt.Color(29, 78, 111));
        textfieldnombres.setBorder(null);
        textfieldnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldnombresKeyTyped(evt);
            }
        });
        jpedp.add(textfieldnombres);
        textfieldnombres.setBounds(170, 165, 430, 30);

        textfieldapellidos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldapellidos.setForeground(new java.awt.Color(25, 92, 134));
        textfieldapellidos.setBorder(null);
        textfieldapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldapellidosKeyTyped(evt);
            }
        });
        jpedp.add(textfieldapellidos);
        textfieldapellidos.setBounds(170, 226, 420, 30);

        cmbgenero1.setBackground(new java.awt.Color(178, 248, 248));
        cmbgenero1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbgenero1.setForeground(new java.awt.Color(25, 92, 134));
        cmbgenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbgenero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpedp.add(cmbgenero1);
        cmbgenero1.setBounds(390, 290, 190, 38);

        textfieldedad.setBackground(new java.awt.Color(178, 248, 248));
        textfieldedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldedad.setForeground(new java.awt.Color(25, 92, 134));
        textfieldedad.setBorder(null);
        textfieldedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldedadKeyTyped(evt);
            }
        });
        jpedp.add(textfieldedad);
        textfieldedad.setBounds(120, 295, 90, 30);

        fechas.setColorBackground(new java.awt.Color(22, 54, 77));
        fechas.setColorDiaActual(new java.awt.Color(0, 255, 255));
        fechas.setFuente(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jpedp.add(fechas);
        fechas.setBounds(330, 355, 270, 40);

        textfielddpi.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfielddpi.setForeground(new java.awt.Color(25, 92, 134));
        textfielddpi.setBorder(null);
        jpedp.add(textfielddpi);
        textfielddpi.setBounds(180, 435, 390, 40);

        textfieldresidencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        textfieldresidencia.setForeground(new java.awt.Color(25, 92, 134));
        textfieldresidencia.setBorder(null);
        jpedp.add(textfieldresidencia);
        textfieldresidencia.setBounds(210, 507, 360, 40);

        textfieldcorreo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        textfieldcorreo.setForeground(new java.awt.Color(25, 92, 134));
        textfieldcorreo.setBorder(null);
        jpedp.add(textfieldcorreo);
        textfieldcorreo.setBounds(200, 577, 370, 40);

        textfieldperfil.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        textfieldperfil.setForeground(new java.awt.Color(25, 92, 134));
        textfieldperfil.setBorder(null);
        jpedp.add(textfieldperfil);
        textfieldperfil.setBounds(950, 175, 250, 30);

        cmbtalla.setBackground(new java.awt.Color(178, 248, 248));
        cmbtalla.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbtalla.setForeground(new java.awt.Color(25, 92, 134));
        cmbtalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "xs", "s", "m", "l" }));
        cmbtalla.setBorder(null);
        jpedp.add(cmbtalla);
        cmbtalla.setBounds(870, 235, 60, 36);

        btnmenube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Home_70px.png"))); // NOI18N
        btnmenube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenube.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnmenube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenubeActionPerformed(evt);
            }
        });
        jpedp.add(btnmenube);
        btnmenube.setBounds(650, 440, 130, 100);

        btnguardarcambiosdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnguardarcambiosdp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarcambiosdp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        btnguardarcambiosdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarcambiosdpActionPerformed(evt);
            }
        });
        jpedp.add(btnguardarcambiosdp);
        btnguardarcambiosdp.setBounds(1060, 440, 130, 100);

        cmbactivoina.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbactivoina.setForeground(new java.awt.Color(25, 92, 134));
        cmbactivoina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "No Activo" }));
        jpedp.add(cmbactivoina);
        cmbactivoina.setBounds(750, 315, 290, 30);

        lbedp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/editar/datosp1.jpg"))); // NOI18N
        jpedp.add(lbedp);
        lbedp.setBounds(0, 0, 1250, 700);

        lbl_id_asociado.setText("jLabel2");
        jpedp.add(lbl_id_asociado);
        lbl_id_asociado.setBounds(490, 114, 50, 30);

        rSPanelsSlider1.add(jpedp, "card17");

        jpbbproyecto.setName("jpbbproyecto"); // NOI18N
        jpbbproyecto.setLayout(null);
        tablebbvproyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Nombre", "Apellido", "Fecha de Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablebbvproyecto.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablebbvproyecto.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablebbvproyecto.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablebbvproyecto.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablebbvproyecto.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablebbvproyecto.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablebbvproyecto.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablebbvproyecto.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablebbvproyecto.setComponentPopupMenu(jPopupMenu1);
        tablebbvproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebbvproyecto.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebbvproyecto.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablebbvproyecto.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablebbvproyecto.setRowHeight(22);
        tablebbvproyecto.getTableHeader().setReorderingAllowed(false);
        tablebbvproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebbvproyectoMouseClicked(evt);
            }
        });
        scrollbbproy.setViewportView(tablebbvproyecto);
        if (tablebbvproyecto.getColumnModel().getColumnCount() > 0) {
            tablebbvproyecto.getColumnModel().getColumn(0).setMinWidth(20);
            tablebbvproyecto.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablebbvproyecto.getColumnModel().getColumn(0).setMaxWidth(100);
            tablebbvproyecto.getColumnModel().getColumn(1).setMinWidth(100);
            tablebbvproyecto.getColumnModel().getColumn(1).setPreferredWidth(300);
            tablebbvproyecto.getColumnModel().getColumn(1).setMaxWidth(300);
            tablebbvproyecto.getColumnModel().getColumn(3).setMinWidth(100);
            tablebbvproyecto.getColumnModel().getColumn(3).setPreferredWidth(300);
            tablebbvproyecto.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        jpbbproyecto.add(scrollbbproy);
        scrollbbproy.setBounds(110, 260, 1030, 380);

        cmbbproyectos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbbproyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbproyectosActionPerformed(evt);
            }
        });
        jpbbproyecto.add(cmbbproyectos);
        cmbbproyectos.setBounds(310, 200, 320, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/proyectos2.jpg"))); // NOI18N
        jpbbproyecto.add(jLabel2);
        jLabel2.setBounds(0, 0, 1250, 700);
        jpbbproyecto.add(lblIdProyecto);
        lblIdProyecto.setBounds(690, 184, 70, 30);

        rSPanelsSlider1.add(jpbbproyecto, "card18");

        jPanel1.add(rSPanelsSlider1);
        rSPanelsSlider1.setBounds(0, 0, 1370, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbvprogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbvprogramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbvprogramaActionPerformed

    private void btnbvnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvnombreMouseClicked
        rSPanelsSlider1.setPanelSlider(jpgeneral, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvnombreMouseClicked

    private void btnbvexbecariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvexbecariosMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvexbnexb, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvexbecariosMouseClicked

    private void btnbvactivosinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvactivosinaMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvactivosina, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvactivosinaMouseClicked

    private void btnbvanioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvanioMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvanio, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvanioMouseClicked

    private void btnbvedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvedadMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvedad, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvedadMouseClicked

    private void btnbvgeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvgeneroMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvgenero, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvgeneroMouseClicked

    private void btnbvprogramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvprogramaMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvprograma, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvprogramaMouseClicked

    private void btnbvpromocionbecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvpromocionbecaMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvpromocionbeca, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvpromocionbecaMouseClicked

    private void btnbvocupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvocupacionMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvocupacion, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnbvocupacionMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnhomedpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomedpActionPerformed
        this.dispose();
        menujf mep = new menujf();
        mep.setVisible(true);
    }//GEN-LAST:event_btnhomedpActionPerformed

    private void btnminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarActionPerformed

    private void btnrmenuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmenuaActionPerformed
        rSPanelsSlider1.setPanelSlider(jpmenua, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnrmenuaActionPerformed

    private void colocarProyectos() {
        try {
            Connection con = null;
            Conexion conexion = new Conexion();
            con = conexion.getConnection();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM proyecto");
            while (rs.next()) {
                this.cmbbproyectos.addItem(rs.getString("nombreProyecto"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(busquedasjf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtbvnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbvnombreKeyPressed
        String act = (String) cmbactivo.getSelectedItem();
        if (act.equals("Activo")) {
            activo = true;
        } else {
            activo = false;
        }

        tablebvnombre.setModel(busquedas.BNombre(txtbvnombre.getText(), tablebvnombre, txtApellido.getText(), activo));
    }//GEN-LAST:event_txtbvnombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        String act = (String) cmbactivo.getSelectedItem();
        activo = act.equals("Activo");
        tablebvnombre.setModel(busquedas.BNombre(txtbvnombre.getText(), tablebvnombre, txtApellido.getText(), activo));
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void cmbactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbactivoActionPerformed
        String act = (String) cmbactivo.getSelectedItem();
        activo = act.equals("Activo");
        tablebvnombre.setModel(busquedas.BNombre(txtbvnombre.getText(), tablebvnombre, txtApellido.getText(), activo));
    }//GEN-LAST:event_cmbactivoActionPerformed

    private void btnbevoluntariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbevoluntariosMouseClicked
        if (cmbbusoed.getSelectedItem().equals("Buscar")) {
            rSPanelsSlider1.setPanelSlider(jpmenua, RSPanelsSlider.DIRECT.DOWN);
        } else if (cmbbusoed.getSelectedItem().equals("Editar")) {
            rSPanelsSlider1.setPanelSlider(jpgeneral, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnbevoluntariosMouseClicked

    private void btnbeproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbeproyectoMouseClicked
        if (cmbbusoed.getSelectedItem().equals("Buscar")) {
            rSPanelsSlider1.setPanelSlider(jpbbproyecto, RSPanelsSlider.DIRECT.DOWN);
        } else if (cmbbusoed.getSelectedItem().equals("Editar")) {
            rSPanelsSlider1.setPanelSlider(jpbproyecto, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnbeproyectoMouseClicked

    private void btnbevoluntariadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbevoluntariadoMouseClicked
        if (cmbbusoed.getSelectedItem().equals("Buscar")) {
            rSPanelsSlider1.setPanelSlider(jpbvoluntariado, RSPanelsSlider.DIRECT.DOWN);
        } else if (cmbbusoed.getSelectedItem().equals("Editar")) {
            rSPanelsSlider1.setPanelSlider(jpevoluntariado, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnbevoluntariadoMouseClicked

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        rSPanelsSlider1.setPanelSlider(jpmenuboe, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnbevoluntariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbevoluntariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbevoluntariosActionPerformed

    private void txtbnombregKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbnombregKeyPressed
        // TODO add your handling code here:
        tablebvgeneral.setModel(busquedas.BNombreApellido(txtbnombreg.getText(), tablebvgeneral, txtbapellidosg.getText()));
    }//GEN-LAST:event_txtbnombregKeyPressed

    private void txtbapellidosgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbapellidosgKeyPressed
        // TODO add your handling code here:
        tablebvgeneral.setModel(busquedas.BNombreApellido(txtbnombreg.getText(), tablebvgeneral, txtbapellidosg.getText()));
    }//GEN-LAST:event_txtbapellidosgKeyPressed

    private void cmbgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgeneroActionPerformed
        // TODO add your handling code here:
        if (this.cmbgenero.getSelectedItem().equals("Masculino")) {
            tablebvgenero.setModel(busquedas.BGenero(tablebvgenero, "M"));
        } else {
            tablebvgenero.setModel(busquedas.BGenero(tablebvgenero, "F"));
        }


    }//GEN-LAST:event_cmbgeneroActionPerformed

    private void cmbedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbedadActionPerformed
        if ((this.cmbedad.getSelectedItem().equals("Todas las edades"))) {
            tablebvedad.setModel(busquedas.BEdad(tablebvedad, -1));
        } else {
            int age = (Integer) this.cmbedad.getSelectedItem();
            tablebvedad.setModel(busquedas.BEdad(tablebvedad, age));
        }
    }//GEN-LAST:event_cmbedadActionPerformed

    private void cmbanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbanioActionPerformed
        // TODO add your handling code here:
        if ((this.cmbanio.getSelectedItem().equals("Todos los años"))) {
            tablebvanioi.setModel(busquedas.BAnioInicio(tablebvanioi, -1));
        } else {
            int age = (Integer) this.cmbanio.getSelectedItem();
            tablebvanioi.setModel(busquedas.BAnioInicio(tablebvanioi, age));
        }
    }//GEN-LAST:event_cmbanioActionPerformed

    private void cmbocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbocupacionActionPerformed
        // TODO add your handling code here:
        if (this.cmbocupacion.getSelectedItem().equals("Estudia y trabaja")) {
            tablebvocupacion.setModel(busquedas.BOcupacion(tablebvocupacion, "ET"));
        } else if (this.cmbocupacion.getSelectedItem().equals("Estudia")) {
            tablebvocupacion.setModel(busquedas.BOcupacion(tablebvocupacion, "E"));
        } else {
            tablebvocupacion.setModel(busquedas.BOcupacion(tablebvocupacion, "M"));
        }

    }//GEN-LAST:event_cmbocupacionActionPerformed

    private void cmbapromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbapromocionActionPerformed
        // TODO add your handling code here:
        if ((this.cmbapromocion.getSelectedItem().equals("Todos los años"))) {
            tablebvpromo.setModel(busquedas.BPromocion(tablebvpromo, "0"));
        } else {
            String age = (String) this.cmbapromocion.getSelectedItem();
            tablebvpromo.setModel(busquedas.BPromocion(tablebvpromo, age));
        }
    }//GEN-LAST:event_cmbapromocionActionPerformed

    private void cmbprogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbprogramaActionPerformed
        // TODO add your handling code here:
        if (this.cmbprograma.getSelectedItem().equals("Todos los programas")) {
            tablebvprograma.setModel(busquedas.BPrograma(tablebvprograma, "Todos los programas"));
        } else {
            tablebvprograma.setModel(busquedas.BPrograma(tablebvprograma, (String) cmbprograma.getSelectedItem()));
        }
    }//GEN-LAST:event_cmbprogramaActionPerformed

    private void cmbexbnexbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbexbnexbActionPerformed
        // TODO add your handling code here:
        if (this.cmbexbnexb.getSelectedItem().equals("Exbecario")) {
            tablebvexbecarios.setModel(busquedas.BExbecario(txtnvexbnexb.getText(), tablebvexbecarios, txtavexbnexb.getText(), true));
        } else {
            tablebvexbecarios.setModel(busquedas.BExbecario(txtnvexbnexb.getText(), tablebvexbecarios, txtavexbnexb.getText(), false));
        }
    }//GEN-LAST:event_cmbexbnexbActionPerformed

    private void txtnvexbnexbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnvexbnexbKeyPressed
        // TODO add your handling code here:
        if (this.cmbexbnexb.getSelectedItem().equals("Exbecario")) {
            tablebvexbecarios.setModel(busquedas.BExbecario(txtnvexbnexb.getText(), tablebvexbecarios, txtavexbnexb.getText(), true));
        } else {
            tablebvexbecarios.setModel(busquedas.BExbecario(txtnvexbnexb.getText(), tablebvexbecarios, txtavexbnexb.getText(), false));
        }
    }//GEN-LAST:event_txtnvexbnexbKeyPressed

    private void txtavexbnexbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtavexbnexbKeyPressed
        // TODO add your handling code here:
        if (this.cmbexbnexb.getSelectedItem().equals("Exbecario")) {
            tablebvexbecarios.setModel(busquedas.BExbecario(txtnvexbnexb.getText(), tablebvexbecarios, txtavexbnexb.getText(), true));
        } else {
            tablebvexbecarios.setModel(busquedas.BExbecario(txtnvexbnexb.getText(), tablebvexbecarios, txtavexbnexb.getText(), false));
        }
    }//GEN-LAST:event_txtavexbnexbKeyPressed

    private void textfieldnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldnombresKeyTyped

    }//GEN-LAST:event_textfieldnombresKeyTyped

    private void textfieldapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldapellidosKeyTyped

    }//GEN-LAST:event_textfieldapellidosKeyTyped

    private void textfieldedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldedadKeyTyped

    }//GEN-LAST:event_textfieldedadKeyTyped

    private void btnmenubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenubeActionPerformed

    }//GEN-LAST:event_btnmenubeActionPerformed

    private void btnguardarcambiosdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarcambiosdpActionPerformed
        actualizarAsociado(lbl_id_asociado.getText());
    }//GEN-LAST:event_btnguardarcambiosdpActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Aquí tengo que programar
        rSPanelsSlider1.setPanelSlider(jpedp, RSPanelsSlider.DIRECT.DOWN);
        lbl_id_asociado.setText(obtenerId());
        buscarAsociado(lbl_id_asociado.getText());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public String getFecha(RSDateChooser jd) {
        if (jd.getDatoFecha() != null) {
            return formato.format(jd.getDatoFecha());
        } else {
            return null;
        }
    }

    private void actualizarAsociado(String idAsociado) {
        try {
            int id = Integer.parseInt(idAsociado);
            Connection con = null;
            Conexion conexion;
            conexion = new Conexion();
            con = conexion.getConnection();
            String sql = "UPDATE asociado SET DPI=?, Genero=?, CorreoElectronico=?, FechaNacimiento=?, TallaPlayera=?,"
                    + "Residencia=?, Nombre=?, Apellido=?,Activo=?, PerfilFacebook=? WHERE id LIKE '%" + id + "%'";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, textfielddpi.getText());
            String genero = (String) cmbgenero1.getSelectedItem();
            if (genero.equals("Masculino")) {
                st.setBoolean(2, true);
            } else {
                st.setBoolean(2, false);
            }
            st.setString(3, textfieldcorreo.getText());
            st.setString(4, getFecha(fechas));
            st.setString(5, (String) cmbtalla.getSelectedItem());
            st.setString(6, textfieldresidencia.getText());
            st.setString(7, textfieldnombres.getText());
            st.setString(8, textfieldapellidos.getText());
            String activo = (String) cmbactivoina.getSelectedItem();
            if (activo.equals("Activo")) {
                st.setBoolean(9, true);
            } else {
                st.setBoolean(9, false);
            }

            st.setString(10, textfieldperfil.getText());
            int res = st.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Información actualizada correctamente");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar información");
            }

            tablebvgeneral.setModel(busquedas.BNombreApellido("", tablebvgeneral, ""));
        } catch (SQLException ex) {
            Logger.getLogger(busquedasjf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiarCajas() {
        textfielddpi.setText("");
        cmbgenero1.setSelectedItem("");
        textfieldcorreo.setText("");
        cmbtalla.setSelectedItem("");
        textfieldresidencia.setText("");
        textfieldnombres.setText("");
        textfieldapellidos.setText("");
        cmbactivoina.setSelectedItem("");
        textfieldperfil.setText("");
        btnguardarcambiosdp.setEnabled(false);
    }

    private void buscarAsociado(String idAsociado) {
        try {
            int id = Integer.parseInt(idAsociado);
            Connection con = null;
            Conexion conexion;
            conexion = new Conexion();
            con = conexion.getConnection();
            String sql = "SELECT DPI, Genero, CorreoElectronico, FechaNacimiento, TallaPlayera, Residencia, Nombre, Apellido,"
                    + "Activo, PerfilFacebook, YEAR(CURDATE())-YEAR(FechaNacimiento) + IF(DATE_FORMAT(CURDATE(),'%m-%d')"
                    + ">DATE_FORMAT(FechaNacimiento, '%m-%d'),0,-1) AS EDAD FROM asociado WHERE id LIKE '%" + id + "%'";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                textfieldnombres.setText(rs.getString("Nombre"));
                textfieldapellidos.setText(rs.getString("Apellido"));
                textfieldedad.setText(rs.getString("EDAD"));
                fechas.setDatoFecha(rs.getDate("FechaNacimiento"));
                textfielddpi.setText(rs.getString("DPI"));
                textfieldresidencia.setText(rs.getString("Residencia"));
                textfieldcorreo.setText(rs.getString("CorreoElectronico"));
                textfieldperfil.setText(rs.getString("PerfilFacebook"));
                cmbtalla.setSelectedItem(rs.getString("TallaPlayera"));
                boolean activo = rs.getBoolean("Activo");
                System.out.println(activo);
                boolean genero = rs.getBoolean("Genero");
                System.out.println(genero);
                if (genero) {
                    cmbgenero1.setSelectedItem("Masculino");
                }
                if (!genero) {
                    cmbgenero1.setSelectedItem("Femenino");
                }
                if (activo) {
                    cmbactivoina.setSelectedItem("Activo");
                }
                if (!activo) {
                    cmbactivoina.setSelectedItem("No Activo");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(busquedasjf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        rSPanelsSlider1.setPanelSlider(jpeproyecto, RSPanelsSlider.DIRECT.DOWN);
        lbl_id_proyecto.setText(obtenerId());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tablebvgeneralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablebvgeneralKeyPressed


    }//GEN-LAST:event_tablebvgeneralKeyPressed

    private void tablebvgeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebvgeneralMouseClicked
        int fila = tablebvgeneral.getSelectedRow();
        String id = (String) tablebvgeneral.getValueAt(fila, 0);
        setId(id);
    }//GEN-LAST:event_tablebvgeneralMouseClicked

    private void tablebbvproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebbvproyectoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablebbvproyectoMouseClicked

    private void cmbbproyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbproyectosActionPerformed
        try {
            // TODO add your handling code here:
            Connection con = null;
            Conexion conexion;
            conexion = new Conexion();
            con = conexion.getConnection();

            String sql = "SELECT * FROM proyecto WHERE nombreProyecto LIKE '" + this.cmbbproyectos.getSelectedItem() + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            this.lblIdProyecto.setText(String.valueOf(rs.getInt("id")));
            tablebbvproyecto.setModel(busquedas.BProyecto(tablebbvproyecto, lblIdProyecto.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(busquedasjf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmbbproyectosActionPerformed

    private void setId(String id_proyecto) {
        id = id_proyecto;
    }

    private String obtenerId() {
        return id;
    }

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
            java.util.logging.Logger.getLogger(busquedasjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busquedasjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busquedasjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busquedasjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busquedasjf().setVisible(true);
            }
        });
    }

    private final SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro JTEditarProyecto;
    private javax.swing.JButton btnbeproyecto;
    private javax.swing.JButton btnbevoluntariado;
    private javax.swing.JButton btnbevoluntarios;
    private javax.swing.JButton btnbvactivosina;
    private javax.swing.JButton btnbvanio;
    private javax.swing.JButton btnbvedad;
    private javax.swing.JButton btnbvexbecarios;
    private javax.swing.JButton btnbvgenero;
    private javax.swing.JButton btnbvnombre;
    private javax.swing.JButton btnbvocupacion;
    private javax.swing.JButton btnbvprograma;
    private javax.swing.JButton btnbvpromocionbeca;
    private javax.swing.JButton btnevoluntariadog;
    private javax.swing.JButton btnguardarcambiosdp;
    private javax.swing.JButton btnguardareproyect;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnmenube;
    private javax.swing.JButton btnmenuboe;
    private javax.swing.JButton btnmenubused;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnrmenua;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbactivo;
    private javax.swing.JComboBox<String> cmbactivoina;
    private javax.swing.JComboBox<String> cmbanio;
    private javax.swing.JComboBox<String> cmbapromocion;
    private javax.swing.JComboBox<String> cmbbproyectos;
    private javax.swing.JComboBox<String> cmbbusoed;
    private rojerusan.RSComboMetro cmbedad;
    private javax.swing.JComboBox<String> cmbexbnexb;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JComboBox<String> cmbgenero1;
    private javax.swing.JComboBox<String> cmbnomproyecto;
    private javax.swing.JComboBox<String> cmbocupacion;
    private javax.swing.JComboBox<String> cmbprograma;
    private javax.swing.JComboBox<String> cmbtalla;
    private rojeru_san.componentes.RSDateChooser fechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpbbproyecto;
    private javax.swing.JPanel jpbproyecto;
    private javax.swing.JPanel jpbvoluntariado;
    private javax.swing.JPanel jpedp;
    private javax.swing.JPanel jpeproyecto;
    private javax.swing.JPanel jpevoluntariado;
    private javax.swing.JPanel jpgeneral;
    private javax.swing.JPanel jpmenua;
    private javax.swing.JPanel jpmenuboe;
    private javax.swing.JPanel jpvactivosina;
    private javax.swing.JPanel jpvanio;
    private javax.swing.JPanel jpvedad;
    private javax.swing.JPanel jpvexbnexb;
    private javax.swing.JPanel jpvgenero;
    private javax.swing.JPanel jpvocupacion;
    private javax.swing.JPanel jpvprograma;
    private javax.swing.JPanel jpvpromocionbeca;
    private javax.swing.JLabel lbbproyectos;
    private javax.swing.JLabel lbbvoluntariado;
    private javax.swing.JLabel lbedp;
    private javax.swing.JLabel lbeproyectos;
    private javax.swing.JLabel lbevoluntariado;
    private javax.swing.JLabel lbexbnexb;
    private javax.swing.JLabel lbgeneral;
    private javax.swing.JLabel lblIdProyecto;
    private javax.swing.JLabel lbl_id_asociado;
    private javax.swing.JLabel lbl_id_proyecto;
    private javax.swing.JLabel lbmenua;
    private javax.swing.JLabel lbmenuboe;
    private javax.swing.JLabel lbvanio;
    private javax.swing.JLabel lbvedad;
    private javax.swing.JLabel lbvgenero;
    private javax.swing.JLabel lbvnombre;
    private javax.swing.JLabel lbvocupacion;
    private javax.swing.JLabel lbvprograma;
    private javax.swing.JLabel lbvpromocionbeca;
    private javax.swing.JPopupMenu popInfoGen;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JScrollPane scrollbbproy;
    private javax.swing.JScrollPane scrolled;
    private javax.swing.JScrollPane scrollg;
    private javax.swing.JScrollPane scrollgai;
    private javax.swing.JScrollPane scrollge;
    private javax.swing.JScrollPane scrollgex;
    private javax.swing.JScrollPane scrollgvproy;
    private javax.swing.JScrollPane scrolln;
    private javax.swing.JScrollPane scrollocup;
    private javax.swing.JScrollPane scrollpro;
    private javax.swing.JScrollPane scrollpromo;
    private javax.swing.JScrollPane scrollveproy;
    private javax.swing.JScrollPane scrollvevol;
    private javax.swing.JScrollPane scrollvmiembros;
    private javax.swing.JScrollPane scrollvmiembros1;
    private javax.swing.JScrollPane scrollvvol;
    private rojerusan.RSTableMetro tablebbvproyecto;
    private rojerusan.RSTableMetro tablebvanioi;
    private rojerusan.RSTableMetro tablebvedad;
    private rojerusan.RSTableMetro tablebvexbecarios;
    private rojerusan.RSTableMetro tablebvgeneral;
    private rojerusan.RSTableMetro tablebvgenero;
    private rojerusan.RSTableMetro tablebvnombre;
    private rojerusan.RSTableMetro tablebvocupacion;
    private rojerusan.RSTableMetro tablebvprograma;
    private rojerusan.RSTableMetro tablebvpromo;
    private rojerusan.RSTableMetro tablevemiembros;
    private rojerusan.RSTableMetro tableveproy;
    private rojerusan.RSTableMetro tablevevol;
    private rojerusan.RSTableMetro tablevmiembros;
    private rojerusan.RSTableMetro tablevproy;
    private rojerusan.RSTableMetro tablevvol;
    private javax.swing.JTextField textfieldapellidos;
    private javax.swing.JTextField textfieldcorreo;
    private javax.swing.JTextField textfielddpi;
    private javax.swing.JTextField textfieldedad;
    private javax.swing.JTextField textfieldnombres;
    private javax.swing.JTextField textfieldperfil;
    private javax.swing.JTextField textfieldresidencia;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtavexbnexb;
    private javax.swing.JTextField txtbapellidosg;
    private javax.swing.JTextField txtbmiembros;
    private javax.swing.JTextField txtbnombreg;
    private javax.swing.JTextField txtbproyecto;
    private javax.swing.JTextField txtbvnombre;
    private javax.swing.JTextField txtbvoluntarios;
    private javax.swing.JTextField txtemiembros;
    private javax.swing.JTextField txteproyecto;
    private javax.swing.JTextField txtevoluntarios;
    private javax.swing.JTextField txtnombreproyecto;
    private javax.swing.JTextField txtnvexbnexb;
    private javax.swing.JTextField txtproyecto;
    // End of variables declaration//GEN-END:variables
}
