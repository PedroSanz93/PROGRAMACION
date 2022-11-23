
package UD2_PARTE1;

import java.util.Scanner;
// importamos lector por teclado para el main
public class Ej8 {

    public static void main(String[] args) {
        // declaracion de variables
    Scanner edades = new Scanner(System.in);
    // variable para leer por teclado
    int edad;
    // declaramos variable de edad
    System.out.println("Introduce tu edad ");
    // mensaje de incio para introducir tu edad
    edad = edades.nextInt();
    // variable para leer por teclado
    if (edad >=18) {
        // aqui metemos el if para que cuando metamos la edad si es >= a 18 te imprima si eres mayor edad
        System.out.println("Eres mayor edad");
        } 
    else if (edad <18) {
        // aqui la otra opcion con el else if para que cuando metamos un valor < de 18 nos diga que eres menor de edad (opcional)
        System.out.println("Eres menor de edad");
        }
    } 
}
