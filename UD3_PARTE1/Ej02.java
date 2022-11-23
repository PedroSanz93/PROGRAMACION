//Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
//resultado de multiplicarlos. Implementa y utiliza la función:
// double multiplica(double a, double b) // Devuelve la multiplicación de dos números
package UD3_PARTE1;

import java.util.Scanner;

public class Ej02 {

    public static double multiplica(double a, double b)
    {
       double multiplicacion;
       
            multiplicacion = a * b;
            
            return multiplicacion;
    }
            
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        double n1=sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double n2=sc.nextDouble();
        
        double producto = multiplica(n1,n2);
        System.out.println("El resultado es: "+producto);
        
    }
}
