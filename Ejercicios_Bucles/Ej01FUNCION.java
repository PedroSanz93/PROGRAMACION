
package Ejercicios_Bucles;


public class Ej01FUNCION {

    public static void multiplos5FOR ()
    {
        int i;
        for (i=0;i<=100;i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        multiplos5FOR();
    }
}
