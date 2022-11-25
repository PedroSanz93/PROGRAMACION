package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej12FUNCION {

    public static void fibonacci(int n) {
        int contn = 0;
        int sumador = 0;
        for (int i = 1; i < n; i++) {
            if (sumador == 0) {
                sumador = n;
            }
            contn = contn + sumador;
            sumador = contn - sumador;
            System.out.println(contn);
        }
    }

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        fibonacci(sc.nextInt());
    }
}
