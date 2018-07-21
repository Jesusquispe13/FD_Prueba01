/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author Administrador
 */
public class Arreglos {
    
    public static void main(String[] args) {
        String[] apellidos =new String[5];
        //en dos lineas
        //String[] apellidos
        //apellidos = new String[5];
        String[] nombre;
        nombre=new String[5];
        
        apellidos[0]="quispe";//agregando un valor al limite cero
        apellidos[1]="fernadez";
        apellidos[2]="echevarria";
        apellidos[3]="soto";
        apellidos[4]="cueva";
        
        String[] departamentos = {"tacna","piura","lima","arequipa","ica","tumbe"};
        System.out.println("Tamaño del  arreglo apellido es "+ apellidos.length);
        System.out.println("Tamaño del  arreglo nombre es "+ nombre.length);
        System.out.println("Tamaño del  arreglo departamento es "+ departamentos.length);
        
        //recorrer 
        for (int i = 0; i<departamentos.length ; i++) {
            System.out.println("el valor en la posicion"+ i +" = "+ departamentos[i]);
           
        }
        double[] notas ={8,15,200,35.4,500};
        
        System.out.println("Tamaño del  arreglo notas es "+ notas.length);
        double notamayor=0;
        
        
        
        for (int i = 0; i<notas.length ; i++) {
            if (notas[i]>notamayor) {
                notamayor = notas[i];
                
            }
            
        }
        System.out.println("es "+notamayor); 
        
        
        
        
    }
    
}
