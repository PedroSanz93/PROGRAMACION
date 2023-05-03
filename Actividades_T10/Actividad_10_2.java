package Actividades_T10;

import java.io.FileReader;
import java.io.IOException;

public class Actividad_10_2 {

    public static void main(String[] args) {
    /* Una vez abierto el flujo, leemos de él caracter a caracter, incluidos los cambios
        de linea, y los vamos concatenando en la cadena de caracteres que al final contendra
        el texto completo del archivo Main.java */
        String texto = "";
        
        FileReader in = null;
        /* la declaramos fuera de la estructura TRY-CATCH para que sea
        accesible tambien desde fuera*/
        try{
            
            in = new FileReader("C:\\Users\\sanz.alped\\Desktop\\Prueba1Ficheros.txt");// aqui iria una ruta
            int c = in.read();
            while(c!= -1){ // mientras no llegue al final del archivo
                texto = texto + (char) c; // convertimos C a CHAR
                c = in.read();
            } 
            
        }catch(IOException ex){  
         
            System.out.println(ex.getMessage());
        
        } finally {
            
            if(in != null){// si el flujo esta abierto
                try{
                    
                    in.close();// cerramos el fujo
                    
                }catch(IOException ex){
                    System.out.println(ex);
                    
                }
            }
        }
        System.out.println(texto);
    }
}