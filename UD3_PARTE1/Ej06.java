//Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
//cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
//double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA

package UD3_PARTE1;

import java.util.Scanner;

public class Ej06 {

    public static double precioConIVA(double precio)
    {
       double iva=1.21;
       
       precio=precio*iva;
        
        return precio;
    }
    
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Introduce los 5 precios: ");
        sc= new Scanner(System.in);
        double precio1=sc.nextDouble();
        
        sc= new Scanner(System.in);
        double precio2=sc.nextDouble();
        
        sc= new Scanner(System.in);
        double precio3=sc.nextDouble();
               
        sc= new Scanner(System.in);
        double precio4=sc.nextDouble();
        
        sc= new Scanner(System.in);
        double precio5=sc.nextDouble();
        
        System.out.println("El precio1 es : "+precioConIVA(precio1));
        System.out.println("El precio1 es : "+precioConIVA(precio2));
        System.out.println("El precio1 es : "+precioConIVA(precio3));
        System.out.println("El precio1 es : "+precioConIVA(precio4));
        System.out.println("El precio1 es : "+precioConIVA(precio5));
    }
}
