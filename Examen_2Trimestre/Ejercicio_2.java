
package Examen_2Trimestre;

import java.util.Scanner; // clase Scanner para meter datos por teclado

public class Ejercicio_2 {

    public static void main(String[] args) {
        //clase principal
        Scanner sc;
        sc= new Scanner(System.in);        
        int numero;
        // variable para guardar el valor que meta el usuario por teclado
        // voy a usar la estructura de repeticion doWhile para que me haga la primera accion que va a ser comprobar si es un numero par y positivo con un if
        do{
            System.out.println("Introduce numeros para saber si es positivo, par y saber su cuadrado, hasta introducir un 0");
            numero = sc.nextInt();// numero a introducir por el usuario dentro del do
            int cuadrado=numero*numero; // variable que guarda la operacion del cuadrado del numero
            // uso el condicional If diciendole que si es un numero que da resto cero (que seria par) y es mayor que cero, los contadores suman +1 
            if (numero%2==0 && numero>0){ // el primer if filtra un par si da resto cero porque es positivo si es mayor que 0 
                System.out.println("El numero es: "+numero+", es positivo y par y el cuadrado es: "+cuadrado);
            }else if(numero%2!=0 && numero>0){ // el primer else if filtra si es impar si su resto es distinto a 0 y positivo si es mayor que 0
                System.out.println("El numero: "+numero+", no es par pero si positivo y su cuadrado es: "+cuadrado);
            } else if(numero%2==0 && numero<0){ // el segundo else if filtra si es par si su resto es cero y negativo porque es menor que 0
                System.out.println("El numero: "+numero+", es par pero no positivo y su cuadrado es: "+cuadrado);
            } else if(numero%2!=0 && numero<0){ // el tercer else if filtra si es impar si su resto es distinto a 0 y negativo porque es menor que 0
                System.out.println("El numero: "+numero+", no es par no es positivo y su cuadrado es: "+cuadrado);
            }
        } while (numero!=0); // el while le ponemos que si es distinto a 0 que haga el bucle y si no que salga del bucle y acabe el programa     
    }   
}
