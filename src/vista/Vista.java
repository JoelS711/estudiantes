/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author JoelS
 */
public class Vista extends javax.swing.JFrame {

    public javax.swing.JLabel jLabelnombre;
    public javax.swing.JTextField jTextnombre;
    public javax.swing.JLabel jLabelapellido;
    public javax.swing.JTextField jTextapellido;
    public javax.swing.JLabel jLabelfecha_nac;
    public javax.swing.JTextField jTextfecha_nac;
    public javax.swing.JLabel jLabelcorreo_ins;
    public javax.swing.JTextField jTextcorreo_ins;
    public javax.swing.JLabel jLabelcorreo_per;
    public javax.swing.JTextField jTextcorreo_per;
    public javax.swing.JLabel jLabelcelular;
    public javax.swing.JTextField jTextcelular;
    public javax.swing.JLabel jLabelfijo;
    public javax.swing.JTextField jTextfijo;
    public javax.swing.JLabel jLabelprograma;
    public javax.swing.JTextField jTextprograma;
    //Botones
    public javax.swing.JButton jButtonagregar;
    public javax.swing.JButton jButtonbuscar;
    public javax.swing.JButton jButtonmodificar;
    public javax.swing.JButton jButtoneliminar;
    public javax.swing.JButton jButtonmostrar;
    public javax.swing.JButton jButtonlimpiar;
    public javax.swing.JButton jButtonsalir;

    public Vista() {
        setLayout(null);
        //Variables declaradas
        jLabelnombre = new javax.swing.JLabel();
        jLabelnombre.setText("Nombre");
        jTextnombre = new javax.swing.JTextField();
        jTextnombre.setText("");

        jLabelapellido = new javax.swing.JLabel();
        jLabelapellido.setText("Apellido");
        jTextapellido = new javax.swing.JTextField();
        jTextapellido.setText("");

        jLabelfecha_nac = new javax.swing.JLabel();
        jLabelfecha_nac.setText("Fecha de nacimiento");
        jTextfecha_nac = new javax.swing.JTextField();
        jTextfecha_nac.setText("");

        jLabelcorreo_ins = new javax.swing.JLabel();
        jLabelcorreo_ins.setText("Correo Institucional");
        jTextcorreo_ins = new javax.swing.JTextField();
        jTextcorreo_ins.setText("");

        jLabelcorreo_per = new javax.swing.JLabel();
        jLabelcorreo_per.setText("Correo personal");
        jTextcorreo_per = new javax.swing.JTextField();
        jTextcorreo_per.setText("");

        jLabelcelular = new javax.swing.JLabel();
        jLabelcelular.setText("Celular");
        jTextcelular = new javax.swing.JTextField();
        jTextcelular.setText("");

        jLabelfijo = new javax.swing.JLabel();
        jLabelfijo.setText("Fijo");
        jTextfijo = new javax.swing.JTextField();
        jTextfijo.setText("");

        jLabelprograma = new javax.swing.JLabel();
        jLabelprograma.setText("Programa");
        jTextprograma = new javax.swing.JTextField();
        jTextprograma.setText("");

        jButtonagregar = new javax.swing.JButton();
        jButtonagregar.setText("AGREGAR");
        jButtonbuscar = new javax.swing.JButton();
        jButtonbuscar.setText("BUSCAR");
        jButtonmodificar = new javax.swing.JButton();
        jButtonmodificar.setText("MODIFICAR");
        jButtoneliminar = new javax.swing.JButton();
        jButtoneliminar.setText("ELIMINAR");
        jButtonmostrar = new javax.swing.JButton();
        jButtonmostrar.setText("MOSTRAR");
        jButtonsalir = new javax.swing.JButton();
        jButtonsalir.setText("SALIR");
        jButtonlimpiar = new javax.swing.JButton();
        jButtonlimpiar.setText("LIMPIAR");

        //SetBound de las variables
        jLabelnombre.setBounds(20, 20, 100, 20);
        add(jLabelnombre);
        jTextnombre.setBounds(150, 20, 300, 20);
        add(jTextnombre);

        jLabelapellido.setBounds(20, 50, 100, 20);
        add(jLabelapellido);
        jTextapellido.setBounds(150, 50, 300, 20);
        add(jTextapellido);

        jLabelfecha_nac.setBounds(20, 80, 150, 20);
        add(jLabelfecha_nac);
        jTextfecha_nac.setBounds(150, 80, 300, 20);
        add(jTextfecha_nac);

        jLabelcorreo_ins.setBounds(20, 110, 150, 20);
        add(jLabelcorreo_ins);
        jTextcorreo_ins.setBounds(150, 110, 300, 20);
        add(jTextcorreo_ins);

        jLabelcorreo_per.setBounds(20, 140, 150, 20);
        add(jLabelcorreo_per);
        jTextcorreo_per.setBounds(150, 140, 300, 20);
        add(jTextcorreo_per);

        jLabelcelular.setBounds(20, 170, 100, 20);
        add(jLabelcelular);
        jTextcelular.setBounds(150, 170, 300, 20);
        add(jTextcelular);

        jLabelfijo.setBounds(20, 200, 100, 20);
        add(jLabelfijo);
        jTextfijo.setBounds(150, 200, 300, 20);
        add(jTextfijo);

        jLabelprograma.setBounds(20, 230, 100, 20);
        add(jLabelprograma);
        jTextprograma.setBounds(150, 230, 300, 20);
        add(jTextprograma);

        //setBound de Botones
        jButtonagregar.setBounds(30, 300, 100, 30);
        add(jButtonagregar);

        jButtonbuscar.setBounds(120, 300, 100, 30);
        add(jButtonbuscar);

        jButtonmodificar.setBounds(210, 300, 100, 30);
        add(jButtonmodificar);

        jButtoneliminar.setBounds(300, 300, 100, 30);
        add(jButtoneliminar);

        jButtonmostrar.setBounds(390, 300, 100, 30);
        add(jButtonmostrar);

        jButtonsalir.setBounds(165, 340, 100, 30);
        add(jButtonsalir);
        jButtonsalir.setBackground(new java.awt.Color(243, 70, 74));

        jButtonlimpiar.setBounds(255, 340, 100, 30);
        add(jButtonlimpiar);

    }

}
