
package UD2_PARTE1;

import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
        //
        Scanner calificaciones = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Introduce la nota del alumno");
        nota=calificaciones.nextInt();
        
            
            switch (nota){
                case 0:
                System.out.println("La nota introducida ha sido Muy deficiente"); 
                break;
                case 1:
                System.out.println("La nota introducida ha sido Muy deficiente");  
                break;
                case 2:   
                System.out.println("La nota introducida ha sido Muy deficiente");
                break;
                case 3:                   
                System.out.println("La nota introducida ha sido Muy deficiente"); 
                break;
                case 4:                   
                System.out.println("La nota introducida ha sido un Insuficiente"); 
                break;
                case 5:
                System.out.println("La nota introducida ha sido Suficiente");
                break;
                case 6:
                System.out.println("La nota introducida ha sido Bien");
                break;
                case 7:
                System.out.println("La nota introducida ha sido Notable");  
                break;
                case 8:
                System.out.println("La nota introducida ha sido Notable");  
                break;
                case 9:
                System.out.println("La nota introducida ha sido Sobresaliente");   
                break;
                case 10:
                System.out.println("La nota introducida ha sido Sobresaliente");  
                break;
                default:
                System.out.println("Numero incorrecto");
                    break;
            }
        }    
    }
     

