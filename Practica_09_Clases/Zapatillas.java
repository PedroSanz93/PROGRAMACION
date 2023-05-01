package Practica_09_Clases;
class Zapatillas extends Fabricante{
    // atributos propios de la clase Zapatillas
    public int talla;
    public String color;
    public String marca;
        // en el constructor llamo a todos los atributos de la subclase Fabricante y superclase TiendaRopa
        public Zapatillas(int IDTienda, double precio, int CODmaterial,int fechaFab, String marca) {
        super(IDTienda, precio, CODmaterial);
        this.precio = precio;
        this.CODmaterial = CODmaterial;
        this.fechaFab = fechaFab;
        this.marca = marca;
        }
    // metodos Getter y Setter de la clase Zapatillas
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Metodos getter y setter heredados sobrescritos de subclase Fabricante
    @Override
    public int getCODmaterial() {
        return CODmaterial;
    }
    @Override
    public void setCODmaterial(int CODmaterial) {
        this.CODmaterial = CODmaterial;
    }
    @Override
    public int getFechaFab() {
        return fechaFab;
    }
    @Override
    public void setFechaFab(int fechaFab) {
        this.fechaFab = fechaFab;
    }
    // Metodo heredado de superclase TiendaRopa
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    // El override esta sobreescribiendo el metodo de la superclase ya que aqui lo estoy implementando con todos los atributos heredados
    @Override
    public String toString(){
        return "Zapatilla{" + "talla=" + talla + ", color=" + color + ", marca=" + marca + 
                ", Codigo material= " +CODmaterial+ ", Año de coleccion= " + fechaFab + ", Precio=  "+precio+'}';
    }
}