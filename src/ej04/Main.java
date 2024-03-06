package ej04;

public class Main {

	public static void main(String[] args) {
		// Creo los articulos
		Articulo art1 = new Articulo("Campana", 1000, 4);
		Articulo art2 = new Articulo("Campana Extractora", 500, 3);

		// Imprime la informacion del articulo
		art1.imprime();
		art2.imprime();
		System.out.println();
		
		// Imprimo el precio con iva
		double precio = art1.getPVP();
		System.out.println("El precio es: " + precio);
		
		// Imprimo el precio con descuento
		System.out.println();
		double descuento = art1.descuento(10);
		System.out.println("El precio con descuento es: " + descuento);
		
		art1.vender(2);
		art1.imprime();
		
		art1.almacenar(3);
		art1.imprime();
		
	}

}
