
package com.mycompany.proyecto3;

import java.util.ArrayList;


public class Main {

    public static ArrayList<Cliente> cl=new ArrayList();
    
    public static void main(String[] args)
    {
        cl.add(new Cliente("JORGE","LUIS","255599680","6793493",1000,"luiscarrillo129@gmail.com","HOLA"));
        new login();
    }
    
}
