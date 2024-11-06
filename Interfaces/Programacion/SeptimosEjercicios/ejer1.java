package SeptimosEjercicios;

import java.util.Scanner;

public class ejer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número positivo: ");
        
        try {
            String input = scanner.nextLine();
            int numero = Integer.parseInt(input);
            
            if (numero < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo.");
            }
            
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
