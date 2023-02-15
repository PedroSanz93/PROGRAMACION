/*Condicionales (if, if-then-else, switch) Bucles (while, do-while, for) Salidas anticipadas.*/
package trimestre_2;

import java.util.Scanner;
public class Practica_02_BORRADOR {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        int saldo=1000;
        
        int opcion=0;
        
        int pin=0;
        
        do{
            System.out.println("Introduce el pin");
            
            pin=sc.nextInt();
            if(pin==1234){
                System.out.println("Pin correcto");
            }else{
                System.out.println("Pin incorrecto, operacion cancelada, saliendo de cajero");
                System.exit(0);
            }
        
        
        while (opcion!=4){
            
            System.out.println("Bienvenido al cajero");
            System.out.println("----------------------------------------------");
            System.out.println("Marca 0 para comprobar el saldo");
            System.out.println("Marca 1 para retirar dinero");
            System.out.println("Marca 2 para imprimir factura factura");
            System.out.println("Marca 3 para pagar una factura");
            System.out.println("Marca 4 para salir");
            
            opcion=sc.nextInt();
            
            switch (opcion){
                
                case 0:
                    System.out.println("Su saldo es: "+saldo);
                    break;
                case 1:
                    System.out.println("Cuanto quieres retirar");
                    int retirar=sc.nextInt();
                    if (saldo==0){
                        System.out.println("Saldo insuficiente");
                    } else if (saldo>0){
                        saldo = saldo-retirar;
                        System.out.println("Se han retirado "+retirar+" euros de su cuenta");
                    }
                    break;
                case 2:
                    System.out.println("Indica por numero de mes del 1 al 12 que recibo quieres imprimir");
                    int factura=sc.nextInt();
                    for (int i=1;i<=12;i++){
                        if(i==factura) break;
                    }
                    System.out.println("Has elegido imprimir la factura: "+factura);
                    break;
                case 3:
                    System.out.println("Indica por numero de mes del 1 al 12 que factura quieres pagar");
                    int pagar=sc.nextInt();
                    for (int i=1;i<=12;i++){
                        if(i==pagar) continue;
                    }
                    System.out.println("Has elegido pagar la factura: "+pagar);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error indica una opcion en el menu");
                    break;
            }
        }
       } while(pin!=1234); 
    }
}