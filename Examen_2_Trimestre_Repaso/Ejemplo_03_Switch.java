
package Examen_2_Trimestre_Repaso;

import java.util.Scanner;
import Examen_2_Trimestre_Repaso.Ejemplo_01_Clase;

public class Ejemplo_03_Switch {

    public static int pruebaMayorMenor(int a, int b)
    {
        if (a>b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc;
        sc=new Scanner(System.in);

        int opcion=0;

        while (opcion!=6){
            
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
            System.out.println("Opcion 6 salir");
            System.out.println("***********************************************");
            opcion=sc.nextInt();
            
            switch (opcion){
                
                case 0: 
                    System.out.println("Esto es una pequeña demostracion de un ternario");
                    System.out.println("**********************************************");
                    System.out.println("Introduce un numero");
                    double n1=sc.nextDouble();
                    System.out.println("Introduce otro numero");
                    System.out.println("**********************************************");
                    double n2=sc.nextDouble();
                    double total=n1+n2;
                    System.out.println("El total es: "+total);
                    System.out.println("**********************************************");
                    System.out.println("Eres socio: true/false");
                    boolean socio=sc.nextBoolean();
                    final double descuento=(total/1.21);
                    boolean p1=true;
                    p1=(n1>0 && n2>0) ? p1==true : p1==false;
                    System.out.println((p1==true && socio==true) ? "El resultado es: "+descuento:"");
                    System.out.println(p1==true && socio==false ? "El resultado es: "+total:"");
                    System.out.println((p1==false && socio==false) ? "El resultado es: "+n1+"+"+n2+"="+total :"");
                    break;
                case 1:
                    System.out.println("Esto es una demostracion de If/Else");
                    System.out.println("**********************************************");
                    System.out.println("Introduce tu edad");
                    int edad=sc.nextInt();
                    if(edad>18){
                        System.out.println("Eres mayor de edad");
                    } else{
                        System.out.println("Eres menor de edad");
                    }
                    break;
                case 2:
                    System.out.println("Esto es una demostracion del If/Else if");
                    System.out.println("**********************************************");
                    System.out.println("Introduce un numero para saber sus cifras");
                    int cifras=sc.nextInt();
                    if (cifras<10){
                        System.out.println("Tiene una cifra");
                    } else if (cifras<100){
                        System.out.println("Tiene 2 cifras");
                    } else if (cifras<1000){
                        System.out.println("Tiene 3 cifras");
                    } else if (cifras<10000){
                        System.out.println("Tiene 4 cifras");
                    } else if(cifras<100000){
                        System.out.println("Tiene 5 cifras");
                    }
                    break;
                case 3:
                    System.out.println("Previamente se ha dejado una funcion preparada antes del MAIN");
                    System.out.println("**********************************************");
                    System.out.println("Es una sencilla prueba para ver que numero es mayor");
                    System.out.println("**********************************************");
                    System.out.println("Introduce un numero");
                    int numA=sc.nextInt();
                    System.out.println("Introduce otro numero");
                    int numB=sc.nextInt();
                    System.out.println("El mayor es: "+pruebaMayorMenor(numA,numB));
                    break;
                case 4:
                    int contraseña=0;
                    do{
                    System.out.println("Introduce la contraseña correcta para continuar");
                    System.out.println("**********************************************");
                    contraseña=sc.nextInt();
                        if(contraseña==1312){
                            System.out.println("Contraseña correcta, continua palante primo");
                        } else{
                            System.out.println("Contraseña incorrecta, tas equivocao!!");
                        }
                    }while(contraseña!=1312);
                    break;
                case 5:
                    System.out.println("Voy a reutilizar una clase previamente creada para ver si eres mayor de edad");
                    System.out.println("**********************************************");
                    System.out.println("Introduce tu edad");
                    int edad2=sc.nextInt();
                    Ejemplo_01_Clase repaso = new Ejemplo_01_Clase (edad2);
                    // La clase se nombra Aqui y se le da el nombre repaso y se usa con edad2 que es la variable creada para esta prueba
                    System.out.println("Eres mayor de edad: "+repaso.Mayoredad());
                    /* Llamamos a la clase con el .MayorEdad() es porque devuelve un booleano de un valor que NO se ha almacenado en la clase
                       Usaria getNuevaedad() si fuera un valor que previamente he guardado en la clase */
                case 6:
                    System.out.println("Saliendo");
                    System.out.println("**********************************************");
                    break;
                default :
                    System.err.println("Error");
                    break;
            }
        }
    }
}
