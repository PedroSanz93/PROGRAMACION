
package trimestre_2;

import java.util.Scanner;

public class Repaso_23_Ejercicio_Bucle_03 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Tabla multiplicar");
        int j=sc.nextInt(); // numero del que vamos a hacer la tabla de multiplicar
        for (int i=0;i<=10;i++){ // buble que va a repetir 10 veces con un incremento de 1 en 1 hasta 10
            int mul=j*i; // operacion que vamos a guardar en la variable mul j(nº metido por teclado)*i (el incremeto)
            System.out.println( j+"*"+i+"="+mul); // salida de j*i=mul (variable que acumula la multiplicacion)
        }
    }
}
