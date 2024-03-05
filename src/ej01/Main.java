package ej01;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente("09090909E", "Hector", 3000);
		cuenta.mostrarInformacion();
		cuenta.sacarDinero(1000);
		cuenta.ingresarDinero(100);
		cuenta.mostrarInformacion();
	}

}
