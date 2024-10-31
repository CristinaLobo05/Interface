
package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Crear un ArrayList de enteros
        Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un número entero:");
            int num = scanner.nextInt();
            numeros.add(num);
        }

        System.out.println("Ingresa el índice del número que deseas actualizar (0-9):");
        int indice = scanner.nextInt();

        System.out.println("Ingresa el nuevo valor para ese índice:");
        int nuevoValor = scanner.nextInt();

        numeros.set(indice, nuevoValor);

        System.out.println("Lista actualizada: " + numeros);
        
        scanner.close();
    }
}
