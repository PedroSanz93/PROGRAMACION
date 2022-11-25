package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej11FUNCION {

    public static void cuadradoCubo(int n) {
        int contn = 0;
        int cuadrado;
        int cubo;

        for (int i = n; i <= n + 5; i++) {
            cuadrado = i * i;
            cubo = i * i * i;
            contn++;
            System.out.println("Nº" + i + " el cuadrado: " + cuadrado + " y el cubo " + cubo);
        }
    }

    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce un numero para hacer el cuadrado y el cubo");
        sc = new Scanner(System.in);

        cuadradoCubo(sc.nextInt());
    }
}
