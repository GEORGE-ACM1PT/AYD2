
package com.mycompany.proyecto3;

public class Cliente 
{
    String Nombre;
    String Apellido;
    String Dpi;
    String Nocuenta;
    long saldo;
    String email;
    String Contrasena;
    
    public Cliente(String a,String b, String  c,String  d,long  e,String f,String g)
    {
        this.Nombre=a;
        this.Apellido=b;
        this.Dpi=c;
        this.Nocuenta=d;
        this.saldo=e;
        this.email=f;
        this.Contrasena=g;
       Main.cl.add(this);
    }
    public long Acreditar(long c)
    {
       saldo=saldo+c;
       
       return saldo;
    }
    
    public boolean Debito(long c)
    {
     if(! (c >saldo))
     {
            saldo=saldo-c;
            return true;
     }
    return false;
    }
    
    public long ConsultarSaldo()
    {
    return saldo;
    }
    
    
    public boolean tranferencia(String c, long Monto)
    {
     
         for (Cliente cliente : Main.cl) 
        {
            if(cliente.Nocuenta == null ? c == null : cliente.Nocuenta.equals(c))
            {  
                if(this.Debito(Monto))
                {
                    cliente.Acreditar(Monto);
                    return true;
                }
               
               break;
            }
        }
        
    return false;
    }
}


