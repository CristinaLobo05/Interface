package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class ejer2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); // Crear un ArrayList de cadenas
        Scanner scanner = new Scanner(System.in);
        String nombre;

        // Bucle para ingresar nombres hasta que se ingrese "fin"
        while (true) {
            System.out.println("Ingresa un nombre (o 'fin' para terminar):");
            nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break; // Salir del bucle si se ingresa "fin"
            }
            nombres.add(nombre); // Agregar el nombre al ArrayList
        }

        // Imprimir todos los nombres ingresados
        System.out.println("Los nombres ingresados son: " + nombres);

        // Pedir al usuario que elimine un nombre específico
        System.out.println("Ingresa el nombre que deseas eliminar:");
        String nombreAEliminar = scanner.nextLine();
        nombres.remove(nombreAEliminar); // Eliminar el nombre del ArrayList

        // Imprimir la lista actualizada
        System.out.println("Lista actualizada de nombres: " + nombres);
        
        scanner.close();
    }
}
