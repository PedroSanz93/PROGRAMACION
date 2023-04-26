
package Practica_09_Clases;

import java.util.Scanner;

public class ProgramaTiendaRopa_intento_1 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
                   
            System.out.println("Esta es la App de TiendaRopa");
            System.out.println("------------------------------------------------");
            System.out.println("Ingresa tu ID de usuario y contraseña si eres Cliente o Administrador");
            
            int opcion=1;
            int usuario=0;
            int contraseña=0;
            if (usuario==0001 && contraseña==5555){
                System.out.println("Has iniciado sesion como Administrador");
                
                while (opcion!=4){
                    
                    switch(opcion){
                        case 1:
                            System.out.println("----------<Sesion administrador>----------");
                            System.out.println("Opcion 1: añadir producto");
                            System.out.println("Opcion 2: eliminar producto");
                            System.out.println("opcion 3: mostrar existencias");
                            int opcionProducto=1;
                            
                            while(opcionProducto!=3){
                                System.out.println("Añadir nuevo producto: (1)Camiseta, (2)Pantalon, (3)Zapatillas");
                                if (opcionProducto==1){
                                    Camiseta Camiseta1 = new Camiseta(1, 29.9, 1, 2020, "Prueba");
                                }
                            }
                            
                            
                    }
                    
                }    
            }  else {
                System.out.println("Has iniciado sesion como Cliente");
            }               
    }
}
