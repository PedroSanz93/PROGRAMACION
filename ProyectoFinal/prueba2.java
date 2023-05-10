
package ProyectoFinal;

import java.sql.SQLException;

import java.sql.*;
import java.util.Scanner;

public class prueba2 {

    public static void main(String[] args) {

       Scanner sc;
        sc= new Scanner(System.in);
        String bbdd="jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
        String usuario="root";
        String clave="root1234.";
        //arraylist para guardar datos de la bbdd
        
        
        try{
            //conexion con la base de datos
            Connection con=DriverManager.getConnection(bbdd,usuario,clave);
            // crea un objeto para preguntar a la base de datos
            Statement objetoConsulta=con.createStatement();
            // a traves de resultSet hacemos la consulta
            ResultSet consulta=objetoConsulta.executeQuery("SELECT * FROM ropa");
            int contRopa=1;
                // imprime las filas y columnas de la base de datos
                System.out.println("Este es el Stock disponible en Ropa");
                System.out.println("------------------------------------");
                System.out.println("Elige que producto quiere comprar");
                System.out.println("------------------------------------");
                //leer la base de datos
            while(consulta.next()){
                System.out.println(contRopa+" .Producto-> "+consulta.getString(1)+"--"+consulta.getString(2)+"--"+consulta.getString(3)+"--"
                        +consulta.getString(4)+"--"+consulta.getString(5)+"--"+consulta.getString(6)+"--"+consulta.getString(7)+"\n");
                // contRopa ++ para que imprima cada producto como un indice para que el usuario pueda elegir

            }
                  
            try{
            //conexion con la base de datos
            Connection conRopa=DriverManager.getConnection(bbdd,usuario,clave);
            // crea un objeto para preguntar a la base de datos
            Statement objetoConsultaRopa=conRopa.createStatement();
            // a traves de resultSet hacemos la consulta
            ResultSet consultaRopa=objetoConsultaRopa.executeQuery("SELECT * FROM ropa");
            
            double totalCompraRopa=0.0;
            String pedidoRopa="";
            
            int indiceRopa=1;
            while(consultaRopa.next()){
                System.out.println(indiceRopa+". "+consultaRopa.getString("nombre")+" - "+consulta.getDouble("precio")+" EUROS");
                indiceRopa++;
            }
            System.out.println("Para finalizar pedido pulsa 0");
            int opcionRopa=0;
            while(opcionRopa!=0){
                opcionRopa=sc.nextInt();
                // .absolute nos permite calcular el valor de un numero
                consultaRopa.absolute(opcionRopa);
                double precioRopa= consultaRopa.getDouble("precio");
                totalCompraRopa+=precioRopa;
                
            }
                System.out.println("El total de la compra es: "+totalCompraRopa+" EUROS");
                
            }catch(SQLException e){
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
            }
            

                
            // cierra conexion
            con.close();
        }catch(SQLException e){
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
        }
    }

}
