
package Practica_09_Clases;

//SUBLASE FABRICANTE

class Fabricante extends TiendaRopa{
    
    public int CODmaterial;
    public int fechaFab;
    // constructor
    public Fabricante(int IDTienda, double precio, int CODmaterial) {
        // con super llamo a los atributos de la superclase
        super(IDTienda, precio);
        // y estos son los atributos propios de la subclase fabricante
        this.CODmaterial = CODmaterial;
        this.fechaFab = fechaFab;
    }
    // Getters y Setters para obtener la informacion del fabricante
    public void setCODmaterial(int marca){
        this.CODmaterial = CODmaterial;
    }
    public int getCODmaterial(){
        return CODmaterial;
    }
    public void setFechaFab(int fechaFab){
        this.fechaFab = fechaFab;
    }
    public int getFechaFab(){
        return fechaFab;
    }
}
