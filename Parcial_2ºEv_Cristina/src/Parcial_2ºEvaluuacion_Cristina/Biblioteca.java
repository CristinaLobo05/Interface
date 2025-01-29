package Parcial_2ºEvaluuacion_Cristina;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros;
    
    public Biblioteca() {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido agregado a la biblioteca.");
    }

    public void listarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("Listado de libros en la biblioteca:");
            for (Libro libro : listaLibros) {
                libro.mostrarInfo();
                System.out.println();
            }
        }
    }

    public void buscarLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado:");
                libro.mostrarInfo();
                return;
            }
        }
        System.out.println("No se encontró un libro con el título \"" + titulo + "\".");
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("No se encontró el libro \"" + titulo + "\" para prestar.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("No se encontró el libro \"" + titulo + "\" para devolver.");
    }
}
























