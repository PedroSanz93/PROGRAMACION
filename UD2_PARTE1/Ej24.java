
package UD2_PARTE1;

import java.util.Scanner;

public class Ej24 {

    public static void main(String[] args) {
        // 
        Scanner tiopepe = new Scanner(System.in);
        
        double precio;
        int dia=0; //HAY QUE IGUALAR A 0 (=0) CUANDO HAYA UN WHILE
        
        while (dia!=7){
            
            System.out.println("Introduce el numero de dia de la semana");
            dia=tiopepe.nextInt();
            System.out.println("Introduce el monto de la compra");
            precio=tiopepe.nextDouble();
            
            switch (dia){
                case 1:
                    System.out.println("Hoy es lunes y no hay descuento, el total de tu compra es "+precio);
                    break;
                case 2:
                    precio=precio-(precio*0.15);
                    System.out.println("Hoy es martes se aplica el descuento del 15%, el total de tu compra es "+precio);
                    break;
                case 3:
                    System.out.println("Hoy es miercoles y no hay descuento, el total de tu compra es "+precio);
                    break;
                case 4:
                    precio=precio-(precio*0.15);
                    System.out.println("Hoy es jueves se aplica el descuento del 15%, el total de tu compra es "+precio);
                    break;
                case 5:
                    System.out.println("Hoy es viernes y no hay descuento, el total de tu compra es "+precio);
                    break;
                case 6:
                    System.out.println("Hoy es sabado y no hay descuento, el total de tu compra es "+precio);
                    break;
                case 7:
                    System.out.println("Hoy es domingo y no deberiamos estar trabajando, pero por culpa del capitalismo estamos aqui, tu puta compra es  "+precio);
                    break;
                default:
                    System.out.println("opcion erronea, introduce una valida no hay mas de 7 dias en la semana pringao");
            }
        } 
    }  
}
