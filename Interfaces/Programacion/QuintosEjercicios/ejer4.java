
package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Crear un ArrayList de enteros
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese 10 números
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un número entero:");
            int num = scanner.nextInt();
            numeros.add(num);
        }

        // Permitir al usuario actualizar un número en una posición específica
        System.out.println("Ingresa el índice del número que deseas actualizar (0-9):");
        int indice = scanner.nextInt();

        System.out.println("Ingresa el nuevo valor para ese índice:");
        int nuevoValor = scanner.nextInt();

        // Actualizar el número en el índice especificado
        numeros.set(indice, nuevoValor);

        // Imprimir el ArrayList actualizado
        System.out.println("Lista actualizada: " + numeros);
        
        scanner.close();
    }
}
