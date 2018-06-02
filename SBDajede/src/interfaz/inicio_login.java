/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import org.apache.commons.codec.digest.DigestUtils;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class inicio_login extends javax.swing.JFrame {

    /**
     * Creates new form inicio_login
     */
    private final Usuario us;
    Font fuente = new Font("Yu Gothic UI Light", Font.BOLD, 25);
    Font fuente2 = new Font("Yu Gothic UI Light", Font.BOLD, 15);
    ImageIcon iniciotam1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/iniciointerfaz.jpg")).getImage());
    ImageIcon logintam1 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/Login1.jpg")).getImage());

    public inicio_login() {
        initComponents();
        us = new Usuario();     //instancio la clase usuario.
        this.setResizable(false);
        cmbRestablecer.setModel(us.usuarios());
        CMBUsuarios.setModel(us.usuarios()); //Le doy el modelo al combo box de usuarios.
        CMBUsuarios.setBackground(new Color(0, 0, 0, 0));
        PSTcontrasenia.setBackground(new Color(0, 0, 0, 0));
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        if ((tamanio.width == 1920) && (tamanio.height == 1080)) {
            this.setSize(1568, 880); //1568 880 1250 700
            rSPanelsSlider1.setSize(1568, 880);
            jpinicio.setSize(1568, 880);
            jplogin.setSize(1568, 880);
            lbinicio.setSize(1568, 950);
            lblogin.setSize(1568, 880);
            lbinicio.setIcon(iniciotam1);
            lblogin.setIcon(logintam1);
            btnsiguiente.setLocation(1400, 700);
            btnadmin.setLocation(170, 530);
            btncomite.setLocation(425, 530);
            btningresar.setLocation(800, 530);
            btnfpassword.setLocation(1400, 635);
            btneditaru.setLocation(1400, 520);
            PSTcontrasenia.setLocation(910, 423);
            PSTcontrasenia.setFont(fuente);
            CMBUsuarios.setLocation(860, 320);
            CMBUsuarios.setFont(fuente);
        }
        this.setLocationRelativeTo(null);
        transparencia();
    }

    public void transparencia() {
//        btnminimizar.setOpaque(false);
//        btnminimizar.setContentAreaFilled(false);
//        btnminimizar.setBorderPainted(false);
//        btnsalir.setOpaque(false);
//        btnsalir.setContentAreaFilled(false);
//        btnsalir.setBorderPainted(false);
        btnsiguiente.setOpaque(false);
        btnsiguiente.setContentAreaFilled(false);
        btnsiguiente.setBorderPainted(false);
//        btnatras.setOpaque(false);
//        btnatras.setContentAreaFilled(false);
//        btnatras.setBorderPainted(false);
        btnadmin.setOpaque(false);
        btnadmin.setContentAreaFilled(false);
        btnadmin.setBorderPainted(false);
        btncomite.setOpaque(false);
        btncomite.setContentAreaFilled(false);
        btncomite.setBorderPainted(false);
        btningresar.setOpaque(false);
        btningresar.setContentAreaFilled(false);
        btningresar.setBorderPainted(false);
        btnfpassword.setOpaque(false);
        btnfpassword.setContentAreaFilled(false);
        btnfpassword.setBorderPainted(false);
        btneditaru.setOpaque(false);
        btneditaru.setContentAreaFilled(false);
        btneditaru.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contrasenia = new rojerusan.RSPasswordTextPlaceHolder();
        cmbRestablecer = new rojerusan.RSComboMetro();
        txtContrasenia = new javax.swing.JTextField();
        panelf = new javax.swing.JPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jpinicio = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JButton();
        lbinicio = new javax.swing.JLabel();
        jplogin = new javax.swing.JPanel();
        CMBUsuarios = new javax.swing.JComboBox<>();
        PSTcontrasenia = new javax.swing.JPasswordField();
        btnadmin = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();
        btncomite = new javax.swing.JButton();
        btnfpassword = new javax.swing.JButton();
        btneditaru = new javax.swing.JButton();
        lblogin = new javax.swing.JLabel();

        Contrasenia.setText("rSPasswordTextPlaceHolder1");

        cmbRestablecer.setMaximumRowCount(3);

        txtContrasenia.setEditable(false);
        txtContrasenia.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setUndecorated(true);

        panelf.setLayout(null);

        rSPanelsSlider1.setMaximumSize(new java.awt.Dimension(1565, 880));
        rSPanelsSlider1.setMinimumSize(new java.awt.Dimension(250, 700));
        rSPanelsSlider1.setPreferredSize(new java.awt.Dimension(1250, 700));

        jpinicio.setName("jpinicio"); // NOI18N
        jpinicio.setLayout(null);

        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inicio/icons8_Right_70px.png"))); // NOI18N
        btnsiguiente.setName("btnsiguiente"); // NOI18N
        btnsiguiente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inicio/icons8_Right_100px.png"))); // NOI18N
        btnsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsiguienteMouseClicked(evt);
            }
        });
        jpinicio.add(btnsiguiente);
        btnsiguiente.setBounds(1050, 530, 98, 82);

        lbinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/iniciotam2.jpg"))); // NOI18N
        lbinicio.setText("jLabel1");
        jpinicio.add(lbinicio);
        lbinicio.setBounds(0, -30, 1290, 770);

        rSPanelsSlider1.add(jpinicio, "card4");

        jplogin.setName("jplogin"); // NOI18N
        jplogin.setLayout(null);

        CMBUsuarios.setBackground(new java.awt.Color(0, 102, 153));
        CMBUsuarios.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        CMBUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        CMBUsuarios.setMaximumRowCount(4);
        CMBUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ejemplo@gmail.com", "ejemplo2@hotmail.com", "ejemplo3@outlook.com", "ejemplo4@yahoo.com" }));
        CMBUsuarios.setBorder(null);
        jplogin.add(CMBUsuarios);
        CMBUsuarios.setBounds(660, 245, 390, 40);

        PSTcontrasenia.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        PSTcontrasenia.setForeground(new java.awt.Color(0, 255, 255));
        PSTcontrasenia.setText("jPasswordField1");
        PSTcontrasenia.setBorder(null);
        PSTcontrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PSTcontraseniaKeyPressed(evt);
            }
        });
        jplogin.add(PSTcontrasenia);
        PSTcontrasenia.setBounds(710, 325, 330, 25);

        btnadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Admin_Settings_Male_70px.png"))); // NOI18N
        btnadmin.setName("btnadmin"); // NOI18N
        btnadmin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Admin_Settings_Male_100px.png"))); // NOI18N
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        jplogin.add(btnadmin);
        btnadmin.setBounds(130, 380, 120, 110);

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_In_Progress_70px.png"))); // NOI18N
        btningresar.setName("btningresar"); // NOI18N
        btningresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_In_Progress_100px.png"))); // NOI18N
        btningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btningresarMouseClicked(evt);
            }
        });
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jplogin.add(btningresar);
        btningresar.setBounds(630, 380, 98, 110);

        btncomite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_User_Groups_70px.png"))); // NOI18N
        btncomite.setMaximumSize(new java.awt.Dimension(130, 130));
        btncomite.setMinimumSize(new java.awt.Dimension(130, 130));
        btncomite.setName("btncomite"); // NOI18N
        btncomite.setPreferredSize(new java.awt.Dimension(130, 130));
        btncomite.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_User_Groups_100px.png"))); // NOI18N
        jplogin.add(btncomite);
        btncomite.setBounds(300, 380, 130, 110);

        btnfpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Forgot_Password_70px_1.png"))); // NOI18N
        btnfpassword.setName("btnfpassword"); // NOI18N
        btnfpassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/icons8_Forgot_Password_100px.png"))); // NOI18N
        btnfpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfpasswordActionPerformed(evt);
            }
        });
        jplogin.add(btnfpassword);
        btnfpassword.setBounds(1110, 490, 100, 90);

        btneditaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/Edit_User_70px.png"))); // NOI18N
        btneditaru.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login/Edit_User_100px.png"))); // NOI18N
        btneditaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditaruMouseClicked(evt);
            }
        });
        jplogin.add(btneditaru);
        btneditaru.setBounds(1110, 390, 100, 90);

        lblogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Login2.jpg"))); // NOI18N
        lblogin.setText("jLabel1");
        jplogin.add(lblogin);
        lblogin.setBounds(0, 0, 1250, 700);

        rSPanelsSlider1.add(jplogin, "card4");

        panelf.add(rSPanelsSlider1);
        rSPanelsSlider1.setBounds(0, 0, 1250, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelf, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelf, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsiguienteMouseClicked
        rSPanelsSlider1.setPanelSlider(jplogin, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnsiguienteMouseClicked

    private void btningresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseClicked
        InicioSesion();

    }//GEN-LAST:event_btningresarMouseClicked

    private void PSTcontraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PSTcontraseniaKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == 10) {
            InicioSesion();
        }
    }//GEN-LAST:event_PSTcontraseniaKeyPressed

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, Contrasenia, "Ingrese contraseña del \"Administrador\"", JOptionPane.DEFAULT_OPTION);
        if (respuesta == 0) {
            String Pass = Contrasenia.getText();
            if (us.verificarSesion(DigestUtils.md5Hex(Pass), "Admin")) {
                Registrarjf registrar = new Registrarjf();
                registrar.setVisible(true);
                this.dispose();
            } else {
                new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder\nContraseña incorrecta",
                        5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                        RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            }
        }

    }//GEN-LAST:event_btnadminActionPerformed

    private String GenerarContrasenia() {
        try {
            String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
            int length = 10;
            Random random = SecureRandom.getInstanceStrong(); // as of JDK 8, this should return the strongest algorithm available to the JVM
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                int indexRandom = random.nextInt(symbols.length);
                sb.append(symbols[indexRandom]);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(inicio_login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    private void btnfpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfpasswordActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, cmbRestablecer, "Ingrese contraseña del \"Administrador\"", JOptionPane.DEFAULT_OPTION);
        if (respuesta == 0) {
            if (cmbRestablecer.getSelectedItem().equals("Admin")) {
                new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder\nNo cuenta con suficiente autorización",
                        5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                        RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
            } else {
                int usuario = cmbRestablecer.getSelectedIndex() + 1;
                String ContraseniaNueva = GenerarContrasenia();
                if (!us.RestablecerContrasenia(usuario, DigestUtils.md5Hex(ContraseniaNueva))) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Usuario no valido",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                } else {
                    txtContrasenia.setText(ContraseniaNueva);
                    JOptionPane.showMessageDialog(null, txtContrasenia, "Su constraseña nueva es:", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnfpasswordActionPerformed

    private void btneditaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditaruMouseClicked
        //Editar los atributos del usuario
        int respuesta = JOptionPane.showConfirmDialog(null, cmbRestablecer, "Ingrese el usuario", JOptionPane.DEFAULT_OPTION);
        if (respuesta == 0) {
            respuesta = JOptionPane.showConfirmDialog(null, Contrasenia, "Ingrese la contraseña del usuario: " + cmbRestablecer.getSelectedItem(), JOptionPane.DEFAULT_OPTION);
            if (respuesta == 0) {
                String usuario = (String) cmbRestablecer.getSelectedItem();
                String Pass = Contrasenia.getText();
                if (cmbRestablecer.getSelectedItem().equals("Admin")) {
                    new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder\nNo cuenta con suficiente autorización",
                            5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                            RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                } else {
                    if (us.verificarSesion(DigestUtils.md5Hex(Pass), usuario)) {
                        int usuario1 = cmbRestablecer.getSelectedIndex() + 1;
                        this.dispose();
                        Registrarjf r = new Registrarjf();
                        r.setVisible(true);
                        r.setInfo(usuario1);
                    } else {
                        new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder\nLa contraseña del usuario no coincide",
                                5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                                RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                    }
                }

            }
        }
    }//GEN-LAST:event_btneditaruMouseClicked

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btningresarActionPerformed
    /**
     * metodo que verifica la si la contraseña del usurio es la misma en la BD.
     */
    private void InicioSesion() {
        String usuario = (String) CMBUsuarios.getSelectedItem();
        if (us.verificarSesion(DigestUtils.md5Hex(PSTcontrasenia.getText()), usuario)) {
            this.dispose();
            splashjf s = new splashjf();
            menujf m = new menujf();
            this.dispose();
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            try {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(10);
                    s.porcentajec.setText(Integer.toString(i) + "%");
                    s.barracargando.setValue(i);
                    if (i == 100) {
                        s.dispose();
                        m.setVisible(true);
                    }
                }

            } catch (InterruptedException e) {

            }
        } else {
            new rojerusan.RSNotifyAnimated("¡ERROR!", "Error al intentar Acceder\nUsuario y/o contraseña incorrecta",
                    5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                    RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
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

                new inicio_login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CMBUsuarios;
    private rojerusan.RSPasswordTextPlaceHolder Contrasenia;
    private javax.swing.JPasswordField PSTcontrasenia;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btncomite;
    private javax.swing.JButton btneditaru;
    private javax.swing.JButton btnfpassword;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnsiguiente;
    private rojerusan.RSComboMetro cmbRestablecer;
    private javax.swing.JPanel jpinicio;
    private javax.swing.JPanel jplogin;
    private javax.swing.JLabel lbinicio;
    private javax.swing.JLabel lblogin;
    private javax.swing.JPanel panelf;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTextField txtContrasenia;
    // End of variables declaration//GEN-END:variables
}
