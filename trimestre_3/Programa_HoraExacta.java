// actividad 8.2
package trimestre_3;

import java.util.Scanner;

public class Programa_HoraExacta {

    public static void main(String[] args) {

        
        HoraExacta r = new HoraExacta (11, 15, 23); // hora del descanso
        System.out.println(r);
        
        for (int i = 1; i<= 61; i++){
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escribe los segundos: ");
        
        int segundos = new Scanner(System.in).nextInt();
        
        if(r.setSegundos(segundos)){
            System.out.println(r);
        } else{
            System.out.println("No es posible cambiar los segundos");
        }
    }
}