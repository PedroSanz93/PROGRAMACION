
package Actividades_T10;


import java.io.FileReader;
import java.io.IOException;

/*Crea un fichero de texto con un editor e implementa un programa que lo abra y lo lea,
mostrando su contenido por pantalla.
Nota: No olvides escribir la ruta de acceso al fichero completa si este no se encuentra en
la carpeta del proyecto actual*/
public class Actividad_problema_10_1 {

    public static void main(String[] args) {
        String texto = "";      
        FileReader entrada = null;
        try{   
        entrada = new FileReader("C:\\Users\\sanz.alped\\Desktop\\Prueba1Ficheros.txt");
        int leer = entrada.read();
            while(leer !=-1){
            texto = texto + (char) leer;
            leer = entrada.read();
            } 
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        } finally{
            if(entrada != null){
            try{
                entrada.close();

              }catch(IOException ex){
              System.out.println(ex);
              }
          }
        }
        System.out.println(texto);
    }
}