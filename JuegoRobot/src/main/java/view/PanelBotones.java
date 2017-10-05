/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Adrian
 */
public class PanelBotones extends JPanel {
    
    private JButton btnCarEnergia;
    private JButton btnGenBloques;
    private JButton btnPosRobot2;
    private JButton btnPosRobot1;
    
    public PanelBotones (){
        this.initComponent();
    }
    
    private void initComponent(){
        BoxLayout distribucion = new BoxLayout(this, 3);   
        
        this.setLayout(distribucion);
        
        
        this.btnCarEnergia = new JButton("Cargar Energia");
        this.btnCarEnergia.addActionListener(new GestionEventos());
        this.btnCarEnergia.setBackground(Color.darkGray);  
        this.btnCarEnergia.setForeground(Color.white);
        this.add(this.btnCarEnergia);
        
        this.btnGenBloques = new JButton("Generar Bloques");
        this.btnGenBloques.addActionListener(new GestionEventos());
         this.btnGenBloques.setBackground(Color.darkGray);      
          this.btnGenBloques.setForeground(Color.white);
        this.add(this.btnGenBloques);
        
        this.btnPosRobot2 = new JButton("Posicionar Robot 2");
        this.btnPosRobot2.addActionListener(new GestionEventos());
         this.btnPosRobot2.setBackground(Color.darkGray);
          this.btnPosRobot2.setForeground(Color.white);
        this.add(this.btnPosRobot2);
        
        this.btnPosRobot1 = new JButton("Posicionar Robot 1");
        this.btnPosRobot1.addActionListener(new GestionEventos());
         this.btnPosRobot1.setBackground(Color.darkGray);
          this.btnPosRobot1.setForeground(Color.white);
        this.add(this.btnPosRobot1);
            
        
        
    }
    
    
/*
    public JButton getBtnCarEnergia() {
        return btnCarEnergia;
    }

    public JButton getBtnGenBloques() {
        return btnGenBloques;
    }

    public JButton getBtnPosRobot2() {
        return btnPosRobot2;
    }

    public JButton getBtnPosRobot1() {
        return btnPosRobot1;
    }
*/
   
          
}
