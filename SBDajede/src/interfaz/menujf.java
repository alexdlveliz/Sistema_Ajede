/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Proyecto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class menujf extends javax.swing.JFrame {

    //ImageIcon menutam2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/opcionestam2.jpg")).getImage());
    ImageIcon menu = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/menuprincipalv2t1.jpg")).getImage());
    private final Proyecto proyecto;
    private int IDproyecto;
    private ArrayList<Integer> listaPuestos;
    private ArrayList<Integer> listaIdmiembros;

    /**
     * Creates new form menujf
     */
    public menujf() {
        proyecto = new Proyecto();
        listaPuestos = new ArrayList<>();
        listaIdmiembros = new ArrayList<>();
        initComponents();
        tablevoluntarios.setModel(proyecto.Voluntarios("", tablevoluntarios));
        tableproyecto.setModel(proyecto.Proyectos("", tableproyecto));
        cmbPuestos.setModel(proyecto.puestos());
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
            btnagregar.setLocation(198, 445);
            btneditar.setLocation(515, 430);
            btnbuscar.setLocation(1165, 425);
            btnminimizarmenu.setLocation(1410, 5);
            btnsalirdmenu.setLocation(1480, 5);
        } else if ((tamanio.width == 1708) && (tamanio.height == 960)) //1366.768, alex: 1708.960
        {
            this.setSize(1250, 700);
            //jpmenu.setIcon(menutam2);
            this.setLocationRelativeTo(null);
            btnagregar.setLocation(191, 320); ///NAHOMI, AQUÍ ES 190, 320
            btneditar.setLocation(853, 320);
            btnbuscar.setLocation(500, 320);
            btnminimizarmenu.setLocation(1090, 5);
            btnsalirdmenu.setLocation(1175, 5);
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
        btneditar.setOpaque(false);
        btneditar.setContentAreaFilled(false);
        btneditar.setBorderPainted(false);
        btnbuscar.setOpaque(false);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setBorderPainted(false);
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
        btnrinactivos.setOpaque(false);
        btnrinactivos.setContentAreaFilled(false);
        btnrinactivos.setBorderPainted(false);
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
        btnrtrabajando.setOpaque(false);
        btnrtrabajando.setContentAreaFilled(false);
        btnrtrabajando.setBorderPainted(false);
        btnrnivelest.setOpaque(false);
        btnrnivelest.setContentAreaFilled(false);
        btnrnivelest.setBorderPainted(false);
        btnrpromocion.setOpaque(false);
        btnrpromocion.setContentAreaFilled(false);
        btnrpromocion.setBorderPainted(false);
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
        cmbPuestos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnminimizarmenu = new javax.swing.JButton();
        btnsalirdmenu = new javax.swing.JButton();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        menuprincipal = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproyecto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablemiembros = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablevoluntarios = new javax.swing.JTable();
        btnguardarvoluntarioado = new javax.swing.JButton();
        btnmenuv = new javax.swing.JButton();
        txtproyecto = new javax.swing.JTextField();
        txtvoluntarios = new javax.swing.JTextField();
        txtmiembros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtProyectoSelect = new javax.swing.JTextField();
        lbvoluntariadom = new javax.swing.JLabel();
        jpmreportes = new javax.swing.JPanel();
        btnrmenu = new javax.swing.JButton();
        btnractivos = new javax.swing.JButton();
        btnrinactivos = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1565, 880));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 700));
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

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Edit_Property_70px.png"))); // NOI18N
        btneditar.setName("btneditar"); // NOI18N
        btneditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Edit_Property_100px.png"))); // NOI18N
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        menuprincipal.add(btneditar);
        btneditar.setBounds(850, 320, 210, 170);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Search_70px.png"))); // NOI18N
        btnbuscar.setName("btnbuscar"); // NOI18N
        btnbuscar.setPreferredSize(new java.awt.Dimension(150, 25));
        btnbuscar.setRequestFocusEnabled(false);
        btnbuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Search_100px.png"))); // NOI18N
        btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarMouseClicked(evt);
            }
        });
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        menuprincipal.add(btnbuscar);
        btnbuscar.setBounds(510, 310, 240, 180);

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

        tableproyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nombre Proyecto", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableproyecto.setComponentPopupMenu(PMProyecto);
        tableproyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableproyecto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableproyecto);
        if (tableproyecto.getColumnModel().getColumnCount() > 0) {
            tableproyecto.getColumnModel().getColumn(0).setPreferredWidth(1);
            tableproyecto.getColumnModel().getColumn(1).setResizable(false);
            tableproyecto.getColumnModel().getColumn(2).setResizable(false);
        }

        jpvoluntariadom.add(jScrollPane1);
        jScrollPane1.setBounds(50, 170, 550, 160);

        tablemiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablemiembros.setComponentPopupMenu(PMMiembro);
        tablemiembros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tablemiembros);

        jpvoluntariadom.add(jScrollPane2);
        jScrollPane2.setBounds(50, 460, 550, 210);

        tablevoluntarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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
        tablevoluntarios.setComponentPopupMenu(PMVoluntariado);
        tablevoluntarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(tablevoluntarios);
        if (tablevoluntarios.getColumnModel().getColumnCount() > 0) {
            tablevoluntarios.getColumnModel().getColumn(0).setMinWidth(0);
            tablevoluntarios.getColumnModel().getColumn(0).setPreferredWidth(1);
            tablevoluntarios.getColumnModel().getColumn(0).setMaxWidth(2);
            tablevoluntarios.getColumnModel().getColumn(3).setMinWidth(80);
            tablevoluntarios.getColumnModel().getColumn(3).setPreferredWidth(80);
            tablevoluntarios.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jpvoluntariadom.add(jScrollPane3);
        jScrollPane3.setBounds(640, 170, 560, 210);

        btnguardarvoluntarioado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_70px.png"))); // NOI18N
        btnguardarvoluntarioado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Save_Close_100px.png"))); // NOI18N
        btnguardarvoluntarioado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarvoluntarioadoActionPerformed(evt);
            }
        });
        jpvoluntariadom.add(btnguardarvoluntarioado);
        btnguardarvoluntarioado.setBounds(740, 490, 180, 100);

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

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Proyecto Seleccionado:");
        jpvoluntariadom.add(jLabel1);
        jLabel1.setBounds(40, 340, 200, 40);

        txtProyectoSelect.setEditable(false);
        txtProyectoSelect.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jpvoluntariadom.add(txtProyectoSelect);
        txtProyectoSelect.setBounds(240, 340, 360, 40);

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
        btnrmenu.setBounds(1060, 460, 130, 80);

        btnractivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/activos.png"))); // NOI18N
        btnractivos.setName(""); // NOI18N
        btnractivos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/activosdos.png"))); // NOI18N
        jpmreportes.add(btnractivos);
        btnractivos.setBounds(280, 70, 130, 90);

        btnrinactivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/inactivo.png"))); // NOI18N
        btnrinactivos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/inactivodos.png"))); // NOI18N
        jpmreportes.add(btnrinactivos);
        btnrinactivos.setBounds(490, 70, 130, 90);

        btnredad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/edad.png"))); // NOI18N
        btnredad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/edaddos.png"))); // NOI18N
        jpmreportes.add(btnredad);
        btnredad.setBounds(70, 280, 130, 90);

        btnrporanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/anio.png"))); // NOI18N
        btnrporanio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/aniodos.png"))); // NOI18N
        jpmreportes.add(btnrporanio);
        btnrporanio.setBounds(280, 280, 130, 90);

        btnrgenero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/genero.png"))); // NOI18N
        btnrgenero.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/generodos.png"))); // NOI18N
        jpmreportes.add(btnrgenero);
        btnrgenero.setBounds(490, 280, 130, 90);

        btnrexbecario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/exbecarios.png"))); // NOI18N
        btnrexbecario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/exbecariosdos.png"))); // NOI18N
        jpmreportes.add(btnrexbecario);
        btnrexbecario.setBounds(710, 190, 130, 90);

        btnrprograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/programa.png"))); // NOI18N
        btnrprograma.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/programados.png"))); // NOI18N
        jpmreportes.add(btnrprograma);
        btnrprograma.setBounds(70, 490, 130, 90);

        btnrtrabajando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/trabajando.png"))); // NOI18N
        btnrtrabajando.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/trabajandodos.png"))); // NOI18N
        jpmreportes.add(btnrtrabajando);
        btnrtrabajando.setBounds(290, 490, 120, 90);

        btnrnivelest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/nivele.png"))); // NOI18N
        btnrnivelest.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/niveledos.png"))); // NOI18N
        jpmreportes.add(btnrnivelest);
        btnrnivelest.setBounds(490, 490, 130, 80);

        btnrnoexbecarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/noexbecarios.png"))); // NOI18N
        btnrnoexbecarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/noexbecariodos.png"))); // NOI18N
        jpmreportes.add(btnrnoexbecarios);
        btnrnoexbecarios.setBounds(710, 410, 130, 80);

        btnrpromocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/promocion.png"))); // NOI18N
        btnrpromocion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/promociondos.png"))); // NOI18N
        jpmreportes.add(btnrpromocion);
        btnrpromocion.setBounds(890, 310, 130, 80);

        btnrgeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/general.png"))); // NOI18N
        btnrgeneral.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mreportes/generaldos.png"))); // NOI18N
        jpmreportes.add(btnrgeneral);
        btnrgeneral.setBounds(70, 70, 130, 90);

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


    }//GEN-LAST:event_btnagregarvoluntariadoActionPerformed

    private void btnminimizarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnminimizarmenuActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        rSPanelsSlider1.setPanelSlider(menuagregar, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        rSPanelsSlider1.setPanelSlider(jpmreportes, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnsalirdmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirdmenuMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnsalirdmenuMouseClicked

    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnmenuvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuvMouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnmenuvMouseClicked

    private void btnbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarMouseClicked
        this.dispose();
        busquedasjf buscar = new busquedasjf();
        buscar.setVisible(true);
    }//GEN-LAST:event_btnbuscarMouseClicked

    private void btnguardarproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarproyectoMouseClicked
        Proyecto();
    }//GEN-LAST:event_btnguardarproyectoMouseClicked

    private void btnguardarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarproyectoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

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
        IDproyecto = Integer.parseInt((String)tableproyecto.getValueAt(select, 0));
        System.out.println(IDproyecto);
        if (select != -1) {
            String nombre = (String) tableproyecto.getValueAt(select, 1);
            txtProyectoSelect.setText(nombre);
            MIProyecto.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_MIProyectoActionPerformed

    private void MICambiarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICambiarProyectoActionPerformed
        //Si en la tabal miembros selecciona la opcion del menu cambiar proyecto se habilita el boton en la tabla proyectos
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
        String datos[] = new String[3];
        DefaultTableModel modelo = (DefaultTableModel) tablemiembros.getModel();
        int temp;
        for (int i = 0; i < seleccionados.length; i++) {
            temp = Integer.parseInt((String) tablevoluntarios.getValueAt(seleccionados[i], 0));
            listaIdmiembros.add(temp);
            datos[0] = (String) tablevoluntarios.getValueAt(seleccionados[i], 1);
            datos[1] = (String) tablevoluntarios.getValueAt(seleccionados[i], 2);
            datos[2] = "Voluntaria/o";
            listaPuestos.add(6);
            modelo.addRow(datos);
        }

        tablemiembros.setModel(modelo);

    }//GEN-LAST:event_MIVoluntariosActionPerformed

    private void MIMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIMiembroActionPerformed
        /**
         * Este es para remover lguno de los voluntarios que se hayan agregado
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
        for (int i = 0; i < seleccionados.length; i++) {
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
        tablevoluntarios.setModel(proyecto.Voluntarios(txtvoluntarios.getText(), tablevoluntarios));
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
        tr.setRowFilter(RowFilter.regexFilter(consulta, 0));
    }
    private void txtmiembrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmiembrosKeyPressed
        //filro de busqueda para miembros
        filtro(txtmiembros.getText(), tablemiembros);
    }//GEN-LAST:event_txtmiembrosKeyPressed

    private void txtmiembrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmiembrosKeyTyped

    }//GEN-LAST:event_txtmiembrosKeyTyped

    private void btnguardarvoluntarioadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarvoluntarioadoActionPerformed
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
        for (int i = 0; (i < tablemiembros.getRowCount()) && (bandera); i++) {
            if (!proyecto.insertarVoluntariado(IDproyecto, listaIdmiembros.get(i), 0, listaPuestos.get(i))) {
                bandera = false;
            }
        }
        if (bandera) {
            JOptionPane.showMessageDialog(null, "Se insertaron correctamente los datos");
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos");
        }

    }//GEN-LAST:event_btnguardarvoluntarioadoActionPerformed

    private void MIPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIPuestosActionPerformed
        /**
         * Este metod me sitve para mostrar un joption pane con un combo box
         * dentro de el para que cambié el puesto a mi manera if preciona
         * aceptar al option pane hace lo siguiente tomamos todas las filas
         * seleccionadas tomamos el puesto que se selecciono y el indice que
         * este trae ciclo for para darle el nuevo pueto en la tabla y en el
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
            int index = cmbPuestos.getSelectedIndex(), k;
            String temp1;
            DefaultTableModel modelo = (DefaultTableModel) tablemiembros.getModel();
            for (int i = 0; i < modelo.getRowCount(); i++) {
                temp1 = (String) modelo.getValueAt(i, 0);
                for (int j = 0; j < temp.size(); j++) {
                    if (temp1.equals(temp.get(j))) {
                        modelo.setValueAt(puesto, i, 2);
                        listaPuestos.set(i, index + 1);
                    }
                }
            }

            tablemiembros.setModel(modelo);
        }
    }//GEN-LAST:event_MIPuestosActionPerformed

    private void btnrmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrmenuMouseClicked
        rSPanelsSlider1.setPanelSlider(menuprincipal, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_btnrmenuMouseClicked

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
            java.util.logging.Logger.getLogger(menujf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menujf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menujf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menujf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menujf().setVisible(true);
            }
        });
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
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnguardarproyecto;
    private javax.swing.JButton btnguardarvoluntarioado;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnmenuv;
    private javax.swing.JButton btnminimizarmenu;
    private javax.swing.JButton btnractivos;
    private javax.swing.JButton btnredad;
    private javax.swing.JButton btnrexbecario;
    private javax.swing.JButton btnrgeneral;
    private javax.swing.JButton btnrgenero;
    private javax.swing.JButton btnrinactivos;
    private javax.swing.JButton btnrmenu;
    private javax.swing.JButton btnrnivelest;
    private javax.swing.JButton btnrnoexbecarios;
    private javax.swing.JButton btnrporanio;
    private javax.swing.JButton btnrprograma;
    private javax.swing.JButton btnrpromocion;
    private javax.swing.JButton btnrtrabajando;
    private javax.swing.JButton btnsalirdmenu;
    private javax.swing.JComboBox<String> cmbPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JTable tablemiembros;
    private javax.swing.JTable tableproyecto;
    private javax.swing.JTable tablevoluntarios;
    private javax.swing.JTextField txtProyectoSelect;
    private javax.swing.JTextField txtdescripcionp;
    private javax.swing.JTextField txtmiembros;
    private javax.swing.JTextField txtnombreproyecto;
    private javax.swing.JTextField txtproyecto;
    private javax.swing.JTextField txtvoluntarios;
    // End of variables declaration//GEN-END:variables
}
