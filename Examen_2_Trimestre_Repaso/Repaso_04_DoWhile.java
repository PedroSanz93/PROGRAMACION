
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;


public class Repaso_04_DoWhile {

    public static void main(String[] args) {
        Scanner sc;
        sc= new Scanner(System.in);
        
        int contraseña=1234;

            do{
            System.out.println("Introduce la contraseña");
            contraseña=sc.nextInt();           
                if(contraseña==1234){
                    System.out.println("Acaba el bucle do while");

                } else{
                    System.out.println("Sigue intentandolo");
                }            
            } while(contraseña!=1234);
    } 
}
