package TercerosEjercicios;


import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número A: ");
        int A = sc.nextInt();
        System.out.print("Introduce el número B: ");
        int B = sc.nextInt();
        int suma = 0;

        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            suma += i;
        }
        System.out.println("La suma entre " + A + " y " + B + " es: " + suma);
    }
}
