package ProyectoFinal;
// SUPERCLASE ABSTRAIDA porque no vamos a crear ningun objeto a partir de ella
public abstract class BayaPloh {
// Atributos
protected final int NIF= 14010957; // Atributo en final para que no se pueda cambiar
protected String[] creadores={"Jose_Lopez","Pedro_Sanz"}; // atributo metido en array para que muestre nuestros nombres
protected String cursoAño="1ºDAM curso 2022/2023"; // atributo con datos de cuando lo hemos desarrollado
public String factura; // atributo que todos los productos van a heredar 
    // constructor de la app (solo vamos a usar factura los demas atributos van a ir por toString para solo mostrar info)
    public BayaPloh(String factura) {
        this.factura = factura;
    }
    // metodos propios de superClase
    public void setCreadores(String[] creadores) {
        this.creadores = creadores;
    }
    public String[] getCreadores() {
        return creadores;
    }
    public void setCursoAño(String cursoAño) {
        this.cursoAño = cursoAño;
    }
    public String getCursoAño() {
        return cursoAño;
    }
    // metodo factura para heredarlo en cada producto que vende la app
    public void setFactura(String factura) {
        this.factura = factura;
    }
    public String getFactura() {
        return factura;
    }
    /* metodo toString sobreescrito para imprimir en cualquier factura los datos
    de la app o para que por menu en el programa se pida info de la app*/
    @Override
    public String toString() {
        return "BayaPloh{" + "NIF=" + NIF + ", creadores=" + creadores + ", cursoA\u00f1o=" + cursoAño + '}';
    }
}