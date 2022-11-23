//Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de
//edad o no. Implementa y utiliza la función:
//boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario

package UD3_PARTE1;

import java.util.Scanner;

public class Ej01 {

    public static boolean MayorEdad(int a)
    {
    boolean mayor = false;
    
        if (a>=18){
             mayor =true;
        }
           return mayor;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce la edad");
        int edad=sc.nextInt();
       
        if (MayorEdad(edad) == true)
            System.out.println("Eres mayor de edad");
           
        else
        {
        System.out.println("Eres menor de edad");
        }
    }
}
