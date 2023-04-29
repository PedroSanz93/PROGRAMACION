package Practica_09_Clases;

// SUPERCLASE esta abstraida puesto que no voy a crear ningun objeto a partir de la Superclase
public abstract class TiendaRopa  {
    // Atributos
    private final int NIF_empresa = 12343210; 
    // codigo de producto en privado para que no se pueda modificar y variable en final para que sea constante
    protected int IDTienda; 
    // ID de tieda protegido para que solo se pueda modificar si es necesario con get y set
    public double precio; 
    // precio en publico para modificarlo sin restriccion
    
    // constructor de TiendaRopa
    TiendaRopa(int IDTienda, double precio){
        this.IDTienda = IDTienda;
        this.precio = precio;
    }
    // metodos getter y setter de TiendaRopa
    public void setIDTienda(int IDTienda) {
        this.IDTienda = IDTienda;
    }
    
    public int getIDTienda() {
        return IDTienda;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
    public double getPrecio() {
        return precio;
    }
    // metodo toString para mostrar datos de la empresa con @Override para que quede como plantilla unica
    // al tener NIF_empresa encapsulado privado y ser una constante nunca podra ser sobreescrito con otra plantilla
    @Override
    public String toString() {
    return "TiendaRopa{" + "NIF_empresa=" + NIF_empresa + ", IDTienda=" + IDTienda +'}';
    }
}
