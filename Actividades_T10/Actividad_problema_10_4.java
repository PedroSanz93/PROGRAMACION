/* Escribe un texto en un archivo de texto, linea a linea leidas del teclado,
hasta que introduzca la cadena <fin>.*/
package Actividades_T10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad_problema_10_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BufferedWriter salida = null; 
        try {
            salida = new BufferedWriter(new FileWriter("C:\\Users\\sanz.alped\\Desktop\\FIN.txt")); // ruta donde se escribe el texto
            String entrada; // variable que va a guardar el valor de entrada por teclado
            do {
                // el DO WHILE soluciona que vaya introduciendo texto y la condicion del while corta cuando la palabra introducida es fin con .equals()
                entrada = sc.nextLine();
                for (int i = 0; i < entrada.length(); i++) {
                    // el for recorre de uno en uno todas las posiciones de la cadena de texto y va colocando los caracteres introducidos en la entrada
                    salida.write(entrada.charAt(i));// la salida imprime la cadena de texto introducida caracter a caracter en el For en orden
                }
                salida.newLine();// en la salida hay un salto a la siguiente linea para que sea mas legible               
            } while (!"final".equals(entrada));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (salida != null) { // si el flujo de salida esta abierto
                try {
                    salida.close(); // se cierra el flujo de salida
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}