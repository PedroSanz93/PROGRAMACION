
package UD2_PARTE1;

import java.util.Scanner;
// importamos lector por teclado para el main     
public class Ej6 {

    public static void main(String[] args) {
        // declaracion de variables
    Scanner porcentajes = new Scanner (System.in);
    // variable para leer por teclado
    double precio_articulo;
    double precio_venta;
    double porcentaje_descuento;
    
    System.out.println("introduce precio del articulo");
    // print para meter un dato
    precio_articulo = porcentajes.nextDouble();
    //le decimos que el dato va a meterse por teclado
    System.out.println("introduce el precio de venta");
    //print para meter el segundo dato
    precio_venta = porcentajes.nextDouble();
    //le decimos que el segundo dato va a introducirse por teclado
    porcentaje_descuento = (((precio_articulo-precio_venta)*100)/precio_articulo);
    // formula para sacar que descuento tiene el articulo
    System.out.println("el descuento es "+porcentaje_descuento+"%");
    // print final con el descuento que tiene el articulo
    } 
}
