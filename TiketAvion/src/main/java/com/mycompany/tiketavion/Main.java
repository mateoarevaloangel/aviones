/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import java.text.ParseException;
import java.util.HashMap;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * avion c
     */
    static AvionC avionc = new AvionC(1);
    /**
     * avion b
     */
    static AvionA aviona = new AvionA(1);
    /**
     * avion a
     */
    static AvionB avionb = new AvionB(1);
    static MetodoPrincipal me= new MetodoPrincipal();
    public static void main(String[] args) throws ParseException {
        me.menu();
    }   
}
