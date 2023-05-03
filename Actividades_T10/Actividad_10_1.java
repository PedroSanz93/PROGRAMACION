package Actividades_T10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_10_1 {
/* Establecemos un bucle infinito del que solo nos puede sacar el BREAK que, por
    otra parte, solo se ejecutara si se produce la lectura del Scanner sin que salte
    una excepcion InputMismatchException por una entrada tipo erroneo */    
    // es un METODO static que devuelve un valor int    
    static Integer resultado(){
        
        /* es la definicion de una firma de metodo en JAVA, es necesario para que al 
        compilar se sepa que hay un metodo llamado resultado y que devuelve un valor integer*/
        Integer resultado; 
        
        /* el bucle se asegura que el usuario meta un valor valido y se asegura que
        que hasta que no meta un valor valido no salga del bucle*/
        while(true){            
            try{
                System.out.println("Introducir entero");
                resultado = new Scanner(System.in).nextInt();
                break;
                // aqui se llega solo si la lectura del Scanner ha sido correcta
            } catch(InputMismatchException ex){
              /* si el usuario introduce un valor no que sea entero se captura en
                en la excepcion, el catch, y muestra el mensaje de error*/  
                System.out.println("Tipo erroneo");
            }
        }
        // retorna resultado
        return resultado;
}  
    public static void main(String[] args) {
    }
}