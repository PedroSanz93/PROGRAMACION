
package Examen_2Trimestre;

import java.util.Scanner; // clase Scanner para meter datos por teclado

public class Ejercicio_1 {

    public static void main(String[] args) { // clase principal
        
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.println("Cual ha sido tu nota");
        int nota = sc.nextInt(); // esta seria la variable que va a guardar el valor que el usuario metera por teclado
        // Uso el condicional If para que dependiendo del valor metido salga por una de las decisiones
        if(nota==0 || nota==1 || nota==2 || nota==3 || nota==4){// en el IF le decimos que si la nota es 0 o 1 o 2 o 3 o 4 muestra un mensaje de insuficiente
            System.out.println("Tu nota es: Insuficiente"); // salida por pantalla
        } else if(nota==5){ // en el else if entra la siguiente condicion que si es 5 muestra un mensaje de Suficiente
            System.out.println("Tu nota es: suficiente"); // salida por pantalla
        } else if(nota==6){ // en el siguiente else if entra en la siguiente condicion que si es 6 muestra un mensaje de Bien
            System.out.println("Tu nota es: Bien"); // salida por pantalla
        } else if(nota==7 || nota==8){ // en el siguiente else if entra en la siguiente condicion que si es 7 o 8 muestra un mensaje de Notable
            System.out.println("Tu nota es: Notable"); // salida por pantalla
        } else if(nota==9 || nota==10){ // en el siguiente else if entra en la siguiente condicion que si es 9 o 10 muestra un mensaje de Sobresaliente
            System.out.println("Tu nota es: Sobresaliente"); // salida por pantalla
        }
    }
}
