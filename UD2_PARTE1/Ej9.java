
package UD2_PARTE1;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        // EJERCICIO IGUAL QUE EL ANTERIOR, PA REPASARLO
    Scanner edades = new Scanner(System.in);
    
    int edad;
    System.out.println("Introduce tu edad, porfavor");
    
    edad = edades.nextInt();
    
    if (edad >=18) {
        System.out.println("Eres mayor de edad muchacho");
    } else if (edad <18) {
        System.out.print("Eres menor de edad, pa tu casa");
    }
}   
}
