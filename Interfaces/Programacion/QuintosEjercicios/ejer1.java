package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer1
{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Crear un ArrayList de enteros
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario 5 números y agregarlos al ArrayList
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un número entero:");
            int num = scanner.nextInt();
            numeros.add(num); // Agregar el número al ArrayList
        }

        // Imprimir el contenido del ArrayList
        System.out.println("Los números ingresados son: " + numeros);
        
        scanner.close();
    }
}
