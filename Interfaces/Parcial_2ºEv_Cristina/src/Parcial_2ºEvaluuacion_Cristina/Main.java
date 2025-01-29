package Parcial_2ºEvaluuacion_Cristina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0; 

        biblioteca.agregarLibro(new LibroDigital("La Ultima Nota", "Joana Marcus", "Romance", 1.5, "PDF"));
        biblioteca.agregarLibro(new LibroDigital("Romper el Hielo", "Hannah Grace", "Romance", 1.6, "PDF"));
        biblioteca.agregarLibro(new LibroFisico("Culpa Mia", "Mercedes Ron", "Romance", "Sección a, Estante 5", 152));
        biblioteca.agregarLibro(new LibroFisico("Antes de Diciembre", "Joana Marcus", "Romance", "Sección B, Estante 2", 163));
        biblioteca.agregarLibro(new LibroFisico("A traves de mi Ventana", "Ariana Godoy", "Romance", "Sección B, Estante 5", 141));

        System.out.println("¡Tres libros iniciales han sido añadidos a la biblioteca!");

        while (opcion != 6) { 
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) { 
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Tipo de libro (1: Digital, 2: Físico): ");
                        int tipo = scanner.nextInt();
                        scanner.nextLine(); 

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Género: ");
                        String genero = scanner.nextLine();

                        if (tipo == 1) {
                            System.out.print("Tamaño del archivo (MB): ");
                            double tamano = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Formato: ");
                            String formato = scanner.nextLine();
                            biblioteca.agregarLibro(new LibroDigital(titulo, autor, genero, tamano, formato));
                        } else if (tipo == 2) {
                            System.out.print("Ubicación: ");
                            String ubicacion = scanner.nextLine();
                            System.out.print("Número de páginas: ");
                            int paginas = scanner.nextInt();
                            biblioteca.agregarLibro(new LibroFisico(titulo, autor, genero, ubicacion, paginas));
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;

                    case 2:
                        biblioteca.listarLibros();
                        break;

                    case 3:
                        System.out.print("Ingrese el título del libro a buscar: ");
                        String buscarTitulo = scanner.nextLine();
                        biblioteca.buscarLibro(buscarTitulo);
                        break;

                    case 4:
                        System.out.print("Ingrese el título del libro a prestar: ");
                        String prestarTitulo = scanner.nextLine();
                        biblioteca.prestarLibro(prestarTitulo);
                        break;

                    case 5:
                        System.out.print("Ingrese el título del libro a devolver: ");
                        String devolverTitulo = scanner.nextLine();
                        biblioteca.devolverLibro(devolverTitulo);
                        break;
                        
                    case 6:
                        System.out.println("¡Gracias por usar la biblioteca!");
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduzca un número.");
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }
}

