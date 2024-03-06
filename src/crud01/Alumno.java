package crud01;

public class Alumno {

	private String nombre = "";
	
	private double notaMedia;

	public Alumno() {
		
	}

	public Alumno(String nombre, double notaMedia) {
		if(nombre != null && !nombre.equals("")) {			
			this.nombre = nombre;
		}
		if(notaMedia >= 0) {			
			this.notaMedia = notaMedia;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
	public String toString() {
		String cadena = "Nombre: " + this.nombre + "\n" + "Nota Media: " + this.notaMedia;
		return cadena;
	}
	
	
	
}
