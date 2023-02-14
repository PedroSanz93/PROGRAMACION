
package trimestre_2;

import java.util.Scanner;
// metemos un Scanner para que lea por teclado los datos que le vamos a meter

public class Repaso_02 {

    public static void main(String[] args) {
    
        Scanner sc;
        sc = new Scanner(System.in);
        // metemos un lector del Scanner para que el programa lea que el usuario va a meter por teclado
        System.out.println("Hola escribe tu nombre");
        // el primer prinln es la primera salida de texto por consola para que muestra un mensaje de introduce un numero
        String nombre = sc.nextLine();
        // declaro variable que va a ser leida por el Scanner(teclado)
        System.out.println("Ahora escribe un numero");
        // el segundo println es la segunda salida de texto por consola para que muestre el mensaje de introduce un numero
        int numero = sc.nextInt();
        // declaro la segunda variable que va a ser leida por el Scanner(teclado)
        System.out.println("Hola "+nombre+" el numero introducido es el "+numero);
        // y el tercer println es la salida final del programa que va a mostrar un mensaje con los datos introducidos por teclado
    }
}
