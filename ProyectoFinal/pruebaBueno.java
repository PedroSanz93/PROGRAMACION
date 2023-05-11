package ProyectoFinal;

import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class pruebaBueno {

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        String bbdd = "jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
        String usuario = "root";
        String clave = "root1234.";
        // variable que guarda el precio de los productos de la base de datos iniciada en 0
        double precioRopa = 0;
        // variable tipo double que va a guardar el total de la compra sumando los precios
        double totalCompraRopa = 0.0;
        // La conexion con la BBDD siempre inicia con un try and catch para el control de errores
        try {
            //conexion con la base de datos
            Connection con = DriverManager.getConnection(bbdd, usuario, clave);
            // crea un objeto para preguntar a la base de datos
            Statement objetoConsulta = con.createStatement();
            // a traves de resultSet hacemos la consulta y obtenemos el resultado de la misma
            ResultSet consulta = objetoConsulta.executeQuery("SELECT * FROM ropa");
            // variable para indexar los datos
            int contRopa = 1;
            // imprime las filas y columnas de la base de datos
            System.out.println("Este es el Stock disponible en Ropa");
            System.out.println("------------------------------------");
            System.out.println("Elige que producto quiere comprar");
            System.out.println("------------------------------------");
            //leer la base de datos
            while (consulta.next()) {
                System.out.println(contRopa + " .Producto-> " + consulta.getString(1) + "--" + consulta.getString(2) + "--" + consulta.getString(3) + "--"
                        + consulta.getString(4) + "--" + consulta.getString(5) + "--" + consulta.getString(6) + "--" + consulta.getString(7) + "\n");
                // contRopa ++ para que imprima cada producto como un indice para que el usuario pueda elegir
                contRopa++;
            }
            
            int idComprar = 1;
            while (idComprar != 0) {

                idComprar = sc.nextInt();

                try {
                    //conexion con la base de datos
                    Connection conRopa = DriverManager.getConnection(bbdd, usuario, clave);
                    // crea un objeto para preguntar a la base de datos
                    Statement objetoConsultaRopa = conRopa.createStatement();
                    // a traves de resultSet hacemos la consulta
                    ResultSet consultaRopa = objetoConsultaRopa.executeQuery("SELECT tipoPrenda,marca,precio FROM ropa where idRopa=" + idComprar);

                    System.out.println("Selecciona que producto quieres comprar: ");
                    int indiceRopa = 1;
                    while (consultaRopa.next()) {
                        System.out.println(indiceRopa + ". " + consultaRopa.getString(1) + " - " + consultaRopa.getString(2) + " - " + consultaRopa.getDouble(3) + " EUROS");
                        indiceRopa++;
                        precioRopa = consultaRopa.getDouble(3);
                        totalCompraRopa = totalCompraRopa + precioRopa;
                        System.out.println("Para finalizar pedido pulsa 0");
                    }
                    System.out.println("El total de la compra es: " + totalCompraRopa + " EUROS");
                } catch (SQLException e) {
                    System.err.println("Error al conectar con la BBDD: " + e.getMessage());
                }
            }
            // cierra conexion
            con.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
        }
    }
}