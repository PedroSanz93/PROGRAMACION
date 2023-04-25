
package Practica_09_Clases;

import java.util.Scanner;

public class ProgramaTiendaRopa {

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
                                    Camiseta Camiseta1 = new Camiseta(1234, 1, 11.9, true, nike,2023);
                                }
                            }
                            
                            
                    }
                    
                }    
            }  else {
                System.out.println("Has iniciado sesion como Cliente");
            }
            
            // iDEA CON ARRAYS MULTIDIMENSIONALES
            Array[6,NUMERO PRODUCTOS NUEVOS];// ENTRADA DE CUANTOS PRODUCTOS NUEVOS VAS A METER
            
            for(int a=0;a<6;a++){ // FOR PARA "DIBUJAR COMO VA A SER EL ARRAY" EJEMPLO SI ARRIBA METES 2 METERA DOS FILAS CON 6 COLUMNAS 
                
                for (int b=0;NUMERO DE PRODUCTOS A AÑADIR;a++){ // RECORRE EL NUMERO DE PRODUCTOS QUE SE HAN AÑADIDO NUEVOS
                
                
                ARRAY[a,b]=ENTRADA POR TECLADO; // Y AQUI SE INGRESAN TODOS LOS ATRIBUTOS EJEMPLO PRECIO, COLOR, MARCA...
                
                
            }
                
                
            }
            
                
    }
}
