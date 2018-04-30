/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GEORGE
 */
public class NewMainTest {
    
    public NewMainTest() {
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
     * Test of main method, of class NewMain.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of metodo method, of class NewMain.
     */
    @org.junit.Test
    public void testMetodo() {
        System.out.println("metodo");
        int i = 0;
        NewMain instance = new NewMain();
        int expResult = 2;
        int result = instance.metodo(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult)
        {
        fail("The test case is a prototype.");
        }
        
    }
    
}
