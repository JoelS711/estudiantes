
import controlador.Controlador;
import modelo.ConsultasDAO;
import modelo.EstudiantesDTO;
import vista.Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JoelS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudiantesDTO modest = new EstudiantesDTO();
        ConsultasDAO modconsul = new ConsultasDAO();
        Vista vjf = new Vista();
        Controlador ctrl = new Controlador(modest, vjf, modconsul);
        ctrl.iniciar();
        vjf.setBounds(100, 100, 600, 500);
        vjf.setVisible(true);
    }

}
