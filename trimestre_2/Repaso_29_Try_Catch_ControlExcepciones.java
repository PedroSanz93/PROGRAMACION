package trimestre_2_REPASO;

import java.util.Scanner;

public class Repaso_29_Try_Catch_ControlExcepciones {

    public static void main(String[] args) {
        /* Declaramos dos variables
         * para almacenar dos números
         * y una tercera para almacenar
         * el resultado de una división*/
        double primerNumero, segundoNumero, resultado;
        // Declaro un objeto Scanner para leer los datos
        Scanner lectura=new Scanner(System.in);
        try { // Intentamos         
            // Pedir los números al usuario
            System.out.println("Introduce el primer numero");
            primerNumero=lectura.nextDouble();         
            System.out.println("Introduce el segundo numero");
            segundoNumero=lectura.nextDouble();           
            // y dividir los dos números
            resultado=primerNumero/segundoNumero;
            // Mostramos el resultado por pantalla.
            System.out.println("El resultado es " + resultado);         
        }
        /* En caso de que surja algún error
         * de tipo aritmético,Por ejemplo,
         * que no se puede dividir entre cero*/
        catch (ArithmeticException e){ 
            // Mostramos este mensaje 
            System.out.println("No se puede dividir entre cero");   
        }
        /* En caso que se la excepcion no sea
         * de tipo aritmético, se ejecutará este bloque*/
        catch (Exception ex){ 
            /* Mostramos este mensaje en caso de que no
             * sea una excepción de tipo aritmético*/
            System.out.println("Se ha producido un error"); 
        } 
        /* Tanto si se produce la excepción,
         * como si no se produce, se ejecutará
         * el bloque finally*/
        finally {
            lectura.close();
        }
    }       
}