/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import static com.mycompany.tiketavion.Main.avionc;
import static com.mycompany.tiketavion.Main.me;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class MetodoPrincipal {
    static AvionC avionc = new AvionC(1);
    static AvionA aviona = new AvionA(1);
    static AvionB avionb = new AvionB(1);
    AvionA a= new AvionA(1);
    AvionB b= new AvionB(1);
    AvionC c= new AvionC(1);
    public void menu(){
        HashMap<String, Avion> aviones = new HashMap<String, Avion>();
        aviones=me.llenar();
        String entradaTexto;   
        a=(AvionA)aviones.get("aviona");
        b=(AvionB)aviones.get("avionb");
        c=(AvionC)aviones.get("avionc");
        while(1==1){            
            System.out.println ("Ingrese 'v' para ver los asientos 'c' para comprar una asiento");
            Scanner entradaEscaner = new Scanner (System.in);
            entradaTexto=entradaEscaner.nextLine ();
            switch (entradaTexto) {
                case "v":
                    a.crearAvion();
                    a.mostrar();   
                    b.crearAvion();
                    b.mostrar();
                    c.crearAvion();
                    c.mostrar();
                    break;
                case "c":
                    System.out.println ("Ingrese el avion donde desea hacer la compra");
                    entradaTexto=entradaEscaner.nextLine ();
                    switch (entradaTexto) {
                    case "A":
                        System.out.println ("Ingrese 'v' para vip y 'n' para asiento normal");
                        entradaTexto=entradaEscaner.nextLine ();
                        switch (entradaTexto) {
                            case "v":
                                System.out.println ("Ingrese el asiento que desea comprar");
                                entradaTexto=entradaEscaner.nextLine ();
                                if(a.sillasVip.containsKey(entradaTexto)){
                                    if(a.sillasVip.get(entradaTexto).getEstado()=='l'){
                                        a.sillasVip.get(entradaTexto).setEstado('o');
                                        System.out.println("Comprar exitosa");
                                    }else{
                                        System.out.println("el asisento no esta disponible");
                                    }                       
                                }else{
                                    System.out.println("el asisento no existe");
                                }                                
                                break;
                            case "n":
                                System.out.println ("Ingrese el asiento que desea comprar");
                                entradaTexto=entradaEscaner.nextLine ();
                                if(a.sillasNormales.containsKey(entradaTexto)){
                                    if(a.sillasNormales.get(entradaTexto).getEstado()=='l'){
                                        a.sillasNormales.get(entradaTexto).setEstado('o');
                                        System.out.println("Comprar exitosa");
                                    }else{
                                        System.out.println("el asisento no esta disponible");
                                    }                       
                                }else{
                                    System.out.println("el asisento no existe");
                                }
                                break;
                        }
                        break;
                    case "B":
                        System.out.println ("Ingrese el asiento que desea comprar");
                        entradaTexto=entradaEscaner.nextLine ();
                        if(b.sillasNormales.containsKey(entradaTexto)){
                            if(b.sillasNormales.get(entradaTexto).getEstado()=='l'){
                                b.sillasNormales.get(entradaTexto).setEstado('o');
                                System.out.println("Comprar exitosa");
                            }else{
                                System.out.println("el asisento no esta disponible");
                                    }                       
                        }else{
                            System.out.println("el asisento no existe");
                            }
                        break;
                    case "C":
                        System.out.println ("Ingrese el asiento que desea comprar");
                        entradaTexto=entradaEscaner.nextLine ();
                        if(c.sillasPequeñas.containsKey(entradaTexto)){
                            if(c.sillasPequeñas.get(entradaTexto).getEstado()=='l'){
                                c.sillasPequeñas.get(entradaTexto).setEstado('o');
                                System.out.println("Comprar exitosa");
                            }else{
                                System.out.println("el asisento no esta disponible");
                                    }                       
                        }else{
                            System.out.println("el asisento no existe");
                            }
                        break;
                        
                    }
                    break;
                default:
                    System.out.println ("Opcion no valida");
                    break;
            }
        }
    }
    public static HashMap<String, Avion> llenar(){
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
        sillasNormales.put("B9",new Silla(1,"B9",new Persona(8,"daniela")));
        sillasNormales.put("B10",new Silla(1,"B10",null));
        sillasNormales.put("B11",new Silla(1,"B11",new Persona(8,"daniela")));
        sillasNormales.put("B12",new Silla(1,"B12",null));
        sillasNormales.get("B1").setEstado('o');
        sillasNormales.get("B2").setEstado('l');
        sillasNormales.get("B3").setEstado('o');
        sillasNormales.get("B4").setEstado('l');
        sillasNormales.get("B5").setEstado('o');
        sillasNormales.get("B6").setEstado('l');
        sillasNormales.get("B7").setEstado('o');
        sillasNormales.get("B8").setEstado('l');
        HashMap<String, Silla> sillasB= new HashMap<String, Silla>();
        sillasB.put("A1",new Silla(1,"A1",new Persona(8,"daniela")));
        sillasB.put("A2",new Silla(1,"A2",null));
        sillasB.put("A3",new Silla(1,"A3",new Persona(8,"lorena")));
        sillasB.put("A4",new Silla(1,"A4",null));
        sillasB.put("A5",new Silla(1,"A5",new Persona(8,"daniela")));
        sillasB.put("A6",new Silla(1,"A6",null));
        sillasB.put("A7",new Silla(1,"A7",new Persona(8,"daniela")));
        sillasB.put("A8",new Silla(1,"A8",null));
        sillasB.put("A9",new Silla(1,"A9",new Persona(8,"daniela")));
        sillasB.put("A10",new Silla(1,"A10",null));
        sillasB.put("A11",new Silla(1,"A11",new Persona(8,"daniela")));
        sillasB.put("A12",new Silla(1,"A12",null));
        sillasB.get("A1").setEstado('o');
        sillasB.get("A2").setEstado('l');
        sillasB.get("A3").setEstado('o');
        sillasB.get("A4").setEstado('l');
        sillasB.get("A5").setEstado('o');
        sillasB.get("A6").setEstado('l');
        sillasB.get("A7").setEstado('o');
        sillasB.get("A8").setEstado('l');
        sillasB.get("A9").setEstado('o');
        sillasB.get("A10").setEstado('l');
        sillasB.get("A11").setEstado('o');
        sillasB.get("A12").setEstado('l');
        avionc.setSillasPequeñas(sillas);
        aviona.setSillasVip(sillasVip);
        aviona.setSillasNormales(sillasNormales);
        avionb.setSillasNormales(sillasB);
        avionc.crearAvion();
        aviona.crearAvion();
        avionb.crearAvion();
        aviones.put("aviona", aviona);
        aviones.put("avionb", avionb);
        aviones.put("avionc", avionc);
        return aviones;
        }
}
