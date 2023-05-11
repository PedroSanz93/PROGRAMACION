
package ProyectoFinal;

import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class ProgramaBayaPloh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        int n = 0;//Variable while y primer switch
        int n1 = 0; //Variable switch case1
        int n2 = 0; //Variable switch case 3
        //Variables comprobar las tallas del apartado vender(Switch 1)
        int tallaNum = 0;//Variable para insertar por teclado el valor de talla numerico
        String infoTalla; //Variable para insertar por teclado talla
        String tallaRop = null;//Variable para insertar por teclado el valor de talla en letra
        //Variables Apartado Venta
        double Precio;
        String marca;
        String color;
        String tipoPrenda = null;
        while (n != 5) { //WHILE, Aquí creamos un bucle para hacer un menú, mientras no usemos el 5 , el bucle se repite
            System.out.println("-------------------------------------------------"); //Imprimimos por pantalla
            System.out.println("Bienvenido a BayaPloh, tu aplicación de compra/venta de ropa, sonido y videojuegos"); //Imprimimos por pantalla
            System.out.println("Esta aplicación ha sido realizada por José López y Pedro Sanz alumnos 1ºDAM curso 2022/2023 "); //Imprimimos por pantalla
            System.out.println("-------------------------------------------------");//Imprimimos por pantalla
            System.out.println("Pulsa 1 para ver catálogo");//Imprimimos por pantalla
            System.out.println("Pulsa 2 para comprar");//Imprimimos por pantalla
            System.out.println("Pulsa 3 para vender");//Imprimimos por pantalla
            System.out.println("Pulsa 4 para ver los últimos usuarios");//Imprimimos por pantalla
            System.out.println("Pulsa 5 para salir");//Imprimimos por pantalla
            System.out.println("-------------------------------------------------");//Imprimimos por pantalla
            n = sc.nextInt();
            switch (n) { //SWITCH PRINCIPAL , Creamos un menú con el switch para poder elegir cualquiera de las opciones y cada una haga un función
                case 1: //Primera opción del switch->VER CATALOGO
                    // SWITCH para ver los productos que estan en la BBDD
                    int q=sc.nextInt(); // variable para la opcion de este switch
                    //q=0;
                    while(q!=4){
                    System.out.println("-------------------------------------------------");
                    System.out.println("La opcion 1 es ROPA: ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("La opcion 2 es SONIDO: ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("La opcion 3 es VIDEOJUEGOS: ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("La opcion 4 es ATRAS ");
                    System.out.println("-------------------------------------------------");
                        switch(q){
                            case 1:
                                String bbdd = "jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
                                String usuario = "root";
                                String clave = "root1234.";
                                // La conexion con la BBDD siempre inicia con un try and catch para el control de errores
                                try {
                                    //conexion con la base de datos
                                    Connection con = DriverManager.getConnection(bbdd, usuario, clave);
                                    // crea un objeto para preguntar a la base de datos
                                    Statement objetoConsulta = con.createStatement();
                                    // a traves de resultSet hacemos la consulta y obtenemos el resultado de la misma
                                    ResultSet consulta = objetoConsulta.executeQuery("SELECT * FROM ropa");
                                    // imprime las filas y columnas de la base de datos
                                    System.out.println("Este es el Stock disponible en Ropa");
                                    System.out.println("------------------------------------");
                                    //leer la base de datos
                                    while (consulta.next()) {
                                        System.out.println(" .Producto-> " + consulta.getString(1) + "--" + consulta.getString(2) + "--" + consulta.getString(3) + "--"
                                                + consulta.getString(4) + "--" + consulta.getString(5) + "--" + consulta.getString(6) + "--" + consulta.getString(7) + "\n");                    
                                    }
                                    // cierra conexion
                                    con.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al conectar con la BBDD: " + e.getMessage());
                                }
                            break;
                            case 2:
                                
                                String bbdd2 = "jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
                                String usuario2 = "root";
                                String clave2 = "root1234.";
                                // La conexion con la BBDD siempre inicia con un try and catch para el control de errores
                                try {
                                    //conexion con la base de datos
                                    Connection con2 = DriverManager.getConnection(bbdd2, usuario2, clave2);
                                    // crea un objeto para preguntar a la base de datos
                                    Statement objetoConsulta2 = con2.createStatement();
                                    // a traves de resultSet hacemos la consulta y obtenemos el resultado de la misma
                                    ResultSet consulta2 = objetoConsulta2.executeQuery("SELECT * FROM sonido");
                                    // imprime las filas y columnas de la base de datos
                                    System.out.println("Este es el Stock disponible en Sonido");
                                    System.out.println("------------------------------------");
                                    //leer la base de datos
                                    while (consulta2.next()) {
                                        System.out.println(" .Producto-> " + consulta2.getString(1) + "--" + consulta2.getString(2) + "--" + consulta2.getString(3) + "--"
                                                + consulta2.getString(4) + "--" + consulta2.getString(5) + "--" + consulta2.getString(6) + "--" + consulta2.getString(7) + "\n");                    
                                    }
                                    // cierra conexion
                                    con2.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al conectar con la BBDD: " + e.getMessage());
                                }
                            break;
                            case 3:
                                String bbdd3 = "jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
                                String usuario3 = "root";
                                String clave3 = "root1234.";
                                // La conexion con la BBDD siempre inicia con un try and catch para el control de errores
                                try {
                                    //conexion con la base de datos
                                    Connection con3 = DriverManager.getConnection(bbdd3, usuario3, clave3);
                                    // crea un objeto para preguntar a la base de datos
                                    Statement objetoConsulta3 = con3.createStatement();
                                    // a traves de resultSet hacemos la consulta y obtenemos el resultado de la misma
                                    ResultSet consulta3 = objetoConsulta3.executeQuery("SELECT * FROM videojuegos");
                                    // imprime las filas y columnas de la base de datos
                                    System.out.println("Este es el Stock disponible en Sonido");
                                    System.out.println("------------------------------------");
                                    //leer la base de datos
                                    while (consulta3.next()) {
                                        System.out.println(" .Producto-> " + consulta3.getString(1) + "--" + consulta3.getString(2) + "--" + consulta3.getString(3) + "--"
                                                + consulta3.getString(4) + "--" + consulta3.getString(5) + "--" + consulta3.getString(6) + "--" + consulta3.getString(7) + "\n");                    
                                    }
                                    // cierra conexion
                                    con3.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al conectar con la BBDD: " + e.getMessage());
                                }
                            break;
                            case 4:
                                System.out.println("Volviendo atras");
                            break;
                            default:
                                System.err.println("Error, opcion incorrecta");
                                break;
                        }
                    }
                    break; // Salida anticipada
                case 2: //Segunda opción del switch
                    System.out.println(""); //Imprimimos por pantalla
                    System.out.println("");//Imprimimos por pantalla
                    System.out.println("");//Imprimimos por pantalla
                    System.out.println("");//Imprimimos por pantalla
                    System.out.println("");//Imprimimos por pantalla
                    System.out.println("");//Imprimimos por pantalla
                    System.out.println("");//Imprimimos por pantalla
                    System.out.println("-------------------------------------------------");//Imprimimos por pantalla
                    n1 = sc.nextInt();
                    switch (n1) { //SWITCH
                        case 1: //Primera opción del switch
                            break; // Salida anticipada
                        case 2: //Segunda opción del switch
                            break; // Salida anticipada
                        case 3: //Tercera opción del switch
                            break; // Salida anticipada
                        case 4: //Cuarta opción del switch
                            break; // Salida anticipada
                        case 5: //Quinta opción del switch
                            break; // Salida anticipada
                        case 6: //Sexta opción del switch
                            break; // Salida anticipada
                        default: //Opción que salta si no sale ninguna de las anteriores
                            System.out.println("Opción incorrecta");
                            break; // Salida anticipada
                    }
                    break;
                case 3: //Tercera opción del switch que sería la opción de vender
                    System.out.println("Bienvenido al sistema de venta, ¿que desea vender?");
                    System.out.println("Pulse 1 para vender equipos para vender ropa");
                    System.out.println("Pulse 2 para vender equipos para vender Videojuegos");
                    System.out.println("Pulse 3 para vender equipos para vender sonido");
                    System.out.println("Pulse 4 para salir");
                    n2 = sc.nextInt();
                    switch (n2) {
                        case 1: //Primera opción del switch
                            System.out.println("Qué tipo de ropa quiere vender, Zapatillas o RopaVestir");
                            infoTalla = line.nextLine();//Escribimos por teclado
                            if (infoTalla.equals("Zapatillas")) {
                                System.out.println("Inserte la talla");
                                tallaNum = sc.nextInt();
                              //  String valor1 = Ropa.validarTallaNum(tallaNum);
                             //1   System.out.println(valor1); //Imprimir por teclado
                            } else if (infoTalla.equals("RopaVestir")) {
                                System.out.println("Inserte la talla");
                                tallaRop = line.nextLine();
                             //   String Valor2 = Ropa.validarTalla(tallaRop); //Creamos una variable para meter el método comprobar talla
                              //  System.out.println(Valor2); //Imprimir por teclado
                            } else {
                                System.out.println("Respuesta no correcto");
                            }
                            System.out.println("¿A que precio quieres venderlo?");
                            Precio = sc.nextDouble();
                            System.out.println("¿Qué Marca es?");
                            marca = line.nextLine();
                            System.out.println("¿Qué color tiene?");
                            color = line.nextLine();
                            Ropa ropa10 = new Ropa("En proceso", Precio, marca, color, tallaRop, tallaNum, tipoPrenda);
                            System.out.println(ropa10);
                            break; // Salida anticipada
                        case 2: //Segunda opción del switch
                            break; // Salida anticipada
                        case 3: //Tercera opción del switch
                            break; // Salida anticipada
                        case 4: //Cuarta opción del switch
                            break; // Salida anticipada
                        default: //Opción que salta si no sale ninguna de las anteriores
                            System.out.println("Opción incorrecta");
                            break; // Salida anticipada
                    }
                    break; // Salida anticipada
                case 4: //Cuarta opción del switch
                    break; // Salida anticipada
                case 5: //Quinta opción del switch
                    System.out.println("Adios gracias por usar la aplicación, un saludo"); //Imprimimos por pantalla un mensaje
                    break; // Salida anticipada
                default: // Si no se utiliza ninguna de las opciones del case, ni el número que corta el bucle siempre entra en default
                    System.err.println("Opcion incorrecta, escoja otra opción"); //Imprimimos por pantalla un mensaje
                    break; // Salida anticipada
            }
        }
    }
}