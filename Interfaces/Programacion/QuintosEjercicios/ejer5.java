package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Crear un ArrayList de enteros
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa un número entero (negativo para terminar):");
            int num = scanner.nextInt();
            if (num < 0) {
                break; 
            }
            numeros.add(num); 
        }

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
        
        scanner.close();
    }
}
