package crud02;

public class Gestisimal {

	public static Articulo[] articulos = new Articulo[20];

	public static void listado() {
		int i = 0;

		while (i < articulos.length && articulos[i] != null) {
			System.out.println(articulos[i]);
			i++;
		}
	}

	public static boolean alta(Articulo art) {
		boolean anyadido = false;

		// 1º Comprobar si el artículo ya existe
		int i = 0;
		int pos = buscaArticulo(art);

		// Si no he encontrado el artículo lo tengo que añadir
		if (pos == -1) {

			while (i < articulos.length && articulos[i] != null) {
				i++;
			}

			if (i < articulos.length) {
				articulos[i] = art;
				anyadido = true;
			}
		}

		return anyadido;
	}

	public static boolean baja(Articulo art) {
		int codigo;
		boolean borrado = false;

		codigo = art.getCodigo();
		int i = 0;
		int pos = buscaArticulo(art);

		if (pos >= 0) {
			while (i < articulos.length && codigo != articulos[i].getCodigo()) {
				i++;
			}
			if (i < articulos.length) {
				articulos[i] = null;
				borrado = true;
			}
		}
		return borrado;
	}

	public static int buscaArticulo(Articulo art) {
		int i = 0;
		int pos = -1;

		while (i < articulos.length && pos == -1) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}

			i++;
		}

		return pos;
	}

}