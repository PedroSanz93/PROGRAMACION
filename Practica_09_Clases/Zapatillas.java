
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

    // Atributo heredado de superclase TiendaRopa
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }   
       
    public void DatosProducto(){    
    System.out.println("------------->Talla: "+talla);
    System.out.println("------------>Color: "+color);
    System.out.println("----------->Codido del material: "+CODmaterial);
    System.out.println("---------->Marca: "+marca);
    System.out.println("--------->Año de la coleccion: "+fechaFab);
    System.out.println("-------->PVP: "+precio+" Euros");
    }
}
