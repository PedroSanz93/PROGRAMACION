
package UD2_PARTE1;

import java.util.Scanner;

public class Ej23 {


    public static void main(String[] args) {
       
        Scanner farmacia = new Scanner(System.in);
        
        double valorcompra;
        int opcion=0; //HAY QUE IGUALAR A 0 (=0) CUANDO HAYA UN WHILE
        
        while (opcion!=2){
        System.out.println("Introduce el total de la compra");
        valorcompra=farmacia.nextDouble();
        System.out.println("Introduce 1 para pagar al contado");
        System.out.println("Introduce 2 para pagar por tarjeta");
        opcion=farmacia.nextInt();
        
        switch (opcion){
            case 1:
                valorcompra=valorcompra-(valorcompra*0.05);
                System.out.println("Habiendo pagado al contado se hace un descuento del 5% y el total es "+valorcompra);
                break;
            case 2:
                valorcompra=valorcompra+(valorcompra*0.03);
                System.out.println("Habiendo pagado por tarjeta se te hace un regardo del 3% y el total es "+valorcompra);
                break;
            default:
                System.out.println("Error vuelve a introducir opcion de pago");
                break;
        }
    }
  }
}
