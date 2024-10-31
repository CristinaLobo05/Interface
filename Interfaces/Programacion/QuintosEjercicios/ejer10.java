package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Introduce números enteros (escribe '0' para detener): ");
        int num;
        do {
            num = sc.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        } while (num != 0);

       for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }
}
