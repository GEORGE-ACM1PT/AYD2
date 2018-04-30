/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

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
public class JavaApplication2Test {
    
    public JavaApplication2Test() {
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
     * Test of main method, of class JavaApplication2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaApplication2.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of metodo method, of class JavaApplication2.
     */
    @Test
    public void testMetodo() {
        System.out.println("metodo");
        int i = 0;
        JavaApplication2 instance = new JavaApplication2();
        int expResult = 12;
        int result = instance.metodo(i);
        ;assertEquals(expResult, result);
     
        if(expResult!=result)
        { fail("The test case is a prototype.");
        }
       
    }
    
}
