
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner sc;
        
        sc=new Scanner(System.in);
        int num=0;
        int cantidadnum=0;
        int suma=0;
        int media;
        while (num>=0){
            System.out.println("Introduce numeros");
            num= sc.nextInt();
            suma=suma+num;
            cantidadnum++;
            media=suma/cantidadnum;
            System.out.println("La media es "+media);
        } 
    }
}
