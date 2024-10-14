package CuartosEjercicios;

import java.util.HashSet;

public class ejer5 {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 6, 7, 5, 8, 6, 9, 10, 4};
        HashSet<Integer> vistos = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();

        for (int num : numeros) {
            if (!vistos.add(num)) {
                repetidos.add(num);
            }
        }

        System.out.println("Números repetidos: " + repetidos);
    }
}
