
import java.util.Scanner;
// import de la clase Scanner para leer por teclado
public class Practica_04_BORRADOR {

    public static void main(String[] args) {
        // Clase principal main
        Scanner sc;
        sc=new Scanner(System.in);
        // Clase Scanner para leer por teclado
        int opcion=0; // variable para acumular el valor de opcion
        
        while (opcion!=3){// el while para asegurar que se introduce una opcion valida
            // Menu con todas las opciones
            System.out.println("Para comprobar el estado de tu pedido");
            System.out.println("**********************************************");
            System.out.println("Opcion 0 para localizar en que orden esta tu pedido");
            System.out.println("**********************************************");
            System.out.println("Opcion 1 para localizar cuantas paradas le quedan a tu pedido");
            System.out.println("**********************************************");
            System.out.println("Opcion 2 para hacer una copia de seguridad de todos los pedidos");
            System.out.println("**********************************************");
            System.out.println("Opcion 3 para salir del programa");
            opcion=sc.nextInt();
            // opcion a elegir por teclado
            switch(opcion){
                case 0: 
                    int arr[]; // declaro un array
                    arr=new int[10]; // de 10 posiciones
                    int buscador=0; // declaro una variable para buscar en el array
                    int pedido=55; // declaro una varible que guarda el nºpedido
                    arr[5]=55; // y le indico que va a estar en la posicion 5 de 10 del array
                    while (buscador<arr.length && arr[buscador]!=pedido){
                        // le digo al while que mientras el buscador que va a ser lo que recorra el array se menor a la longitud del array y difenrente al nº de pedido
                            buscador++; // suma a la busqueda +1
                            }
                                if (buscador<arr.length){
                                    // si el contador del buscador no excede el numero de veces buscado con la longitud del array lo encuentra y lo muestra
                                    System.out.println("El pedido esta en la orden numero: "+buscador);
                                } else {
                                    // por el else sale si no encuentra el nº de pedido
                                }
                break;
                
                case 1: 
                    System.out.println("En que parada estas");
                    int tuparada=sc.nextInt();
                    int parada [];
                    // declaro un vector para guardar la cantidad de paradas
                    parada= new int[50];
                    // indico al vector que habria 50 paradas
                     for(int i=0; i<parada.length;i++){
                    // el FOR empieza de 0 hasta la longitud del vector parada llendo de 1 en 1
                    parada[i]=(int)(Math.random()*10+1);
                    /* en parada se van a guardar los valores del for, despues decimos que va a ser un valor entero de manera aleatoria y el *100+1 
                    lo que te coge son 100 numeros quitando el 0, el randomizado es con idea de que te de una posicion distinta de la parada cada vez que lo compruebes*/
                    }
                    int contador=0;
                    // declaro variable contador
                    for (int vuelta:parada){ // ForEach (For mejorado)
                        /* lo que se hace aqui es crear la variable vuelta y hacer que recorra la longitud de parada 
                           y va cogiendo los 100 numeros aleatorios para randomizar la parada cada vez que se compruebe*/
                        contador =contador+vuelta;
                        // y aqui abajo en la variable suma se va sumando contador+vuelta y asi acumulando hasta 10
                    }
                    System.out.println("Tu pedido va por la parada: "+contador+", y tu estas en la parada: "+tuparada);
                    // salida de los datos con informacion de porque parada va y en cual estas tu 
                break;
                
                case 2:
                    System.out.println("Vamos a hacer una copia de seguridad de todos los pedidos realizados");
                    System.out.println("Cuantos pedidos has realizado anteriormente");
                    int pedidos=sc.nextInt(); // variable para guardar la cantidad de pedidos
                    int arr2[]=new int[pedidos];// aqui le digo al array que guarde cuantas posiciones va a haber dependiendo de cuantos pedidos meta
                    int arr2Copia[]= new int [arr2.length]; // aqui indico que la copia va a tener la longitud del original
                    for (int i=0; i<arr2.length; i++){ // el primer FOR va a recorrer el array 
                    System.out.println("Escribe los numeros de pedido: ");
                    arr2[i]=sc.nextInt(); // y va a guardar en el array los numeros de pedido en cada posicion
                    // Le metemos, segun cuando valores le hayamos dicho que vamos a meter, todos los numeros
                    }
                    System.out.println("Estos son tus numeros de pedido del mas antiguo al mas reciente");
                    for(int j=arr2.length-1;j>=0; j--){// el segundo FOR recorre el array al reves
                        System.out.println("El pedido es: "+arr2[j]+", y esta es la copia: "+arr2[j]);// y imprime los numeros de pedido hacia atras
                    }
                break;
                
                case 3:
                    System.out.println("Saliendo del programa"); // salida del programa
                break;
                
                default:
                    System.err.println("Error, opcion incorrecta"); // default para errores en meter opcion incorrecta
                break;
            }
        }
    }   
}
