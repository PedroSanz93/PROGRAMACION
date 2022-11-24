
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej08FUNCION {

    static Scanner sc;
    
    public static void tablaMultiplicar(int n)
    {
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Introduce numero");
        tablaMultiplicar(sc.nextInt());
    }
}
