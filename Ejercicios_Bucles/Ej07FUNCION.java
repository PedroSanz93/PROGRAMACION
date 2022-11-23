
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ej07FUNCION {
    // el scaner se pone aqui porque es local para las dos funciones y lo vamos a usar en la primera
    static Scanner sc;
    
    // en la primera funcion vamos a pedir la contraseña al usuario
    public static int pedirContraseña()
    {
        //entra el primer print para pedir la contraseña
        System.out.println("Introduce contraseña");
        // metemos la variable contraseña que va a ser lo que meta el usuario por teclado
        sc= new Scanner(System.in);
        int password=sc.nextInt(); 
        // y lo que devuelve es la contraseña y salta a la siguiente variable
        return password;
    }
    // en la segunda variable se verifica si la contraseña va a ser correcta o no
    public static boolean cajafuerte()
    {
        // se define con el int los intentos que tenemos para abrir la caja 
        int intentos=4;
        // con el boolean se define una variable para determinar si es correcta la contraseña y se iguala con false porque de entrada antes de meter nada no es correcto
        boolean correcto=false; 
        // en el DO se comprueba la contraseña metida por teclado
        do
        {
            // llamamos a la funcion de arriba para que ahora en el IF ELSE te compruebe si es correcta o no
            int password=pedirContraseña();
            if (password==1234){
                // si es correcta devuelve true y en el if como que entra correcta
                correcto=true;
            } else {
                // si es incorrecta te entra en el false y se reduce de los 4 intentos en 1 por el intentos--
                correcto=false;
                intentos--;
            }
        }while ((intentos>0)&&(!correcto));
        // y el while se mete aqui para decir que si los intentos son mayor que 0 y no son correctos va a probar hasta 4 veces
        if(correcto){
            // si entra en el IF es correcta y te devuelve el true
            return true;
        }
        // y si no entra en el IF lo intenta 4 veces y si es incorrecta las 4 veces finaliza programa y te dice que ya no se puede intentar mas
        return false;
    }
    

    public static void main(String[] args) {
        // dos variables dentro del main una para intentos que van a ser las veces que te deja meter contraseña y el boolean para decir si es correcta o no
        int intentos;
        boolean correcto;
        // se llama a la funcion cajafuerte para hacer la verificacion, esta a su vez
        correcto=cajafuerte();

        if (correcto){
            System.out.println("Contraseña correcta");
        }else {
            System.out.println("Lo has intentado 4 veces llama al de mantenimiento");
        }
    }
}
