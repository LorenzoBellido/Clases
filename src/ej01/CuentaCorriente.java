package ej01;
/**
 * Clase que recoge los datos de la cuenta corriente personal
 */
public class CuentaCorriente {
	/**
	 * Atributo donde guardar el DNI del titular
	 */
	private String dni;
	/**
	 * Atributo donde guardar el nombre del titular
	 */
	private String nombre;
	/**
	 * Atributo donde guardar el saldo del titular
	 */
	private double saldo;

	/**
	 * Constructor sin parametros de la clase CuentaCorriente
	 */
	public CuentaCorriente() {
		super();
	}
	/**
	 * Constructor con parametros (dni y saldo) de la clase CuentaCorriente
	 */
	public CuentaCorriente(String dni, int saldo) {
		super();
		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
	/**
	 * Constructor con parametros (dni, nombre y saldo) de la clase CuentaCorriente
	 */
	public CuentaCorriente(String dni, String nombre, int saldo) {
		super();
		if (dni != null && !dni.equals("") && dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
/**
 * Método para 
 * @param dinero
 */
	public boolean sacarDinero(double dinero) {
		boolean sacarDinero = false;
		if(this.saldo > dinero) {
			sacarDinero = true;
			this.saldo -= dinero; 
		}
		return sacarDinero;
	}
	
	public void ingresarDinero(double dinero) {
		this.saldo += dinero;
	}
	
	public void mostrarInformacion() {
		System.out.println(this.dni);
		System.out.println(this.nombre);
		System.out.println(this.saldo);
	}

}
