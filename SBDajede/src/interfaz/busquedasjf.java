/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.BusquedasVoluntarios;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class busquedasjf extends javax.swing.JFrame {

    /**
     * Creates new form busquedasjf
     */
    private BusquedasVoluntarios busquedas;
    private Boolean activo=true;
    public busquedasjf() {
        busquedas = new BusquedasVoluntarios();
        initComponents();
        tablebvnombre.setModel(busquedas.BNombre("", tablebvnombre, "",true));
        this.setLocationRelativeTo(null);

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
        btnrmenua = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnminimizar = new javax.swing.JButton();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jpmenua = new javax.swing.JPanel();
        btnbvnombre = new javax.swing.JButton();
        btnbvexbecarios = new javax.swing.JButton();
        btnbvnoexbecarios = new javax.swing.JButton();
        btnbvanio = new javax.swing.JButton();
        btnbvedad = new javax.swing.JButton();
        btnbvgenero = new javax.swing.JButton();
        btnbvprograma = new javax.swing.JButton();
        btnbvpromocionbeca = new javax.swing.JButton();
        btnbvocupacion = new javax.swing.JButton();
        lbmenua = new javax.swing.JLabel();
        jpvnombre = new javax.swing.JPanel();
        txtbvnombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jsbvnombre = new javax.swing.JScrollPane();
        tablebvnombre = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbactivo = new javax.swing.JComboBox<>();
        lbvnombre = new javax.swing.JLabel();
        jpvactivos = new javax.swing.JPanel();
        txtbvactivos = new javax.swing.JTextField();
        jsbvactivos = new javax.swing.JScrollPane();
        tablebvactivos = new javax.swing.JTable();
        lbvactivos = new javax.swing.JLabel();
        jpvinactivos = new javax.swing.JPanel();
        txtbvinactivos = new javax.swing.JTextField();
        jsbvinactivos = new javax.swing.JScrollPane();
        tablebvinactivos = new javax.swing.JTable();
        lbvinactivos = new javax.swing.JLabel();
        jpvexbecarios = new javax.swing.JPanel();
        txtbvexbecarios = new javax.swing.JTextField();
        jsbvexbecarios = new javax.swing.JScrollPane();
        tablebvexbecarios = new javax.swing.JTable();
        lbvexbecarios = new javax.swing.JLabel();
        jpvnoexbecarios = new javax.swing.JPanel();
        txtbvnoexbecarios = new javax.swing.JTextField();
        jsbvnoexbecarios = new javax.swing.JScrollPane();
        tablebvnoexbecarios = new javax.swing.JTable();
        lbvnoexbecarios = new javax.swing.JLabel();
        jpvanio = new javax.swing.JPanel();
        txtbvanio = new javax.swing.JTextField();
        jsbvanio = new javax.swing.JScrollPane();
        tablebvanio = new javax.swing.JTable();
        lbvanio = new javax.swing.JLabel();
        jpvedad = new javax.swing.JPanel();
        txtbvedad = new javax.swing.JTextField();
        jsbvedad = new javax.swing.JScrollPane();
        tablebvedad = new javax.swing.JTable();
        lbvedad = new javax.swing.JLabel();
        jpvgenero = new javax.swing.JPanel();
        txtbvgenero = new javax.swing.JTextField();
        jsbvgenero = new javax.swing.JScrollPane();
        tablebvgenero = new javax.swing.JTable();
        lbvgenero = new javax.swing.JLabel();
        jpvprograma = new javax.swing.JPanel();
        txtbvprograma = new javax.swing.JTextField();
        jsbvprograma = new javax.swing.JScrollPane();
        tablebvprograma = new javax.swing.JTable();
        lbvprograma = new javax.swing.JLabel();
        jpvpromocionbeca = new javax.swing.JPanel();
        txtbvpromocionbeca = new javax.swing.JTextField();
        jsbvpromocionbeca = new javax.swing.JScrollPane();
        tablebvpromocionbeca = new javax.swing.JTable();
        lbvpromocionbeca = new javax.swing.JLabel();
        jpvocupacion = new javax.swing.JPanel();
        txtbvocupacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebvocupacion = new javax.swing.JTable();
        lbvocupacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1565, 880));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(1565, 880));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 700));
        jPanel1.setLayout(null);

        btnrmenua.setText("jButton12");
        btnrmenua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmenuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnrmenua);
        btnrmenua.setBounds(1140, 610, 80, 28);

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

        rSPanelsSlider1.setMaximumSize(new java.awt.Dimension(1565, 880));
        rSPanelsSlider1.setMinimumSize(new java.awt.Dimension(1250, 700));
        rSPanelsSlider1.setPreferredSize(new java.awt.Dimension(1250, 700));

        jpmenua.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpmenua.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpmenua.setName("jpmenua"); // NOI18N
        jpmenua.setLayout(null);

        btnbvnombre.setText("volutario nombre");
        btnbvnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvnombreMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvnombre);
        btnbvnombre.setBounds(160, 240, 140, 50);

        btnbvexbecarios.setText("voluntarios exbecarios");
        btnbvexbecarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvexbecariosMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvexbecarios);
        btnbvexbecarios.setBounds(710, 240, 160, 50);

        btnbvnoexbecarios.setText("voluntarios no exbecarios");
        btnbvnoexbecarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvnoexbecariosMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvnoexbecarios);
        btnbvnoexbecarios.setBounds(900, 240, 180, 50);

        btnbvanio.setText("voluntarios por año");
        btnbvanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvanioMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvanio);
        btnbvanio.setBounds(160, 360, 150, 40);

        btnbvedad.setText("voluntarios por edad");
        btnbvedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvedadMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvedad);
        btnbvedad.setBounds(350, 360, 150, 40);

        btnbvgenero.setText("voluntarios por genero");
        btnbvgenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvgeneroMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvgenero);
        btnbvgenero.setBounds(540, 360, 170, 40);

        btnbvprograma.setText("voluntarios por programa");
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
        btnbvprograma.setBounds(730, 360, 180, 40);

        btnbvpromocionbeca.setText("voluntarios por promocion de beca");
        btnbvpromocionbeca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvpromocionbecaMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvpromocionbeca);
        btnbvpromocionbeca.setBounds(920, 360, 240, 40);

        btnbvocupacion.setText("voluntarios por ocupacion");
        btnbvocupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbvocupacionMouseClicked(evt);
            }
        });
        jpmenua.add(btnbvocupacion);
        btnbvocupacion.setBounds(160, 450, 190, 40);

        lbmenua.setText("jLabel1");
        jpmenua.add(lbmenua);
        lbmenua.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jpmenua, "card9");

        jpvnombre.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpvnombre.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpvnombre.setName("jpvnombre"); // NOI18N
        jpvnombre.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpvnombre.setLayout(null);

        txtbvnombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbvnombreKeyPressed(evt);
            }
        });
        jpvnombre.add(txtbvnombre);
        txtbvnombre.setBounds(180, 70, 650, 30);

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
        });
        jpvnombre.add(txtApellido);
        txtApellido.setBounds(180, 110, 650, 28);

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

        jpvnombre.add(jsbvnombre);
        jsbvnombre.setBounds(40, 190, 1190, 470);

        jLabel1.setText("Nombre:");
        jpvnombre.add(jLabel1);
        jLabel1.setBounds(120, 80, 50, 16);

        jLabel2.setText("Apellido:");
        jpvnombre.add(jLabel2);
        jLabel2.setBounds(120, 120, 50, 16);

        cmbactivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cmbactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbactivoActionPerformed(evt);
            }
        });
        jpvnombre.add(cmbactivo);
        cmbactivo.setBounds(950, 90, 130, 26);
        jpvnombre.add(lbvnombre);
        lbvnombre.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvnombre, "card3");

        jpvactivos.setMaximumSize(new java.awt.Dimension(1565, 880));
        jpvactivos.setMinimumSize(new java.awt.Dimension(1250, 700));
        jpvactivos.setName("jpvactivos"); // NOI18N
        jpvactivos.setPreferredSize(new java.awt.Dimension(1250, 700));
        jpvactivos.setLayout(null);

        txtbvactivos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvactivos.setText("jTextField1");
        jpvactivos.add(txtbvactivos);
        txtbvactivos.setBounds(360, 140, 650, 30);

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

        jpvactivos.add(jsbvactivos);
        jsbvactivos.setBounds(140, 190, 1090, 440);

        lbvactivos.setText("jLabel1");
        jpvactivos.add(lbvactivos);
        lbvactivos.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvactivos, "card4");

        jpvinactivos.setName("jpvinactivos"); // NOI18N
        jpvinactivos.setLayout(null);

        txtbvinactivos.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvinactivos.setText("jTextField1");
        jpvinactivos.add(txtbvinactivos);
        txtbvinactivos.setBounds(360, 140, 650, 30);

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

        jpvinactivos.add(jsbvinactivos);
        jsbvinactivos.setBounds(140, 190, 1090, 440);

        lbvinactivos.setText("jLabel1");
        jpvinactivos.add(lbvinactivos);
        lbvinactivos.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvinactivos, "card5");

        jpvexbecarios.setName("jpvexbecarios"); // NOI18N
        jpvexbecarios.setLayout(null);

        txtbvexbecarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvexbecarios.setText("jTextField1");
        jpvexbecarios.add(txtbvexbecarios);
        txtbvexbecarios.setBounds(360, 140, 650, 30);

        tablebvexbecarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jsbvexbecarios.setViewportView(tablebvexbecarios);

        jpvexbecarios.add(jsbvexbecarios);
        jsbvexbecarios.setBounds(140, 190, 1090, 440);

        lbvexbecarios.setText("jLabel1");
        jpvexbecarios.add(lbvexbecarios);
        lbvexbecarios.setBounds(-32411, -32409, 41, 16);

        rSPanelsSlider1.add(jpvexbecarios, "card6");

        jpvnoexbecarios.setName("jpvnoexbecarios"); // NOI18N
        jpvnoexbecarios.setLayout(null);

        txtbvnoexbecarios.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvnoexbecarios.setText("jTextField1");
        jpvnoexbecarios.add(txtbvnoexbecarios);
        txtbvnoexbecarios.setBounds(360, 140, 650, 30);

        tablebvnoexbecarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jsbvnoexbecarios.setViewportView(tablebvnoexbecarios);

        jpvnoexbecarios.add(jsbvnoexbecarios);
        jsbvnoexbecarios.setBounds(140, 190, 1090, 440);

        lbvnoexbecarios.setText("jLabel1");
        jpvnoexbecarios.add(lbvnoexbecarios);
        lbvnoexbecarios.setBounds(-32706, -32685, 41, 16);

        rSPanelsSlider1.add(jpvnoexbecarios, "card7");

        jpvanio.setName("jpvanio"); // NOI18N
        jpvanio.setLayout(null);

        txtbvanio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvanio.setText("jTextField1");
        jpvanio.add(txtbvanio);
        txtbvanio.setBounds(360, 140, 650, 30);

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
        jsbvanio.setBounds(140, 190, 1090, 440);

        lbvanio.setText("jLabel1");
        jpvanio.add(lbvanio);
        lbvanio.setBounds(-32768, -32768, 41, 16);

        rSPanelsSlider1.add(jpvanio, "card8");

        jpvedad.setName("jpvedad"); // NOI18N
        jpvedad.setLayout(null);

        txtbvedad.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvedad.setText("jTextField1");
        jpvedad.add(txtbvedad);
        txtbvedad.setBounds(360, 140, 650, 30);

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
        jsbvedad.setBounds(140, 190, 1090, 440);

        lbvedad.setText("jLabel1");
        jpvedad.add(lbvedad);
        lbvedad.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvedad, "card9");

        jpvgenero.setName("jpvgenero"); // NOI18N
        jpvgenero.setLayout(null);

        txtbvgenero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvgenero.setText("jTextField1");
        jpvgenero.add(txtbvgenero);
        txtbvgenero.setBounds(360, 140, 650, 30);

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
        jsbvgenero.setBounds(140, 190, 1090, 440);

        lbvgenero.setText("jLabel1");
        jpvgenero.add(lbvgenero);
        lbvgenero.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvgenero, "card10");

        jpvprograma.setName("jpvprograma"); // NOI18N
        jpvprograma.setLayout(null);

        txtbvprograma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvprograma.setText("jTextField1");
        jpvprograma.add(txtbvprograma);
        txtbvprograma.setBounds(360, 140, 650, 30);

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
        jsbvprograma.setBounds(140, 190, 1090, 440);

        lbvprograma.setText("jLabel1");
        jpvprograma.add(lbvprograma);
        lbvprograma.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvprograma, "card11");

        jpvpromocionbeca.setName("jpvpromocionbeca"); // NOI18N
        jpvpromocionbeca.setLayout(null);

        txtbvpromocionbeca.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvpromocionbeca.setText("jTextField1");
        jpvpromocionbeca.add(txtbvpromocionbeca);
        txtbvpromocionbeca.setBounds(360, 140, 650, 30);

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
        jsbvpromocionbeca.setBounds(140, 190, 1090, 440);

        lbvpromocionbeca.setText("jLabel1");
        jpvpromocionbeca.add(lbvpromocionbeca);
        lbvpromocionbeca.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvpromocionbeca, "card12");

        jpvocupacion.setName("jpvocupacion"); // NOI18N
        jpvocupacion.setLayout(null);

        txtbvocupacion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        txtbvocupacion.setText("jTextField1");
        jpvocupacion.add(txtbvocupacion);
        txtbvocupacion.setBounds(360, 140, 650, 30);

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
        jScrollPane1.setBounds(140, 190, 1090, 440);

        lbvocupacion.setText("jLabel1");
        jpvocupacion.add(lbvocupacion);
        lbvocupacion.setBounds(0, 0, 1370, 740);

        rSPanelsSlider1.add(jpvocupacion, "card13");

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbvprogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbvprogramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbvprogramaActionPerformed

    private void btnbvnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvnombreMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvnombre, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvnombreMouseClicked

    private void btnbvexbecariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvexbecariosMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvexbecarios, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvexbecariosMouseClicked

    private void btnbvnoexbecariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvnoexbecariosMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvnoexbecarios, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvnoexbecariosMouseClicked

    private void btnbvanioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvanioMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvanio, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvanioMouseClicked

    private void btnbvedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvedadMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvedad, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvedadMouseClicked

    private void btnbvgeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvgeneroMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvgenero, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvgeneroMouseClicked

    private void btnbvprogramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvprogramaMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvprograma, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvprogramaMouseClicked

    private void btnbvpromocionbecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvpromocionbecaMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvpromocionbeca, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnbvpromocionbecaMouseClicked

    private void btnbvocupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbvocupacionMouseClicked
        rSPanelsSlider1.setPanelSlider(jpvocupacion, RSPanelsSlider.DIRECT.UP);
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
    private javax.swing.JButton btnbvanio;
    private javax.swing.JButton btnbvedad;
    private javax.swing.JButton btnbvexbecarios;
    private javax.swing.JButton btnbvgenero;
    private javax.swing.JButton btnbvnoexbecarios;
    private javax.swing.JButton btnbvnombre;
    private javax.swing.JButton btnbvocupacion;
    private javax.swing.JButton btnbvprograma;
    private javax.swing.JButton btnbvpromocionbeca;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnrmenua;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpmenua;
    private javax.swing.JPanel jpvactivos;
    private javax.swing.JPanel jpvanio;
    private javax.swing.JPanel jpvedad;
    private javax.swing.JPanel jpvexbecarios;
    private javax.swing.JPanel jpvgenero;
    private javax.swing.JPanel jpvinactivos;
    private javax.swing.JPanel jpvnoexbecarios;
    private javax.swing.JPanel jpvnombre;
    private javax.swing.JPanel jpvocupacion;
    private javax.swing.JPanel jpvprograma;
    private javax.swing.JPanel jpvpromocionbeca;
    private javax.swing.JScrollPane jsbvactivos;
    private javax.swing.JScrollPane jsbvanio;
    private javax.swing.JScrollPane jsbvedad;
    private javax.swing.JScrollPane jsbvexbecarios;
    private javax.swing.JScrollPane jsbvgenero;
    private javax.swing.JScrollPane jsbvinactivos;
    private javax.swing.JScrollPane jsbvnoexbecarios;
    private javax.swing.JScrollPane jsbvnombre;
    private javax.swing.JScrollPane jsbvprograma;
    private javax.swing.JScrollPane jsbvpromocionbeca;
    private javax.swing.JLabel lbmenua;
    private javax.swing.JLabel lbvactivos;
    private javax.swing.JLabel lbvanio;
    private javax.swing.JLabel lbvedad;
    private javax.swing.JLabel lbvexbecarios;
    private javax.swing.JLabel lbvgenero;
    private javax.swing.JLabel lbvinactivos;
    private javax.swing.JLabel lbvnoexbecarios;
    private javax.swing.JLabel lbvnombre;
    private javax.swing.JLabel lbvocupacion;
    private javax.swing.JLabel lbvprograma;
    private javax.swing.JLabel lbvpromocionbeca;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTable tablebvactivos;
    private javax.swing.JTable tablebvanio;
    private javax.swing.JTable tablebvedad;
    private javax.swing.JTable tablebvexbecarios;
    private javax.swing.JTable tablebvgenero;
    private javax.swing.JTable tablebvinactivos;
    private javax.swing.JTable tablebvnoexbecarios;
    private javax.swing.JTable tablebvnombre;
    private javax.swing.JTable tablebvocupacion;
    private javax.swing.JTable tablebvprograma;
    private javax.swing.JTable tablebvpromocionbeca;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtbvactivos;
    private javax.swing.JTextField txtbvanio;
    private javax.swing.JTextField txtbvedad;
    private javax.swing.JTextField txtbvexbecarios;
    private javax.swing.JTextField txtbvgenero;
    private javax.swing.JTextField txtbvinactivos;
    private javax.swing.JTextField txtbvnoexbecarios;
    private javax.swing.JTextField txtbvnombre;
    private javax.swing.JTextField txtbvocupacion;
    private javax.swing.JTextField txtbvprograma;
    private javax.swing.JTextField txtbvpromocionbeca;
    // End of variables declaration//GEN-END:variables
}
