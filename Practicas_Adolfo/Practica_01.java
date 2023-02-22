package trimestre_2;

import java.util.Scanner;
// Clase Scanner para introducir datos por teclado
public class Practica_01 {

    public static void main(String[] args) {
    // Clase principal
        Scanner sc;
        sc = new Scanner(System.in);
        // Lector del Scanner para meter un dato por teclado
        System.out.println("Esta aplicacion ha sido desarrollada por Pedro Sanz Albendin");
        System.out.println("Bienvenid@ al terminal de pago siga las instrucciones para continuar");
        System.out.println("----------------------------------------------------------");
        System.out.println("Hay una oferta del dia, si te llevas 2 articulos se descuenta el 21% de IVA, y si eres socio se te hace el descuento habitual del 5%(Los descuento no son acumulables))");
        System.out.println("----------------------------------------------------------");
        System.out.println("Si solo te llevas 1 articulo pagas su precio normal");
        System.out.println("----------------------------------------------------------");
        // Las primeras lineas de codigo representan un menu para pagar en una tienda con una breve explicacion
        System.out.println("Introduce el precio del articulo con el valor mas alto");
        // mensaje por patalla de inicio del programa para meter el precio del primer articulo
            int precio1 = sc.nextInt();
            // variable del primer precio a introducir indicando al usuario que debe de meter el precio mas alto
        System.out.println("Introduce el precio del segundo articulo");
        // mensaje por pantalla para introducir precio del segundo articulo en el caso de que lo haya
            int precio2 = sc.nextInt();
            // variable para almacenar el precio del segundo articulo 
        System.out.println("Eres socio de la tienda (true/false)");
        // mensaje para saber si eres socio o no de la tienda para hacer el descuento de socio o no
            boolean socio = sc.nextBoolean();
            // variable para acumular true si eres socio para hacerte descuento o false para ver si no eres socio y no hacerte descuento
        System.out.println("----------------------------------------------------------");
            int total= (precio1+precio2);
            // varible para acumular el total del importe de los dos articulos
            final double descuento=(total/1.21);
            // constante que acumula la formula del descuento del 21% de IVA
            final double descuentoSocio=(total/1.05);
            boolean p1 = true;
            // variable donde se guarda que el precio1 tiene que ser true 
            p1= (precio1>0 && precio2>0) ? p1==true : p1==false;
            // en esta linea se comprueba si se cumple que p1 tenga dos valores>0 y por lo tanto sea verdadero
            System.out.println((p1==true) ? "Su precio con el descuento por haber comprado 2 articulos es: "+descuento : "");
            // si es verdadero tira por la primera opcion que seria precio total- el descuento del 21%
            System.out.println((socio==true)? "Su precio con descuento de socio es: "+descuentoSocio : "" );
            // si el p1 solo tiene un valor tomara de referencia si socio es true/false, si es true le hace descuento del 5%
            System.out.println((p1==false && socio==false) ? "Su precio sin descuento es: "+total : "");
            // y la ultima opcion, si solo lleva un articulo y socio es false marcara el precio sin descuento
    }
}