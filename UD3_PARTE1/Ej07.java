//Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
//área y su perímetro. Implementa y utiliza las funciones:
//double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
//double areaRectangulo(double ancho, double alto) // Devuelve el área
package UD3_PARTE1;
import java.util.Scanner;
public class Ej07 {
    public static double perimetroRectangulo(double ancho, double alto)
    {
       double perimetro;
       perimetro=(ancho*2)+(alto*2);
        return perimetro;
    } 
    public static double areaRectangulo(double ancho, double alto)
    {
        double area;
        area=ancho*alto;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce ancho y largo del rectangulo");
        sc= new Scanner(System.in);
        double ancho=sc.nextDouble();
        sc= new Scanner(System.in);
        double alto=sc.nextDouble();
        System.out.println("El perimetro del rectangulo es: "+perimetroRectangulo(ancho,alto));
        System.out.println("El perimetro del rectangulo es: "+areaRectangulo(ancho,alto));
    }
}
