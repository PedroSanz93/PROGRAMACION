package Practica_09_Clases;

//SUBLASE FABRICANTE
class Fabricante extends TiendaRopa{
    // atributos propios de Fabricante
    public int CODmaterial;
    public int fechaFab;
    // constructor
    public Fabricante(int IDTienda, double precio, int CODmaterial) {
        // con super() llamo a los atributos de la superclase
        super(IDTienda, precio);
        this.CODmaterial = CODmaterial;
        this.fechaFab = fechaFab;
    }
    // Metodos Getters y Setters de Fabricante
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
