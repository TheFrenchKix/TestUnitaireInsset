/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValideOK() {
        //given
        String str = "Bonjour";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        
        //when
        boolean result = instance.isChaineValide(str);
        
        //then
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testIsChaineValideFAUX() {
        //given
        String str = "";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        
        //when
        boolean result = instance.isChaineValide(str);
        
        //then
        assertEquals(expResult, result);
    }
    
    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        //when
        String str = "moto";
        StringUtils instance = new StringUtils();
        String expResult = "otom";
        
        //when
        String result = instance.inverse(str);
        
        //then
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeOK() {
        //given
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        
        //when
        boolean result = instance.isPalindrome(str);
        
        //then
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeFAUX() {
        //given
        String str = "moto";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        
        //when
        boolean result = instance.isPalindrome(str);
        
        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        //given
        String str = "Bonjour";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put(String.valueOf("B"), 1);
        expResult.put(String.valueOf("j"), 1);
        expResult.put(String.valueOf("n"), 1);
        expResult.put(String.valueOf("o"), 2);
        expResult.put(String.valueOf("r"), 1);
        expResult.put(String.valueOf("u"), 1);
        
        System.out.println(expResult);
        
        //when
        Map<String, Integer> result = instance.compterOccurences(str);
        
        //then
        assertEquals(expResult, result);
    }
    
}
