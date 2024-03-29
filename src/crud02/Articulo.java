package crud02;

public class Articulo {

	private int codigo;
	
	private String descripcion = "";
	
	private double precioCompra;
	
	private double precioVenta;
	
	private int stock;

	public Articulo() {

	}
	
	

	public Articulo(int codigo) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
	}



	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
		if(descripcion != null && !descripcion.equals("")) {			
			this.descripcion = descripcion;
		}
		if(precioCompra > 0) {			
			this.precioCompra = precioCompra;
		}
		if(precioVenta > 0) {			
			this.precioVenta = precioVenta;
		}
		if(stock >= 0) {			
			this.stock = stock;
		}
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if(descripcion != null && !descripcion.equals("")) {			
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if(precioCompra > 0) {			
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if(precioVenta > 0) {			
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if(stock >= 0) {			
			this.stock = stock;
		}
	}

	@Override
	public String toString() {
		String cadena = "------------ \n";
		cadena +="Código: " + this.codigo +"\n";
		cadena +="Descripcion: " + this.descripcion +"\n";
		cadena +="Precio Compra: " + this.precioCompra +"\n"; 
		cadena +="Precio Venta: " + this.precioVenta +"\n";
		cadena +="Stock: " + this.stock +"\n";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Articulo art = (Articulo) obj;
		
		if(this.codigo == art.codigo) {
			iguales = true;
		}
		
		return iguales;
	}
	
	
}
