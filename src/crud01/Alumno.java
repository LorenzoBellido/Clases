package crud01;

public class Alumno {

	private String nombre="";
	private double notaMedia;
	
	public Alumno() {
		this.nombre = "";
		this.notaMedia = 0.0;
	}
	
	public Alumno(String nombre, double notaMedia) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(notaMedia>=0 && notaMedia<=10) {
			this.notaMedia = notaMedia;
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		if(notaMedia>=0 && notaMedia<=10) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public String toString() {
		return this.nombre + ": " + this.notaMedia;
	}
	
}