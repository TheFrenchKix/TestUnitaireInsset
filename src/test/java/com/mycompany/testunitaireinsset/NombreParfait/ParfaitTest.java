/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    public void testEstDivisibleParOK() {
        
        //given
        long n = 3;
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;

        //when
        boolean result = instance.estDivisiblePar(n, val);

        //then
        Assert.assertTrue("OK", result);
    }

    /**
     * Test of diviseurs method, of class Parfait.
     */
    @Test
    public void testDiviseursOK() {
        //given
        long val = 4;
        Parfait instance = new Parfait();
        long[] expResult = {1, 4, 2,};
        
        //when
        long[] result = instance.diviseurs(val);
        
        //then
        Assert.assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfait() {
        //given
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;
        
        //when
        boolean result = instance.estParfait(val);
        
        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultOK() {
        //given
        boolean isParfait = true;
        long nb = 6;
        Parfait instance = new Parfait();
        String expResult = "le nombre " + nb + " est parfait";
        
        //when
        String result = instance.formaterResult(isParfait, nb);
        
        //then
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultFAUX() {
        //given
        boolean isParfait = false;
        long nb = 5;
        Parfait instance = new Parfait();
        String expResult = "le nombre " + nb + " n'est pas parfait";;
        
        //when
        String result = instance.formaterResult(isParfait, nb);
        
        //then
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
