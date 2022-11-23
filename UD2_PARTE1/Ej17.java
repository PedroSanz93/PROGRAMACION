
package UD2_PARTE1;

import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
// Para las validaciones de para numeros o letras SE USA .equals con las siguientes instrucciones
        Scanner iniciosesion = new Scanner(System.in);
//Equals() se usa para saber si dos objetos son del mismo tipo y tienen los mismos datos.
//Nos dara el valor true si son iguales y false si no.
//Las subclases pueden sobreescribir el método equals() para hacer una comparación entre dos objetos.
        String usuario;
        String contraseña;
        
        System.out.println("Introduce usuario");
        usuario = iniciosesion.nextLine();
        System.out.println("Introduce contraseña");
        contraseña = iniciosesion.nextLine();
// Para lo que es correcto como usuario hay que meter usuario.equals("Pedro) porque de esta manera va a validar la contraseña y comprobar que esta bien
// Para cuando quiere comprobar si esta incorrecto no hay que meter el .equals simplemente con decir que es != a la correcta te lo comprueba
        if (usuario.equals("Pedro") && contraseña.equals("1234")){
            System.out.println("Usuario y contraseña correcto");
        } else if (usuario.equals("Pedro") && contraseña!="1234"){
            System.out.println("Usuario valido, contraseña incorrecta");
        } else if (usuario!="Pedro" && contraseña.equals("1234")){
            System.out.println("Usuario incorrecto, contraseña correcta");
        }  else if (usuario!="Pedro" && contraseña!="1234"){
            System.out.println("Usuario y contraseña incorrectos");
        }
    }
}