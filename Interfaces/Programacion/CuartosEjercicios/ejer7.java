package CuartosEjercicios;


import java.util.Arrays;
import java.util.Random;

public class ejer7 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Llenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }

        // Ordenar el array usando Arrays.sort()
        Arrays.sort(numeros);

        // Imprimir el array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
