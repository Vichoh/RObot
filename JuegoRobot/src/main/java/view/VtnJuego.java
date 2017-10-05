/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Adrian
 */
public class VtnJuego extends JFrame{
    
    private PanelBotones panelBotones;
     public Tablero tablero;
     
    public VtnJuego (){
          this.initComponent(); 
    }
    
    
    private void initComponent(){
        this.tablero = new Tablero(5, 5);
        this.tablero.generarTablero();      
        this.panelBotones = new PanelBotones();
        this.panelBotones.setBorder(new EmptyBorder (10,10,10,10));
       /*
        cargarEnergia(this.tablero);
        generarBloques(this.tablero);
        posicionarRobot1(this.tablero);
        posicionarRobot2(this.tablero);*/
        
        this.add(this.tablero, BorderLayout.CENTER);
        this.add(this.panelBotones, BorderLayout.EAST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 400);
        this.setLocation(150, 150);
        this.setVisible(true);
    } 
    
    /*
    private void cargarEnergia(Tablero tablero){
        this.panelBotones.getBtnCarEnergia().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.generarEnergia();
            }
        });
    }
    
    private void generarBloques(Tablero tablero){
        this.panelBotones.getBtnGenBloques().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.borrarEnergiaCeldas();
                tablero.limpiarRobots();
            }
        });
    }
    
     private void posicionarRobot1(Tablero tablero){
        this.panelBotones.getBtnPosRobot1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.ubicarRobot(tablero.robot1);
                tablero.dibujarRobot(tablero.robot1);
            }
        });
    }
     
      private void posicionarRobot2(Tablero tablero){
        this.panelBotones.getBtnPosRobot2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.limpiarRobots();
                tablero.ubicarRobot(tablero.robot2);
                tablero.dibujarRobot(tablero.robot2);
            }
        });
    }*/
    
}
