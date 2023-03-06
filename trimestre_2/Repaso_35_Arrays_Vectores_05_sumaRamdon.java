
/* Vector de longitud 10 que se inicializara con numeros aleatorios comprendidos entre el 1 y el 100. 
   Finalmente se sumaran todos los aleatorios guardados en la tabla */
package trimestre_2_REPASO;

public class Repaso_35_Arrays_Vectores_05_sumaRamdon {

    public static void main(String[] args) {
        
        int valores [];
        // Declaracion del vector
        valores= new int[10];
        // le decimos al constructor que el valor va a ser 10
        for(int i=0; i<valores.length;i++){
            // empieza de 0 hasta la longitud del vector llendo de 1 en 1
            valores[i]=(int)(Math.random()*100+1);
            // en valores se almacenan los valores del for, despues decimos que va a ser un valor entero de manera aleatoria y el *100+1 lo que te coge son 100 numeros quitando el 0
        }
        int suma=0;
        // declaro variable para acumular la suma
        for (int valor:valores){ // Esto seria un ForEach (for mejorado)
            // lo que se hace aqui es crear la variable valor y hacer que recorra la longitud de valores y va cogiendo los 100 numeros aleatorios
            suma += valor;
            // y aqui abajo en la variable suma se va sumando suma+valor y asi acumulando hasta 10
        }
        System.out.println("La suma total de los numeros aleatorios es: "+suma);
        // salida de los datos de la suma
    }
}
