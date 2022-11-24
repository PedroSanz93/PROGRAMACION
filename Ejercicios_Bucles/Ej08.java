
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej08 {

   
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce numero para tabla de multiplicar");
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for (int i=1;i<=10;i++){
           
            System.out.println(n+"x"+i+"="+n*i);
        }   
    }
}
