package ProyectoFinal;
import java.sql.*; // librelia sql necesaria para la conexion
public class ConexionBBDD {
   // empieza siendo null siempre
   private static Connection con = null;
    // variable que va a guardar la ruta de donde esta localmente la base de datos 
    private static String bbdd = "jdbc:mysql://localhost:3306/Bayaploh?useUnicode=true&characterEncoding=UTF-8";
    // variable usuario guarda usuario de la base de datos
    private static String usuario = "root";
    // variable usuario guarda contraseña de la base de datos
    private static String clave = "root1234.";
   // metodo para conectarnos a la BBDD que tendremos previamente echa en MYSQL
    public static Connection getConnection() {
        // controlamos el flujo con el try/catch para establecer conexion con la base de datos
        try {
            // si la conexion es = a null o esta cerrada con el if abre la conexion
            if (con == null || con.isClosed()) {
                // la conexion llama al driverManager para acceder a la base de datos
                con = DriverManager.getConnection(bbdd,usuario,clave);
            }
        // catch para que si no consigue conectar de mensaje de error
        } catch (SQLException e) {
            // mensaje de error
            System.err.println("Error al conectar con la BBDD: " + e.getMessage());
        }
        // retorna con que es la conexion a la BBDD
        return con;
    }
}
