/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZOMBY
 */
public class V_Cobrar extends javax.swing.JFrame {
public DefaultTableModel defModel;
    /**
     * Creates new form V_Cobrar
     */
    public V_Cobrar() {
        initComponents();
        defModel=new DefaultTableModel();
        defModel.addColumn("Concepto");
        defModel.addColumn("Cantidad");
        this.jtab_venta.setModel(defModel);
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
        jl_titulo = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jb_cobrar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtab_venta = new javax.swing.JTable();
        jl_total_pagar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb_add = new javax.swing.JButton();
        jb_rm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(94, 117, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo.setBackground(new java.awt.Color(255, 255, 255));
        jl_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_titulo.setText("Registrar Venta");
        jPanel1.add(jl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 220, -1));

        jl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jl_nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre.setText("NOMBRE:");
        jPanel1.add(jl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 430, -1));
        jPanel1.add(jb_cobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 260, 50));

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar_40_40.png"))); // NOI18N
        jb_salir.setBorder(null);
        jb_salir.setBorderPainted(false);
        jb_salir.setContentAreaFilled(false);
        jb_salir.setFocusPainted(false);
        jb_salir.setFocusable(false);
        jPanel1.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 40));

        jtab_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Concepto", "cantidad"
            }
        ));
        jScrollPane1.setViewportView(jtab_venta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 440, 160));

        jl_total_pagar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jl_total_pagar.setForeground(new java.awt.Color(255, 255, 255));
        jl_total_pagar.setText("$0.0");
        jPanel1.add(jl_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 270, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jb_add.setText("+");
        jPanel1.add(jb_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 30, 30));

        jb_rm.setText("-");
        jPanel1.add(jb_rm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));

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
            java.util.logging.Logger.getLogger(V_Cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Cobrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jb_add;
    public javax.swing.JButton jb_cobrar;
    public javax.swing.JButton jb_rm;
    public javax.swing.JButton jb_salir;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_titulo;
    public javax.swing.JLabel jl_total_pagar;
    public javax.swing.JTable jtab_venta;
    // End of variables declaration//GEN-END:variables
}
