/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import java.util.Date;

/**
 *
 * @author daniel
 */
public class Persona {
    int id;
    String nombre;
    Date fecha;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarPersona(){
        System.err.println("numero: "+this.id);
        System.err.println("numero: "+this.getNombre());
    }
}
