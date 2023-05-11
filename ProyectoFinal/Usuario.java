package ProyectoFinal;
//import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;
/* SUBLASE USUARIO no va a heredar ninguno atributo de la SUPERCLASE 
porque va "independiente" y va a ser con la que naveguemos por la app*/
public class Usuario {
	// atributos de Usuario
    protected String Nombre; // protegido, pero puede ser publico tambien 
    protected String Contraseña; // protegido
    private int Edad; // privado para seguridad de usuario
    // contructor de Usuario
    public Usuario(String Nombre, String Contraseña, int Edad) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Edad = Edad;
    }
    // Metodos de Usuario
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public int getEdad() {
        return Edad;
    }
    // metodo de registro para que el usuario se registre en la app
    public void registro(){
        Scanner sc;
        sc=new Scanner(System.in);
        // 3 variables para guardar los atributos de usuario y a partir de ahi crear un objeto
        String nombre;
        String contraseña;
        int edad;
        // introducir por teclado datos
        System.out.println("Para utilizar la app registra tu nombre, contraseña y edad");
        System.out.println("Nombre: ");
        nombre=sc.nextLine();
        System.out.println("Contraseña: ");
        contraseña=sc.nextLine();
        sc.nextInt(); // limpiador para pasar de string a int o cuando se cambia de dato
        System.out.println("Edad: ");
        edad=sc.nextInt();
        /*
        // creamos un objeto a partir de lo introducido por teclado
        Usuario nuevoUsuario = new Usuario(nombre,contraseña,edad);
        // muestra con toString los datos de registro
        System.out.println("Este es tu registro y datos de usuario: "+nuevoUsuario.toString());*/
        /* voy a almacenar los usuarios en un ArrayList para poder usarlos en el main:
        ArrayList<Usuario> UsuariosRegistrados = new ArrayList<>();
        arr_Usuarios[]Object; // estoy creando un array list que guardo objetos
        UsuariosRegistrados.add()*/
    }
    
    public static void registroUsuario(){
        
         try {
            Connection conn = ConexionBBDD.getConnection(); //Establecer conexion

            // Aquí es donde se ejecuta la consulta y se imprimen los resultados
            Statement stmt = conn.createStatement();
   
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");
            System.out.println("Nombre---Contraseña----Edad");
            // while recorre dentro de la tabla todos los campos de uno en uno
            while (rs.next()) {
               

                System.out.println("    "+rs.getInt(1) + "        " + rs.getString(2) +"    "+ rs.getString(3)+"     "+rs.getString(4));
            }

            conn.close();
           
            } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

          }
    }
    
    
    
    // aqui irian metodos LOGIN y LOGOUT que hay que investigar con .Equals()
    /* despues metodo para Subir producto que seria parecido a como creamos usuario,
    habria que darle una vuelta en todo caso para meter los objetos en un Array*/


