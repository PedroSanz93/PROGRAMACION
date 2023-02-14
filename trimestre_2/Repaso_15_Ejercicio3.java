
package trimestre_2;

import java.util.Scanner;

public class Repaso_15_Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int a = sc.nextInt();
        // entrada del numero por teclado y mensaje
        switch (a){ // switch para que recoja el valor de la variable a y vaya a una de las 5 opciones
            case 1: {
                System.out.println("UNO");// mensaje por pantalla de primera opcion
                break; // termina la accion 1
            }
            case 2: {
                System.out.println("DOS");// mensaje por pantalla de segunda opcion
                break; // termina la accion 2
            }
            case 3: {
                System.out.println("TRES");// mensaje por pantalla de tercera opcion
                break; // termina la accion 3
            }
            case 4: {
                System.out.println("CUATRO");// mensaje por pantalla de cuarta opcion
                break; // termina la accion 4
            }
            default: {
                System.out.println("Numero incorrecto"); // si no se introduce un valor correcto para los 4 casos anteriores lanza el error
                break; // termina la accion de error
            }
        }
    }
}