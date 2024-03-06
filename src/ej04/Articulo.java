package ej04;
/**
 * Clase donde se ejecutaran los métodos de los diferentes articulos
 */
public class Articulo {
	
	/**
	 * Constante donde se guarda el IVA
	 */
	public static final double IVA = 21;
	/**
	 * Atributo para guardar el nombre del atributo
	 */
	private String nombre = "";
	/**
	 * Atributo para guardar el precio del atributo
	 */
	private double precio;
	/**
	 * Atributo para guardar la cantidad del atributo
	 */
	private int cuantosQuedan;
	
	/**
	 * Constructor con parametros
	 * @param nombre Nombre del articulo
	 * @param precio Precio del articulo
	 * @param cuantosQuedan Cantidad del producto
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(precio > 0) {
			this.precio = precio;			
		}
		if(cuantosQuedan > 0) {
			this.cuantosQuedan = cuantosQuedan;			
		}
	}

/**
 * Metodo que te devuelve el nombre
 * @return Nombre del producto
 */
	public String getNombre() {
		return nombre;
	}

/**
 * Método que cambia el nombre
 * @param nombre Nombre del articulo
 */
	public void setNombre(String nombre) {
		if(nombre != null && nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Metodo que te devuelve el precio
	 * @return Precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método que cambia el precio
	 * @param precio Precio del articulo
	 */
	public void setPrecio(double precio) {
		if(precio < 0) {
			this.precio = precio;			
		}
	}

	/**
	 * Metodo que te devuelve la cantidad
	 * @return Cantidad del producto
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Método que cambia la cantidad
	 * @param cuantosQuedadan Cantidad del articulo
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if(cuantosQuedan < 0) {
			this.cuantosQuedan = cuantosQuedan;			
		}
	}

	/**
	 * Metodo que te devuelve el IVA
	 * @return IVA del producto
	 */
	public double getIVA() {
		return IVA;
	}
	
	/**
	 * Imprime los atributos del articulo
	 */
	public void imprime() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Precio: " + this.precio);
		System.out.println("Cantidad: " + this.cuantosQuedan);
	}
	
	/**
	 * Aplica el IVA al precio
	 * @return Precio con IVA incluido
	 */
	public double getPVP(){
		double precioPVP = 0;
		precioPVP = precio + (this.precio*IVA)/100;
		return precioPVP;
	}
	
	/**
	 * Aplica un descuento al precio
	 * @param descuento Descuento del producto
	 * @return Precio con descuento
	 */
	public double descuento(int descuento) {
		double precio = 0;
		precio = this.precio - (this.precio * 20)/100;
		return precio;
	}
	
	/**
	 * Método que resta los articulos vendidos y devuelve un booleano
	 * @param cantidad Cantidad a vender
	 * @return Devuelve true si se puede vender y false si no
	 */
	public boolean vender(int cantidad) {
		boolean vendido = false;
		if(cantidad <= this.cuantosQuedan) {
			vendido = true;
			this.cuantosQuedan -= cantidad; 
		}
		return vendido;
	}
	/**
	 * Método que almacena los articulos
	 * @param cantidad Cantidad a lamacenar
	 */
	public void almacenar(int cantidad) {
		this.cuantosQuedan += cantidad;
	}
}
