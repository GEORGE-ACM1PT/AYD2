/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto3;

import static com.mycompany.proyecto3.Main.cl;
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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of Acreditar method, of class Cliente.
     */
    @org.junit.Test
    public void testAcreditar() {
        System.out.println("Acreditar");
        long c = 10;
        Cliente instance = new Cliente("JORGE","LUIS","255599680","6793493",1000,"luiscarrillo129@gmail.com","HOLA");
        long expResult = 1010;
        long result = instance.Acreditar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        if(expResult!=result)
        {
          fail("The test case is a prototype.");
        }
        
    }


    @org.junit.Test
    public void testDebito() {
        System.out.println("Debito");
        long c = 1001;
        Cliente instance =  new Cliente("JORGE","LUIS","255599680","6793493",1000,"luiscarrillo129@gmail.com","HOLA");
        boolean expResult = true;
        boolean result = instance.Debito(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult)
        {
             fail("The test case is a prototype.");
        }
        
    }


    @org.junit.Test
    public void testConsultarSaldo() {
        System.out.println("ConsultarSaldo");
        Cliente instance =  new Cliente("JORGE","LUIS","255599680","6793493",1000,"luiscarrillo129@gmail.com","HOLA");
        long expResult = 1000;
        long result = instance.ConsultarSaldo();
        assertEquals(expResult, result);
        
        if(result!=expResult)
            
            
            
        {
             fail("The test case is a prototype.");
             
             
             
        }
    }


    @org.junit.Test
    
    public void testTranferencia() {
        System.out.println("tranferencia");
        String c = "12345";
        long Monto = 10;
        Cliente instance = new Cliente("JORGE","LUIS","255599680","6793493",1000,"luiscarrillo129@gmail.com","HOLA");
        Main.cl.add(new Cliente("GILBERTO","VAQUIN","567878","12345",1000,"gilberto@gmail.com","HOLA123"));
        boolean expResult = true;
        boolean result = instance.tranferencia(c, Monto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult)
        {
             fail("The test case is a prototype.");
        }
    }
}
