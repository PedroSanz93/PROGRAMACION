
package UD2_PARTE2;

import java.util.Scanner;

public class Ej007 {

    public static void main(String[] args) {
        
        Scanner nonulos = new Scanner(System.in);
        // introducimos 3 variables
        int i;
        // i es el incremento de numero que vamos a meter desde donde se empieza, cuantos vamos a meter y que son de 1 en 1
        int n;
        // n que son los valores pos o neg que vamos a ir metiendo
        int contaneg=0;
        // el contador de negativos igualado a 0 que contabilizara cuantos numero negativos nos van a entrar
            for (i=0;i<100;i++){
                // operacion en el for con i para hacer el incremento y decirle CUANTOS NUMEROS vamos a meter y como
                System.out.println("introduce 100 numeros");
                n=nonulos.nextInt();
                // los numeros los leemos dentro del FOR para que sepa que vamos a meter X numeros en el campo i<100
                if (n<0){
                // dentro del IF se da el (n<0) para que sepa cual es negativo
                    contaneg=contaneg+1;
                // al meter el contador aqui los numeros que entren negativos los va contabilizando
                }
            }
            System.out.println("Se han introducido "+contaneg+" numeros negativos");
            // IMPORTANTE leer el contador despues de haber metido los numeros FUERA DEL FOR para que se hagan tanto FOR como IF dentro de FOR y de resultados
    }
}
