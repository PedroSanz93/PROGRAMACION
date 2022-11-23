//Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
//más elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores
//(no tres) y nos devuelva el máximo de los dos valores.
package UD3_PARTE1;
import java.util.Scanner;
public class Ej09 {
    public static int tresnumeros (int n1, int n2)
    {
        if (n1>n2){
            return n1;
        }
        return n2;
    }
    public static void main(String[] args) {
        
        Scanner sc;
        System.out.println("Introduce tres valores");
        
        sc= new Scanner(System.in);
        int num1=sc.nextInt();
        
        sc= new Scanner(System.in);
        int num2=sc.nextInt();
        
        sc= new Scanner(System.in);
        int num3=sc.nextInt();
        
        System.out.println(tresnumeros(tresnumeros(num1,num2),num3));
    }
}
