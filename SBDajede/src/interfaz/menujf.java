/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.ImpresionReportes;
import Clases.Proyecto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class menujf extends javax.swing.JFrame {

    ImageIcon menua1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/menuat1.jpg")).getImage());
    ImageIcon menu = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/menuprincipalv2t1.jpg")).getImage());
    ImageIcon menur = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/busquedas/mrreportes1.jpg")).getImage());
    private final Proyecto proyecto;
    private int IDproyecto;
    private ArrayList<Integer> listaPuestos;
    private ArrayList<Integer> listaIdmiembros;
    private ArrayList<Integer> listaBorrado;
    private final ImpresionReportes reportes;

    /**
     * Creates new form menujf
     */
    public menujf() {
        reportes = new ImpresionReportes();
        proyecto = new Proyecto();

        initComponents();
        tableproyecto.setModel(proyecto.Proyectos("", tableproyecto));
        cmbPuestos.setModel(proyecto.puestos());
        cmbEdades.setModel(proyecto.getEdades());
        cmbAnios.setModel(proyecto.AnioInicio());
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        transparencia();
        if ((tamanio.width == 1920) && (tamanio.height == 1080)) {
            this.setSize(1560, 880);
            jPanel1.setSize(1565, 880);
            rSPanelsSlider1.setSize(1565, 880);
            menuprincipal.setSize(1565, 880);
            lbmenuprincipal.setSize(1565, 880);
            lbmenuprincipal.setIcon(menu);
            this.setLocationRelativeTo(null);
            btnagregar.setLocation(260, 405);
            btnbuscar.setLocation(680, 405);
            btnreportes.setLocation(1075, 405);
            btnminimizarmenu.setLocation(1410, 5);
            btnsalirdmenu.setLocation(1480, 5);
            btnhome.setLocation(1340, 5);
            btnregresar.setLocation(1270, 5);
            menuagregar.setSize(1565, 880);
            lbmenuagregar.setSize(1565, 880);
            lbmenuagregar.setIcon(menua1);
            btnagregarvoluntario.setLocation(345, 440);
            btnagregarproyecto.setLocation(685, 440);
            btnagregarvoluntariado.setLocation(1055, 440);
            jpmreportes.setSize(1565, 880);
            lbmreportes.setSize(1565, 880);
            lbmreportes.setIcon(menur);
            btnrgeneral.setLocation(95, 120);
            btnractivos.setLocation(370, 120);
            btnrproyectos.setLocation(640, 120);
            btnredad.setLocation(95, 380);
            btnrporanio.setLocation(365, 380);
            btnrgenero.setLocation(630, 380);
            btnrexbecario.setLocation(905, 250);
            btnrprograma.setLocation(95, 650);
            btnrtrabajando.setLocation(375, 650);
            btnrnivelest.setLocation(630, 650);
            btnrnoexbecarios.setLocation(905, 540);
            btnrpromocion.setLocation(1140, 420);
            btnrmenu.setLocation(1355, 615);
        }
    }

    //Insertar proyecto
    public void Proyecto() {
        String nombre = txtnombreproyecto.getText();
        String descripcion = txtdescripcionp.getText();
        if (proyecto.insertarProyecto(nombre, descripcion)) {
            JOptionPane.showMessageDialog(null, "Proyecto ingresado correctamente");
        }

    }

    public void transparencia() {
        btnagregar.setOpaque(false);
        btnagregar.setContentAreaFilled(false);
        btnagregar.setBorderPainted(false);
        btnbuscar.setOpaque(false);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setBorderPainted(false);
        btnreportes.setOpaque(false);
        btnreportes.setContentAreaFilled(false);
        btnreportes.setBorderPainted(false);
        btnsalirdmenu.setOpaque(false);
        btnsalirdmenu.setContentAreaFilled(false);
        btnsalirdmenu.setBorderPainted(false);
        btnminimizarmenu.setOpaque(false);
        btnminimizarmenu.setContentAreaFilled(false);
        btnminimizarmenu.setBorderPainted(false);
        btnagregarvoluntario.setOpaque(false);
        btnagregarvoluntario.setContentAreaFilled(false);
        btnagregarvoluntario.setBorderPainted(false);
        btnagregarproyecto.setOpaque(false);
        btnagregarproyecto.setContentAreaFilled(false);
        btnagregarproyecto.setBorderPainted(false);
        btnagregarvoluntariado.setOpaque(false);
        btnagregarvoluntariado.setContentAreaFilled(false);
        btnagregarvoluntariado.setBorderPainted(false);
        txtnombreproyecto.setBackground(new Color(0, 0, 0, 0));
        txtdescripcionp.setBackground(new Color(0, 0, 0, 0));
        btnaddproyecto.setOpaque(false);
        btnaddproyecto.setContentAreaFilled(false);
        btnaddproyecto.setBorderPainted(false);
        btnguardarproyecto.setOpaque(false);
        btnguardarproyecto.setContentAreaFilled(false);
        btnguardarproyecto.setBorderPainted(false);
        btnmenu.setOpaque(false);
        btnmenu.setContentAreaFilled(false);
        btnmenu.setBorderPainted(false);
        btnrmenu.setOpaque(false);
        btnrmenu.setContentAreaFilled(false);
        btnrmenu.setBorderPainted(false);
        btnrgeneral.setOpaque(false);
        btnrgeneral.setContentAreaFilled(false);
        btnrgeneral.setBorderPainted(false);
        btnractivos.setOpaque(false);
        btnractivos.setContentAreaFilled(false);
        btnractivos.setBorderPainted(false);
        btnrproyectos.setOpaque(false);
        btnrproyectos.setContentAreaFilled(false);
        btnrproyectos.setBorderPainted(false);
        btnredad.setOpaque(false);
        btnredad.setContentAreaFilled(false);
        btnredad.setBorderPainted(false);
        btnrporanio.setOpaque(false);
        btnrporanio.setContentAreaFilled(false);
        btnrporanio.setBorderPainted(false);
        btnrgenero.setOpaque(false);
        btnrgenero.setContentAreaFilled(false);
        btnrgenero.setBorderPainted(false);
        btnrexbecario.setOpaque(false);
        btnrexbecario.setContentAreaFilled(false);
        btnrexbecario.setBorderPainted(false);
        btnrnoexbecarios.setOpaque(false);
        btnrnoexbecarios.setContentAreaFilled(false);
        btnrnoexbecarios.setBorderPainted(false);
        btnrprograma.setOpaque(false);
        btnrprograma.setContentAreaFilled(false);
        btnrprograma.setBorderPainted(false);
        btnguardarvoluntariado.setOpaque(false);
        btnguardarvoluntariado.setContentAreaFilled(false);
        btnguardarvoluntariado.setBorderPainted(false);
        btnmenuv.setOpaque(false);
        btnmenuv.setContentAreaFilled(false);
        btnmenuv.setBorderPainted(false);
        btnrtrabajando.setOpaque(false);
        btnrtrabajando.setContentAreaFilled(false);
        btnrtrabajando.setBorderPainted(false);
        btnrnivelest.setOpaque(false);
        btnrnivelest.setContentAreaFilled(false);
        btnrnivelest.setBorderPainted(false);
        btnrpromocion.setOpaque(false);
        btnrpromocion.setContentAreaFilled(false);
        btnrpromocion.setBorderPainted(false);
        btnregresar.setOpaque(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.setBorderPainted(false);
        btnhome.setOpaque(false);
        btnhome.setContentAreaFilled(false);
        btnhome.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PMProyecto = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        MIProyecto = new javax.swing.JMenuItem();
        PMVoluntariado = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        MIVoluntarios = new javax.swing.JMenuItem();
        PMMiembro = new javax.swing.JPopupMenu();
        jMenu2 = new javax.swing.JMenu();
        MIMiembro = new javax.swing.JMenuItem();
        MICambiarProyecto = new javax.swing.JMenuItem();
        MIPuestos = new javax.swing.JMenuItem();
        cmbPuestos = new rojerusan.RSComboMetro();
        cmbGenero = new rojerusan.RSComboMetro();
        cmbA_I = new rojerusan.RSComboMetro();
        cmbEdades = new rojerusan.RSComboMetro();
        cmbAnios = new rojerusan.RSComboMetro();
        jPanel1 = new javax.swing.JPanel();
        btnminimizarmenu = new javax.swing.JButton();
        btnsalirdmenu = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        menuprincipal = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnreportes = new javax.swing.JButton();
        lbmenuprincipal = new javax.swing.JLabel();
        menuagregar = new javax.swing.JPanel();
        btnagregarvoluntario = new javax.swing.JButton();
        btnagregarproyecto = new javax.swing.JButton();
        btnagregarvoluntariado = new javax.swing.JButton();
        lbmenuagregar = new javax.swing.JLabel();
        jpagregarproyecto = new javax.swing.JPanel();
        txtnombreproyecto = new javax.swing.JTextField();
        txtdescripcionp = new javax.swing.JTextField();
        btnaddproyecto = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnguardarproyecto = new javax.swing.JButton();
        lbproyectos = new javax.swing.JLabel();
        jpvoluntariadom = new javax.swing.JPanel();
        btnguardarvoluntariado = new javax.swing.JButton();
        btnmenuv = new javax.swing.JButton();
        txtproyecto = new javax.swing.JTextField();
        txtvoluntarios = new javax.swing.JTextField();
        txtmiembros = new javax.swing.JTextField();
        txtProyectoSelect = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        scrollvmiembros = new javax.swing.JScrollPane();
        tablemiembros = new rojerusan.RSTableMetro();
        scrollvevol = new javax.swing.JScrollPane();
        tablevoluntarios = new rojerusan.RSTableMetro();
        scrollveproy = new javax.swing.JScrollPane();
        tableproyecto = new rojerusan.RSTableMetro();
        lbvoluntariadom = new javax.swing.JLabel();
        jpmreportes = new javax.swing.JPanel();
        btnrmenu = new javax.swing.JButton();
        btnractivos = new javax.swing.JButton();
        btnrproyectos = new javax.swing.JButton();
        btnredad = new javax.swing.JButton();
        btnrporanio = new javax.swing.JButton();
        btnrgenero = new javax.swing.JButton();
        btnrexbecario = new javax.swing.JButton();
        btnrprograma = new javax.swing.JButton();
        btnrtrabajando = new javax.swing.JButton();
        btnrnivelest = new javax.swing.JButton();
        btnrnoexbecarios = new javax.swing.JButton();
        btnrpromocion = new javax.swing.JButton();
        btnrgeneral = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbmreportes = new javax.swing.JLabel();

        PMProyecto.setToolTipText("");
        PMProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu1.setText("Opciones");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MIProyecto.setText("Seleccionar Proyecto");
        MIProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MIProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(MIProyecto);

        PMProyecto.add(jMenu1);

        jMenu3.setText("Opciones");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MIVoluntarios.setText("Agregar miembro");
        MIVoluntarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MIVoluntarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIVoluntariosActionPerformed(evt);
            }
        });
        jMenu3.add(MIVoluntarios);

        PMVoluntariado.add(jMenu3);

        jMenu2.setText("Opciones");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MIMiembro.setText("Remover Miembro");
        MIMiembro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MIMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIMiembroActionPerformed(evt);
            }
        });
        jMenu2.add(MIMiembro);

        MICambiarProyecto.setText("Cambiar Proyecto");
        MICambiarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MICambiarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICambiarProyectoActionPerformed(evt);
            }
        });
        jMenu2.add(MICambiarProyecto);

        MIPuestos.setText("Asignar puesto");
        MIPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIPuestosActionPerformed(evt);
            }
        });
        jMenu2.add(MIPuestos);

        PMMiembro.add(jMenu2);

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino", "Ambos" }));

        cmbA_I.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo", "Ambos" }));

        cmbEdades.setMaximumRowCount(4);

        cmbAnios.setMaximumRowCount(4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1565, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(null);

        btnminimizarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_30px_1.png"))); // NOI18N
        btnminimizarmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_70px.png"))); // NOI18N
        btnminimizarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimizarmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnminimizarmenu);
        btnminimizarmenu.setBounds(1069, 10, 90, 70);

        btnsalirdmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_30px.png"))); // NOI18N
        btnsalirdmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_70px.png"))); // NOI18N
        btnsalirdmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirdmenuMouseClicked(evt);
            }
        });
        jPanel1.add(btnsalirdmenu);
        btnsalirdmenu.setBounds(1160, 10, 80, 70);

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Back_30px.png"))); // NOI18N
        btnregresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Back_70px.png"))); // NOI18N
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar);
        btnregresar.setBounds(900, 10, 80, 70);

        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_30px.png"))); // NOI18N
        btnhome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px_1.png"))); // NOI18N
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomedpActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome);
        btnhome.setBounds(985, 10, 80, 70);

        rSPanelsSlider1.setMaximumSize(new java.awt.Dimension(1565, 880));
        rSPanelsSlider1.setMinimumSize(new java.awt.Dimension(1250, 700));
        rSPanelsSlider1.setPreferredSize(new java.awt.Dimension(1250, 700));

        menuprincipal.setName("menuprincipal"); // NOI18N
        menuprincipal.setPreferredSize(new java.awt.Dimension(1250, 700));
        menuprincipal.setLayout(null);

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Add_File_70px.png"))); // NOI18N
        btnagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregar.setName("btnagregar"); // NOI18N
        btnagregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Add_File_100px.png"))); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        menuprincipal.add(btnagregar);
        btnagregar.setBounds(190, 300, 210, 190);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Search_70px.png"))); // NOI18N
        btnbuscar.setName("btnbuscar"); // NOI18N
        btnbuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Search_100px.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        menuprincipal.add(btnbuscar);
        btnbuscar.setBounds(520, 310, 210, 170);

        btnreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Edit_Property_70px.png"))); // NOI18N
        btnreportes.setName("btnreportes"); // NOI18N
        btnreportes.setPreferredSize(new java.awt.Dimension(150, 25));
        btnreportes.setRequestFocusEnabled(false);
        btnreportes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Edit_Property_100px.png"))); // NOI18N
        btnreportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreportesMouseClicked(evt);
            }
        });
        btnreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesActionPerformed(evt);
            }
        });
        menuprincipal.add(btnreportes);
        btnreportes.setBounds(840, 310, 240, 180);

        lbmenuprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/menuprincipalv2t2.jpg"))); // NOI18N
        lbmenuprincipal.setRequestFocusEnabled(false);
        menuprincipal.add(lbmenuprincipal);
        lbmenuprincipal.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(menuprincipal, "card2");

        menuagregar.setMaximumSize(new java.awt.Dimension(1565, 880));
        menuagregar.setMinimumSize(new java.awt.Dimension(1250, 700));
        menuagregar.setName("menuagregar"); // NOI18N
        menuagregar.setPreferredSize(new java.awt.Dimension(1250, 700));
        menuagregar.setLayout(null);

        btnagregarvoluntario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Add_User_Male_70px_1.png"))); // NOI18N
        btnagregarvoluntario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Add_User_Male_100px.png"))); // NOI18N
        btnagregarvoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarvoluntarioActionPerformed(evt);
            }
        });
        menuagregar.add(btnagregarvoluntario);
        btnagregarvoluntario.setBounds(270, 330, 150, 140);

        btnagregarproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Construction_70px_1.png"))); // NOI18N
        btnagregarproyecto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Construction_100px_1.png"))); // NOI18N
        btnagregarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarproyectoActionPerformed(evt);
            }
        });
        menuagregar.add(btnagregarproyecto);
        btnagregarproyecto.setBounds(540, 320, 190, 140);

        btnagregarvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Hand_70px.png"))); // NOI18N
        btnagregarvoluntariado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Hand_100px.png"))); // NOI18N
        btnagregarvoluntariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarvoluntariadoActionPerformed(evt);
            }
        });
        menuagregar.add(btnagregarvoluntariado);
        btnagregarvoluntariado.setBounds(830, 320, 160, 150);

        lbmenuagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/menu2tam2.jpg"))); // NOI18N
        menuagregar.add(lbmenuagregar);
        lbmenuagregar.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(menuagregar, "card3");

        jpagregarproyecto.setName("jpagregarproyecto"); // NOI18N
        jpagregarproyecto.setLayout(null);

        txtnombreproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtnombreproyecto.setText("Ejemplo");
        jpagregarproyecto.add(txtnombreproyecto);
        txtnombreproyecto.setBounds(80, 245, 710, 40);

        txtdescripcionp.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtdescripcionp.setText("El objetivo del proyecto es.....");
        jpagregarproyecto.add(txtdescripcionp);
        txtdescripcionp.setBounds(80, 380, 710, 260);

        btnaddproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Plus_50px.png"))); // NOI18N
        btnaddproyecto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Plus_75px.png"))); // NOI18N
        jpagregarproyecto.add(btnaddproyecto);
        btnaddproyecto.setBounds(940, 320, 150, 80);

        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuMouseClicked(evt);
            }
        });
        jpagregarproyecto.add(btnmenu);
        btnmenu.setBounds(1050, 510, 130, 100);

        btnguardarproyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnguardarproyecto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        btnguardarproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarproyectoMouseClicked(evt);
            }
        });
        btnguardarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproyectoActionPerformed(evt);
            }
        });
        jpagregarproyecto.add(btnguardarproyecto);
        btnguardarproyecto.setBounds(860, 510, 140, 100);

        lbproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/proyectos2.jpg"))); // NOI18N
        jpagregarproyecto.add(lbproyectos);
        lbproyectos.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpagregarproyecto, "card4");

        jpvoluntariadom.setName("jpvoluntariadom"); // NOI18N
        jpvoluntariadom.setLayout(null);

        btnguardarvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnguardarvoluntariado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        btnguardarvoluntariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarvoluntariadoActionPerformed(evt);
            }
        });
        jpvoluntariadom.add(btnguardarvoluntariado);
        btnguardarvoluntariado.setBounds(740, 490, 180, 100);

        btnmenuv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnmenuv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnmenuv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuvMouseClicked(evt);
            }
        });
        jpvoluntariadom.add(btnmenuv);
        btnmenuv.setBounds(970, 490, 160, 120);

        txtproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtproyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtproyectoKeyPressed(evt);
            }
        });
        jpvoluntariadom.add(txtproyecto);
        txtproyecto.setBounds(200, 110, 400, 40);

        txtvoluntarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtvoluntarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvoluntariosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvoluntariosKeyTyped(evt);
            }
        });
        jpvoluntariadom.add(txtvoluntarios);
        txtvoluntarios.setBounds(830, 110, 370, 40);

        txtmiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtmiembros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmiembrosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmiembrosKeyTyped(evt);
            }
        });
        jpvoluntariadom.add(txtmiembros);
        txtmiembros.setBounds(230, 405, 370, 40);

        txtProyectoSelect.setEditable(false);
        txtProyectoSelect.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jpvoluntariadom.add(txtProyectoSelect);
        txtProyectoSelect.setBounds(230, 340, 370, 40);

        jLabel1.setBackground(new java.awt.Color(25, 61, 93));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proyecto Seleccionado:");
        jLabel1.setOpaque(true);
        jpvoluntariadom.add(jLabel1);
        jLabel1.setBounds(30, 330, 580, 60);

        tablemiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nombres", "Apellidos", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablemiembros.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablemiembros.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablemiembros.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablemiembros.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablemiembros.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablemiembros.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablemiembros.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablemiembros.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablemiembros.setComponentPopupMenu(PMMiembro);
        tablemiembros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablemiembros.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablemiembros.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablemiembros.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablemiembros.setRowHeight(22);
        tablemiembros.getTableHeader().setReorderingAllowed(false);
        scrollvmiembros.setViewportView(tablemiembros);
        if (tablemiembros.getColumnModel().getColumnCount() > 0) {
            tablemiembros.getColumnModel().getColumn(0).setMinWidth(50);
            tablemiembros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablemiembros.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jpvoluntariadom.add(scrollvmiembros);
        scrollvmiembros.setBounds(50, 460, 550, 210);

        tablevoluntarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nombre", "Apellido", "Género"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablevoluntarios.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tablevoluntarios.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablevoluntarios.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablevoluntarios.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tablevoluntarios.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablevoluntarios.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablevoluntarios.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tablevoluntarios.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tablevoluntarios.setComponentPopupMenu(PMVoluntariado);
        tablevoluntarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevoluntarios.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevoluntarios.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tablevoluntarios.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tablevoluntarios.setRowHeight(22);
        tablevoluntarios.getTableHeader().setReorderingAllowed(false);
        scrollvevol.setViewportView(tablevoluntarios);
        if (tablevoluntarios.getColumnModel().getColumnCount() > 0) {
            tablevoluntarios.getColumnModel().getColumn(0).setMinWidth(50);
            tablevoluntarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablevoluntarios.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jpvoluntariadom.add(scrollvevol);
        scrollvevol.setBounds(640, 170, 550, 210);

        tableproyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Proyecto", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        tableproyecto.setComponentPopupMenu(PMProyecto);
        tableproyecto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableproyecto.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tableproyecto.setRowHeight(22);
        tableproyecto.getTableHeader().setReorderingAllowed(false);
        scrollveproy.setViewportView(tableproyecto);
        if (tableproyecto.getColumnModel().getColumnCount() > 0) {
            tableproyecto.getColumnModel().getColumn(0).setMinWidth(50);
            tableproyecto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableproyecto.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jpvoluntariadom.add(scrollveproy);
        scrollveproy.setBounds(50, 170, 550, 160);

        lbvoluntariadom.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbvoluntariadom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/voluntariadom2.jpg"))); // NOI18N
        lbvoluntariadom.setText("ejemplo heidy torres");
        jpvoluntariadom.add(lbvoluntariadom);
        lbvoluntariadom.setBounds(0, 0, 1250, 700);
        lbvoluntariadom.getAccessibleContext().setAccessibleName("");

        rSPanelsSlider1.add(jpvoluntariadom, "card5");

        jpmreportes.setName("jpmreportes"); // NOI18N
        jpmreportes.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpmreportes.setLayout(null);

        btnrmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_70px.png"))); // NOI18N
        btnrmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Person_at_Home_100px.png"))); // NOI18N
        btnrmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrmenuMouseClicked(evt);
            }
        });
        jpmreportes.add(btnrmenu);
        btnrmenu.setBounds(1070, 470, 130, 80);

        btnractivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/activos.png"))); // NOI18N
        btnractivos.setName(""); // NOI18N
        btnractivos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/activosdos.png"))); // NOI18N
        btnractivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnractivosActionPerformed(evt);
            }
        });
        jpmreportes.add(btnractivos);
        btnractivos.setBounds(280, 70, 130, 90);

        btnrproyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/proyecto.png"))); // NOI18N
        btnrproyectos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/proyectodos.png"))); // NOI18N
        btnrproyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrproyectosActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrproyectos);
        btnrproyectos.setBounds(500, 70, 130, 90);

        btnredad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/edad.png"))); // NOI18N
        btnredad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/edaddos.png"))); // NOI18N
        btnredad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnredadActionPerformed(evt);
            }
        });
        jpmreportes.add(btnredad);
        btnredad.setBounds(70, 280, 130, 90);

        btnrporanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/anio.png"))); // NOI18N
        btnrporanio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/aniodos.png"))); // NOI18N
        btnrporanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrporanioActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrporanio);
        btnrporanio.setBounds(280, 280, 130, 90);

        btnrgenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/genero.png"))); // NOI18N
        btnrgenero.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/generodos.png"))); // NOI18N
        btnrgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrgeneroActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrgenero);
        btnrgenero.setBounds(500, 280, 130, 90);

        btnrexbecario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/exbecarios.png"))); // NOI18N
        btnrexbecario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/exbecariosdos.png"))); // NOI18N
        btnrexbecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrexbecarioActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrexbecario);
        btnrexbecario.setBounds(710, 190, 130, 90);

        btnrprograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/programa.png"))); // NOI18N
        btnrprograma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/programados.png"))); // NOI18N
        btnrprograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrprogramaActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrprograma);
        btnrprograma.setBounds(70, 490, 130, 90);

        btnrtrabajando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/trabajando.png"))); // NOI18N
        btnrtrabajando.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/trabajandodos.png"))); // NOI18N
        btnrtrabajando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrtrabajandoActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrtrabajando);
        btnrtrabajando.setBounds(290, 490, 120, 90);

        btnrnivelest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/nivele.png"))); // NOI18N
        btnrnivelest.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/niveledos.png"))); // NOI18N
        btnrnivelest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrnivelestActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrnivelest);
        btnrnivelest.setBounds(500, 490, 130, 80);

        btnrnoexbecarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/noexbecarios.png"))); // NOI18N
        btnrnoexbecarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/noexbecariodos.png"))); // NOI18N
        btnrnoexbecarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrnoexbecariosActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrnoexbecarios);
        btnrnoexbecarios.setBounds(710, 410, 130, 80);

        btnrpromocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/promocion.png"))); // NOI18N
        btnrpromocion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/promociondos.png"))); // NOI18N
        btnrpromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrpromocionActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrpromocion);
        btnrpromocion.setBounds(900, 310, 130, 80);

        btnrgeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/general.png"))); // NOI18N
        btnrgeneral.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/generaldos.png"))); // NOI18N
        btnrgeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrgeneralActionPerformed(evt);
            }
        });
        jpmreportes.add(btnrgeneral);
        btnrgeneral.setBounds(70, 70, 130, 90);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jpmreportes.add(jLabel2);
        jLabel2.setBounds(920, 600, 130, 80);

        lbmreportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/reportestam2.jpg"))); // NOI18N
        lbmreportes.setText("jLabel2");
        lbmreportes.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpmreportes.add(lbmreportes);
        lbmreportes.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpmreportes, "card6");

        jPanel1.add(rSPanelsSlider1);
        rSPanelsSlider1.setBounds(0, 0, 1250, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarvoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarvoluntarioActionPerformed
        this.dispose();
        agregarjf menu = new agregarjf();
        menu.setVisible(true);
    }//GEN-LAST:event_btnagregarvoluntarioActionPerformed

    private void btnagregarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarproyectoActionPerformed
        rSPanelsSlider1.setPanelSlider(jpagregarproyecto, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_btnagregarproyectoActionPerformed

    private void btnagregarvoluntariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarvoluntariadoActionPerformed
        rSPanelsSlider1.setPanelSlider(jpvoluntariadom, RSPanelsSlider.DIRECT.DOWN);
        limpiar();
    }//GEN-LAST:event_btnagregarvoluntariadoActionPerformed

    private void btnminimizarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarmenuActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarmenuActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        rSPanelsSlider1.setPanelSlider(menuagregar, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        this.dispose();
        busquedasjf buscar = new busquedasjf();
        buscar.setVisible(true);

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnsalirdmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirdmenuMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnsalirdmenuMouseClicked

    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnmenuvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuvMouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnmenuvMouseClicked

    private void btnreportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreportesMouseClicked
        rSPanelsSlider1.setPanelSlider(jpmreportes, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnreportesMouseClicked

    private void btnguardarproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarproyectoMouseClicked
        Proyecto();
    }//GEN-LAST:event_btnguardarproyectoMouseClicked

    private void btnguardarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarproyectoActionPerformed

    private void btnreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesActionPerformed
        rSPanelsSlider1.setPanelSlider(jpmreportes, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_btnreportesActionPerformed

    private void MIProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIProyectoActionPerformed
        /**
         * Al precionar la opcion del menu en la tabla proyecto selecciono el
         * numero de fila que tiene guardo en una variable local el id del
         * proyecto que me servirá para insertar el voluntariado verifico si
         * selecciono alguna fila de la tabla en el caso de no seleccionar una
         * fila me devuelve menos 1 tomo el nombre que esta en la fila
         * seleccionada y columna 1 puesto que se que en esa columna se guardan
         * los nombres de los proyectos muestro el nombre en un textfield no
         * editable para que el usuario no pueda cambiar el nombre hago que el
         * menu de la tabla opciones se deshabilite esto para no poder cambiar
         * el proyecto en caso contrario solo muestra un mensaje
         */
        int select = tableproyecto.getSelectedRow();
        IDproyecto = Integer.parseInt((String) tableproyecto.getValueAt(select, 0));
        if (select != -1) {
            String nombre = (String) tableproyecto.getValueAt(select, 1);
            txtProyectoSelect.setText(nombre);
            tablemiembros.setModel(proyecto.volunatariado(IDproyecto, tablemiembros, ""));
            tablevoluntarios.setModel(proyecto.Voluntarios(tablemiembros, txtvoluntarios.getText(), tablevoluntarios));
            listaIdmiembros = new ArrayList<>();
            listaBorrado = new ArrayList<>();
            listaPuestos = proyecto.getPuestoid();
            for (int i = 0; i < tablemiembros.getRowCount(); i++) {
                listaIdmiembros.add(Integer.parseInt((String) tablemiembros.getValueAt(i, 0)));
            }
            btnguardarvoluntariado.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_MIProyectoActionPerformed

    private void MICambiarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICambiarProyectoActionPerformed
        //Si en la tabla miembros selecciona la opcion del menu cambiar proyecto se habilita el boton en la tabla proyectos
        MIProyecto.setEnabled(true);
    }//GEN-LAST:event_MICambiarProyectoActionPerformed

    private void MIVoluntariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIVoluntariosActionPerformed
        /**
         * Tomo el conjunto de filas seleccionadas y las guardo en un arreglo
         * declaro un modelo para la tabala miembros obtengo el modelo de esa
         * tabla un ciclo que va a a añadir los datos en otra tabla tomando solo
         * el nombre, apellido y el puesto se lo asigno también agrego en una
         * arraylist el id del puesto esto igual me servirá para cuando inserte
         * Tomar nota que le agrego 5 porque el puesto "Voluntario" en la base
         * de datos tiene id 5 agrego a una arraylist a los miembras tomando su
         * id Tomar nota que el id me lo devuelve cuando pido los datos y se lo
         * agrego al modelo por ultimo le mando el modelo a la tabla miembros
         */
        int seleccionados[] = tablevoluntarios.getSelectedRows();
        String datos[] = new String[4];
        DefaultTableModel modelo = (DefaultTableModel) tablemiembros.getModel();
        DefaultTableModel modelo1 = (DefaultTableModel) tablevoluntarios.getModel();
        int temp;
        for (int i = 0; i < seleccionados.length; i++) {
            temp = Integer.parseInt((String) tablevoluntarios.getValueAt(seleccionados[i] - i, 0));
            listaIdmiembros.add(temp);
            datos[0] = (String) tablevoluntarios.getValueAt(seleccionados[i] - i, 0);
            datos[1] = (String) tablevoluntarios.getValueAt(seleccionados[i] - i, 1);
            datos[2] = (String) tablevoluntarios.getValueAt(seleccionados[i] - i, 2);
            datos[3] = "Voluntaria/o";
            modelo1.removeRow(seleccionados[i] - i);
            listaPuestos.add(6);
            modelo.addRow(datos);
        }
        tablevoluntarios.setModel(modelo1);
        tablemiembros.setModel(modelo);

    }//GEN-LAST:event_MIVoluntariosActionPerformed

    private void MIMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIMiembroActionPerformed
        /**
         * Este es para remover alguno de los voluntarios que se hayan agregado
         * anteriormente obtengo el conjunto de filas seleccionadas declaro un
         * modelo de la tabla miembros un ciclo donde voy a remover cada uno de
         * las filas que tiene el modelo Tomar nota que le digo que remueva la
         * fila que esta almacenado en seleccionados -i esto lo hago para que no
         * mee de error ya que las filas del modelo al borrar 1 el actual se
         * mueve a la izquierda y así sucesuvamente ejemplo quiero eliminar los
         * registros 0 y 2 de una tabla de 5 registros datos a eliminar
         * registros primera vuelta segunda vuelta 0 0 se elimina 0 se mantiene
         * el 0 que era 1 cuando entro 2 1 el 1 se vuelve 0 se elimina el 1 que
         * en realidad es 2 2 el 2 se vuelve 1 1 sigue en 1 que en realidad es 3
         * ya que se eliminaron 2 registos 3 .... .... 4 .... .... n n=n-1 n=n-1
         * operacion 0-0=0 2-1=1 lo mismo pasa con los arraylist
         */
        int seleccionados[] = tablemiembros.getSelectedRows();
        DefaultTableModel modelo = (DefaultTableModel) tablemiembros.getModel();
        DefaultTableModel modelo1 = (DefaultTableModel) tablevoluntarios.getModel();
        String datos[] = new String[4];
        for (int i = 0; i < seleccionados.length; i++) {
            listaBorrado.add(Integer.parseInt((String) tablemiembros.getValueAt(seleccionados[i] - i, 0)));
            datos[0] = (String) tablemiembros.getValueAt(seleccionados[i] - i, 0);
            datos[1] = (String) tablemiembros.getValueAt(seleccionados[i] - i, 1);
            datos[2] = (String) tablemiembros.getValueAt(seleccionados[i] - i, 2);
            modelo1.addRow(datos);
            modelo.removeRow(seleccionados[i] - i);
            listaPuestos.remove(seleccionados[i] - i);
            listaIdmiembros.remove(seleccionados[i] - i);
        }
        tablemiembros.setModel(modelo);
    }//GEN-LAST:event_MIMiembroActionPerformed

    private void txtproyectoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproyectoKeyPressed
        //filtro de busqueda para el proyecto
        tableproyecto.setModel(proyecto.Proyectos(txtproyecto.getText(), tableproyecto));
    }//GEN-LAST:event_txtproyectoKeyPressed

    private void txtvoluntariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvoluntariosKeyPressed
        //filtro de busqueda para el asociado
        tablevoluntarios.setModel(proyecto.Voluntarios(tablemiembros, txtvoluntarios.getText(), tablevoluntarios));
    }//GEN-LAST:event_txtvoluntariosKeyPressed
    //filtro de busqueda para la tabla miembros
    private void filtro(String consulta, JTable jtableBuscar) {
        /**
         * *
         * Nota cabe recordar que la tabla miembro no esta conectada aun con la
         * BD por ende se crea este metodo
         */
        if (consulta.length() != 0) {
            //hago el primer caracter mayuscula
            consulta = Character.toUpperCase(consulta.charAt(0)) + consulta.substring(1, consulta.length());
        }
        DefaultTableModel dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta, 1));
    }
    private void txtmiembrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmiembrosKeyPressed
        //filro de busqueda para miembros
        filtro(txtmiembros.getText(), tablemiembros);


    }//GEN-LAST:event_txtmiembrosKeyPressed

    private void txtmiembrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmiembrosKeyTyped
        CapturaTecla(evt);
    }//GEN-LAST:event_txtmiembrosKeyTyped

    private void btnguardarvoluntariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarvoluntariadoActionPerformed
        /**
         * este metodo inserta a la Base de datos lo que esta en la tabla de
         * miembros que seria el voluntariado declaro una variable bandera ciclo
         * for con 2 condiciones que Tomar en cuenta que como inserto varios
         * asociados a la tabla volunariado si regresa que es falso bandera va a
         * ser false para romper el cicclo y dmostrar un error al usuario si
         * siempre es verdadera bandera sigue como true y al salir del ciclo
         * como bandera es true me muestra un m,ensaje que se inserto todos los
         * miembros.
         */
        boolean bandera = true;
        for (int i = 0; i < listaBorrado.size(); i++) {
            bandera = proyecto.deleteVoluntariado(IDproyecto, listaBorrado.get(i));
        }
        if (bandera) {
            for (int i = 0; (i < tablemiembros.getRowCount()) && (bandera); i++) {
                bandera = proyecto.insertarVoluntariado(IDproyecto, listaIdmiembros.get(i), 0, listaPuestos.get(i));
            }
            if (bandera) {
                JOptionPane.showMessageDialog(null, "Se insertaron correctamente los datos");
                limpiar();
            } else {
                new rojerusan.RSNotifyAnimated("¡ERROR!", "Hubo un error al insertar/modificar al voluntariado",
                        5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                        RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            }
        } else {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar modificar el voluntariado",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }

    }//GEN-LAST:event_btnguardarvoluntariadoActionPerformed

    private void MIPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIPuestosActionPerformed
        /**
         * Este metodo me sirve para mostrar un joption pane con un combo box
         * dentro de el para que cambié el puesto a mi manera if preciona
         * aceptar al option pane hace lo siguiente tomamos todas las filas
         * seleccionadas tomamos el puesto que se selecciono y el indice que
         * este trae ciclo for para darle el nuevo puesto en la tabla y en el
         * arraylist
         */
        int respuesta = JOptionPane.showConfirmDialog(null, cmbPuestos, "seleccione un puesto", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            ArrayList<String> temp = new ArrayList<>();
            int seleccionados[] = tablemiembros.getSelectedRows();
            for (int i = 0; i < seleccionados.length; i++) {
                temp.add((String) tablemiembros.getValueAt(seleccionados[i], 0));
            }
            String puesto = (String) cmbPuestos.getSelectedItem();
            int index = cmbPuestos.getSelectedIndex();
            String temp1;
            DefaultTableModel modelo = (DefaultTableModel) tablemiembros.getModel();
            for (int i = 0; i < modelo.getRowCount(); i++) {
                temp1 = (String) modelo.getValueAt(i, 0);
                for (int j = 0; j < temp.size(); j++) {
                    if (temp1.equals(temp.get(j))) {
                        modelo.setValueAt(puesto, i, 3);
                        listaPuestos.set(i, index + 2);
                    }
                }
            }

            tablemiembros.setModel(modelo);
        }
    }//GEN-LAST:event_MIPuestosActionPerformed

    private void btnrmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrmenuMouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_btnrmenuMouseClicked

    private void btnrgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrgeneroActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, cmbGenero, "seleccione un puesto", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            String genero = (String) cmbGenero.getSelectedItem();
            if (genero.equals("Masculino")) {
                if (!reportes.ReportGeneros(true)) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            } else if (genero.equals("Femenino")) {
                if (!reportes.ReportGeneros(false)) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            } else {
                if (!reportes.ReportGenero()) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnrgeneroActionPerformed

    private void btnrnivelestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrnivelestActionPerformed
        if (!reportes.ReportNivEst()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrnivelestActionPerformed

    private void btnrgeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrgeneralActionPerformed
        if (!reportes.ReportDatosGenerales()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrgeneralActionPerformed

    private void btnractivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnractivosActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, cmbA_I, "seleccione un puesto", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            String activo = (String) cmbA_I.getSelectedItem();
            if (activo.equals("Activo")) {
                if (!reportes.ReportA_I(true)) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            } else if (activo.equals("Inactivo")) {
                if (!reportes.ReportA_I(false)) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            } else {
                if (!reportes.ReportGenero()) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnractivosActionPerformed

    private void btnrproyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrproyectosActionPerformed
        if (!reportes.ReportDetProyecto()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrproyectosActionPerformed

    private void btnredadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnredadActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, cmbEdades, "seleccione una edad", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            if (cmbEdades.getSelectedItem().equals("Todas las edades")) {
                if (!reportes.ReportEdad()) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            } else {
                int edad = (int) cmbEdades.getSelectedItem();
                if (!reportes.ReportEdades(edad)) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnredadActionPerformed

    private void btnrexbecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrexbecarioActionPerformed
        if (!reportes.ReportExbecarios()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrexbecarioActionPerformed

    private void btnrnoexbecariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrnoexbecariosActionPerformed
        if (!reportes.ReportNoExbecarios()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrnoexbecariosActionPerformed

    private void btnhomedpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomedpActionPerformed
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnhomedpActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnrprogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrprogramaActionPerformed
        if (!reportes.ReportPrograma()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrprogramaActionPerformed

    private void btnrtrabajandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrtrabajandoActionPerformed
        if (!reportes.ReportTrabajando()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrtrabajandoActionPerformed

    private void btnrpromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrpromocionActionPerformed
        if (!reportes.ReportPromocion()) {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnrpromocionActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtvoluntariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvoluntariosKeyTyped
        CapturaTecla(evt);
    }//GEN-LAST:event_txtvoluntariosKeyTyped

    private void btnrporanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrporanioActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, cmbAnios, "seleccione un año", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            if (cmbAnios.getSelectedItem().equals("Todos los años")) {
                if (!reportes.ReportAnio()) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            } else {
                int fecha = (int) cmbAnios.getSelectedItem();
                if (!reportes.ReportAnios(fecha)) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnrporanioActionPerformed

    private void CapturaTecla(KeyEvent e) {
        char c = e.getKeyChar();
        if (c >= 0 && c <= 64 && c != 32) {
            e.consume();
        }
    }

    private void limpiar() {
        txtmiembros.setText("");
        txtvoluntarios.setText("");
        txtproyecto.setText("");
        btnguardarvoluntariado.setEnabled(false);
        txtProyectoSelect.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tablemiembros.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        modelo = (DefaultTableModel) tablevoluntarios.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MICambiarProyecto;
    private javax.swing.JMenuItem MIMiembro;
    private javax.swing.JMenuItem MIProyecto;
    private javax.swing.JMenuItem MIPuestos;
    private javax.swing.JMenuItem MIVoluntarios;
    private javax.swing.JPopupMenu PMMiembro;
    private javax.swing.JPopupMenu PMProyecto;
    private javax.swing.JPopupMenu PMVoluntariado;
    private javax.swing.JButton btnaddproyecto;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregarproyecto;
    private javax.swing.JButton btnagregarvoluntariado;
    private javax.swing.JButton btnagregarvoluntario;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardarproyecto;
    private javax.swing.JButton btnguardarvoluntariado;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnmenuv;
    private javax.swing.JButton btnminimizarmenu;
    private javax.swing.JButton btnractivos;
    private javax.swing.JButton btnredad;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnreportes;
    private javax.swing.JButton btnrexbecario;
    private javax.swing.JButton btnrgeneral;
    private javax.swing.JButton btnrgenero;
    private javax.swing.JButton btnrmenu;
    private javax.swing.JButton btnrnivelest;
    private javax.swing.JButton btnrnoexbecarios;
    private javax.swing.JButton btnrporanio;
    private javax.swing.JButton btnrprograma;
    private javax.swing.JButton btnrpromocion;
    private javax.swing.JButton btnrproyectos;
    private javax.swing.JButton btnrtrabajando;
    private javax.swing.JButton btnsalirdmenu;
    private rojerusan.RSComboMetro cmbA_I;
    private rojerusan.RSComboMetro cmbAnios;
    private rojerusan.RSComboMetro cmbEdades;
    private rojerusan.RSComboMetro cmbGenero;
    private rojerusan.RSComboMetro cmbPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpagregarproyecto;
    private javax.swing.JPanel jpmreportes;
    private javax.swing.JPanel jpvoluntariadom;
    private javax.swing.JLabel lbmenuagregar;
    private javax.swing.JLabel lbmenuprincipal;
    private javax.swing.JLabel lbmreportes;
    private javax.swing.JLabel lbproyectos;
    private javax.swing.JLabel lbvoluntariadom;
    private javax.swing.JPanel menuagregar;
    private javax.swing.JPanel menuprincipal;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JScrollPane scrollveproy;
    private javax.swing.JScrollPane scrollvevol;
    private javax.swing.JScrollPane scrollvmiembros;
    private rojerusan.RSTableMetro tablemiembros;
    private rojerusan.RSTableMetro tableproyecto;
    private rojerusan.RSTableMetro tablevoluntarios;
    private javax.swing.JTextField txtProyectoSelect;
    private javax.swing.JTextField txtdescripcionp;
    private javax.swing.JTextField txtmiembros;
    private javax.swing.JTextField txtnombreproyecto;
    private javax.swing.JTextField txtproyecto;
    private javax.swing.JTextField txtvoluntarios;
    // End of variables declaration//GEN-END:variables

}
