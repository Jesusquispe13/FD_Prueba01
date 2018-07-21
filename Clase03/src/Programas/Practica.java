
package Programas;


public class Practica {
    public static void main(String[] args) {
        String[] nombres = {"jesus","luis","juan","jack","carlos","marlon"};
        double[] notas = {14,18,10,7,11,8};
        
        
        
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i]>16) {
                System.out.println(nombres[i]+ " tiene " +notas[i]);
                System.out.println("muy bien");
             
            } else if ( notas[i]>10 ) {
            System.out.println(nombres[i]+ "  tiene " + notas[i]);  
                System.out.println("mejorando");
            }else{
                System.out.println(nombres[i]+"  tiene " +notas[i]);
            System.out.println(" necesita apoyo");
            
        }
                    
        
        }
        
        
        
        
        
    }
    
    
    
    
}
