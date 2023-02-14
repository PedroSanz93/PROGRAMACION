// programa que solicite las notas(nº Entero) de los 3 trimestres de programacion, el programa 
//debe mostrar la nota media del curso en numero entero y en el expediente academico con decimales
package trimestre_2;

import java.util.Scanner;

public class Repaso_07 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        // lector de lo que se meta por teclado
        System.out.println("Introduce las notas del primer trimestre");       
        int nota1 = sc.nextInt();       
        System.out.println("Introduce las notas del segundo trimestre"); 
        int nota2 = sc.nextInt();
        System.out.println("Introduce las notas del tercer trimestre");
        int nota3 = sc.nextInt();
        // declaramos varibles para guardar los datos con su mensaje correspondiente de que se introduzca cada dato
        double media = nota1+nota2+nota3;
        int notaMedia = (nota1+nota2+nota3)/3;
        double notaAcademica = media/3;
        // declaramos la primara variable para que acumule el valor con decimales, la segunda un entero sin decimales y la ultima para poder mostra el numero con decimales
        System.out.println("La nota media es: "+notaMedia+", y la nota academica es: "+notaAcademica);
        // muestra por pantalla los resultados
    }
}
