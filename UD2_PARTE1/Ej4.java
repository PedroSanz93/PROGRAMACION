
package UD2_PARTE1;

import java.util.Scanner;
// este import es para que en el main se pueda leer por teclado
public class Ej4 {

    public static void main(String[] args) {
        // Declaramos dos variables para cada valor que vamos a introducir por teclado
        int numero1;
        int numero2;
        int suma;
        int resta;
        int producto;
        int division;
        
        Scanner operacion = new Scanner(System.in);
        // variable para leer por teclado
        System.out.println("introduce numero");
        // mensaje para introducir numero
        numero1= operacion.nextInt();
        // indicamos que numero1 se mete por teclado
        numero2= operacion.nextInt();
        // indica que numero2 se mete por teclado
        suma=numero1+numero2;
        //le decimos al programa que tiene que sumar esas variables y despues el print para que lo imprima en pantalla
        System.out.println("la suma es " +suma);
        resta=numero1-numero2;
        //le decimos al programa que tiene que restar esas variables y despues el print para que lo imprima en pantalla
        System.out.println("la resta es " +resta);
        producto=numero1*numero2;
        //le decimos al programa que tiene que multiplicar esas variables y despues el print para que lo imprima en pantalla
        System.out.println("el producto es " +producto);
        division=numero1/numero2;
        //le decimos al programa que tiene que dividir esas variables y despues el print para que lo imprima en pantalla
        System.out.println("la division es " +division);
    }
    
}
