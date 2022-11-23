//Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual
//es el mínimo. Implementa y utiliza la función:
//int minimo(int a, int b) // Devuelve el menor entre a y b
package UD3_PARTE1;

import java.util.Scanner;

public class Ej03 {

    public static int minimo(int a, int b)
    {
        int resultado;
        
        if (a>b){//3>3 2>3 entrarian en el ELSE
            resultado=a;
        }else{
            resultado=b;//<--
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int n1=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2=sc.nextInt();
        
        int resultado=minimo(n1,n2);
        System.out.println("El mayor es "+resultado);
    }
}
