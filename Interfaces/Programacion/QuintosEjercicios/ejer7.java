package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Random;

public class ejer7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        // Llenar el ArrayList con 10 números aleatorios
        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100) + 1); // Números entre 1 y 100
        }

        // Convertir el ArrayList en un array normal
        Integer[] array = numeros.toArray(new Integer[0]);

        // Imprimir el array
        System.out.println("ArrayList: " + numeros);
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
