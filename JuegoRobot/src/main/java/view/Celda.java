/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;


/**
 *
 * @author Adrian
 */
public class Celda extends JButton{
    
    private boolean solido;
    private int energia;
    private boolean ocupado;
    
    
    public Celda(){
        
        this.energia = 0;
        this.solido = false;
        this.ocupado = false;
    }

    public boolean isSolido() {
        return solido;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setSolido(boolean solido) {
        this.solido = solido;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    
}
