
package Practica_09_Clases;

class Camiseta extends Fabricante{
 
    public String talla;
    public String color;
    public String marca;
    
        public Camiseta(int IDTienda, double precio, int CODmaterial,int fechaFab, String marca) {
        super(IDTienda, precio, CODmaterial);
        this.precio = precio;
        this.CODmaterial = CODmaterial;
        this.fechaFab = fechaFab; 
        this.marca = marca;
    }       
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Atributos sobrescritos de subclase Fabricante
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

    // Atributo heredado de superclase TiendaRopa  
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override 
    // El override esta sobreescribiendo el metodo de la superclase ya que aqui lo estoy implementando con todos los atributos heredados
    public String toString() {
        return "Camiseta{" + "talla=" + talla + ", color=" + color + ", marca=" + marca + 
                ", Codigo material= " +CODmaterial+ ", Año de coleccion= " + fechaFab + ", Precio=  "+precio+'}';
    }
}
