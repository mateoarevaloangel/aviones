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
public class AvionC extends Avion{
    HashMap<String, Silla> sillasPequeñas;

    public AvionC(int id) {
        super(id);
    }

    public HashMap<String, Silla> getSillasPequeñas() {
        return sillasPequeñas;
    }

    public String[] getAvion() {
        return avion;
    }

    public void setSillasPequeñas(HashMap<String, Silla> sillasPequeñas) {
        this.sillasPequeñas = sillasPequeñas;
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
        this.avion[7]="   /          ["+sillasPequeñas.get("A1").getEstado()+"]["+sillasPequeñas.get("A2").getEstado()+"] ["+sillasPequeñas.get("A3").getEstado()+"]["+sillasPequeñas.get("A4").getEstado()+"]           \\";
        this.avion[8]="  /            A5 A6  A7 A8            \\";
        this.avion[9]=" /            ["+sillasPequeñas.get("A5").getEstado()+"]["+sillasPequeñas.get("A6").getEstado()+"] ["+sillasPequeñas.get("A7").getEstado()+"]["+sillasPequeñas.get("A8").getEstado()+"]             \\";
        this.avion[10]="-------------| A5 A6  A7 A8 |-------------";
        this.avion[11]="             |["+sillasPequeñas.get("A5").getEstado()+"]["+sillasPequeñas.get("A6").getEstado()+"] ["+sillasPequeñas.get("A7").getEstado()+"]["+sillasPequeñas.get("A8").getEstado()+"]|";
        for(int i = 0;i<=12;i++){
            System.out.println(avion[i]);
        }
        
    }
}
