package crud01;

public class ArrayAlumno {
	public static Alumno[] alumnos = new Alumno[30];
	
	public static void imprimirAlumnos() {
		for(Alumno alumn : alumnos) {
			if(alumn != null) {
				System.out.println(alumn);
			}
		}
	}
	
	public static boolean nuevoAlumno(String nombre, double nota) {
		Alumno alumn = new Alumno(nombre, nota);
		int i = 0;
		boolean anyadido = false;
		
		while(i<alumnos.length && alumnos[i]!=null) {
			i++;
		}
		
		if(i<alumnos.length) {
			alumnos[i] = alumn;
			anyadido = true;
		} 
		
		return anyadido;
	}
	
	public static boolean modificaAlumno(String alumno, double nota) {
		boolean modificado = false;
		int i = buscaAlumno(alumno);
		
		if(i<alumnos.length) {
			alumnos[i].setNotaMedia(nota);
			modificado=true;
		}		
		
		return modificado;
	}

	public static boolean eliminaAlumno(String alumno) {
		boolean eliminado = false;
		int i = buscaAlumno(alumno);
		
		if(i<alumnos.length) {
			alumnos[i] = null;
			eliminado = true;
		}
		
		return eliminado;
	}
	
	/**
	 * @param alumno
	 * @return
	 */
	private static int buscaAlumno(String alumno) {
		int i = 0;
		
		while(i<alumnos.length && (alumnos[i]==null || !alumnos[i].getNombre().equals(alumno))) {
			i++;
		}
		return i;
	}
}