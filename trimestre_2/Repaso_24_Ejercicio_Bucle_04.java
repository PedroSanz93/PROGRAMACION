
package trimestre_2;

public class Repaso_24_Ejercicio_Bucle_04 {

    public static void main(String[] args) {
        System.out.println("Tabla multiplicar");
        for (int i=0;i<=10;i++){ // el primer for dice las veces que se va a repetir el bucle            
            for (int j=0;j<=10;j++){ // el segundo for que es el que va anidado va igual para decirle que vamos a hacer dentro de las 10 veces 10 repeticiones por cada vez
                System.out.println(i+"*"+j+"="+(i*j)); // en la salida metemos i*j=i*j para que imprima cada numero y resultado
            }                 
        }
    }
}
