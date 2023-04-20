
package Practica_09_Clases;

import java.util.Scanner;
// SUPERCLASE
public class TiendaRopa {
    // Atributos
    protected int CodProducto; // codigo de producto en privado para que no se pueda modificar
    private char IDTienda; // ID de tieda protegido para que solo se pueda modificar si es necesario con get y set
    public double precio; // precio en publico porque si hay algun tipo de perido de rebajas se pueda modificar desde la app
    
    // constructor
    TiendaRopa(int CodProducto, char IDTienda, double precio){
        this.CodProducto = CodProducto;
        this.IDTienda = IDTienda;
        this.precio = precio;
    }
    // metodo para meter nuevos productos
    public void NuevoProducto(){
        Scanner sc;
        sc = new Scanner(System.in);
        // demostracion ficticia de introducir un nuevo producto, en la practica real iria enlazado con una base de datos donde estaria todo el inventario del comercio
        System.out.println("Introduce nuevo prodcuto: ");
        int CodProducto=sc.nextInt();
        System.out.println("Introduce precio del producto: ");
        double precio=sc.nextDouble();
        System.out.println("Introduce el ID de la tienda: ");
        char IDTienda=(char) sc.nextInt();
        System.out.println("Producto añadido correctamente.");
    }
    // metodo para eliminar un producto por su codigo
    public void eliminarProducto(){
        // mismo ejemplo que con el metodo anterior la idea a la practica real es que borre los productos de la base de datos si se agotan
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Introduce codigo de producto para eliminarlo");
        int CodProducto=sc.nextInt();
        System.out.println("Producto eliminado correctamente");
    }
    public void mostrarExistencias(){
        // este metodo igual que los otros mostraria las existencias registradas en la base de datos
        System.out.println("Lista de productos:.....");
    }
}

//SUBLASE FABRICANTE
class Fabricante extends TiendaRopa{
    
    public boolean materialRecliclado;
    public String marca;
    public int fechaFab;
    // constructor
    public Fabricante(int CodProducto, char IDTienda, double precio) {
        // con super llamo a los atributos de la superclase
        super(CodProducto, IDTienda, precio);
        // y estos son los atributos propios de la subclase fabricante
        this.materialRecliclado = materialRecliclado;
        this.marca = marca;
        this.fechaFab = fechaFab;
    }
    // Getters y Setters para obtener la informacion del fabricante
    public void setmaterialRecliclado(){
        this.materialRecliclado = materialRecliclado;
    }
    public boolean getmaterialRecliclado(){
        return materialRecliclado;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setFechaFab(int fechaFab){
        this.fechaFab = fechaFab;
    }
    public int getFechaFab(){
        return fechaFab;
    }
}
// SUBLASE Producto donde van a ir los productos de la tienda
class Producto extends TiendaRopa{
    // atributos propios de producto
    public int talla;
    public int color;
    // aqui con el constructor empiezo a heredar de la superclase hasta los productos
    public Producto (int CodProducto, char IDTienda, double precio){
        super(CodProducto, IDTienda, precio);
        this.talla = talla;
        this.color = color;
    }
}
// Subclase dentro de producto que serian las categorias
class Camiseta extends Fabricante{
    // y aqui con el constructor heredo de la subclase fabricante todos los metodos y atributos, habiendo heredado ya los metodos y atributos de la superclase tiendaropa
    public Camiseta(int CodProducto, double precio, boolean materialRecliclado, String marca, int fechaFab){
        super(CodProducto, precio, materialRecliclado, marca, fechaFab);
        this.CodProducto = CodProducto;
        this.precio = precio;
        this.materialRecliclado = materialRecliclado;
        this.marca = marca;
        this.fechaFab = fechaFab;
    }
}    
// buscar en ejercicios de clases como el de vehiculo-aereo-avion
// CodProducto, IDTienda, precio, materialRecliclado, marca, fechaFab
