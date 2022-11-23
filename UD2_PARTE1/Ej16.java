
package UD2_PARTE1;
import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        // 
       Scanner numeroentre = new Scanner(System.in);
      int numero;
      
      System.out.println("Introduce un numero");
      numero = numeroentre.nextInt();
      
      if (numero<=9){
          System.out.println("El numero introducido tiene una cifra");
      } else if (numero<=99){
          System.out.println("El numero introducido tiene dos cifras");
      } else if (numero<=999){
          System.out.println("El numero introducido tiene tres cifras");
      } else if (numero<=9999){
          System.out.println("El numero introducido tiene cuatro cifras");
      } else if (numero<=99999){
          System.out.println("El numero introducido tiene cinco cifras");
      }
    } 
}
