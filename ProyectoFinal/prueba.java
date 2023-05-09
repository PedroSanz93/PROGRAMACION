
package ProyectoFinal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

public class prueba {

    public static void main(String[] args) {

        String bbdd="jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
        String usuario="root";
        String clave="root1234.";
        //arraylist para guardar datos de la bbdd
        ArrayList<String>carritoCompra = new ArrayList<>();
        
        try{
            //conexion con la base de datos
            Connection con=DriverManager.getConnection(bbdd,usuario,clave);
            // crea un objeto para preguntar a la base de datos
            Statement objetoConsulta=con.createStatement();
            // a traves de resultSet hacemos la consulta
            ResultSet consulta=objetoConsulta.executeQuery("SELECT * FROM ropa");
            
            while(consulta.next()){
                
                // imprime las filas y columnas de la base de datos
                System.out.print(consulta.getString(1)+"--"+consulta.getString(2)+"--"+consulta.getString(3)+"--"
                        +consulta.getString(4)+"--"+consulta.getString(5)+"--"+consulta.getString(6)+"--"+consulta.getString(7)+"\n");
                
                int cont=1;
                for(String resultado:carritoCompra){
                    System.out.println(cont+". Producto->"+);// falta seguir con el obtener precio
                }
                
            }
            // cierra conexion
            con.close();
        }catch(SQLException e){
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
        }
        
        /*
        carritoCompra.add("SELECT * FROM ropa");
        
        int cont1=1;
        

        
        
        for(String resultado:carritoCompra){
            System.out.println(resultado);
        }*/
        
    } 
}
