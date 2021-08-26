/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ConsultasDAO;
import modelo.EstudiantesDTO;
import vista.Vista;

/**
 *
 * @author JoelS
 */
public class Controlador implements ActionListener {

    private EstudiantesDTO modest;
    private Vista view;
    private ConsultasDAO modconsul;

    public Controlador(EstudiantesDTO modest, Vista view, ConsultasDAO modconsul) {
        this.modest = modest;
        this.modconsul = modconsul;
        this.view = view;
        this.view.jButtonagregar.addActionListener(this);
        this.view.jButtonbuscar.addActionListener(this);
        this.view.jButtonmodificar.addActionListener(this);
        this.view.jButtoneliminar.addActionListener(this);
        this.view.jButtonmostrar.addActionListener(this);
        this.view.jButtonsalir.addActionListener(this);
        this.view.jButtonlimpiar.addActionListener(this);

    }

    public void iniciar() {
        view.setTitle("LA FLORESTA");
        view.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.jButtonagregar) {
            modest.setNombres(view.jTextnombre.getText());
            modest.setApellidos(view.jTextapellido.getText());
            modest.setFec_nac(view.jTextfecha_nac.getText());
            modest.setCor_ins(view.jTextcorreo_ins.getText());
            modest.setCor_per(view.jTextcorreo_per.getText());
            modest.setCelular(Long.parseLong(view.jTextcelular.getText()));
            modest.setFijo(Long.parseLong(view.jTextfijo.getText()));
            modest.setPrograma(view.jTextprograma.getText());
            if (modconsul.ingresarEstudiante(modest)) {
                JOptionPane.showMessageDialog(null, "Se he registrado el estudiante");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha registrado el estudiante");
                limpiar();
            }

        }

        if (e.getSource() == view.jButtonbuscar) {
            modest.setCor_ins(view.jTextcorreo_ins.getText());
            if (modconsul.buscarEstudiante(modest)) {
                view.jTextnombre.setText(modest.getNombres());
                view.jTextapellido.setText(modest.getApellidos());
                view.jTextfecha_nac.setText(modest.getFec_nac());
                view.jTextcorreo_ins.setText(modest.getCor_ins());
                view.jTextcorreo_per.setText(modest.getCor_per());
                view.jTextcelular.setText(String.valueOf(modest.getCelular()));
                view.jTextfijo.setText(String.valueOf(modest.getFijo()));
                view.jTextprograma.setText(modest.getPrograma());
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningun estudiante");
                limpiar();
            }

        }

        if (e.getSource() == view.jButtonmodificar) {
            modest.setCor_ins(view.jTextcorreo_ins.getText());
            modest.setCor_per(view.jTextcorreo_per.getText());
            modest.setCelular(Long.parseLong(view.jTextcelular.getText()));
            modest.setFijo(Long.parseLong(view.jTextfijo.getText()));
            modest.setPrograma(view.jTextprograma.getText());
            if (modconsul.modificarEstudiante(modest)) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar");
                limpiar();
            }

        }
        if (e.getSource() == view.jButtoneliminar) {
            modest.setCor_ins(view.jTextcorreo_ins.getText());
            if (modconsul.eliminarEstudiante(modest)) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado el estudiante");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el estudiante");
                limpiar();
            }

        }

        if (e.getSource() == view.jButtonmostrar) {
            modconsul.mostrarEstudiante(modest);
        }
        if (e.getSource() == view.jButtonlimpiar) {
            limpiar();
        }

        if (e.getSource() == view.jButtonsalir) {
            System.exit(0);
        }
    }

    public void limpiar() {
        view.jTextnombre.setText(null);
        view.jTextapellido.setText(null);
        view.jTextfecha_nac.setText(null);
        view.jTextcorreo_ins.setText(null);
        view.jTextcorreo_per.setText(null);
        view.jTextcelular.setText(null);
        view.jTextfijo.setText(null);
        view.jTextprograma.setText(null);

    }
}
