/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiketavion;

import static com.mycompany.tiketavion.MetodoPrincipal.llenar;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class MetodoPrincipalTest {
    
    public MetodoPrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of menu method, of class MetodoPrincipal.
     */
    
    /**
     * Test of calcularNeto method, of class MetodoPrincipal.
     */
    @Test
    public void testCalcularNeto() {
        System.out.println("calcularNeto");
        HashMap<String, Avion> map = llenar();
        MetodoPrincipal instance = new MetodoPrincipal();
        Integer expResult = 12200000;
        Integer result = instance.calcularNeto(map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
