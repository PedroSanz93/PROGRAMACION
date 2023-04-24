
package Practica_09_Clases;


//SUBLASE FABRICANTE
class Fabricante extends TiendaRopa{
    
    public boolean materialRecliclado;
    public String marca;
    public int fechaFab;
    // constructor
    public Fabricante(int CodProducto, int IDTienda, double precio) {
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
