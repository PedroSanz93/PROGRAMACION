package ProyectoFinal;
//Subclase que hereda de BayaPloh, y a su vez es super clase de otras 3 
public class Categoria extends BayaPloh {
	
	//Atributos de la clase
	private double precio;
	private String marca;
	protected String categoria;
	
	//Constructor de clase
	public Categoria(String factura, double precio, String marca) {
		super(factura);
		this.precio=precio;
		this.marca=marca;
	}
		
        //Tengo que darle una vuelta a como plantear esto de mostar categoria	
        public void setCategoria(String categoria) {
		
	}
	public String getCategoria(){
		return categoria;
	}

        //Métodos set y get de la clase
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
}