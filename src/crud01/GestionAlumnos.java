package crud01;

import java.util.Scanner;

public class GestionAlumnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		String nombre;
		double nota;

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			switch (opc) {
			case 1:
				// Imprimir el listado de alumnos
				ArrayAlumno.imprimirAlumnos();
				break;
			case 2: // Crear y añadir alumno
				System.out.println("Introduzca el nombre del alumno:");
				nombre = sc.nextLine();
				System.out.println("Introduzca la nota media del alumno:");
				nota = sc.nextDouble();
				sc.nextLine();
				if (ArrayAlumno.nuevoAlumno(nombre, nota)) {
					System.out.println("Añadido correctamente");
				} else {
					System.out.println("Array lleno");
				}
				break;
			case 3: // Modificar alumno
				System.out.println("Introduzca el nombre del alumno:");
				nombre = sc.nextLine();
				System.out.println("Introduzca la nota media del alumno:");
				nota = sc.nextDouble();
				sc.nextLine();
				if (ArrayAlumno.modificaAlumno(nombre, nota)) {
					System.out.println("Alumno modificado correctamente");
				} else {
					System.out.println("No se ha encontrado al alumno");
				}
				break;
			case 4:
				System.out.println("Introduzca el nombre del alumno:");
				nombre = sc.nextLine();
				if (ArrayAlumno.eliminaAlumno(nombre)) {
					System.out.println("Alumno eliminado correctamente");
				} else {
					System.out.println("Alumno no encontrado");
				}
				break;
			}
		} while (opc != 5);

		sc.close();
	}

	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("==========");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.println("¿Qué opción quiere ejecutar?");
	}

}