
package UD2_PARTE1;

import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        // 
    Scanner positivonegativo = new Scanner(System.in);
        //
        int numero;
        
        System.out.println("Introduce un numero");
        numero = positivonegativo.nextInt();
        
        if (numero<0){
            System.out.println("El numero introducido es negativo");
        } else if (numero>=0){
        System.out.println("El numero introducido es positivo");
        }
    }
}
