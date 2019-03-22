/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class Persona {
    /**
     * variable id
     */
    int id;
    /**
     * variable nombre
     */
    String nombre;
    /**
     * variable fecha
     */
    Date  fecha;
/**
     * const persona
     * @param  id id
     * @param nombre nombre
     */
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * metodo mostrar persona
     */
    public void mostrarPersona(){
        System.err.println("numero: "+this.getId());
        System.err.println("numero: "+this.getNombre());
    }
}
