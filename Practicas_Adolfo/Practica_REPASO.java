
package Practicas_Adolfo;

import java.util.Scanner; // importo clase scanner para meter datos por teclado
import Examen_2_Trimestre_Repaso.Ejemplo_01_Clase; // importo clase creada por mi para una de las opciones del programa
import java.util.Arrays; // importo clase arrays para llamar metodos para arrays

public class Practica_REPASO {

    public static int pruebaMayorMenor(int a, int b)
            // funcion sencilla para comparar dos numeros para decir cual es mayor
    {
        if (a>b){// un if simple para sacar que numero es mayor
            return a; // si lo es devuelve a
        } else {
            return b; // si no lo es devuelve b
        }
    }
    public static void main(String[] args) {
        // clase principal main
        Scanner sc;
        sc=new Scanner(System.in);
        // lector por teclado de valores
        int opcion=0;
        // creo la variable opcion que incia en 0 para meter las opciones por teclado del menu
        while (opcion!=7){
            // creo un while para que haga un bucle en las 7 opciones del menu posibles
            System.out.println("Esto es para repasar el examen de programacion");
            System.out.println("**********************************************");
            System.out.println("Opcion 0 ternario");
            System.out.println("**********************************************");
            System.out.println("Opcion 1 If/Else");
            System.out.println("**********************************************");
            System.out.println("Opcion 2 If/Else If");
            System.out.println("**********************************************");
            System.out.println("Opcion 3 Funciones");
            System.out.println("**********************************************");
            System.out.println("Opcion 4 para Do/While");
            System.out.println("**********************************************");
            System.out.println("Opcion 5 para Clase/Objeto");
            System.out.println("**********************************************");
            System.out.println("Opcion 6 para Arrays Unidimensionales");
            System.out.println("***********************************************");
            System.out.println("Opcion 7 salir");
            // impresion por pantalla del menu con las opciones
            opcion=sc.nextInt();
            // el usuario introduce la ocpion por teclado en el menu
            switch (opcion){ // menu switch para 7 opciones
                
                case 0: // operador ternario
                    System.out.println("Esto es una pequeña demostracion de un ternario");
                    System.out.println("Que te suma dos numero, y segun la decision que tomes te hace otra operacion");
                    System.out.println("**********************************************");
                    System.out.println("Introduce un numero");
                    double n1=sc.nextDouble(); // el usuario introduce el primer numero por teclado
                    System.out.println("Introduce otro numero");
                    System.out.println("**********************************************");
                    double n2=sc.nextDouble(); // el usuario introduce el segundo numero por teclado
                    double total=n1+n2; // variable que acumula la suma de los dos numeros introducidos por el usuario
                    System.out.println("El total es: "+total); // imprime la suma
                    System.out.println("**********************************************");
                    System.out.println("Quieres otra operacion: true/false"); // mensaje para aplicar ternario
                    boolean operacion=sc.nextBoolean(); // el usuario introduce decision por teclado
                    final double descuento=(total/1.50); // operacion de "descuento" en el total
                    boolean p1=true; // igualo la variable p1 a true para establecer los caminos
                    p1=(n1>0 && n2>0) ? p1==true : p1==false; 
                    /* si dentro de p1 el numero 1 y el 2 son mayores que cero hay dos posibilidades que sea true y 
                       vaya por uno de los caminos o sea false y vaya por el otro*/
                    System.out.println((p1==true && operacion==true) ? "El resultado es: "+descuento:"");
                    // imprime si p1 y la operacion son true hace la suma y la operacion
                    System.out.println(p1==true && operacion==false ? "El resultado es: "+total:"");
                    // si p1 es true y la operacion es false, solo hace la suma y no la operacion
                    System.out.println((p1==false && operacion==false) ? "El resultado es: "+n1+"+"+n2+"="+total :"");
                    // y por ultimo si p1 y la operacion son false imprime el valor metido
                    break; // break para poder resetear el menu despues de cada opcion
                case 1:
                    System.out.println("Esto es una demostracion de If/Else");
                    System.out.println("**********************************************");
                    System.out.println("Introduce tu edad");
                    int edad=sc.nextInt(); // numero a introducido por el usario 
                    if(edad>=18){ // if else sencillo para comprobar si es mayor o igual de 18 es mayor de edad
                        System.out.println("Eres mayor de edad");
                    } else{ // else si es menor de 18
                        System.out.println("Eres menor de edad");
                    }
                    break; // break para poder resetear el menu despues de cada opcion
                case 2:
                    System.out.println("Esto es una demostracion del If/Else if");
                    System.out.println("**********************************************");
                    System.out.println("Introduce un numero para saber sus cifras");
                    int cifras=sc.nextInt();// numero a introducido por el usario para ver cuantas cifras tiene (maximo 5)
                    if (cifras<10){ // si tiene 1 cifra salta el println
                        System.out.println("Tiene una cifra");
                    } else if (cifras<100){ // si tiene 2 cifras salta el println
                        System.out.println("Tiene 2 cifras");
                    } else if (cifras<1000){ // si tiene 3 cifras salta el println
                        System.out.println("Tiene 3 cifras");
                    } else if (cifras<10000){ // si tiene 4 cifras salta el println
                        System.out.println("Tiene 4 cifras");
                    } else if(cifras<100000){ // si tiene 5 cifras salta el println
                        System.out.println("Tiene 5 cifras");
                    }
                    break; // break para poder resetear el menu despues de cada opcion
                case 3:
                    System.out.println("Previamente se ha dejado una funcion preparada antes del MAIN");
                    System.out.println("**********************************************");
                    System.out.println("Es una sencilla prueba para ver que numero es mayor");
                    System.out.println("**********************************************");
                    System.out.println("Introduce un numero");
                    int numA=sc.nextInt(); // numero a introducido por el usario
                    System.out.println("Introduce otro numero");
                    int numB=sc.nextInt();// numero b introducido por el usario
                    // llamada al metodo para hacer la comprobacion de cual es mayor
                    System.out.println("El mayor es: "+pruebaMayorMenor(numA,numB));
                    break; // break para poder resetear el menu despues de cada opcion
                case 4:
                    int contraseña=0; // inicializo la contraseña fuera del do while en 0
                    do{ // el do siempre hace lo que va dentro una vez
                    System.out.println("Introduce la contraseña correcta para continuar");
                    System.out.println("**********************************************");
                    // contraseña metida por el usuario
                    contraseña=sc.nextInt();
                        if(contraseña==5555){ // sencillo if else con mensaje para comproba s la contraseña es correcta o no
                            System.out.println("Contraseña correcta, continua palante primo");
                        } else{
                            System.out.println("Contraseña incorrecta, tas equivocao!!");
                        }
                    }while(contraseña!=5555); // si es distinta sigue hacendo el bucle hasta que se introduzca bien
                    break; // break para poder resetear el menu despues de cada opcion
                case 5: // clase/objeto
                    System.out.println("Voy a reutilizar una clase previamente creada para ver si eres mayor de edad");
                    System.out.println("**********************************************");
                    System.out.println("Introduce tu edad");
                    // numero introducido por el usuario
                    int edad2=sc.nextInt();
                    Ejemplo_01_Clase repaso = new Ejemplo_01_Clase (edad2);
                    // La clase se nombra Aqui y se le da el nombre repaso y se usa con edad2 que es la variable creada para esta prueba
                    System.out.println("Eres mayor de edad: "+repaso.Mayoredad());
                    /* Llamamos a la clase con el .MayorEdad() es porque devuelve un booleano de un valor que NO se ha almacenado en la clase,
                       Usaria getNuevaedad() si fuera un valor que previamente he guardado en la clase */
                    break; // break para poder resetear el menu despues de cada opcion
                case 6: // arrays
                    System.out.println("Este seria un repaso a los arrays de un programa que separa los arrays");
                    System.out.println("en pares e impares y a continuacion hace una busqueda secuencial para ver");
                    System.out.println("si el numero que vas a introducir por teclado esta en esa division de pares e impares");
                    System.out.println("*****************************************************************************************");
                    int numeros[]; // declaro variable entera con array
                    int arrPar[]= new int[0]; 
                    // el contador de array par igualado a cero porque al principio no hay ningun numero metido
                    int arrImpar[]= new int[0];
                    // el contador de array impar igualado a cero porque al principio no hay ningun numero metido
                    System.out.println("Indica cuantos numeros se van a meter");
                    int num=sc.nextInt(); // variable para acumular los numeros que se van a almacenar en el array
                    numeros = new int[num]; 
                    // y aqui le decimos al array que se va a guardar la variable array que usuario meta por teclado
                    for (int i=0;i<numeros.length;i++){ 
                    // for para recorrer desde cero hasta lo largo que sea el array de uno en uno
                        System.out.println("Mete ahora los numero");
                        numeros[i]=sc.nextInt();
                        // la variable i va a ser la encargada de recorrer todos los numeros del array
                    }
                    for (int j:numeros){
                        // en el segundo for (que es forEach) se recorre con la variable j todos los numeros almacenados en el array
                        if(j%2==0){
                            // con el if le decimos que todos los numeros de resto 0 son pares
                            arrPar=Arrays.copyOf(arrPar , arrPar.length+1); 
                            /* el metodo Arrays.copyOf() añade un numero par al array original con una logitud mayor y
                               añade el valor de j al final*/
                            arrPar[arrPar.length-1]=j;
                        } else {
                            arrImpar=Arrays.copyOf(arrImpar , arrImpar.length+1);
                            /* el metodo Arrays.copyOf() añade un numero impar al array original con una logitud mayor y
                               añade el valor de j al final*/
                            arrImpar[arrImpar.length-1]=j; 
                        }
                    }
                    
                    Arrays.sort(arrPar); // metodo de la clase Arrays para ordenar los pares
                    Arrays.sort(arrImpar); // metodo de la clase Arrays para ordenar los impares
                    System.out.println("Los numeros pares son: "+Arrays.toString(arrPar));
                    // imprime los valores pares del array
                    System.out.println("Los numeros impares son: "+Arrays.toString(arrImpar));
                    // imprime los valores impares del array
                    System.out.println("**********************************************");
                    System.out.println("Ahora a traves de una busqueda secuencial introduce un numero a ver si esta en los pares o impares");
                    // pide que se introduzca un numero por teclado para la busqueda
                    int buscaNum = sc.nextInt();
                    /* inicializo 2 variables como false, una es buscando que es para seguir buscando el numero y la otra es 
                    encontrado que es la que si encuentra el numero sale del bucle*/
                    boolean buscando = false;
                    boolean encontrado = false;
                    // el primer forEach sirve para recorrer con la variable aux k el array par y ver si el numero metido esta ahi
                    for(int k : arrPar){
                        // si lo encuentra las dos variables, buscando y encontrado son true por lo tanto esta en los pares y sale del bucle
                        if (k==buscaNum){
                            buscando = true;
                            encontrado = true;
                            break; // uso el break como salida anticipada para que no haga todo el bucle
                        } if(!encontrado){
                        // uso la expresion ! para decirle al if que siga buscando porque no se ha encontrado el numero
                        // al meter else if lo sacaba todo como encontrado y lo he separado en 2 if
                        // el segundo forEach vuelve a recorrer pero esta vez los impares con la variable aux z
                        for(int z : arrImpar){
                            // finalmente si lo encuentra en los impares sale del bucle con el break como salida anticipada
                            if(z==buscaNum){
                                buscando = true;
                                encontrado = true;
                                break; // break para salida del bucle
                                }                            }
                        }
                    }
                    /* y para acabar la busqueda si el numero es encontrado que es la variable que encontraba el numero
                        te muestra un mensaje de encontrado y en el else el mensaje de si no lo encuentra*/
                    if(encontrado){
                        System.out.println("El numero que has metido: "+buscaNum+", esta en los metidos antes" );
                        
                    } else{  
                        System.out.println("No esta en la lista");
                    }      System.out.println("************************************************************************");
                    break; // break para poder resetear el menu despues de cada opcion
                case 7: // salida de menu
                    System.out.println("Saliendo");
                    System.out.println("**********************************************");
                    break; // break para poder resetear el menu despues de cada opcion
                default : // default para errores en el menu
                    System.err.println("Error");
                    break; // break para poder resetear el menu si se mete un valor no valido
            }
        }
    }
}
