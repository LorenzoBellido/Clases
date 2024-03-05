package ej02;

public class Libro {

	private String titulo = "";
	private String autor = "";
	private int ejemplares;
	private int prestados;
	
	

	public Libro() {
		super();
	}



	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if(prestados >= 0) {
			this.prestados = prestados;		
		}
	}
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}



	public boolean prestamo() {
		boolean prestamo = false;
		
		if(this.ejemplares > 0) {
			this.prestados++;
			prestamo = true;
		}
		
		return prestamo;
	}
	
	public boolean devuelve() {
		boolean devuelve = false;
		
		if(this.prestados > 0) {
			this.ejemplares++;
			devuelve = true;
		}
		
		return devuelve;
	}
}
