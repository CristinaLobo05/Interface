package SextosEjercicios;

import java.util.HashMap;
import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> frecuenciaNumeros = new HashMap<>();

        System.out.println("Ingresa la cantidad de números en la lista:");
        int n = scanner.nextInt();

        System.out.println("Ingresa los números de la lista:");
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
           frecuenciaNumeros.put(numero, frecuenciaNumeros.getOrDefault(numero, 0) + 1);
        }

        boolean hayRepetidos = false;

        for (int frecuencia : frecuenciaNumeros.values()) {
            if (frecuencia > 1) {
                hayRepetidos = true;
                break;
            }
        }

        if (hayRepetidos) {
            System.out.println("Hay al menos un número que se repite en la lista.");
        } else {
            System.out.println("No hay números repetidos en la lista.");
        }

        scanner.close();
    }
}
