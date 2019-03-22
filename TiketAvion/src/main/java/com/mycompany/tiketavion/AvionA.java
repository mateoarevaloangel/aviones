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
 * @author MateoG
 * @version 1.0
 */
public class AvionA extends Avion{
    /**
     * mapa sillas vip
     */
    HashMap<String, Silla> sillasVip;
    /**
     * mapa sillas normales
     */
    HashMap<String, Silla> sillasNormales;
    /**
     * const aviona
     * @param id id
     */
    public AvionA(int id) {
        super(id);
    }

    public HashMap<String, Silla> getSillasVip() {
        return sillasVip;
    }

    public HashMap<String, Silla> getSillasNormales() {
        return sillasNormales;
    }

    public String[] getAvion() {
        return avion;
    }

    public void setSillasVip(HashMap<String, Silla> sillasVip) {
        for(Silla si:sillasVip.values()){
        sillasVip.get(si.getNombre()).setPrecio(900000);
    }
        this.sillasVip = sillasVip;
    }

    public void setSillasNormales(HashMap<String, Silla> sillasNormales) {
        for(Silla si:sillasNormales.values()){
        sillasNormales.get(si.getNombre()).setPrecio(500000);
    }
        this.sillasNormales = sillasNormales;
    }

    public void setAvion(String[] avion) {
        this.avion = avion;
    }/**
     * metodo crear avion
     */
    public void crearAvion(){
        this.avion[0]="                    /\\       ";
        this.avion[1]="                   /  \\      ";
        this.avion[2]="                  /    \\     ";
        this.avion[3]="                 /      \\    ";
        this.avion[4]="                /        \\   ";
        this.avion[5]="     /---------/          \\---------\\";
        this.avion[6]="    /          A1 A2  A3 A4          \\";
        this.avion[7]="   /          ["+sillasVip.get("A1").getEstado()+"]["+sillasVip.get("A2").getEstado()+"] ["+sillasVip.get("A3").getEstado()+"]["+sillasVip.get("A4").getEstado()+"]           \\";
        this.avion[8]="  /            A5 A6  A7 A8            \\";
        this.avion[9]=" /            ["+sillasVip.get("A5").getEstado()+"]["+sillasVip.get("A6").getEstado()+"] ["+sillasVip.get("A7").getEstado()+"]["+sillasVip.get("A8").getEstado()+"]             \\";
        this.avion[10]="-------------| B1 B2  B3 B4 |-------------";
        this.avion[11]="             |["+sillasNormales.get("B1").getEstado()+"]["+sillasNormales.get("B2").getEstado()+"] ["+sillasNormales.get("B3").getEstado()+"]["+sillasNormales.get("B4").getEstado()+"]|";
        this.avion[12]="             | B5 B6  B7 B8 |";
        this.avion[13]="             |["+sillasNormales.get("B5").getEstado()+"]["+sillasNormales.get("B6").getEstado()+"] ["+sillasNormales.get("B7").getEstado()+"]["+sillasNormales.get("B8").getEstado()+"]|";
        this.avion[14]="               \\         /";
        this.avion[15]="                \\   |   /";
        this.avion[16]="                 \\  |  /";
        this.avion[17]="                  \\ | /";
        this.avion[18]="                  / | \\";
        this.avion[19]="                 /  |  \\";
        this.avion[20]="                ---------";
    }/**
     * metodo mostrar avion
     */
    public void mostrar(){
        System.out.println("Avion A");
        for(int i = 0;i<=20;i++){
            System.out.println(avion[i]);
        }
    }/**
     * metodo calcular total
     * return total 
     */
    
    public Integer calcularTotal(){
        total=0;
        for(Silla si:sillasVip.values()){
            if(si.getEstado()=='o'){
                total+=si.getPrecio();
            }
        }
        for(Silla si:sillasNormales.values()){
            if(si.getEstado()=='o'){
                total+=si.getPrecio();
            }
        }
        return total;
    }
}
