
package UD2_PARTE1;

import java.util.Scanner;

public class Ej19 {

    public static void main(String[] args) {
        // metemos escaner y las variables que van a ser las opciones del menu del cajero
        Scanner cajeroautomatico = new Scanner(System.in);
        
        int ingreso;
        int retirar;
        int saldo=1000; //HAY QUE IGUALAR A ALGO CUANDO HAYA UN WHILE
        int opcion=0;
        
        while (opcion!=4){   
// metemos el bucle donde va a ir todo y ahi le decimos que las opciones del cajero son 4 y que lo que sea distinto a 4 vuelve al bucle y te pide otra vez opcion(eso viene en el default al final)
        System.out.println("Marque 1 para ingresar");
        System.out.println("Marque 2 para retirar");
        System.out.println("Marque 3 para ver saldo");
        System.out.println("Marque 4 para salir");
// metemos todo lo que va a salir en el menu y que lo imprima por pantalla para que marcando se vaya a la opcion que quieras
        opcion=cajeroautomatico.nextInt();
// metemos que opcion 1 2 3 o 4 la vamos a meter por teclado y va a ir recogida en el switch que es nuestro menu
            switch (opcion){
// metemos el switch con opcion entre() porque ahi va a determinar que caso escogemos
                case 1:
// en el caso 1 es ingreso, primero muestra por pantalla, metemos por teclado y operacion con la muestra por pantalla de lo que va metido y al final el break
                    System.out.println("Marque 1 para ingreso en cuenta");
                    ingreso = cajeroautomatico.nextInt();
                    saldo = saldo+ingreso;
                    System.out.println("Se han ingresado "+ingreso+" euros en su cuenta");
                    break;
                case 2:
// en el caso 2 es retirada, muestra mensaje y le dice que entra por teclado, metemos el if para que si el saldo es 0 de error y sino se hace operacion con el break al final
                    System.out.println("Marque 2 para retirar dinero");               
                    retirar = cajeroautomatico.nextInt();
                    if (saldo==0){
                        System.out.println("Saldo insuficiente");
                    } else if (saldo>0){
                        saldo = saldo-retirar;
                        System.out.println("Se han retirado "+retirar+" euros de su cuenta");
                    }
                    break;
                case 3:
// nos muestra el saldo sin mas con todas las operaciones que le hayamos metido
                    System.out.println("Su saldo actual es"+saldo);
                    break;   
                case 4:
// ultimo caso es salir del programa por si te equivocas para volver a elegir tambien con break
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Error marque una opcion valida");
                    break;
// el default nos sirve para que si metemos una opcion incorrecta nos lo diga y vuelva al menu
            }
        }
      }
    }
