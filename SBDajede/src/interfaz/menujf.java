/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Nahomi
 */
public class menujf extends javax.swing.JFrame {

    /**
     * Creates new form menujf
     */
    public menujf() {
        initComponents();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        transparencia();
        if ((tamanio.width ==1920)&&(tamanio.height == 1080))
        {
            this.setSize(1667, 937);
            this.setLocationRelativeTo(null);
            btnagregar.setLocation(213, 455);
            btneditar.setLocation(550, 445);
            btneliminar.setLocation(890, 430);
            btnbuscar.setLocation(1244, 432);
        }
        else if((tamanio.width == 1366) && (tamanio.height == 768)) //1366.768, alex: 1708.960
        {
            this.setSize(1667, 837);
            this.setLocationRelativeTo(null);
            btnagregar.setLocation(213, 375);
            btneditar.setLocation(550, 375);
            btneliminar.setLocation(890, 370);
            btnbuscar.setLocation(1244, 372);
        }
    }
    public void transparencia()
    {
        btnagregar.setOpaque(false);
        btnagregar.setContentAreaFilled(false);
        btnagregar.setBorderPainted(false);
        btneliminar.setOpaque(false);
        btneliminar.setContentAreaFilled(false);
        btneliminar.setBorderPainted(false);
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
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmenu = new jcMousePanel.jcMousePanel();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnminimizarmenu = new javax.swing.JButton();
        btnsalirdmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(200, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jpmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/opciones2.jpg"))); // NOI18N
        jpmenu.setVisibleLogo(false);
        jpmenu.setLayout(null);

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Add_User_Male_70px_1.png"))); // NOI18N
        btnagregar.setMargin(new java.awt.Insets(-15, 14, 35, 14));
        btnagregar.setName("btnagregar"); // NOI18N
        btnagregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Add_User_Male_100px.png"))); // NOI18N
        btnagregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jpmenu.add(btnagregar);
        btnagregar.setBounds(240, 370, 200, 140);

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Edit_Property_70px.png"))); // NOI18N
        btneditar.setName("btneditar"); // NOI18N
        btneditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Edit_Property_100px.png"))); // NOI18N
        jpmenu.add(btneditar);
        btneditar.setBounds(620, 360, 210, 170);

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Search_70px.png"))); // NOI18N
        btnbuscar.setName("btnbuscar"); // NOI18N
        btnbuscar.setPreferredSize(new java.awt.Dimension(150, 25));
        btnbuscar.setRequestFocusEnabled(false);
        btnbuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Search_100px.png"))); // NOI18N
        jpmenu.add(btnbuscar);
        btnbuscar.setBounds(1390, 360, 230, 170);

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Delete_User_Male_70px.png"))); // NOI18N
        btneliminar.setName("btneliminar"); // NOI18N
        btneliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu/icons8_Delete_User_Male_100px.png"))); // NOI18N
        jpmenu.add(btneliminar);
        btneliminar.setBounds(1010, 360, 230, 180);

        btnminimizarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_30px_1.png"))); // NOI18N
        btnminimizarmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Chevron_Down_70px.png"))); // NOI18N
        btnminimizarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimizarmenuActionPerformed(evt);
            }
        });
        jpmenu.add(btnminimizarmenu);
        btnminimizarmenu.setBounds(1700, 0, 80, 70);

        btnsalirdmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_30px.png"))); // NOI18N
        btnsalirdmenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/icons8_Close_Window_70px.png"))); // NOI18N
        btnsalirdmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirdmenuActionPerformed(evt);
            }
        });
        jpmenu.add(btnsalirdmenu);
        btnsalirdmenu.setBounds(1780, 0, 70, 70);

        getContentPane().add(jpmenu, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        this.dispose();
        agregarjf ag = new agregarjf();
        ag.setVisible(true);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnminimizarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarmenuActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarmenuActionPerformed

    private void btnsalirdmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirdmenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirdmenuActionPerformed

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
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnminimizarmenu;
    private javax.swing.JButton btnsalirdmenu;
    private jcMousePanel.jcMousePanel jpmenu;
    // End of variables declaration//GEN-END:variables
}
