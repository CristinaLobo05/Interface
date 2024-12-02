package EjercicioCanciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/*
	 * 1.-> Hacer un programa. Para la gestión, canciones. El programa va a dar de
	 * alta, y listar, artistas con sus canciones.
	 */

	public static void main(String[] args) {

		/*
		 * 3.-> El programa principal, tendrá un ArrayList<cancion>, además tendrás que
		 * crear los métodos para el Alta, Listado Opción A.-> Alta. Opción B.-> Listado
		 * Opción C.-> Salir.
		 */

		ArrayList<Cancion> listaCanciones = new ArrayList<Cancion>();

		Cancion c1 = new Cancion("Wanda y su banda", "Los Wandenios", 2000);
		Cancion c2 = new Cancion("Izan Roolzs", "Izany su baliza", 12313);
		Cancion c3 = new Cancion("Los primigenios", "Primi y su genio", 12323);

		listaCanciones.add(c1);
		listaCanciones.add(c2);
		listaCanciones.add(c3);

		Scanner leer = new Scanner(System.in);
		imprimirOpciones();

		elegirOpcion(listaCanciones, leer);

	}

	private static void elegirOpcion(ArrayList<Cancion> listaCanciones, Scanner leer) {
		String opcion = leer.next();

		Cancion c;

		switch (opcion) {
		case "A":// ALTA

			/*
			 * 4.-> Método Alta() Pide al usuario todos los datos, para completar un objeto
			 * de tipo cancion, y añadirlo en el ArrayList.
			 */

			System.out.println("VAMOS A PROCEDER A INTRODUCIR CANCIONES EN NUESTRA APLICACION");

			int seguir = 1;
			while (seguir == 1) {
				System.out.println("Introduce el nombre de la cancion");
				String nombre = leer.next();
				System.out.println("Introduce el grupo de la cancion");
				String grupo = leer.next();
				System.out.println("Introduce el anio");
				int year = leer.nextInt();

				c = new Cancion();
				c.setNombre(nombre);
				c.setAnio(year);
				c.setGrupo(grupo);
				listaCanciones.add(c);

				System.out.println("\n");
				System.out.println("QUIERES METER MAS CANCIONES?");
				System.out.println("pulsa 1 para seguir, cualquier otro numero para salir");
				seguir = leer.nextInt();

			}

			System.out.println("VAMOS A PROCEDER A LISTAR NUESTRAS CANCIONES");
			for (Cancion cancion : listaCanciones) {
				System.out.println(cancion.toString());
			}

			break;
		case "B":// LISTADO

			/*
			 * / 5.-> Método Listado(); Recorre el ArrayList() y muestra por pantalla los
			 * grupos, junto con el nombre de su album y el año de publicación.
			 */

			System.out.println("VAMOS A PROCEDER A LISTAR NUESTRAS CANCIONES");
			for (Cancion cancion : listaCanciones) {
				System.out.println("NOMBRE: " + cancion.getNombre());

				System.out.println("GRUPO: " + cancion.getGrupo());

				System.out.println("ANIO: " + cancion.getAnio());
			}

			break;
		default:
			System.out.println("OPCION INCORRECTA, SALIMOS");
		}
	}

	private static void imprimirOpciones() {
		System.out.println("INTRODUCE La opcion correspondiente");
		System.out.println("A. PARA ALTA");
		System.out.println("B. PARA LISTADO");
		System.out.println("C. CUALQUIER OTRA LETRA PARA SALIR");
	}

}
