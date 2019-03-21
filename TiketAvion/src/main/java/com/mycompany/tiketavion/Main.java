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
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static AvionC avionc = new AvionC(1);
    static AvionA aviona = new AvionA(1);
    static AvionB avionb = new AvionB(1);
    static MetodoPrincipal me= new MetodoPrincipal();
    public static void main(String[] args) throws ParseException {
        me.menu();
    }   
}
