package EjercicioPrueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Crear datos predefinidos de películas
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Titanic", "Romance", 1997, 195));
        peliculas.add(new Pelicula("Inception", "Ciencia Ficción", 2010, 148));

        // Crear datos predefinidos de series y temporadas
        ArrayList<Serie> series = new ArrayList<>();
        
        // Crear serie 1: Breaking Bad
        Serie serie1 = new Serie("Breaking Bad", "Drama");  // Usamos el constructor de 2 parámetros
        Temporada temp1 = new Temporada(1);
        temp1.addCapitulo(new Capitulo(1, 58));
        temp1.addCapitulo(new Capitulo(2, 47));
        serie1.addTemporada(temp1);

        Temporada temp2 = new Temporada(2);
        temp2.addCapitulo(new Capitulo(1, 50));
        temp2.addCapitulo(new Capitulo(2, 52));
        serie1.addTemporada(temp2);

        series.add(serie1); // Añadir la serie a la lista de series

        // Crear serie 2: Stranger Things
        Serie serie2 = new Serie("Stranger Things", "Ciencia Ficción");  // Usamos el constructor de 2 parámetros
        Temporada temp3 = new Temporada(1);
        temp3.addCapitulo(new Capitulo(1, 60));
        temp3.addCapitulo(new Capitulo(2, 55));
        serie2.addTemporada(temp3);

        series.add(serie2);  // Añadir la serie a la lista de series

        int opcion;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Seleccionar Película");
            System.out.println("2. Seleccionar Serie");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Películas disponibles:");
                    for (int i = 0; i < peliculas.size(); i++) {
                        System.out.println((i + 1) + ". " + peliculas.get(i).getNombre());
                    }
                    System.out.print("Selecciona una película: ");
                    int peliSeleccionada = leer.nextInt();
                    leer.nextLine(); // Limpiar buffer
                    if (peliSeleccionada > 0 && peliSeleccionada <= peliculas.size()) {
                        Pelicula pelicula = peliculas.get(peliSeleccionada - 1);
                        System.out.println("Has seleccionado: " + pelicula.getNombre());
                        System.out.println("Género: " + pelicula.getGenero());
                        System.out.println("Año: " + pelicula.getAnio());
                        System.out.println("Duración: " + pelicula.getDuracion() + " minutos\n");
                    } else {
                        System.out.println("Selección no válida.\n");
                    }
                    break;

                case 2:
                    System.out.println("Series disponibles:");
                    for (int i = 0; i < series.size(); i++) {
                        System.out.println((i + 1) + ". " + series.get(i).getNombre());
                    }
                    System.out.print("Selecciona una serie: ");
                    int serieSeleccionada = leer.nextInt();
                    leer.nextLine(); // Limpiar buffer
                    if (serieSeleccionada > 0 && serieSeleccionada <= series.size()) {
                        Serie serie = series.get(serieSeleccionada - 1);
                        System.out.println("Has seleccionado: " + serie.getNombre());
                        System.out.println("Género: " + serie.getGenero());
                        if (serie.getTemporadas().size() > 0) {
                            System.out.println("Temporadas:");
                            for (Temporada temporada : serie.getTemporadas()) {
                                System.out.println("  Temporada " + temporada.getNumero());
                                for (Capitulo cap : temporada.getCapitulos()) {
                                    System.out.println("    Capítulo " + cap.getNumero() + ": " + cap.getDuracion() + " minutos");
                                }
                            }
                        } else {
                            System.out.println("No hay temporadas disponibles.\n");
                        }
                    } else {
                        System.out.println("Selección no válida.\n");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.\n");
            }
        } while (opcion != 3);

        leer.close();
    }
}
