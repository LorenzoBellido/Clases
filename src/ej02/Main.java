package ej02;

public class Main {

	public static void main(String[] args) {

		Libro lib = new Libro("La vida en la campana", "Hector", 3, 0);
		lib.prestamo();
		lib.devuelve();

	}

}
