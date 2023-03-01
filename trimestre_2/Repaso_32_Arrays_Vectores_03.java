
package trimestre_2_REPASO;

import java.util.Scanner;

public class Repaso_32_Arrays_Vectores_03 {

    public static void main(String[] args) {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        int numAlum; // Variable que almacena el Numero de alumnos que vamos a introducir
        int i; // Variable que acumula el Indice del Array
        double suma = 0; // Variable que acumula la suma de las notas
        double media; // Variable con el calculo de la media de la notas
        
        // Meto un Do While para que lea exactamente los valores que le vamos a meter en la variable numAlum
        do{
            System.out.println("Numero de alumnos de la clase: ");
            numAlum =sc.nextInt();
            
        } while (numAlum <= 0); // mientras sea mayor que cero pasa por el While sino pide datos hasta que se meta un valor correcto
        
        // Variable que guarda el valor en el Array de Notas que seria la FILA y otro valor que guarda el numero de Alumnos que metermos por teclado
        double [] notas = new double[numAlum];
        // El primer FOR recorre las notas que vamos metiendo por teclado y la i sera igual a la longitud del numero de alumnos que hayamos metido por teclado
        for (i = 0; i<notas.length; i++){
            System.out.println("Alumno "+(i+1)+" Nota final: ");
            notas[i] = sc.nextDouble(); // metemos datos de notas hasta el maximo de alumnos
        }
        for (i = 0; i< notas.length ; i++){ // El segundo FOR acumula el valor de la nota y los va sumando uno por uno mientras los recorre
            suma = suma + notas[i];
        }
        // Operacion para sacar la media suma/ la longitud de las notas, las que hayamos metido por teclado
        media = suma / notas.length;
        // Salida de media
        System.out.printf("Nota media del curso: %.2f %n", media);
        // Salida de notas superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        // Con el tercer FOR con un IF dentro filtra las notas segun si son mayor o menor a la media
        for(i = 0; i< notas.length; i++){
            if (notas[i]> media){ // Para mostrar los que estan por debajo de la media se cambia el SIGNO
                // Salida que imprime el numero de alumnos + 1 porque el indice le suma 1 +  las notas segun la posicion en el Array
                System.out.println("Alumno numero "+(i+1)+" Nota final: "+notas[i]);
            }
        }
    }
}
