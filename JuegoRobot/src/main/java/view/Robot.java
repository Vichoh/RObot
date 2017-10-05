/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;

/**
 *
 * @author Adrian
 */
public class Robot {
    
    private int postFila;
    private int postColum;
    private String imagen;
    private int cantMaxima;
    private int cantMinima;
    

    public Robot(String imagen) {
        
        this.postColum =0;
        this.postFila =0;
        this.cantMaxima = 0;
        this.cantMinima = 0;
        this.imagen = imagen;
    }

    public int getPostFila() {
        return postFila;
    }

    public void setPostFila(int postFila) {
        this.postFila = postFila;
    }

    public int getPostColum() {
        return postColum;
    }

    public void setPostColum(int postColum) {
        this.postColum = postColum;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

 
    
    
    
}
