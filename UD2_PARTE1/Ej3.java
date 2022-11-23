
package UD2_PARTE1;

import java.util.Scanner;
// este import es para que en el main se pueda leer por teclado
public class Ej3 {

    public static void main(String[] args) {
        // Declaramos las dos variables, lado y area con la que vamos a realizar la operacion
        int lado;
        int area;
        
        Scanner operacion = new Scanner(System.in);
        // variable para leer por teclado
        System.out.println("intruduce lado");
        //mensaje que aparecera cuando inicie el programa para meter numero
        lado= operacion.nextInt();
        // aqui le decimos al programa que lado lo metemos por teclado y es int porque son numeros enteros
        area= lado*lado;
        // aqui la operacion que va a hacer
        System.out.println("el area es " + area );
        // aqui lo ultimo que es imprimir por pantalla el resultado con la variable area
    } 
}
