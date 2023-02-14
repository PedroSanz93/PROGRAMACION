
package trimestre_2;

import java.util.Scanner;
// Clase Scanner para introducir datos por teclado
public class Practica_01_BORRADOR {

    public static void main(String[] args) {
    // Clase principal
        Scanner sc;
        sc = new Scanner(System.in);
        // Lector del Scanner para meter un dato por teclado
        System.out.println("Esta aplicacion ha sido desarrollada por Pedro Sanz Albendin");
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
            // comprobacion si p1 que seria el precio1 es mayor que cero, si es mayor es true sino es false
          //  boolean p2 = true;
            // variable donde se guarda que el precio2 tiene que ser true
           // p2= (precio1>0&&precio2==0) ? p2==true : p2==false;
            // comprobacion si p2 que seria el precio2 es mayor que cero, si es mayor es true sino es false
          //  boolean rebaja = p1&&p2 || socio ;
            // variable que acumula el resultado de si p1 y p2 es true o false
                        //double totalDesct = total-descuento;
            // variable que convierte el tipo de variable int que estaba usando con el precio, a double calculando el total con el descuento
                        //double totalDesctSocio = total-descuentoSocio;
       // System.out.println((rebaja == true) ? "Su precio con el descuento por haber comprado 2 articulos es: "+descuento : "Su precio con descuento de socio es: "+descuentoSocio);
        
            System.out.println((p1==true) ? "Su precio con el descuento por haber comprado 2 articulos es: "+descuento : "");
            System.out.println((socio==true)? "Su precio con descuento de socio es: "+descuentoSocio : "" );
            System.out.println((p1==false && socio==false) ? "Su precio sin descuento es: "+total : "");
        




// ternario que te da el resultado de que si rebaja es true te da el precio del total con descuento y si es false te lo da sin descuento
    }
}
// Hace el descuento al reves, cuando hay dos numeros y es true hace descuento socio y cuando es false hace descuento normal
// igual si se pone solo 1 numero si es true descuento socio si es false normal
// si pones 1 numero y false hace descuento igual no reconoce que no se hace descuento si es 1 numero y false

