
package UD2_PARTE1;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
    // 
    Scanner mayormenor = new Scanner(System.in);
    //
    int numero1;
    int numero2;
    int mayor;
    
    System.out.println("introduce el primero numero");
    numero1 = mayormenor.nextInt();
    System.out.println("introduce el segundo numero");
    numero2 = mayormenor.nextInt();
    
    if (numero1<numero2){
        mayor = numero2;
        System.out.println("El segundo numero es mayor");
        }
    if (numero1>numero2){
        mayor = numero1;
        System.out.println("El primer numero es mayor");
        }
    }   
}
