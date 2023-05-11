
package ProyectoFinal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

public class prueba {

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
                //System.out.println("------------------------------------");
                /*System.out.print(consulta.getString(1)+"--"+consulta.getString(2)+"--"+consulta.getString(3)+"--"
                        +consulta.getString(4)+"--"+consulta.getString(5)+"--"+consulta.getString(6)+"--"+consulta.getString(7)+"\n");*/
                // variable para guardar el precio
                /*double precioRopa= consulta.getDouble(7);
                String eligeRopa= consulta.getString("idRopa");*/
                System.out.println("------------------------------------");
                System.out.println("Elige que producto quiere comprar");
                System.out.println("------------------------------------");
                ArrayList<String>stockRopa = new ArrayList<>();
            while(consulta.next()){
                
                stockRopa.add(consulta.getString(1));
                stockRopa.add(consulta.getString(2));
                stockRopa.add(consulta.getString(3));
                stockRopa.add(consulta.getString(4));
                stockRopa.add(consulta.getString(5));
                stockRopa.add(consulta.getString(6));
                stockRopa.add(consulta.getString(7));
                
                System.out.println(contRopa+" .Producto-> "+consulta.getString(1)+"--"+consulta.getString(2)+"--"+consulta.getString(3)+"--"
                        +consulta.getString(4)+"--"+consulta.getString(5)+"--"+consulta.getString(6)+"--"+consulta.getString(7)+"\n");
                // contRopa ++ para que imprima cada producto como un indice para que el usuario pueda elegir
                contRopa++;
                String precioRopa=consulta.getString(7);
            }
                System.out.println("Cuantos productos vas a comprar");
                // variable que guarda cuantos productos vas a comprar
                int cantRopa=sc.nextInt();
                // arrayList para guardar cuantos elementos de StockRopa va a comprar
                ArrayList<String> compraRopa=new ArrayList<>();
                System.out.println("------------------------------------");
                for (int i =0;i<cantRopa;i++){
                    System.out.println("Seleciona(por numero) que producto quieres");
                    int eleccionRopa=sc.nextInt();
                    // se añade a compraRopa los productos elegidos
                    compraRopa.add(stockRopa.get(eleccionRopa));
                }
                System.out.println("------------------------------------");
                System.out.println("Los productos elegidos son: ");
                System.out.println(stockRopa);
                //variable para guardar el total del importe de la compra
                double totalCompraRopa=0;
                // for para imprimir productos seleccionados y sumar el total
                /*for(ResultSet consulta : compraRopa){
                    System.out.println(consulta.toString());
                    
                    totalCompraRopa+=consulta.getString(7);
                }*/
                
            // cierra conexion
            con.close();
        }catch(SQLException e){
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
        }
        
        
    } 
}