/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import java.util.HashMap;

/**
 *
 * @author daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static AvionC avion = new AvionC(1);
    public static void main(String[] args) {
        HashMap<String, Silla> sillas = new HashMap<String, Silla>();
        HashMap<Integer, Persona> persona = new HashMap<Integer, Persona>();
        Persona per= new Persona(1,"daniel");
        sillas.put("A1", new Silla(1,"A1",new Persona(1,"daniel")));
        sillas.put("A2", new Silla(1,"A2",new Persona(2,"mateo")));
        sillas.put("A3", new Silla(1,"A3",new Persona(3,"paula")));
        sillas.put("A4", new Silla(1,"A4",new Persona(4,"laura")));
        sillas.put("A5", new Silla(1,"A5",new Persona(5,"ivan")));
        sillas.put("A6", new Silla(1,"A6",new Persona(6,"juan")));
        sillas.put("A7", new Silla(1,"A7",new Persona(7,"david")));
        sillas.put("A8", new Silla(1,"A8",new Persona(8,"daniela")));
        sillas.get("A1").setEstado('o');
        sillas.get("A2").setEstado('l');
        sillas.get("A3").setEstado('o');
        sillas.get("A4").setEstado('l');
        sillas.get("A5").setEstado('o');
        sillas.get("A6").setEstado('l');
        sillas.get("A7").setEstado('o');
        sillas.get("A8").setEstado('l');
        avion.setSillasPequeñas(sillas);
        avion.crearAvion();
        // TODO code application logic here
    }
    
}
