
package trimestre_2;

import java.util.Scanner; // clase Scanner

public class Practica_02 {

    public static void main(String[] args) { // clase principal
        Scanner sc; // lector del Scanner
        sc = new Scanner(System.in);
        
        int saldo=1000; // Variable que acumula el saldo de la cuenta
        
        int opcion=0; // variable para seleccionar la opcion del cajero por pantalla, inicia en 0
        
        int pin=0; // variable que guarda el valor del pin de la cuenta, inicia en 0
        
        do{ // para la verificacion del pin de la cuenta utiliza un Do While que comprueba si se ha introducido bien y sino sale del programa
            System.out.println("Introduce el pin"); // mensaje de ingresa el pin
            pin=sc.nextInt(); // ingresar pin por teclado a traves de Scanner
            if(pin==1234){ // utilizo un IF para que si la contraseña es 1234 entra al menu
                System.out.println("Pin correcto"); // mensaje de contraseña correcta
            }else{ // el ELSE si la contraseña es incorrecta sale del programa
                System.out.println("Pin incorrecto, operacion cancelada, saliendo de cajero"); // mensaje de pin incorrecto
                System.exit(0); // system.exit para que en el ELSE salga del programa
            }
        
        
        while (opcion!=5){ // WHILE para que si se ingresa en el menu una opcion que no sean las que se imprimen por pantalla se va al DEFAULT y da el mensaje de opcion incorrecta
            
            System.out.println("Bienvenido al cajero"); // inicio del cajero con todas las opciones
            System.out.println("----------------------------------------------");
            System.out.println("Marca 0 para comprobar el saldo"); // 0 para comprobar saldo
            System.out.println("----------------------------------------------");
            System.out.println("Marca 1 para retirar dinero"); // 1 para retirar dinero
            System.out.println("----------------------------------------------");
            System.out.println("Marca 2 para ingresar dinero"); // 2 para ingresar dinero
            System.out.println("----------------------------------------------");
            System.out.println("Marca 3 para imprimir factura"); // 3 para imprimir factura
            System.out.println("----------------------------------------------");
            System.out.println("Marca 4 para pagar una factura"); // 4 para pagar factura
            System.out.println("----------------------------------------------");
            System.out.println("Marca 5 para salir"); // 5 para salir del cajero
            
            opcion=sc.nextInt(); // lector de opcion por teclado
            
            switch (opcion){ // el SWITCH para crear el menu con todas las opciones
                
                case 0:
                    System.out.println("Su saldo es: "+saldo); // mensaje que muestra la variable saldo y acumula el valor aunque se vaya alterando
                    break; // break para salir de la opcion 0 y volver al menu
                case 1:
                    System.out.println("Cuanto quieres retirar"); // mensaje de cuanto se va a retirar
                    int retirar=sc.nextInt(); // variable leida por teclado que guarda el valor de el saldo que se va a retirar
                    if (saldo==0){ // con el IF comprueba que si el saldo el 0 para no dejarte retirar
                        System.out.println("Saldo insuficiente");
                    } else if (saldo>0){ // si el saldo es mayo a 0 uso el ELSE IF para retirar saldo
                        saldo = saldo-retirar; // operacion de retirar saldo con una resta donde se queda guardado el valor
                        System.out.println("Se han retirado "+retirar+" euros de su cuenta"); // imprime cuanto dinero se ha retirado
                    }
                    break; // break para salir de la opcion 1 y volver al menu
                case 2: 
                    System.out.println("Teclea cuanto vas a ingresar"); // mensaje de cuanto se va ingresar
                    int ingreso = sc.nextInt(); // variable leida por teclado que guarda el valor del ingreso
                    saldo = saldo+ingreso; // operacion de ingresar el saldo con una suma que guarda el valor
                    System.out.println("Se han ingresado "+ingreso+" euros en su cuenta, ahora su saldo es: "+saldo); // mensaje que muestra el ingreso y saldo tras el ingreso
                    break; // break para salir de la opcion 2 y volver al menu
                case 3:
                    System.out.println("Indica por numero de mes del 1 al 12 que recibo quieres imprimir"); // mensaje para extraer factura para imprimirla
                    int factura=sc.nextInt();// variable que lee que factura quieres imprimpir del 1 al 12
                    for (int i=1;i<=12;i++){ // con el FOR recorre las 12 facturas de una en una
                        if(i==factura) break; // el BREAK salta en la factura que el usuario a pedido por teclado
                    }
                    System.out.println("Has elegido imprimir la factura: "+factura); // mensaje que imprime que factura se ha elegido para imprimir segun el numero del mes
                    break; // break para salir de la opcion 3 y volver al menu
                case 4:
                    System.out.println("Indica por numero de mes del 1 al 12 que factura quieres pagar");// mensaje de que factura desea el usuario pagar 
                    int pagar=sc.nextInt(); // variable que lee que factura quieres pagar indicando el mes del 1 al 12
                    for (int i=1;i<=12;i++){ // con el FOR recorre las 12 factura de una en una
                        if(i==pagar) continue; // el CONTINUE extrae la factura que el usuario selecciona
                    }
                    System.out.println("Has elegido pagar la factura: "+pagar); // mensaje de que factura desea pagar el usuario
                    break; // break para salir de la opcion 4 y volver al menu
                case 5:
                    System.out.println("Saliendo del programa"); // mesnaje de salir del programa
                    System.exit(0); // el SYSTEM.EXIT para salir el programa
                    break; // break para salir de la opcion 5 y volver al menu
                default: // DEFAULT para los errores y que no se pueda meter una opcion correcta
                    System.out.println("Error indica una opcion en el menu"); // mensaje para indicar opcion incorrecta en el menu
                    break; // break para salir de la opcion
            }
        }
       } while(pin!=1234); // el WHILE del DO-WHILE hace que funcione el bucle
    }
}
