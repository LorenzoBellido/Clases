package crud02;

import java.util.Objects;

/**
 * Esta clase Articulo que representa los artículos de un almacén.
 * Estos artículos contarán con un código único, una descripción,
 * el precio sin IVA, precio con IVA y el stock.
 * @author Elena
 * @version 1.0
 */
public class Articulo {

	/**
	 * Atributo código del producto que va a ser un valor único
	 */
	private int codigo;
	
	/**
	 * Descripción del producto. Almacenará información sobre el producto.
	 */
	private String descripcion = "";
	
	/**
	 * Precio del producto sin aplicarle el IVA
	 */
	private double precioCompra;
	
	/**
	 * Precio del producto tras aplicarle el IVA
	 */
	private double precioVenta;
	
	/**
	 * Cuántas unidades quedan del producto disponibles
	 */
	private int stock;
	
	/**
	 * Constructor sin parámetros
	 */
	public Articulo() {
	}
	
	/**
	 * Constructor con parámetros
	 * @param codigo Código del artículo
	 * @param descripcion Descripción del artículo
	 * @param precioCompra El precio al que se ha comprado el artículo
	 * @param precioVenta El precio al que se vende el artículo
	 * @param stock Número de existencias disponibles del artículo
	 */
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if(codigo>0) {
			this.codigo = codigo;
		}
		
		if(descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		
		if(precioCompra>0) {
			this.precioCompra = precioCompra;
		}
		
		if(precioVenta>0) {
			this.precioVenta = precioVenta;
		}
		
		if(stock>=0){
			this.stock = stock;
		}
		
	} // fin constructor

	/**
	 * Devuelve el código del producto
	 * @return El código del producto
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Devuelve la descripción del producto
	 * @return La descripción del producto
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Modifica la descripción del producto
	 * @param descripcion Nueva descripción para el producto
	 */
	public void setDescripcion(String descripcion) {
		if(descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		
	}

	/**
	 * Devuelve el precio de compra del producto
	 * @return El precio de compra del producto
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Método toString que devuelve una cadena con la información del artículo en este formato:
	 * Código: 1
	 * Descripción: descripción del artículo
	 * ...
	 * @return Devuelve una cadena con la información del artículo
	 */
	@Override
	public String toString() {
		String cadena = "--------------------------------------------------\n";
		
		cadena += "Código: " + this.codigo + "\n";
		cadena += "Descripción: " + this.descripcion + "\n";
		cadena += "Precio compra: " + this.precioCompra + "\n";
		cadena += "Precio venta: " + this.precioVenta + "\n";
		cadena += "Stock: " + this.stock + "\n";

		return cadena;
	}

	

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Articulo art2 = (Articulo) obj;
		
		if(this.codigo == art2.codigo) {
			iguales = true;
		}
		
		return iguales;
	}
	
	
	
}