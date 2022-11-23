//Escribe un programa que pida un valor entero en millas y muestre su equivalente en
//kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
//double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
package UD3_PARTE1;

import java.util.Scanner;

public class Ej05 {
    
    public static double millas_km(int millas)//1,60934 km es 1 milla
    {
        
        double km=1.60934;
        double numero=millas*km;
        return numero;
    }

    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce Millas para convertir a Kilometros: ");
        sc=new Scanner(System.in);
        int numero=sc.nextInt();
        System.out.println("Son: "+millas_km(numero)+"Km");
    }
}
