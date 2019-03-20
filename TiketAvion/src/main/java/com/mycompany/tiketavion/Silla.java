/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

/**
 *
 * @author daniel
 */
public class Silla {
    int id;
    char estado;
    String nombre;
    Persona persona;
    int precio;
    public Silla(int id, String nombre, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.persona = persona;
    }

    public int getPrecio() {
        return precio;
    }

    public char getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void mostrarSilla(){
        System.err.println("Datos");
        System.err.println("numero: "+this.id);
        System.err.println("nombre: "+this.nombre);
        System.err.println("persona"+persona.nombre);
    }
}
