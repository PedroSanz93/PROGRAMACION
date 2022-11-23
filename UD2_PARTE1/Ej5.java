
package UD2_PARTE1;

import java.util.Scanner;
// importamos lector por teclado para el main
public class Ej5 {

    public static void main(String[] args) {
        // metemos las variables que vamos a meter por teclado      
        double radio;
        double pi=3.141892;       
        double longitudCircunf;
        double areaCirculo;
        double volumenEsfera;
        
        Scanner resultados = new Scanner(System.in);
        // variable para leer por teclado
        System.out.println("introduce el radio");
        // el print para meter el mensaje por teclado del radio
        radio= resultados.nextInt();
        // con esto el radio lo podemos meter por teclado     
        longitudCircunf= pi*(radio*radio);
        // declaramos la formula la longitudCircunf
        System.out.println("la longitud de la circunferencia es " +longitudCircunf);
        //el print para que te saque el mensaje de la longitud de la circunferencia
        areaCirculo= pi*(radio*radio);
        // declaramos la formula del areaCirculo
        System.out.println("el area del circulo es " +areaCirculo);
        // el print para que te saque el mensaje de el area del circulo
        volumenEsfera= (4/3)*(pi*(radio*radio*radio));
        // declaramos la formula del volumenEsfera
        System.out.println("el volumen de la esfera es " +volumenEsfera);
        // el print para que te saque el mensaje del volumen de la esfera
    }
}
