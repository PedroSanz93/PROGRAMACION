package ProyectoFinal;
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
        // creamos un objeto a partir de lo introducido por teclado
        Usuario usuario1 = new Usuario(nombre,contraseña,edad);
        // muestra con toString los datos de registro
        System.out.println("Este es tu registro y datos de usuario: "+usuario1.toString());
    }
    
    // aqui irian metodos LOGIN y LOGOUT que hay que investigar con .Equals()
    /* despues metodo para Subir producto que seria parecido a como creamos usuario,
    habria que darle una vuelta en todo caso para meter los objetos en un Array*/

}
