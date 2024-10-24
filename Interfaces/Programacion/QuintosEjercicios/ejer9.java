package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejer9 {
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

        // Invertir el ArrayList
        Collections.reverse(numeros);

        // Imprimir el ArrayList invertido
        System.out.println("ArrayList invertido: " + numeros);
    }
}
