
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;


public class Repaso_03_FOR {


    public static void main(String[] args) {
        Scanner sc;
        sc= new Scanner(System.in);
        // meto el numero para la tabla de multiplicar
        System.out.println("Tabla multiplicar del: ");
        int n=sc.nextInt();
        // el for recorre del 0 al 10
        for(int i=0;i<=10;i++){
            // en la variable mult le digo que operacion quiero que me haga con la condicion del FOR
            int mult=n*i;
            // imprime la tabla de ese numero ejemplo 2*2=4 y asi todos los numeros del 0 al 10
            System.out.println(n+" * "+i+" = "+mult);
        }
        
    }
}
