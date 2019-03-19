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
    static AvionC avionc = new AvionC(1);
    static AvionA aviona = new AvionA(1);
    static AvionB avionb = new AvionB(1);
    public static void main(String[] args) {
        HashMap<String, Silla> sillas = new HashMap<String, Silla>();
        HashMap<Integer, Persona> persona = new HashMap<Integer, Persona>();
        Persona per= new Persona(1,"daniel");
        sillas.put("A1", new Silla(1,"A1",new Persona(1,"daniel")));
        sillas.put("A2", new Silla(1,"A2",null));
        sillas.put("A3", new Silla(1,"A3",new Persona(3,"paula")));
        sillas.put("A4", new Silla(1,"A4",null));
        sillas.put("A5", new Silla(1,"A5",new Persona(5,"ivan")));
        sillas.put("A6", new Silla(1,"A6",null));
        sillas.put("A7", new Silla(1,"A7",new Persona(7,"david")));
        sillas.put("A8", new Silla(1,"A8",null));
        sillas.put("A9", new Silla(1,"A9",new Persona(7,"david")));
        sillas.put("A10", new Silla(1,"A10",null));
        sillas.put("A11", new Silla(1,"A11",new Persona(7,"david")));
        sillas.put("A12", new Silla(1,"A12",null));
        sillas.get("A1").setEstado('o');
        sillas.get("A2").setEstado('l');
        sillas.get("A3").setEstado('o');
        sillas.get("A4").setEstado('l');
        sillas.get("A5").setEstado('o');
        sillas.get("A6").setEstado('l');
        sillas.get("A7").setEstado('o');
        sillas.get("A8").setEstado('l');
        sillas.get("A9").setEstado('o');
        sillas.get("A10").setEstado('l');
        sillas.get("A11").setEstado('o');
        sillas.get("A12").setEstado('l');
        HashMap<String, Silla> sillasVip = new HashMap<String, Silla>();
        sillasVip.put("A1",new Silla(1,"A1",new Persona(8,"daniela")));
        sillasVip.put("A2",new Silla(1,"A2",null));
        sillasVip.put("A3",new Silla(1,"A3",new Persona(8,"lorena")));
        sillasVip.put("A4",new Silla(1,"A4",null));
        sillasVip.put("A5",new Silla(1,"A5",new Persona(8,"daniela")));
        sillasVip.put("A6",new Silla(1,"A6",null));
        sillasVip.put("A7",new Silla(1,"A7",new Persona(8,"daniela")));
        sillasVip.put("A8",new Silla(1,"A8",null));
        sillasVip.get("A1").setEstado('o');
        sillasVip.get("A2").setEstado('l');
        sillasVip.get("A3").setEstado('o');
        sillasVip.get("A4").setEstado('l');
        sillasVip.get("A5").setEstado('o');
        sillasVip.get("A6").setEstado('l');
        sillasVip.get("A7").setEstado('o');
        sillasVip.get("A8").setEstado('l');
        HashMap<String, Silla> sillasNormales = new HashMap<String, Silla>();
        sillasNormales.put("B1",new Silla(1,"B1",new Persona(8,"daniela")));
        sillasNormales.put("B2",new Silla(1,"B2",null));
        sillasNormales.put("B3",new Silla(1,"B3",new Persona(8,"lorena")));
        sillasNormales.put("B4",new Silla(1,"B4",null));
        sillasNormales.put("B5",new Silla(1,"B5",new Persona(8,"daniela")));
        sillasNormales.put("B6",new Silla(1,"B6",null));
        sillasNormales.put("B7",new Silla(1,"B7",new Persona(8,"daniela")));
        sillasNormales.put("B8",new Silla(1,"B8",null));
        sillasNormales.get("B1").setEstado('o');
        sillasNormales.get("B2").setEstado('l');
        sillasNormales.get("B3").setEstado('o');
        sillasNormales.get("B4").setEstado('l');
        sillasNormales.get("B5").setEstado('o');
        sillasNormales.get("B6").setEstado('l');
        sillasNormales.get("B7").setEstado('o');
        sillasNormales.get("B8").setEstado('l');
        avionc.setSillasPequeñas(sillas);
        aviona.setSillasVip(sillasVip);
        aviona.setSillasNormales(sillasNormales);
        avionc.crearAvion();
        aviona.crearAvion();
        // TODO code application logic here                
    }
    public HashMap<String, Avion> llenar(){
            HashMap<String, Silla> sillas = new HashMap<String, Silla>();
            HashMap<String, Avion> aviones = new HashMap<String, Avion>();
            HashMap<Integer, Persona> persona = new HashMap<Integer, Persona>();
            Persona per= new Persona(1,"daniel");
            sillas.put("A1", new Silla(1,"A1",new Persona(1,"daniel")));
            sillas.put("A2", new Silla(1,"A2",null));
            sillas.put("A3", new Silla(1,"A3",new Persona(3,"paula")));
            sillas.put("A4", new Silla(1,"A4",null));
            sillas.put("A5", new Silla(1,"A5",new Persona(5,"ivan")));
            sillas.put("A6", new Silla(1,"A6",null));
            sillas.put("A7", new Silla(1,"A7",new Persona(7,"david")));
            sillas.put("A8", new Silla(1,"A8",null));
            sillas.put("A9", new Silla(1,"A9",new Persona(7,"david")));
            sillas.put("A10", new Silla(1,"A10",null));
            sillas.put("A11", new Silla(1,"A11",new Persona(7,"david")));
            sillas.put("A12", new Silla(1,"A12",null));
            sillas.get("A1").setEstado('o');
            sillas.get("A2").setEstado('l');
            sillas.get("A3").setEstado('o');
            sillas.get("A4").setEstado('l');
            sillas.get("A5").setEstado('o');
            sillas.get("A6").setEstado('l');
            sillas.get("A7").setEstado('o');
            sillas.get("A8").setEstado('l');
            sillas.get("A9").setEstado('o');
            sillas.get("A10").setEstado('l');
            sillas.get("A11").setEstado('o');
            sillas.get("A12").setEstado('l');
            HashMap<String, Silla> sillasVip = new HashMap<String, Silla>();
            sillasVip.put("A1",new Silla(1,"A1",new Persona(8,"daniela")));
            sillasVip.put("A2",new Silla(1,"A2",null));
            sillasVip.put("A3",new Silla(1,"A3",new Persona(8,"lorena")));
            sillasVip.put("A4",new Silla(1,"A4",null));
            sillasVip.put("A5",new Silla(1,"A5",new Persona(8,"daniela")));
            sillasVip.put("A6",new Silla(1,"A6",null));
            sillasVip.put("A7",new Silla(1,"A7",new Persona(8,"daniela")));
            sillasVip.put("A8",new Silla(1,"A8",null));
            sillasVip.get("A1").setEstado('o');
            sillasVip.get("A2").setEstado('l');
            sillasVip.get("A3").setEstado('o');
            sillasVip.get("A4").setEstado('l');
            sillasVip.get("A5").setEstado('o');
            sillasVip.get("A6").setEstado('l');
            sillasVip.get("A7").setEstado('o');
            sillasVip.get("A8").setEstado('l');
            HashMap<String, Silla> sillasNormales = new HashMap<String, Silla>();
            sillasNormales.put("B1",new Silla(1,"B1",new Persona(8,"daniela")));
            sillasNormales.put("B2",new Silla(1,"B2",null));
            sillasNormales.put("B3",new Silla(1,"B3",new Persona(8,"lorena")));
            sillasNormales.put("B4",new Silla(1,"B4",null));
            sillasNormales.put("B5",new Silla(1,"B5",new Persona(8,"daniela")));
            sillasNormales.put("B6",new Silla(1,"B6",null));
            sillasNormales.put("B7",new Silla(1,"B7",new Persona(8,"daniela")));
            sillasNormales.put("B8",new Silla(1,"B8",null));
            sillasNormales.get("B1").setEstado('o');
            sillasNormales.get("B2").setEstado('l');
            sillasNormales.get("B3").setEstado('o');
            sillasNormales.get("B4").setEstado('l');
            sillasNormales.get("B5").setEstado('o');
            sillasNormales.get("B6").setEstado('l');
            sillasNormales.get("B7").setEstado('o');
            sillasNormales.get("B8").setEstado('l');
            avionc.setSillasPequeñas(sillas);
            aviona.setSillasVip(sillasVip);
            aviona.setSillasNormales(sillasNormales);
            avionc.crearAvion();
            aviona.crearAvion();
            return aviones;
        }
    
}
