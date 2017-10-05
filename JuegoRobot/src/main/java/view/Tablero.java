/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Adrian
 */
public class Tablero extends JPanel{

    private final int numCol;
    private final int numFil;
    public Celda[][] casillas;
    public Robot robot1 = new Robot("robot.png");
    public Robot robot2 = new Robot("robot.png");
    public static Tablero tablero;
    
    public Tablero(int col, int  fil){
        this.tablero = this;
        this.numCol = col;
        this.numFil = fil;
        this.casillas = new Celda [this.numFil][this.numCol];
        this.setLayout(new GridLayout(this.numFil, this.numCol));
        
    }
    
    public Tablero (){
        this.tablero = this;
        this.numCol = 5;
        this.numFil = 5;
        this.casillas = new Celda [this.numFil][this.numCol];
        this.setLayout(new GridLayout(this.numFil, this.numCol));
    }
    
    public void generarTablero() {
        aleatorioCeldasSolidas(13,12);
        for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {              
                        
                if (this.casillas [i][j].isSolido()) {
                     this.casillas[i][j].setBackground(Color.BLUE);
                }else{
                     this.casillas[i][j].setBackground(Color.white);
                }
                
                this.add(this.casillas[i][j]);
            }
        }
    }
    
    
    private void aleatorioCeldasSolidas(int solido, int vacio){
        int contSolido = 0;
        int contVacio = 0;
        int random = 0;
        for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {
                 this.casillas[i][j] = new Celda();    
                 random = ((int) (Math.random()*10+1 ));
                if ( random% 2== 0 && contSolido < solido  || contVacio == vacio) {
                    contSolido++;
                    System.out.println(random);
                    this.casillas[i][j].setSolido(true);
                   
                }else{
                   contVacio++;
                   System.out.println(random);
                   this.casillas[i][j].setSolido(false);
                }
            }
        }
    }
    
    
    public void generarEnergia(){
        addValorEnergiaCeldas(estructuraEnergia());
        for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {
                this.casillas[i][j].setText(""+this.casillas[i][j].getEnergia());
                System.out.println(this.casillas[i][j].getEnergia());
            }
        }
    }
      
    private void addValorEnergiaCeldas(int estructuraEnergia [][]){
       
        for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {
                this.casillas[i][j].setEnergia(estructuraEnergia[i][j]);
            }
        }
    }
    
    public void borrarEnergiaCeldas(){
         for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {
                this.casillas[i][j].setText("");
                
            }
        }
    }
    public void limpiarRobots(){
         for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {
                if (casillas[i][j].isOcupado()) {
                    casillas[i][j].setOcupado(false);
                    casillas[i][j].setIcon(null);
                }
                
            }
        }
    }
    
    private int [][] estructuraEnergia(){
        int estructuraEnergia [][] = new int [5][5];
        estructuraEnergia[0][0] = 7; 
        estructuraEnergia[0][1] = 6;
        estructuraEnergia[0][2] = 5;
        estructuraEnergia[0][3] = 6;
        estructuraEnergia[0][4] = 7; 
        estructuraEnergia[1][0] = 6;
        estructuraEnergia[1][1] = 3; 
        estructuraEnergia[1][2] = 2;
        estructuraEnergia[1][3] = 3;
        estructuraEnergia[1][4] = 6;
        estructuraEnergia[2][0] = 5;
        estructuraEnergia[2][1]= 2;
        estructuraEnergia[2][2]= 0;
        estructuraEnergia[2][3]= 2;
        estructuraEnergia[2][4]= 5;
        estructuraEnergia[3][0]= 6;
        estructuraEnergia[3][1]= 3;
        estructuraEnergia[3][2]= 2;
        estructuraEnergia[3][3]= 3;
        estructuraEnergia[3][4]= 6; 
        estructuraEnergia[4][0]= 7;
        estructuraEnergia[4][1]= 6;
        estructuraEnergia[4][2]= 5;
        estructuraEnergia[4][3]= 6;
        estructuraEnergia[4][4]= 7;  
        
        return estructuraEnergia;
    }
    
    public void dibujarRobot (Robot robot){
        for (int i = 0; i < this.numFil; i++) {
            for (int j = 0; j < this.numCol; j++) {
                if (this.casillas[i][j].isOcupado()) {
                    casillas[i][j].setIcon(new ImageIcon((robot.getImagen())));
                }
            }
        }
    }
    
    public void  ubicarRobot (Robot robot){
        boolean resp = true;
        int postFila;
        int postColumna;
        do {
             postFila = (int) (Math.random() * 5);
             postColumna = (int) (Math.random() * 5);
             if (!this.casillas[postFila][postColumna].isOcupado() &&  (this.casillas[postFila][postColumna].isSolido())) {
                this.casillas[postFila][postColumna].setOcupado(true);
                robot.setPostColum(postColumna);
                robot.setPostFila(postFila);
                resp = false;
            }
        } while (resp);
        
       
    }
    
}
