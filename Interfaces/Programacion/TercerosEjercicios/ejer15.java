package TercerosEjercicios;


import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int N = sc.nextInt();
        double suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Introduce un número: ");
            suma += sc.nextDouble();
        }
        System.out.println("Promedio: " + suma / N);
    }
}
