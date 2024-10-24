package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Ingresar números en el ArrayList
        System.out.println("Introduce números enteros (escribe '0' para detener): ");
        int num;
        do {
            num = sc.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        } while (num != 0);

        // Sumar los elementos
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma de los números es: " + suma);
    }
}
