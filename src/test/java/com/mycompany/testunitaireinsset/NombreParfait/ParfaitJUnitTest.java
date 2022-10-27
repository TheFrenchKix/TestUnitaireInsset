/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
@RunWith(JUnitParamsRunner.class)
public class ParfaitJUnitTest {
    
    public ParfaitJUnitTest() {
    }
    
   //Il ne reste plus qu’à fournir les paramètres à notre méthode. JUnitParams propose plusieurs manières de faire : directement par annotation,
    //par méthode, par classe externe, ou par lecture depuis une ressource externe (ex.: CSV). Nous allons utiliser une méthode pour fournir les paramètres au test.
    private Object[] parametersForTestEstDivisiblePar() {
        return new Object[][]{
            {3, 6, true},
            {5, 2, false}
        };
    }

    /**
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    @Parameters
    public void testEstDivisiblePar(long n, long val, boolean expResult) {
        //given
        Parfait instance = new Parfait();
        
        //when
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        assertEquals(expResult, result);
        
    }
}
