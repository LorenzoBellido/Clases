package ej03;

/**
 * Clase que recoge los métodos para las coordenadas 
 */
public class Punto {
	/**
	 * Atributo que guarda la coordenada x
	 */
	private int x;
	/**
	 * Atributo que guarda la coordenada y
	 */
	private int y;
	/**
	 * Constructor sin parametros
	 */
	public Punto() {
		super();
	}
	/**
	 * Constructor con parametros
	 * @param x Posición x en el eje de abscisas
	 * @param y Posición y en el eje de abscisas
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Imprime las coordenadas
	 */
	public void imprime() {
		System.out.println("Coordenadas: " + this.x + ", " + this.y);
	}
	
	/**
	 * Método para poner coordenadas
	 * @param x Coordenada x
	 * @param y Coordenada y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Desplaza la coordenada
	 * @param dx distancia a la que se mueve x
	 * @param dy distancia a la que se mueve y
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Distancia de x,y a las coordenadas del punto
	 * @param p coordenadas del punto p
	 * @return Distancia de un punto a otro
	 */
	public double distancia(Punto p) {
		double distancia;
		
		distancia = Math.sqrt(Math.pow(p.x - this.x, 2))+ (Math.pow((p.y - this.y), 2));
		
		return distancia;
	}
	
}
