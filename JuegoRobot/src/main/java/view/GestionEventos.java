/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Adrian
 */
public class GestionEventos implements ActionListener{

     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
      
        JButton btnPresionado = (JButton) e.getSource();
       
        
        switch (btnPresionado.getText()) {
            case "Cargar Energia":
                Tablero.tablero.generarEnergia();
                System.out.println("hola");
                break;
            case "Generar Bloques":
                Tablero.tablero.borrarEnergiaCeldas();
                Tablero.tablero.limpiarRobots();
                break;
            case "Posicionar Robot 2":
                
                 Tablero.tablero.ubicarRobot(Tablero.tablero.robot2);
                Tablero.tablero.dibujarRobot(Tablero.tablero.robot2);
                break;
            case "Posicionar Robot 1":
               
                Tablero.tablero.ubicarRobot(Tablero.tablero.robot1);
                Tablero.tablero.dibujarRobot(Tablero.tablero.robot1);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
