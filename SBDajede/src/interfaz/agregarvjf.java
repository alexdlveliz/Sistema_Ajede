/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author alexd
 */
public class agregarvjf extends javax.swing.JFrame {
    ImageIcon vol2 = new ImageIcon(new ImageIcon(getClass().getResource("/fondos/avol2.jpg")).getImage());
    /** Creates new form agregarvjf */
    public agregarvjf() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanio = tk.getScreenSize();
        if((tamanio.width == 1920) && (tamanio.height == 1080))
        {
            
        }
        else if((tamanio.width == 1366) && (tamanio.height == 768)) //1366.768, alex: 1708.960
        {
            this.setSize(1250, 700);
            jpvoluntariado.setIcon(vol2);
            jScrollPane1.setLocation(10, 145);
            jScrollPane2.setLocation(10, 450);
            jScrollPane3.setLocation(620, 145);
            btnguardar.setLocation(980, 455);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpvoluntariado = new jcMousePanel.jcMousePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproyecto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jpvoluntariado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/avol2.jpg"))); // NOI18N
        jpvoluntariado.setName("jpvoluntariado"); // NOI18N
        jpvoluntariado.setVisibleLogo(false);
        jpvoluntariado.setLayout(null);

        tablaproyecto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaproyecto);

        jpvoluntariado.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 550, 230);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jpvoluntariado.add(jScrollPane2);
        jScrollPane2.setBounds(20, 450, 550, 220);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jpvoluntariado.add(jScrollPane3);
        jScrollPane3.setBounds(580, 150, 550, 220);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Checkmark_black_30px.png"))); // NOI18N
        btnguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generales/Checkmark_black_50px.png"))); // NOI18N
        jpvoluntariado.add(btnguardar);
        btnguardar.setBounds(820, 460, 130, 110);

        getContentPane().add(jpvoluntariado, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(agregarvjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarvjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarvjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarvjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarvjf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private jcMousePanel.jcMousePanel jpvoluntariado;
    private javax.swing.JTable tablaproyecto;
    // End of variables declaration//GEN-END:variables

}