//Escribe un programa que pida un valor N entero y luego muestre: el sumatorio del 1 a N, el
//productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
//int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
//int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
//double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
package UD3_PARTE1;
import java.util.Scanner;
public class Ej08 {
    public static double suma1aN(double n)
    {
        double suma=0;
        for (double i=1;i<=n;i++){
           suma=i+suma;
        }
            return suma;
    }
    public static double producto1aN(double n)
    {
        double producto=1;
        for (double i=1;i<=n;i++){
            producto=producto*i;
        }
            return producto;
    }
    public static double intermedio1aN(double n)
    {
        double intermedio=n/2;
        return intermedio;
    }
    public static void main(String[] args) {
     
        Scanner sc;
        System.out.println("Introduce un numero");
        
        sc= new Scanner(System.in);
        double num=sc.nextDouble();
        
        System.out.println("La suma es: "+suma1aN(num));
        System.out.println("El producto es: "+producto1aN(num));
        System.out.println("El intermedio es: "+intermedio1aN(num));
    }
}
