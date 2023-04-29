
package Practica_09_Clases;

class Zapatillas extends Fabricante{

    public int talla;
    public String color;
    public String marca;
    
        public Zapatillas(int IDTienda, double precio, int CODmaterial,int fechaFab, String marca) {
        super(IDTienda, precio, CODmaterial);
        this.precio = precio;
        this.CODmaterial = CODmaterial;
        this.fechaFab = fechaFab;
        this.marca = marca;
        }
    
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
    // Motodos heredados de superclase TiendaRopa
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
  
    @Override
    public String toString(){
        return "Zapatilla{" + "talla=" + talla + ", color=" + color + ", marca=" + marca + 
                ", Codigo material= " +CODmaterial+ ", Año de coleccion= " + fechaFab + ", Precio=  "+precio+'}';
    }
}
