
package UD2_PARTE1;

import java.util.Scanner;
// importamos lector por teclado para el main
public class Ej7 {

    public static void main(String[] args) {
        // declaracion de variables
    double milla_marina =1852;
    double metros;
    double equivalencia;
    
    Scanner distancias = new Scanner(System.in);
    // variable para leer por teclado
    System.out.println("introduce metros");
    // frase para que introduzcas por teclado
    metros = distancias.nextDouble();
    // variable para meter dato metros por teclado
    equivalencia= (milla_marina*metros);
    // operacion a realizar para sacar la equivalencia de metros en millas marinas
    System.out.println("son "+equivalencia+" millas marinas");
    }
}
