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
public class AvionA extends Avion{
    HashMap<Integer, Silla> sillasVip;
    HashMap<Integer, Silla> sillasNormales;
    public AvionA(int id) {
        super(id);
    }
}
