package TercerosEjercicios;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}

