
package Practica_09_Clases;

class Zapatillas extends Fabricante{

    public int talla;
    public int color;
        
    public Zapatillas(int CodProducto, int IDTienda, double precio, boolean materialRecliclado, String marca,int fechaFab ) {
    super(CodProducto, IDTienda, precio);
    this.precio = precio;
    this.materialRecliclado = materialRecliclado;
    this.marca = marca;
    this.fechaFab = fechaFab;
    }
    
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isMaterialRecliclado() {
        return materialRecliclado;
    }

    public void setMaterialRecliclado(boolean materialRecliclado) {
        this.materialRecliclado = materialRecliclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(int fechaFab) {
        this.fechaFab = fechaFab;
    }

    public double getPrecio() {
        return precio;
    }

    // y aqui con el constructor heredo de la subclase fabricante todos los metodos y atributos, habiendo heredado ya los metodos y atributos de la superclase tiendaropa
    public void setPrecio(double precio) {
        this.precio = precio;
    }       
}