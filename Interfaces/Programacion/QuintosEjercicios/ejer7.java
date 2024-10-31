package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Random;

public class ejer7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100) + 1); // Números entre 1 y 100
        }

       Integer[] array = numeros.toArray(new Integer[0]);

        System.out.println("ArrayList: " + numeros);
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
