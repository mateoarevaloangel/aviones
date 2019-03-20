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
        this.avion[10]="-------------| A9 A10 A11A12 |-------------";
        this.avion[11]="             |["+sillasPequeñas.get("A9").getEstado()+"]["+sillasPequeñas.get("A10").getEstado()+"] ["+sillasPequeñas.get("A11").getEstado()+"]["+sillasPequeñas.get("A12").getEstado()+"]|";
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
        System.out.println("Avion C");
        for(int i = 0;i<=20;i++){
            System.out.println(avion[i]);
        }
    }
}
