package ej03;

public class Punto {
	private int x;
	private int y;
	public Punto() {
		super();
	}
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void imprime() {
		System.out.println("Coordenadas: " + this.x + ", " + this.y);
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public double distancia(Punto p) {
		double distancia;
		
		distancia = Math.sqrt(Math.pow(p.x - this.x), 2)+ (Math.pow((p.y - this.y), 2), 2));
		
		return distancia;
	}
	
}
