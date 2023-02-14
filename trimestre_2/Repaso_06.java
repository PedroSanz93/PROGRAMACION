
package trimestre_2;

import java.util.Scanner;

public class Repaso_06 {

    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("¿Esta lloviendo? (true/false)");
        
        boolean pregunta1 = sc.nextBoolean();
        
        System.out.println("¿Has echo las tareas? (true/false)");
        
        boolean pregunta2 =sc.nextBoolean();
        
        System.out.println("¿Esta lloviendo pero tienes que ir a la biblioteca? (true/false)");
        
        boolean pregunta3 =sc.nextBoolean();
        
        boolean respuesta = respuesta =! pregunta1 && pregunta2 || pregunta3;
        // Si la respuesta que da el usuario es favorable para que salga a la calle muestra true sino muestra false
        System.out.println("Puedes salirte a la calle "+respuesta);

    }
}
