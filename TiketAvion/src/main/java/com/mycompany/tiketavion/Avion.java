/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import java.util.HashMap;
import javafx.scene.text.Text;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class Avion {
    /**
     * variable id
     */
    int id;
    /**
     * variable total
     */
    int total;
    /**
     * variable avion
     */
    String[] avion={"s","a","a","a","s","a","d","a","a","d","s","s","d","r","s","w","d","r","q","e","t"};
    public Avion(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void crearAvion(){ 
        
        
    }
    public Integer calcularTotal(){
        return null;
    }
}