/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author ZOMBY
 */
public class V_BuscarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form V_BuscarPaciente
     */
    public V_BuscarPaciente() {
        initComponents();
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
        jcb_buscar_por = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtf_dato_a_buscar = new javax.swing.JTextField();
        jb_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jl_abonar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_cuenta_credito = new javax.swing.JLabel();
        jcb_select_paciente = new javax.swing.JComboBox<>();
        jb_hist_complet = new javax.swing.JButton();
        jb_add_cita = new javax.swing.JButton();
        jb_abonar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb_salir = new javax.swing.JButton();
        jb_credito = new javax.swing.JButton();
        jl_otorgaCredito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(94, 117, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcb_buscar_por.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcb_buscar_por.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "Num. Paciente" }));
        jPanel1.add(jcb_buscar_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, 30));

        jtf_dato_a_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jtf_dato_a_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 270, 30));

        jb_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_50_50.png"))); // NOI18N
        jb_buscar.setBorder(null);
        jb_buscar.setBorderPainted(false);
        jb_buscar.setContentAreaFilled(false);
        jb_buscar.setFocusPainted(false);
        jb_buscar.setFocusable(false);
        jPanel1.add(jb_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 50, 50));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 70, 30));

        jl_abonar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_abonar.setForeground(new java.awt.Color(255, 255, 255));
        jl_abonar.setText("Abonar");
        jPanel1.add(jl_abonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, 20));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecciona Paciente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BUSCAR PACIENTE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jl_cuenta_credito.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jl_cuenta_credito.setForeground(new java.awt.Color(255, 255, 255));
        jl_cuenta_credito.setText("$0.00");
        jPanel1.add(jl_cuenta_credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jcb_select_paciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jcb_select_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 600, -1));

        jb_hist_complet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Archivo_80_80.png"))); // NOI18N
        jb_hist_complet.setBorder(null);
        jb_hist_complet.setBorderPainted(false);
        jb_hist_complet.setContentAreaFilled(false);
        jb_hist_complet.setFocusPainted(false);
        jb_hist_complet.setFocusable(false);
        jPanel1.add(jb_hist_complet, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 80));

        jb_add_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Agenda_80_80.png"))); // NOI18N
        jb_add_cita.setBorder(null);
        jb_add_cita.setBorderPainted(false);
        jb_add_cita.setContentAreaFilled(false);
        jb_add_cita.setFocusPainted(false);
        jb_add_cita.setFocusable(false);
        jPanel1.add(jb_add_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 80, 80));

        jb_abonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cobrar_80_80.png"))); // NOI18N
        jb_abonar.setBorder(null);
        jb_abonar.setBorderPainted(false);
        jb_abonar.setContentAreaFilled(false);
        jb_abonar.setFocusPainted(false);
        jb_abonar.setFocusable(false);
        jPanel1.add(jb_abonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 80, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Historial Completo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agendar Cita");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, 20));

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar_40_40.png"))); // NOI18N
        jb_salir.setBorder(null);
        jb_salir.setBorderPainted(false);
        jb_salir.setContentAreaFilled(false);
        jb_salir.setFocusPainted(false);
        jb_salir.setFocusable(false);
        jPanel1.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 40, 40));

        jb_credito.setText("Otorgar Credito");
        jPanel1.add(jb_credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 80, 80));

        jl_otorgaCredito.setForeground(new java.awt.Color(254, 254, 254));
        jl_otorgaCredito.setText("Otorgar  credito");
        jPanel1.add(jl_otorgaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 490));

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
            java.util.logging.Logger.getLogger(V_BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_BuscarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jb_abonar;
    public javax.swing.JButton jb_add_cita;
    public javax.swing.JButton jb_buscar;
    public javax.swing.JButton jb_credito;
    public javax.swing.JButton jb_hist_complet;
    public javax.swing.JButton jb_salir;
    public javax.swing.JComboBox<String> jcb_buscar_por;
    public javax.swing.JComboBox<String> jcb_select_paciente;
    public javax.swing.JLabel jl_abonar;
    public javax.swing.JLabel jl_cuenta_credito;
    public javax.swing.JLabel jl_otorgaCredito;
    public javax.swing.JTextField jtf_dato_a_buscar;
    // End of variables declaration//GEN-END:variables
}
