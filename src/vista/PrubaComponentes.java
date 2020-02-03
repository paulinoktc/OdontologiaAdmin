/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZOMBY
 */
public class PrubaComponentes extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form PrubaComponentes
     */
    public PrubaComponentes() {
        initComponents();
        jb_as.setIcon(setIcono("/iconos/book.png", jb_as));

        model = new DefaultTableModel();
        model.addColumn("CONCEPTO");
        model.addColumn("PRECIO");
        model.addColumn("CANTIDAD");
        model.addColumn("TOTAL");

        String[] fila1 = {"AMALGAMAS", "0", "0", "0"};
        String[] fila2 = {"RECINAS", "0", "0", "0"};
        String[] fila3 = {"INCRUSTACIONES", "0", "0", "0"};
        String[] fila4 = {" ", "0", "0", "0"};
        String[] fila5 = {" ", "0", "0", "0"};
        model.addRow(fila1);
        model.addRow(fila2);
        model.addRow(fila3);
        model.addRow(fila4);
        model.addRow(fila5);

        jTable1.setModel(model);
        jt_ds.setModel(model);

        jt_ds.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt){
                SumasTabla(evt);
            }
        });
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
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb_as = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_ds = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("jTextField1");
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 109, 202, -1));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 135, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AMALGAMAS", "0", "0", "0"},
                {"RESINAS", "0", "0", "0"},
                {"INSCRUSTACIONES", "0", "0", "0"},
                {null, "0", "0", "0"},
                {null, "0", "0", "0"}
            },
            new String [] {
                "CONCEPTO", "PRECIO", "CANTIDAD", "SUMAS"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 438, 277));

        jb_as.setBorder(null);
        jb_as.setBorderPainted(false);
        jb_as.setContentAreaFilled(false);
        jb_as.setFocusPainted(false);
        jb_as.setFocusable(false);
        jb_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asActionPerformed(evt);
            }
        });
        jPanel1.add(jb_as, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 150, 140));

        jt_ds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jt_ds);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 380, 170));

        jRadioButton1.setText("jRadioButton1");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1278, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asActionPerformed
        // TODO add your handling code here:
        //SumasTabla();
    }//GEN-LAST:event_jb_asActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       SumasTabla(evt);
    }//GEN-LAST:event_jTable1MouseClicked

    public void SumasTabla(MouseEvent evt) {
        int[] cantidades = new int[4];
        cantidades[0] = Integer.parseInt(model.getValueAt(0, 1).toString());
        cantidades[1] = Integer.parseInt(model.getValueAt(0, 2).toString());
        cantidades[2] = cantidades[0] + cantidades[1];

        String[] fin = {"AMALGAMAS", cantidades[0] + "", cantidades[1] + "", cantidades[2] + ""};
        model.removeRow(0);
        model.insertRow(0, fin);
        System.out.println(cantidades[0]);
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
            java.util.logging.Logger.getLogger(PrubaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrubaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrubaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrubaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrubaComponentes().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_as;
    private javax.swing.JTable jt_ds;
    // End of variables declaration//GEN-END:variables
}