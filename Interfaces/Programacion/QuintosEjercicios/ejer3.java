package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Crear un ArrayList de enteros
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un número entero:");
            int num = scanner.nextInt();
            numeros.add(num);
        }

        System.out.println("Ingresa el número que deseas buscar:");
        int numABuscar = scanner.nextInt();

       if (numeros.contains(numABuscar)) {
            int indice = numeros.indexOf(numABuscar);
            System.out.println("El número " + numABuscar + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El número no está presente en la lista.");
        }
        
        scanner.close();
    }
}
