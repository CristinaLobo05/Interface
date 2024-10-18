package CuartosEjercicios;


import java.util.Arrays;
import java.util.Random;

public class ejer7 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); 

         Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
