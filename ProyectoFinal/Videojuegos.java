package ProyectoFinal;

public class Videojuegos extends Categoria {
	//Atributos propios de la clase
	private String titulo;
	private String pegi;
	private String genero;
	
	//Constructor de la clase
	public Videojuegos(String factura, double precio,String marca,String titulo, String pegi, String genero) {
		super(factura,precio,marca);
		this.titulo=titulo;
		this.pegi=pegi;
		this.genero=genero;
	}

	//Métodos set y get
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
        
	public String getTitulo() {
		return titulo;
	}
        
	public void setPegi(String pegi) {
		this.pegi = pegi;
	}

	public String getPegi() {
		return pegi;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}
        // Metodos sobreescritos de la SuperClase
        @Override
        public void setPrecio(double precio){
            this.precio= precio;// metodo para el precio para pedirlo en el main
        }
        public double getPrecio(){
            return precio;
        }
        @Override
        public String getFactura() {
                return factura;
        }
        @Override
        public void setFactura(String factura) {
                this.factura = factura;
        }
}