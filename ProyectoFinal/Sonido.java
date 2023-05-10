package ProyectoFinal;

public class Sonido extends Categoria {
	//Atributos propios de la clase
	private int potencia;
	private int annosGarantia;
	private double peso;
	
	//Constructor de la clase
	public Sonido(String factura,double precio,String marca,int potencia,int annosGarantia, double peso) {
		super(factura,precio,marca);
		this.potencia=potencia;
		this.annosGarantia=annosGarantia;
		this.peso=peso;
	}
	
	//Métodos set y get
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
        
	public int getPotencia() {
		return potencia;
	}

	public void setAnnosGarantia(int annosGarantia) {
		this.annosGarantia = annosGarantia;
	}

	public int getAnnosGarantia() {
		return annosGarantia;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	

	public double getPeso() {
		return peso;
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