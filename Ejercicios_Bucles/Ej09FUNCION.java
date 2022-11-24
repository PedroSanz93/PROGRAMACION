
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej09FUNCION {

    public static int CuantasCifrasTiene(int n)
    {
        int cifras=0;
        while (n!=0){
            n=n/10;
            cifras++;
        }
        return cifras;
    }

    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce un numero para ver cuantas cifras tiene");
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("El numero tiene "+CuantasCifrasTiene(n)+" cifras");
    }
}