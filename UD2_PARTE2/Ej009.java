package UD2_PARTE2;

import java.util.Scanner;

public class Ej009 {
    
    public static void main(String[] args) {
        Scanner nonulos = new Scanner(System.in);
        // metemos 3 variables
        int n;
        // numeros que vamos a meter por teclado
        int contpos=0;
        // contador de positivos
        int contneg=0;
        // contador de negativos
        // se va a usar el DO WHILE para hacer un bucle que diga vamos a hacer una accion hasta que en el while se haga otra cosa y el programa termine
        do {
        // do es lo que se hace donde metemos las operaciones, en este caso los contadores
            System.out.println("Introduce numeros");
            n=nonulos.nextInt();
        // leemos dentro del do y metemos numero por teclado dentro para que haga las dos acciones, la primera si no es 0 contamos numeros sino va al WHILE
        // IF / ELSE IF son para hacer los contadores
            if (n<0){
            contneg=contneg+1;
            } else if (n>0){
            contpos=contpos+1;
            }
        } //CERRAMOS EL DO ENTRE CORCHETES Y A CONTINUACION VA EL WHILE CON PUNTO Y COMA   
        while (n!=0);
        // en el while entrara el numero si es 0 para finalizar el programa y darte los resultados
        System.out.println("Se ha introducido un 0, el contador ha finalizado. Positivos: "+contpos+". Negativos: "+contneg+".");
    }
}