
package Actividades_T10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad_10_7 {

    public static void main(String[] args) {

        BufferedWriter out = null;
        try{
            
            out = new BufferedWriter(new FileWriter("C:\\Users\\sanz.alped\\Desktop\\quijote.txt"));
            String cad = "En un lugar de la mancha, "; // primera linea
            
            for(int i= 0; i< cad.length(); i++){
                out.write(cad.charAt(i)); // escribimos caracter a caracter
            }
            cad = "de cuyo nombre no quiero acordarme.";// segunda linea
            out.newLine();//cambio de linea
            out.write(cad);//escribimos con una unica sentencia
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        } finally{
            if (out != null){
                try{
                    out.close();
                    // hacemos que se vacie el bufer y se escriba el archivo
                }catch(IOException ex){
                    System.out.println(ex);
                }
            }
        }   
    }
}
