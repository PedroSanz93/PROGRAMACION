
package Actividades_T10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad_10_8 {

    public static void main(String[] args) {

        System.out.println("Nombre del fichero: ");
        String fichOriginal = new Scanner(System.in).nextLine();
        String fichCopia = "copia_de_"+fichOriginal;
        /* abrimos los ficheros para lectura y escritura en la misma 
        sentencia del bloque TRY-CATCH-RESOURCES*/
        try(BufferedReader in = new BufferedReader(new FileReader(fichOriginal));
        BufferedWriter out =new BufferedWriter(new FileWriter(fichCopia))){
            int c = in.read(); // leemos del original
            while(c != -1){ // mientras no lleguemos al final del fichero
                out.write(c); // escribimos en el fichero copia
                c = in.read(); // volvemos a leer
            }
 
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }        
    }
}