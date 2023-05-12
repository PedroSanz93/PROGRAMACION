package ProyectoFinal;

import java.sql.SQLException;
import java.sql.*;

public class MostrarProductos {

    public void catalogoRopa() {
        String bbdd = "jdbc:mysql://localhost:3306/bayaploh?useUnicode=true&characterEncoding=UTF-8";
        String usuario = "root";
        String clave = "root1234.";

        try {
            Connection con = DriverManager.getConnection(bbdd, usuario, clave);
            Statement objetoConsulta = con.createStatement();
            ResultSet consulta = objetoConsulta.executeQuery("SELECT * FROM ropa");
            System.out.println("Este es el Stock disponible en Ropa");
            System.out.println("------------------------------------");

            while (consulta.next()) {
                System.out.println(".Producto-> " + consulta.getString(1) + "--" + consulta.getString(2) + "--" + consulta.getString(3) + "--"
                        + consulta.getString(4) + "--" + consulta.getString(5) + "--" + consulta.getString(6) + "--" + consulta.getString(7) + "\n");
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
        }
    }
    
    

}