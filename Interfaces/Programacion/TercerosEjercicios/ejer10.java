package TercerosEjercicios;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de términos: ");
        int N = sc.nextInt();
        int a = 0, b = 1, temp;

        System.out.println("Serie de Fibonacci: ");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }
    }
}
