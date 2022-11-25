// programa que muestra en 3 columnas, el cuadrado y el cubo de los 5 primeros numeros enteros 
// a partir de un nºque se introduce por teclado
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce un numero para hacer el cuadrado y el cubo");
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int contn = 0;
        int cuadrado;
        int cubo;

        do {
            for (int i = n; i <= n + 5; i++) {
                cuadrado = i * i;
                cubo = i * i * i;
                contn++;
                System.out.println("Nº" + i + " el cuadrado: " + cuadrado + " y el cubo " + cubo);
            }
        } while (contn < 5);
    }
}
