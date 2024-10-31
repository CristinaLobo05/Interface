package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class ejer2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nombre;

        while (true) {
            System.out.println("Ingresa un nombre (o 'fin' para terminar):");
            nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break; 
            }
            nombres.add(nombre); 
        }

        
        System.out.println("Los nombres ingresados son: " + nombres);

       System.out.println("Ingresa el nombre que deseas eliminar:");
        String nombreAEliminar = scanner.nextLine();
        nombres.remove(nombreAEliminar);

        System.out.println("Lista actualizada de nombres: " + nombres);
        
        scanner.close();
    }
}
