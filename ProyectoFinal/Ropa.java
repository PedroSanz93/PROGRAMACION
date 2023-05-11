package ProyectoFinal;

public class Ropa extends Categoria {
	//Atributos propios de la clase
	private String color;
	private String talla;
	private int tallaNum;
	private String tipoPrenda;
	
	//Constructor de la clase
	public Ropa(String factura,double precio,String marca,String color,String talla, int tallaNum, String tipoPrenda) {
		super(factura,precio,marca);
		this.color=color;
		this.talla=talla;
		this.tallaNum=tallaNum;
		this.tipoPrenda=tipoPrenda;
	}

	//Métodos set y get
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTalla() {
		return talla;
	}

	public void setTallaNum(int tallaNum) {
		this.tallaNum = tallaNum;
	}

	public int getTallaNum() {
		return tallaNum;
	}

	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	public String getTipoPrenda() {
		return tipoPrenda;
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