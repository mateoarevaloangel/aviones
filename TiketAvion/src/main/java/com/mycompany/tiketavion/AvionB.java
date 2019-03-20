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
public class AvionB extends Avion{
    HashMap<String, Silla> sillasNormales;

    public AvionB(int id) {
        super(id);
    }

    public HashMap<String, Silla> getSillasNormales() {
        return sillasNormales;
    }

    public String[] getAvion() {
        return avion;
    }

    public void setSillasNormales(HashMap<String, Silla> sillasNormales) {
        this.sillasNormales = sillasNormales;
    }

    public void setAvion(String[] avion) {
        this.avion = avion;
    }
    public void crearAvion(){
        this.avion[0]="                    /\\       ";
        this.avion[1]="                   /  \\      ";
        this.avion[2]="                  /    \\     ";
        this.avion[3]="                 /      \\    ";
        this.avion[4]="                /        \\   ";
        this.avion[5]="     /---------/          \\---------\\";
        this.avion[6]="    /          A1 A2  A3 A4          \\";
        this.avion[7]="   /          ["+sillasNormales.get("A1").getEstado()+"]["+sillasNormales.get("A2").getEstado()+"] ["+sillasNormales.get("A3").getEstado()+"]["+sillasNormales.get("A4").getEstado()+"]           \\";
        this.avion[8]="  /            A5 A6  A7 A8            \\";
        this.avion[9]=" /            ["+sillasNormales.get("A5").getEstado()+"]["+sillasNormales.get("A6").getEstado()+"] ["+sillasNormales.get("A7").getEstado()+"]["+sillasNormales.get("A8").getEstado()+"]             \\";
        this.avion[10]="-------------| A9 A10 A11A12 |-------------";
        this.avion[11]="             |["+sillasNormales.get("A9").getEstado()+"]["+sillasNormales.get("A10").getEstado()+"] ["+sillasNormales.get("A11").getEstado()+"]["+sillasNormales.get("A12").getEstado()+"]|";
        this.avion[12]="             \\             / ";
        this.avion[13]="              \\           /";
        this.avion[14]="               \\         /";
        this.avion[15]="                \\   |   /";
        this.avion[16]="                 \\  |  /";
        this.avion[17]="                  \\ | /";
        this.avion[18]="                  / | \\";
        this.avion[19]="                 /  |  \\";
        this.avion[20]="                ---------";    
    }
    public void mostrar(){
        System.out.println("Avion B");
        for(int i = 0;i<=20;i++){
            System.out.println(avion[i]);
        }
    }
}
