/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.BusquedasVoluntarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
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
ImageIcon vacinac = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vactinact1.jpg")).getImage());
ImageIcon vanio = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vanio1.jpg")).getImage());
ImageIcon vedad = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vedad1.jpg")).getImage());
ImageIcon vexbnexb = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vexbnexb1.jpg")).getImage());
ImageIcon vgenero = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vgenero1.jpg")).getImage());
ImageIcon vinfog = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vinfog1.jpg")).getImage());
ImageIcon vocupacion = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vocupacion11.jpg")).getImage());
ImageIcon vprograma = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vprograma1.jpg")).getImage());
ImageIcon vpromo = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/vpromocion1.jpg")).getImage());
    /**
     * Creates new form busquedasjf
     */
    private BusquedasVoluntarios busquedas;
    private Boolean activo=true;
    public busquedasjf() {
        busquedas = new BusquedasVoluntarios();
        initComponents();
        transparencia();
        tablebvnombre.setModel(busquedas.BNombre("", tablebvnombre, "",true));
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        transparencia();
        if ((tamanio.width == 1920) && (tamanio.height == 1080)) {
            this.setSize(1560, 880);
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
        }

    }
    public void transparencia()
    {
        cmbbusoed.setBackground(new Color(0,0,0,0));
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
        txtbvnombre.setBackground(new Color(0,0,0,0));
        txtApellido.setBackground(new Color(0,0,0,0));
        cmbactivo.setBackground(new Color(0,0,0,0));
        txtbapellidosg.setBackground(new Color(0,0,0,0));
        txtbnombreg.setBackground(new Color(0,0,0,0));
        txtnvexbnexb.setBackground(new Color(0,0,0,0));
        cmbexbnexb.setBackground(new Color(0,0,0,0));
        cmbgenero.setBackground(new Color(0,0,0,0));
        cmbedad.setBackground(new Color(0,0,0,0));
        cmbanio.setBackground(new Color(0,0,0,0));
        cmbprograma.setBackground(new Color(0,0,0,0));
        cmbapromocion.setBackground(new Color(0,0,0,0));
        cmbocupacion.setBackground(new Color(0,0,0,0));
        cmbbproyectos.setBackground(new Color(0,0,0,0));
        txtbmiembros.setBackground(new Color(0,0,0,0));
        txtbproyecto.setBackground(new Color(0,0,0,0));
        txtbvoluntarios.setBackground(new Color(0,0,0,0));
        txtemiembros.setBackground(new Color(0,0,0,0));
        txteproyecto.setBackground(new Color(0,0,0,0));
        txtevoluntarios.setBackground(new Color(0,0,0,0));
        txtedescripcion.setBackground(new Color(0,0,0,0));
        cmbproyecto.setBackground(new Color(0,0,0,0));
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
        jsbvnombre = new javax.swing.JScrollPane();
        tablebvnombre = new javax.swing.JTable();
        cmbactivo = new javax.swing.JComboBox<>();
        lbvnombre = new javax.swing.JLabel();
        jpgeneral = new javax.swing.JPanel();
        txtbapellidosg = new javax.swing.JTextField();
        jsbvactivos = new javax.swing.JScrollPane();
        tablebvactivos = new javax.swing.JTable();
        txtbnombreg = new javax.swing.JTextField();
        lbgeneral = new javax.swing.JLabel();
        jpvexbnexb = new javax.swing.JPanel();
        txtnvexbnexb = new javax.swing.JTextField();
        jsbvinactivos = new javax.swing.JScrollPane();
        tablebvinactivos = new javax.swing.JTable();
        txtavexbnexb = new javax.swing.JTextField();
        cmbexbnexb = new javax.swing.JComboBox<>();
        lbexbnexb = new javax.swing.JLabel();
        jpvanio = new javax.swing.JPanel();
        jsbvanio = new javax.swing.JScrollPane();
        tablebvanio = new javax.swing.JTable();
        cmbanio = new javax.swing.JComboBox<>();
        lbvanio = new javax.swing.JLabel();
        jpvedad = new javax.swing.JPanel();
        jsbvedad = new javax.swing.JScrollPane();
        tablebvedad = new javax.swing.JTable();
        cmbedad = new javax.swing.JComboBox<>();
        lbvedad = new javax.swing.JLabel();
        jpvgenero = new javax.swing.JPanel();
        jsbvgenero = new javax.swing.JScrollPane();
        tablebvgenero = new javax.swing.JTable();
        cmbgenero = new javax.swing.JComboBox<>();
        lbvgenero = new javax.swing.JLabel();
        jpvprograma = new javax.swing.JPanel();
        jsbvprograma = new javax.swing.JScrollPane();
        tablebvprograma = new javax.swing.JTable();
        cmbprograma = new javax.swing.JComboBox<>();
        lbvprograma = new javax.swing.JLabel();
        jpvpromocionbeca = new javax.swing.JPanel();
        jsbvpromocionbeca = new javax.swing.JScrollPane();
        tablebvpromocionbeca = new javax.swing.JTable();
        cmbapromocion = new javax.swing.JComboBox<>();
        lbvpromocionbeca = new javax.swing.JLabel();
        jpvocupacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebvocupacion = new javax.swing.JTable();
        cmbocupacion = new javax.swing.JComboBox<>();
        lbvocupacion = new javax.swing.JLabel();
        jpbproyecto = new javax.swing.JPanel();
        cmbbproyectos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablebproyectos = new javax.swing.JTable();
        lbbproyectos = new javax.swing.JLabel();
        jpbvoluntariado = new javax.swing.JPanel();
        txtbmiembros = new javax.swing.JTextField();
        txtbproyecto = new javax.swing.JTextField();
        txtbvoluntarios = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblmiembros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblproyecto = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblvoluntarios = new javax.swing.JTable();
        lbbvoluntariado = new javax.swing.JLabel();
        jpevoluntariado = new javax.swing.JPanel();
        txtemiembros = new javax.swing.JTextField();
        txteproyecto = new javax.swing.JTextField();
        txtevoluntarios = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbemiembros = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbeproyecto = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbevoluntarios = new javax.swing.JTable();
        btnevoluntariadog = new javax.swing.JButton();
        btnmenuboe = new javax.swing.JButton();
        lbevoluntariado = new javax.swing.JLabel();
        jpeproyecto = new javax.swing.JPanel();
        btnmenubused = new javax.swing.JButton();
        btnguardareproyect = new javax.swing.JButton();
        cmbproyecto = new javax.swing.JComboBox<>();
        txtedescripcion = new javax.swing.JTextField();
        lbeproyectos = new javax.swing.JLabel();

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
        jpmenuboe.add(btnbevoluntarios);
        btnbevoluntarios.setBounds(250, 360, 170, 130);

        btnbeproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Construction_70px_1.png"))); // NOI18N
        btnbeproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbeproyectoMouseClicked(evt);
            }
        });
        jpmenuboe.add(btnbeproyecto);
        btnbeproyecto.setBounds(550, 360, 170, 130);

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
        txtbvnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbvnombreKeyPressed(evt);
            }
        });
        jpvactivosina.add(txtbvnombre);
        txtbvnombre.setBounds(310, 180, 340, 40);

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });
        jpvactivosina.add(txtApellido);
        txtApellido.setBounds(310, 250, 340, 40);

        tablebvnombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DPI", "Email", "Genero", "Fecha de nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jsbvnombre.setViewportView(tablebvnombre);
        if (tablebvnombre.getColumnModel().getColumnCount() > 0) {
            tablebvnombre.getColumnModel().getColumn(0).setResizable(false);
            tablebvnombre.getColumnModel().getColumn(1).setResizable(false);
            tablebvnombre.getColumnModel().getColumn(3).setResizable(false);
            tablebvnombre.getColumnModel().getColumn(4).setResizable(false);
            tablebvnombre.getColumnModel().getColumn(5).setResizable(false);
        }

        jpvactivosina.add(jsbvnombre);
        jsbvnombre.setBounds(100, 320, 1050, 320);

        cmbactivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmbactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbactivoActionPerformed(evt);
            }
        });
        jpvactivosina.add(cmbactivo);
        cmbactivo.setBounds(850, 220, 190, 30);

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
        txtbapellidosg.setText("jTextField1");
        jpgeneral.add(txtbapellidosg);
        txtbapellidosg.setBounds(310, 230, 410, 40);

        tablebvactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvactivos.setViewportView(tablebvactivos);

        jpgeneral.add(jsbvactivos);
        jsbvactivos.setBounds(100, 300, 1050, 350);

        txtbnombreg.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbnombreg.setText("jTextField1");
        jpgeneral.add(txtbnombreg);
        txtbnombreg.setBounds(310, 170, 410, 40);

        lbgeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vinfog2.jpg"))); // NOI18N
        jpgeneral.add(lbgeneral);
        lbgeneral.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpgeneral, "card4");

        jpvexbnexb.setName("jpvexbnexb"); // NOI18N
        jpvexbnexb.setLayout(null);

        txtnvexbnexb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtnvexbnexb.setText("jTextField1");
        jpvexbnexb.add(txtnvexbnexb);
        txtnvexbnexb.setBounds(300, 180, 350, 50);

        tablebvinactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvinactivos.setViewportView(tablebvinactivos);

        jpvexbnexb.add(jsbvinactivos);
        jsbvinactivos.setBounds(100, 320, 1050, 320);

        txtavexbnexb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtavexbnexb.setText("jTextField1");
        jpvexbnexb.add(txtavexbnexb);
        txtavexbnexb.setBounds(300, 250, 350, 50);

        cmbexbnexb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbexbnexb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvexbnexb.add(cmbexbnexb);
        cmbexbnexb.setBounds(840, 220, 210, 40);

        lbexbnexb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vexbnb2.jpg"))); // NOI18N
        jpvexbnexb.add(lbexbnexb);
        lbexbnexb.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvexbnexb, "card5");

        jpvanio.setName("jpvanio"); // NOI18N
        jpvanio.setLayout(null);

        tablebvanio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvanio.setViewportView(tablebvanio);

        jpvanio.add(jsbvanio);
        jsbvanio.setBounds(100, 260, 1050, 390);

        cmbanio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvanio.add(cmbanio);
        cmbanio.setBounds(240, 200, 200, 40);

        lbvanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vanio2.jpeg"))); // NOI18N
        jpvanio.add(lbvanio);
        lbvanio.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvanio, "card8");

        jpvedad.setName("jpvedad"); // NOI18N
        jpvedad.setLayout(null);

        tablebvedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvedad.setViewportView(tablebvedad);

        jpvedad.add(jsbvedad);
        jsbvedad.setBounds(100, 260, 1050, 380);

        cmbedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvedad.add(cmbedad);
        cmbedad.setBounds(250, 180, 200, 40);

        lbvedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbvedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vedad2.jpg"))); // NOI18N
        jpvedad.add(lbvedad);
        lbvedad.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvedad, "card9");

        jpvgenero.setName("jpvgenero"); // NOI18N
        jpvgenero.setLayout(null);

        tablebvgenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvgenero.setViewportView(tablebvgenero);

        jpvgenero.add(jsbvgenero);
        jsbvgenero.setBounds(100, 250, 1050, 390);

        cmbgenero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvgenero.add(cmbgenero);
        cmbgenero.setBounds(250, 180, 260, 30);

        lbvgenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vgenero2.jpg"))); // NOI18N
        jpvgenero.add(lbvgenero);
        lbvgenero.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvgenero, "card10");

        jpvprograma.setName("jpvprograma"); // NOI18N
        jpvprograma.setLayout(null);

        tablebvprograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvprograma.setViewportView(tablebvprograma);

        jpvprograma.add(jsbvprograma);
        jsbvprograma.setBounds(100, 250, 1050, 380);

        cmbprograma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbprograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvprograma.add(cmbprograma);
        cmbprograma.setBounds(310, 190, 340, 50);

        lbvprograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vprograma2.jpg"))); // NOI18N
        jpvprograma.add(lbvprograma);
        lbvprograma.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvprograma, "card11");

        jpvpromocionbeca.setName("jpvpromocionbeca"); // NOI18N
        jpvpromocionbeca.setLayout(null);

        tablebvpromocionbeca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jsbvpromocionbeca.setViewportView(tablebvpromocionbeca);

        jpvpromocionbeca.add(jsbvpromocionbeca);
        jsbvpromocionbeca.setBounds(100, 260, 1050, 380);

        cmbapromocion.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        cmbapromocion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvpromocionbeca.add(cmbapromocion);
        cmbapromocion.setBounds(370, 180, 210, 40);

        lbvpromocionbeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vpromocion2.jpg"))); // NOI18N
        jpvpromocionbeca.add(lbvpromocionbeca);
        lbvpromocionbeca.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvpromocionbeca, "card12");

        jpvocupacion.setName("jpvocupacion"); // NOI18N
        jpvocupacion.setLayout(null);

        tablebvocupacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablebvocupacion);

        jpvocupacion.add(jScrollPane1);
        jScrollPane1.setBounds(100, 270, 1050, 380);

        cmbocupacion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        cmbocupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpvocupacion.add(cmbocupacion);
        cmbocupacion.setBounds(300, 180, 420, 40);

        lbvocupacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/vocupacion2.jpg"))); // NOI18N
        jpvocupacion.add(lbvocupacion);
        lbvocupacion.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpvocupacion, "card13");

        jpbproyecto.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpbproyecto.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpbproyecto.setName("jpbproyecto"); // NOI18N
        jpbproyecto.setLayout(null);

        cmbbproyectos.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jpbproyecto.add(cmbbproyectos);
        cmbbproyectos.setBounds(310, 200, 320, 30);

        jtablebproyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtablebproyectos);

        jpbproyecto.add(jScrollPane2);
        jScrollPane2.setBounds(110, 260, 1030, 380);

        lbbproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/proyectos2.jpg"))); // NOI18N
        jpbproyecto.add(lbbproyectos);
        lbbproyectos.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpbproyecto, "card13");

        jpbvoluntariado.setMaximumSize(new java.awt.Dimension(1566, 880));
        jpbvoluntariado.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpbvoluntariado.setName("jpbvoluntariado"); // NOI18N
        jpbvoluntariado.setLayout(null);

        txtbmiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbmiembros.setText("jTextField1");
        jpbvoluntariado.add(txtbmiembros);
        txtbmiembros.setBounds(230, 405, 370, 40);

        txtbproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbproyecto.setText("jTextField1");
        jpbvoluntariado.add(txtbproyecto);
        txtbproyecto.setBounds(200, 110, 400, 40);

        txtbvoluntarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvoluntarios.setText("jTextField1");
        jpbvoluntariado.add(txtbvoluntarios);
        txtbvoluntarios.setBounds(830, 110, 370, 40);

        tblmiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblmiembros);

        jpbvoluntariado.add(jScrollPane3);
        jScrollPane3.setBounds(50, 460, 550, 210);

        tblproyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblproyecto);

        jpbvoluntariado.add(jScrollPane4);
        jScrollPane4.setBounds(50, 170, 550, 210);

        tblvoluntarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblvoluntarios);

        jpbvoluntariado.add(jScrollPane5);
        jScrollPane5.setBounds(640, 170, 560, 210);

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
        txtemiembros.setText("jTextField1");
        jpevoluntariado.add(txtemiembros);
        txtemiembros.setBounds(230, 405, 370, 40);

        txteproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txteproyecto.setText("jTextField1");
        jpevoluntariado.add(txteproyecto);
        txteproyecto.setBounds(200, 110, 400, 40);

        txtevoluntarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtevoluntarios.setText("jTextField1");
        jpevoluntariado.add(txtevoluntarios);
        txtevoluntarios.setBounds(830, 110, 370, 40);

        tbemiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tbemiembros);

        jpevoluntariado.add(jScrollPane6);
        jScrollPane6.setBounds(50, 460, 550, 210);

        tbeproyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tbeproyecto);

        jpevoluntariado.add(jScrollPane7);
        jScrollPane7.setBounds(50, 170, 550, 210);

        tbevoluntarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tbevoluntarios);

        jpevoluntariado.add(jScrollPane8);
        jScrollPane8.setBounds(640, 170, 560, 210);

        btnevoluntariadog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnevoluntariadog.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        jpevoluntariado.add(btnevoluntariadog);
        btnevoluntariadog.setBounds(750, 490, 150, 100);

        btnmenuboe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnmenuboe.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        jpevoluntariado.add(btnmenuboe);
        btnmenuboe.setBounds(970, 500, 160, 100);

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

        cmbproyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpeproyecto.add(cmbproyecto);
        cmbproyecto.setBounds(80, 250, 720, 30);

        txtedescripcion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtedescripcion.setText("jTextField1");
        jpeproyecto.add(txtedescripcion);
        txtedescripcion.setBounds(80, 380, 710, 260);

        lbeproyectos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbeproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/busquedas/edproyectos2.jpg"))); // NOI18N
        jpeproyecto.add(lbeproyectos);
        lbeproyectos.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpeproyecto, "card16");

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
        rSPanelsSlider1.setPanelSlider(jpvexbnexb, RSPanelsSlider.DIRECT.RIGHT);
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
        rSPanelsSlider1.setPanelSlider(jpmenua, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnhomedpActionPerformed

    private void btnminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarActionPerformed

    private void btnrmenuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmenuaActionPerformed
        rSPanelsSlider1.setPanelSlider(jpmenua, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnrmenuaActionPerformed

    private void txtbvnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbvnombreKeyPressed
        String act=(String)cmbactivo.getSelectedItem();
        if(act.equals("Activo"))
            activo=true;
        else
            activo=false;
            
        tablebvnombre.setModel(busquedas.BNombre(txtbvnombre.getText(), tablebvnombre, txtApellido.getText(),activo));
    }//GEN-LAST:event_txtbvnombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        String act=(String)cmbactivo.getSelectedItem();
        activo = act.equals("Activo");
        tablebvnombre.setModel(busquedas.BNombre(txtbvnombre.getText(), tablebvnombre, txtApellido.getText(),activo));
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void cmbactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbactivoActionPerformed
        String act=(String)cmbactivo.getSelectedItem();
        activo = act.equals("Activo");
        tablebvnombre.setModel(busquedas.BNombre(txtbvnombre.getText(), tablebvnombre, txtApellido.getText(),activo));
    }//GEN-LAST:event_cmbactivoActionPerformed

    private void btnbevoluntariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbevoluntariosMouseClicked
        if(cmbbusoed.getSelectedItem().equals("Buscar") )
        {
                 rSPanelsSlider1.setPanelSlider(jpmenua, RSPanelsSlider.DIRECT.DOWN);
        }
        else if(cmbbusoed.getSelectedItem().equals("Editar"))
        {
                 rSPanelsSlider1.setPanelSlider(jpgeneral, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnbevoluntariosMouseClicked

    private void btnbeproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbeproyectoMouseClicked
        rSPanelsSlider1.setPanelSlider(jpbproyecto, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_btnbeproyectoMouseClicked

    private void btnbevoluntariadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbevoluntariadoMouseClicked
                if(cmbbusoed.getSelectedItem().equals("Buscar") )
        {
                 rSPanelsSlider1.setPanelSlider(jpbvoluntariado, RSPanelsSlider.DIRECT.DOWN);
        }
        else if(cmbbusoed.getSelectedItem().equals("Editar"))
        {
                 rSPanelsSlider1.setPanelSlider(jpevoluntariado, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnbevoluntariadoMouseClicked

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        rSPanelsSlider1.setPanelSlider(jpmenuboe, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnregresarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton btnguardareproyect;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnmenuboe;
    private javax.swing.JButton btnmenubused;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnrmenua;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbactivo;
    private javax.swing.JComboBox<String> cmbanio;
    private javax.swing.JComboBox<String> cmbapromocion;
    private javax.swing.JComboBox<String> cmbbproyectos;
    private javax.swing.JComboBox<String> cmbbusoed;
    private javax.swing.JComboBox<String> cmbedad;
    private javax.swing.JComboBox<String> cmbexbnexb;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JComboBox<String> cmbocupacion;
    private javax.swing.JComboBox<String> cmbprograma;
    private javax.swing.JComboBox<String> cmbproyecto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel jpbproyecto;
    private javax.swing.JPanel jpbvoluntariado;
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
    private javax.swing.JScrollPane jsbvactivos;
    private javax.swing.JScrollPane jsbvanio;
    private javax.swing.JScrollPane jsbvedad;
    private javax.swing.JScrollPane jsbvgenero;
    private javax.swing.JScrollPane jsbvinactivos;
    private javax.swing.JScrollPane jsbvnombre;
    private javax.swing.JScrollPane jsbvprograma;
    private javax.swing.JScrollPane jsbvpromocionbeca;
    private javax.swing.JTable jtablebproyectos;
    private javax.swing.JLabel lbbproyectos;
    private javax.swing.JLabel lbbvoluntariado;
    private javax.swing.JLabel lbeproyectos;
    private javax.swing.JLabel lbevoluntariado;
    private javax.swing.JLabel lbexbnexb;
    private javax.swing.JLabel lbgeneral;
    private javax.swing.JLabel lbmenua;
    private javax.swing.JLabel lbmenuboe;
    private javax.swing.JLabel lbvanio;
    private javax.swing.JLabel lbvedad;
    private javax.swing.JLabel lbvgenero;
    private javax.swing.JLabel lbvnombre;
    private javax.swing.JLabel lbvocupacion;
    private javax.swing.JLabel lbvprograma;
    private javax.swing.JLabel lbvpromocionbeca;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTable tablebvactivos;
    private javax.swing.JTable tablebvanio;
    private javax.swing.JTable tablebvedad;
    private javax.swing.JTable tablebvgenero;
    private javax.swing.JTable tablebvinactivos;
    private javax.swing.JTable tablebvnombre;
    private javax.swing.JTable tablebvocupacion;
    private javax.swing.JTable tablebvprograma;
    private javax.swing.JTable tablebvpromocionbeca;
    private javax.swing.JTable tbemiembros;
    private javax.swing.JTable tbeproyecto;
    private javax.swing.JTable tbevoluntarios;
    private javax.swing.JTable tblmiembros;
    private javax.swing.JTable tblproyecto;
    private javax.swing.JTable tblvoluntarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtavexbnexb;
    private javax.swing.JTextField txtbapellidosg;
    private javax.swing.JTextField txtbmiembros;
    private javax.swing.JTextField txtbnombreg;
    private javax.swing.JTextField txtbproyecto;
    private javax.swing.JTextField txtbvnombre;
    private javax.swing.JTextField txtbvoluntarios;
    private javax.swing.JTextField txtedescripcion;
    private javax.swing.JTextField txtemiembros;
    private javax.swing.JTextField txteproyecto;
    private javax.swing.JTextField txtevoluntarios;
    private javax.swing.JTextField txtnvexbnexb;
    // End of variables declaration//GEN-END:variables
}
