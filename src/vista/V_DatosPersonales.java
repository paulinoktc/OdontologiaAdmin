/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author ZOMBY
 */
public class V_DatosPersonales extends javax.swing.JFrame {

    Graphics2D jPanelGraphics;
    BufferedImage buffer;

    public void setPanel(Graphics2D jPanelGraphics) {
        this.jPanelGraphics = jPanelGraphics;
    }

    public void setBuffer(BufferedImage buffer) {
        this.buffer = buffer;
    }

    /**
     * Creates new form V_DatosPersonales
     */
    public V_DatosPersonales() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        jPanelGraphics.drawImage(buffer, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jp_datosPersonales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_ap_materno = new javax.swing.JTextField();
        tratamiento = new javax.swing.JLabel();
        jt_domicilio = new javax.swing.JTextField();
        jcb_sexo = new javax.swing.JComboBox<>();
        jb_mas = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtf_ocupacion = new javax.swing.JTextField();
        jt_representante = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jcb_estadoCivil = new javax.swing.JComboBox<>();
        jcb_escolaridad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jt_motiv_visita = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jt_correo = new javax.swing.JTextField();
        jcb_t_consulta = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jt_ap_paterno = new javax.swing.JTextField();
        jl_domicilio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_tratamiento = new javax.swing.JTextArea();
        jd_fechcaNacimiento = new com.toedter.calendar.JDateChooser();
        jl_antecedentes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jrb_apRespiratorio = new javax.swing.JRadioButton();
        jrb_aparatoCardio = new javax.swing.JRadioButton();
        jrb_apDigestivo = new javax.swing.JRadioButton();
        jrb_sistemNervioso = new javax.swing.JRadioButton();
        jrb_probGoaulacion = new javax.swing.JRadioButton();
        jrb_desmayos = new javax.swing.JRadioButton();
        jrb_vertigos = new javax.swing.JRadioButton();
        jrb_diabetes = new javax.swing.JRadioButton();
        jrb_tiroides = new javax.swing.JRadioButton();
        jrb_fiebreReumatica = new javax.swing.JRadioButton();
        jrb_hipertencion = new javax.swing.JRadioButton();
        jrb_embarazada = new javax.swing.JRadioButton();
        jcb_mesesEmbarazo = new javax.swing.JComboBox<>();
        jrb_fuma = new javax.swing.JRadioButton();
        jrb_alcohol = new javax.swing.JRadioButton();
        jrb_drogas = new javax.swing.JRadioButton();
        jrb_alergias = new javax.swing.JRadioButton();
        jtf_alergias = new javax.swing.JTextField();
        jrb_anti = new javax.swing.JRadioButton();
        jtf_anti = new javax.swing.JTextField();
        jcb_higieneBucal = new javax.swing.JComboBox<>();
        jb_addAlegia = new javax.swing.JButton();
        jp_habitos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jrb_brincomania = new javax.swing.JRadioButton();
        jrb_contracciones = new javax.swing.JRadioButton();
        jrb_habitMoridida = new javax.swing.JRadioButton();
        jrb_respiracionBucal = new javax.swing.JRadioButton();
        jcb_alimentacion = new javax.swing.JComboBox<>();
        BajoTratamiento = new javax.swing.JRadioButton();
        jrb_medicamento = new javax.swing.JRadioButton();
        jrb_hospializado = new javax.swing.JRadioButton();
        jtf_medicamento = new javax.swing.JTextField();
        jtf_hospitalizado = new javax.swing.JTextField();
        jb_add = new javax.swing.JButton();
        jrb_encia = new javax.swing.JRadioButton();
        jrb_lengua = new javax.swing.JRadioButton();
        jrb_carrillo = new javax.swing.JRadioButton();
        jb_more_medic = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jl_lengua = new javax.swing.JLabel();
        jcb_frenillo = new javax.swing.JComboBox<>();
        jl_mejilla = new javax.swing.JLabel();
        jl_labios = new javax.swing.JLabel();
        jl_Paladar = new javax.swing.JLabel();
        jl_Encia = new javax.swing.JLabel();
        jtf_labios = new javax.swing.JTextField();
        jtf_mejilla = new javax.swing.JTextField();
        jtf_lengua = new javax.swing.JTextField();
        jtf_paladar = new javax.swing.JTextField();
        jtf_encia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_observaciones = new javax.swing.JTextArea();
        jp_odontograma = new javax.swing.JPanel();

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_datosPersonales.setBackground(new java.awt.Color(94, 117, 116));
        jp_datosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESA LOS DATOS DEL PACIENTE");
        jp_datosPersonales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre: ");
        jp_datosPersonales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jt_telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 120, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("A Materno");
        jp_datosPersonales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA NACIMIENTO");
        jp_datosPersonales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 20));

        jt_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 170, 20));

        jt_ap_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_ap_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 260, 20));

        tratamiento.setBackground(new java.awt.Color(204, 204, 255));
        tratamiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tratamiento.setForeground(new java.awt.Color(255, 255, 255));
        tratamiento.setText("Tratamiento");
        jp_datosPersonales.add(tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, 20));

        jt_domicilio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, 20));

        jcb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "F", "M" }));
        jp_datosPersonales.add(jcb_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 70, 20));

        jb_mas.setText("AGREGAR");
        jp_datosPersonales.add(jb_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Telefono:");
        jp_datosPersonales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Representante");
        jp_datosPersonales.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 20));

        jtf_ocupacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jtf_ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, 20));

        jt_representante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_representante, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 220, 20));

        jLabel18.setBackground(new java.awt.Color(204, 204, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("OCUPACION");
        jp_datosPersonales.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jcb_estadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTADO CIVIL", "CASADO", "SOLTERO" }));
        jp_datosPersonales.add(jcb_estadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, -1));

        jcb_escolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLARIDAD", "PREESCOLAR", "PRIMARIA", "SECUNDARIA", "BACHILLERATO", "MEDIA SUPERIOR", "CARRERA", " " }));
        jp_datosPersonales.add(jcb_escolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Motivo Visita");
        jp_datosPersonales.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jt_motiv_visita.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_motiv_visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 220, 20));

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Correo");
        jp_datosPersonales.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        jt_correo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 220, 20));

        jcb_t_consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Consulta" }));
        jp_datosPersonales.add(jcb_t_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 150, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("A Paterno");
        jp_datosPersonales.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jt_ap_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jp_datosPersonales.add(jt_ap_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 210, 20));

        jl_domicilio.setBackground(new java.awt.Color(204, 204, 255));
        jl_domicilio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_domicilio.setForeground(new java.awt.Color(255, 255, 255));
        jl_domicilio.setText("Domicilio:");
        jp_datosPersonales.add(jl_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        jta_tratamiento.setColumns(20);
        jta_tratamiento.setRows(5);
        jScrollPane1.setViewportView(jta_tratamiento);

        jp_datosPersonales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 250, -1));

        jd_fechcaNacimiento.setDateFormatString("yyyy-MM-d");
        jp_datosPersonales.add(jd_fechcaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, -1));

        getContentPane().add(jp_datosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        jl_antecedentes.setBackground(new java.awt.Color(94, 117, 116));
        jl_antecedentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(94, 117, 116));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ANTECEDENTES PERSONALES");
        jl_antecedentes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jrb_apRespiratorio.setBackground(new java.awt.Color(94, 117, 116));
        jrb_apRespiratorio.setForeground(new java.awt.Color(255, 255, 255));
        jrb_apRespiratorio.setText("Aparato Respiratorio");
        jl_antecedentes.add(jrb_apRespiratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jrb_aparatoCardio.setBackground(new java.awt.Color(94, 117, 116));
        jrb_aparatoCardio.setForeground(new java.awt.Color(255, 255, 255));
        jrb_aparatoCardio.setText("Aparato Cardiobascular");
        jl_antecedentes.add(jrb_aparatoCardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jrb_apDigestivo.setBackground(new java.awt.Color(94, 117, 116));
        jrb_apDigestivo.setForeground(new java.awt.Color(255, 255, 255));
        jrb_apDigestivo.setText("Aparato Digestivo");
        jl_antecedentes.add(jrb_apDigestivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jrb_sistemNervioso.setBackground(new java.awt.Color(94, 117, 116));
        jrb_sistemNervioso.setForeground(new java.awt.Color(255, 255, 255));
        jrb_sistemNervioso.setText("Sistema Nervioso");
        jl_antecedentes.add(jrb_sistemNervioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jrb_probGoaulacion.setBackground(new java.awt.Color(94, 117, 116));
        jrb_probGoaulacion.setForeground(new java.awt.Color(255, 255, 255));
<<<<<<< HEAD
        jrb_probGoaulacion.setText("Probelmas de Goagualacion");
=======
        jrb_probGoaulacion.setText("Problemas de Coagulacion");
>>>>>>> objetos
        jl_antecedentes.add(jrb_probGoaulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jrb_desmayos.setBackground(new java.awt.Color(94, 117, 116));
        jrb_desmayos.setForeground(new java.awt.Color(255, 255, 255));
        jrb_desmayos.setText("Desmayos");
        jl_antecedentes.add(jrb_desmayos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jrb_vertigos.setBackground(new java.awt.Color(94, 117, 116));
        jrb_vertigos.setForeground(new java.awt.Color(255, 255, 255));
        jrb_vertigos.setText("Vertigos y Mareos");
        jl_antecedentes.add(jrb_vertigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jrb_diabetes.setBackground(new java.awt.Color(94, 117, 116));
        jrb_diabetes.setForeground(new java.awt.Color(255, 255, 255));
        jrb_diabetes.setText("Diabetes");
        jl_antecedentes.add(jrb_diabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jrb_tiroides.setBackground(new java.awt.Color(94, 117, 116));
        jrb_tiroides.setForeground(new java.awt.Color(255, 255, 255));
        jrb_tiroides.setText("Tiroides");
        jl_antecedentes.add(jrb_tiroides, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jrb_fiebreReumatica.setBackground(new java.awt.Color(94, 117, 116));
        jrb_fiebreReumatica.setForeground(new java.awt.Color(255, 255, 255));
        jrb_fiebreReumatica.setText("Fiebre Reumatica");
        jl_antecedentes.add(jrb_fiebreReumatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jrb_hipertencion.setBackground(new java.awt.Color(94, 117, 116));
        jrb_hipertencion.setForeground(new java.awt.Color(255, 255, 255));
        jrb_hipertencion.setText("Hipertension");
        jl_antecedentes.add(jrb_hipertencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jrb_embarazada.setBackground(new java.awt.Color(94, 117, 116));
        jrb_embarazada.setForeground(new java.awt.Color(255, 255, 255));
        jrb_embarazada.setText("Ebarazada");
        jl_antecedentes.add(jrb_embarazada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jcb_mesesEmbarazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meses", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jl_antecedentes.add(jcb_mesesEmbarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        jrb_fuma.setBackground(new java.awt.Color(94, 117, 116));
        jrb_fuma.setForeground(new java.awt.Color(255, 255, 255));
        jrb_fuma.setText("Fuma");
        jl_antecedentes.add(jrb_fuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jrb_alcohol.setBackground(new java.awt.Color(94, 117, 116));
        jrb_alcohol.setForeground(new java.awt.Color(255, 255, 255));
        jrb_alcohol.setText("Bebe Alcohol");
        jrb_alcohol.setFocusable(false);
        jl_antecedentes.add(jrb_alcohol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jrb_drogas.setBackground(new java.awt.Color(94, 117, 116));
        jrb_drogas.setForeground(new java.awt.Color(255, 255, 255));
        jrb_drogas.setText("Consume Drogas");
        jrb_drogas.setFocusable(false);
        jl_antecedentes.add(jrb_drogas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jrb_alergias.setBackground(new java.awt.Color(94, 117, 116));
        jrb_alergias.setForeground(new java.awt.Color(255, 255, 255));
        jrb_alergias.setText("Alergias");
        jl_antecedentes.add(jrb_alergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        jl_antecedentes.add(jtf_alergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 140, 20));

        jrb_anti.setBackground(new java.awt.Color(94, 117, 116));
        jrb_anti.setForeground(new java.awt.Color(255, 255, 255));
        jrb_anti.setText("Anticonceptivo");
        jl_antecedentes.add(jrb_anti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));
        jl_antecedentes.add(jtf_anti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 140, -1));

        jcb_higieneBucal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Higiene Bucal", "Buena", "Mala" }));
        jl_antecedentes.add(jcb_higieneBucal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jb_addAlegia.setText("+");
        jb_addAlegia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addAlegiaActionPerformed(evt);
            }
        });
        jl_antecedentes.add(jb_addAlegia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        getContentPane().add(jl_antecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 280, 650));

        jp_habitos.setBackground(new java.awt.Color(94, 117, 116));
        jp_habitos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CHUPADORES DE:");
        jp_habitos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jrb_brincomania.setBackground(new java.awt.Color(94, 117, 116));
        jrb_brincomania.setForeground(new java.awt.Color(255, 255, 255));
        jrb_brincomania.setText("Brincomania");
        jp_habitos.add(jrb_brincomania, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jrb_contracciones.setBackground(new java.awt.Color(94, 117, 116));
        jrb_contracciones.setForeground(new java.awt.Color(255, 255, 255));
        jrb_contracciones.setText("Contracciones Musculares");
        jp_habitos.add(jrb_contracciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jrb_habitMoridida.setBackground(new java.awt.Color(94, 117, 116));
        jrb_habitMoridida.setForeground(new java.awt.Color(255, 255, 255));
        jrb_habitMoridida.setText("Habitos De Mordida");
        jp_habitos.add(jrb_habitMoridida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jrb_respiracionBucal.setBackground(new java.awt.Color(94, 117, 116));
        jrb_respiracionBucal.setForeground(new java.awt.Color(255, 255, 255));
        jrb_respiracionBucal.setText("Respiracion Bucal");
        jp_habitos.add(jrb_respiracionBucal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jcb_alimentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentacion", "Buena", "Mala" }));
        jcb_alimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_alimentacionActionPerformed(evt);
            }
        });
        jp_habitos.add(jcb_alimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        BajoTratamiento.setBackground(new java.awt.Color(94, 117, 116));
        BajoTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        BajoTratamiento.setText("Esta Bajo Tratamiento");
        jp_habitos.add(BajoTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jrb_medicamento.setBackground(new java.awt.Color(94, 117, 116));
        jrb_medicamento.setForeground(new java.awt.Color(255, 255, 255));
        jrb_medicamento.setText("Toma Medicamento");
        jp_habitos.add(jrb_medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jrb_hospializado.setBackground(new java.awt.Color(94, 117, 116));
        jrb_hospializado.setForeground(new java.awt.Color(255, 255, 255));
        jrb_hospializado.setText("Ha Sido Hospitalizado");
        jp_habitos.add(jrb_hospializado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jp_habitos.add(jtf_medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 170, -1));
        jp_habitos.add(jtf_hospitalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, -1));

        jb_add.setText("Guardar");
        jp_habitos.add(jb_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 360, -1));

        jrb_encia.setBackground(new java.awt.Color(94, 117, 116));
        jrb_encia.setForeground(new java.awt.Color(255, 255, 255));
        jrb_encia.setText("Encia");
        jp_habitos.add(jrb_encia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jrb_lengua.setBackground(new java.awt.Color(94, 117, 116));
        jrb_lengua.setForeground(new java.awt.Color(255, 255, 255));
        jrb_lengua.setText("Lengua");
        jp_habitos.add(jrb_lengua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jrb_carrillo.setBackground(new java.awt.Color(94, 117, 116));
        jrb_carrillo.setForeground(new java.awt.Color(255, 255, 255));
        jrb_carrillo.setText("Carrillos");
        jp_habitos.add(jrb_carrillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jb_more_medic.setText("+");
        jp_habitos.add(jb_more_medic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar_40_40.png"))); // NOI18N
        jb_salir.setBorder(null);
        jb_salir.setBorderPainted(false);
        jb_salir.setContentAreaFilled(false);
        jb_salir.setFocusPainted(false);
        jb_salir.setFocusable(false);
        jp_habitos.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HABITOS");
        jp_habitos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Observaciones");
        jp_habitos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        jl_lengua.setBackground(new java.awt.Color(204, 204, 255));
        jl_lengua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_lengua.setForeground(new java.awt.Color(255, 255, 255));
        jl_lengua.setText("Lengua");
        jp_habitos.add(jl_lengua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jcb_frenillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frenillo", "Alta", "Media", "Baja" }));
        jp_habitos.add(jcb_frenillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jl_mejilla.setBackground(new java.awt.Color(204, 204, 255));
        jl_mejilla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_mejilla.setForeground(new java.awt.Color(255, 255, 255));
        jl_mejilla.setText("Mejilla");
        jp_habitos.add(jl_mejilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        jl_labios.setBackground(new java.awt.Color(204, 204, 255));
        jl_labios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_labios.setForeground(new java.awt.Color(255, 255, 255));
        jl_labios.setText("Labios");
        jp_habitos.add(jl_labios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 20));

        jl_Paladar.setBackground(new java.awt.Color(204, 204, 255));
        jl_Paladar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Paladar.setForeground(new java.awt.Color(255, 255, 255));
        jl_Paladar.setText("Paladar");
        jp_habitos.add(jl_Paladar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 20));

        jl_Encia.setBackground(new java.awt.Color(204, 204, 255));
        jl_Encia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_Encia.setForeground(new java.awt.Color(255, 255, 255));
        jl_Encia.setText("Encia");
        jp_habitos.add(jl_Encia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 20));
        jp_habitos.add(jtf_labios, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 270, -1));
        jp_habitos.add(jtf_mejilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 270, -1));
        jp_habitos.add(jtf_lengua, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 270, -1));
        jp_habitos.add(jtf_paladar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 270, -1));
        jp_habitos.add(jtf_encia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 270, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TEJIDOS BLANDOS");
        jp_habitos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jta_observaciones.setColumns(20);
        jta_observaciones.setRows(5);
        jScrollPane2.setViewportView(jta_observaciones);

        jp_habitos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 340, -1));

        getContentPane().add(jp_habitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 420, 660));

        jp_odontograma.setBackground(new java.awt.Color(94, 117, 116));
        jp_odontograma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jp_odontograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 610, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_alimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_alimentacionActionPerformed
    }//GEN-LAST:event_jcb_alimentacionActionPerformed

    private void jb_addAlegiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addAlegiaActionPerformed
    }//GEN-LAST:event_jb_addAlegiaActionPerformed

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
            java.util.logging.Logger.getLogger(V_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_DatosPersonales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton BajoTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JButton jb_add;
    public javax.swing.JButton jb_addAlegia;
    public javax.swing.JButton jb_mas;
    public javax.swing.JButton jb_more_medic;
    public javax.swing.JButton jb_salir;
    public javax.swing.JComboBox<String> jcb_alimentacion;
    public javax.swing.JComboBox<String> jcb_escolaridad;
    public javax.swing.JComboBox<String> jcb_estadoCivil;
    public javax.swing.JComboBox<String> jcb_frenillo;
<<<<<<< HEAD
    private javax.swing.JRadioButton jcb_fuma;
=======
>>>>>>> objetos
    public javax.swing.JComboBox<String> jcb_higieneBucal;
    public javax.swing.JComboBox<String> jcb_mesesEmbarazo;
    public javax.swing.JComboBox<String> jcb_sexo;
    public javax.swing.JComboBox<String> jcb_t_consulta;
    public com.toedter.calendar.JDateChooser jd_fechcaNacimiento;
    private javax.swing.JLabel jl_Encia;
    private javax.swing.JLabel jl_Paladar;
    public javax.swing.JPanel jl_antecedentes;
    private javax.swing.JLabel jl_domicilio;
    private javax.swing.JLabel jl_labios;
    private javax.swing.JLabel jl_lengua;
    private javax.swing.JLabel jl_mejilla;
    private javax.swing.JPanel jp_datosPersonales;
    private javax.swing.JPanel jp_habitos;
    public javax.swing.JPanel jp_odontograma;
    public javax.swing.JRadioButton jrb_alcohol;
    public javax.swing.JRadioButton jrb_alergias;
    public javax.swing.JRadioButton jrb_anti;
    public javax.swing.JRadioButton jrb_apDigestivo;
    public javax.swing.JRadioButton jrb_apRespiratorio;
    public javax.swing.JRadioButton jrb_aparatoCardio;
    public javax.swing.JRadioButton jrb_brincomania;
    public javax.swing.JRadioButton jrb_carrillo;
    public javax.swing.JRadioButton jrb_contracciones;
    public javax.swing.JRadioButton jrb_desmayos;
    public javax.swing.JRadioButton jrb_diabetes;
<<<<<<< HEAD
    private javax.swing.JRadioButton jrb_drogas;
    public javax.swing.JRadioButton jrb_embarazada;
    public javax.swing.JRadioButton jrb_encia;
    public javax.swing.JRadioButton jrb_fiebreReumatica;
=======
    public javax.swing.JRadioButton jrb_drogas;
    public javax.swing.JRadioButton jrb_embarazada;
    public javax.swing.JRadioButton jrb_encia;
    public javax.swing.JRadioButton jrb_fiebreReumatica;
    public javax.swing.JRadioButton jrb_fuma;
>>>>>>> objetos
    public javax.swing.JRadioButton jrb_habitMoridida;
    public javax.swing.JRadioButton jrb_hipertencion;
    public javax.swing.JRadioButton jrb_hospializado;
    public javax.swing.JRadioButton jrb_lengua;
    public javax.swing.JRadioButton jrb_medicamento;
    public javax.swing.JRadioButton jrb_probGoaulacion;
    public javax.swing.JRadioButton jrb_respiracionBucal;
    public javax.swing.JRadioButton jrb_sistemNervioso;
    public javax.swing.JRadioButton jrb_tiroides;
    public javax.swing.JRadioButton jrb_vertigos;
    public javax.swing.JTextField jt_ap_materno;
    public javax.swing.JTextField jt_ap_paterno;
    public javax.swing.JTextField jt_correo;
    public javax.swing.JTextField jt_domicilio;
    public javax.swing.JTextField jt_motiv_visita;
    public javax.swing.JTextField jt_nombre;
    public javax.swing.JTextField jt_representante;
    public javax.swing.JTextField jt_telefono;
    public javax.swing.JTextArea jta_observaciones;
    public javax.swing.JTextArea jta_tratamiento;
    public javax.swing.JTextField jtf_alergias;
    public javax.swing.JTextField jtf_anti;
    public javax.swing.JTextField jtf_encia;
    public javax.swing.JTextField jtf_hospitalizado;
    public javax.swing.JTextField jtf_labios;
    public javax.swing.JTextField jtf_lengua;
    public javax.swing.JTextField jtf_medicamento;
    public javax.swing.JTextField jtf_mejilla;
    public javax.swing.JTextField jtf_ocupacion;
    public javax.swing.JTextField jtf_paladar;
    private javax.swing.JLabel tratamiento;
    // End of variables declaration//GEN-END:variables
}
