//Realiza el control de acceso a una caja fuerte. La combinación
//será un número de 4 cifras. El programa nos pedirá la combinación
//para abrirla. Si no acertamos, se nos mostrará el mensaje
//“Lo siento, esa no es la combinación” y si acertamos se nos dirá
//“La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
//oportunidades para abrir la caja fuerte
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {
        Scanner sc;
        int intentos=4;
        
        boolean correcto=false;
        
        do
        {
            System.out.println("Introduce contraseña");
            sc= new Scanner(System.in);
            int password=sc.nextInt();
            if (password==1234){
                correcto=true;
            } else {
                System.out.println("Contraseña incorrecta");
            } 
            intentos--;
        }while ((intentos>0)&&(!correcto));
        
        if (correcto){
            System.out.println("Contraseña correcta");
        }else {
            System.out.println("Lo has intentado 4 veces llama al de mantenimiento");
        }
    }
}
