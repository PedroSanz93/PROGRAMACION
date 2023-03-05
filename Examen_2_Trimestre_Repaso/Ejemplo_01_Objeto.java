
package Examen_2_Trimestre_Repaso;

import Examen_2_Trimestre_Repaso.Ejemplo_01_Clase;
import java.util.Scanner;

public class Ejemplo_01_Objeto {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        
        
        System.out.println("Introduce tu edad");
        int edad=sc.nextInt();
        Ejemplo_01_Clase prueba = new Ejemplo_01_Clase (edad);
        System.out.println("Eres mayor de edad: "+prueba.Mayoredad());
        /*La razón por la que se utiliza prueba.Mayoredad() en lugar de prueba.getMayoredad() 
        en la línea System.out.println("Eres mayor de edad: "+prueba.Mayoredad()); es porque Mayoredad() es 
        un método de la clase Ejemplo_01_Clase que devuelve un booleano indicando si 
        la edad es mayor o igual a 18 años, mientras que getMayoredad() es un método que no existe en la clase y 
        que intenta devolver un valor que no ha sido almacenado en la clase. Por lo tanto, si se quiere imprimir si 
        la persona es mayor de edad o no, lo correcto es llamar al método Mayoredad().
        Si se quisiera imprimir la edad almacenada en la clase, entonces se utilizaría el método getNuevaedad().*/
    }
}
