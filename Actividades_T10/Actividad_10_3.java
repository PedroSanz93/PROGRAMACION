package Actividades_T10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad_10_3 {

    public static void main(String[] args) {

        String texto = "";
        BufferedReader in = null;
        try{
            in = new BufferedReader(new FileReader("C:\\Users\\sanz.alped\\Desktop\\Prueba1Ficheros.txtMAL"));
            String linea = in.readLine();
            while(linea != null){ // mientras no llegue al final del archivo
            /* el cambio de linea hay que insertarlo manualmente */
                texto = texto + linea +'\n';
                linea = in.readLine();
            } 
        } catch(IOException ex){
          System.out.println(ex.getMessage());
          
            } finally{
            if (in != null){// si el flujo esta abierto
                
                try{
                    in.close();// para cerrar el flujo
                } catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}