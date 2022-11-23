
package UD2_PARTE1;

import java.util.Scanner;

public class Ej18 {

    public static void main(String[] args) {
        // 
        Scanner multiplosdediez = new Scanner(System.in);
        
        int numero;

        System.out.println("Introduce un numero");
        numero = multiplosdediez.nextInt();
        
        if (numero%10==0){
            System.out.println("Es multiplo de diez");
        } else if (numero%10!=0){
            System.out.println("No es multiplo de diez");
        }
    }
}
