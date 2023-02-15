
package trimestre_2;

public class Repaso_21_Ejercicio_Bucles_01 {

    public static void main(String[] args) {
        System.out.println("Se van a mostrar los numeros del 1 al 100 impares");
        for (int i=1;i<=100;i++){
            if (i%2==0) continue;
            // haciendo el continue con el %2 quita los de resto cero o sea se los pares
            System.out.println(i);
        }
    }
}
