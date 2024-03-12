package crud02;

public class Gestisimal {

	public static Articulo[] articulos = new Articulo[20];

	public static boolean alta(Articulo art) {
		boolean anyadido = false;
		
		// 1º Comprobar si el artículo ya existe
		int i = 0;
		boolean enc = buscaArticulo(art);

		// Si no he encontrado el artículo lo tengo que añadir
		if(!enc) {
			
			while(i<articulos.length && articulos[i]!=null) {
				i++;
			}
			
			if(i<articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}
		}
		
		return anyadido;
	}
	
	public static boolean baja(Articulo art) {
		int codigo;
		int i = 0;
		boolean borrado = false;
		
		codigo = art.getCodigo();
		
		while(i < articulos.length && codigo != articulos[i].getCodigo()) {
			i++;			
		}
		if(i < articulos.length) {
			articulos[i] = null;
			borrado = true;
		}
		
		return borrado;
	}
	
	private static boolean buscaArticulo(Articulo art) {
		int i = 0;
		boolean enc = false;

		while (i < articulos.length && !enc) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].equals(art)) {
				enc = true;
			}

			i++;
		}
		
		return enc;
	}

}