
package trimestre_2;

public class Repaso_20_For_Continue {

    public static void main(String[] args) {
        System.out.println("Inicio: ");
        for(int i=1;i<=10;i++){
            // bucle for para una cuenta del 1 al 10
            if (i==5) continue;
            // el continue hace que al contar del 1 al 10 no cuente el 5
            System.out.println(i);
        }
    }
}
