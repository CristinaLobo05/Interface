package SeptimosEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejer3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el nombre del archivo a leer: ");
        String archivoNombre = scanner.nextLine();

        try {
            File archivo = new File(archivoNombre);
            Scanner archivoScanner = new Scanner(archivo);

            while (archivoScanner.hasNextLine()) {
                String linea = archivoScanner.nextLine();
                System.out.println(linea);
            }

            archivoScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error durante la lectura del archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
