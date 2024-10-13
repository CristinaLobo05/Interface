package TercerosEjercicios;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        int contador = 0;

        while (num != 0) {
            num /= 10; 
            contador++;
        }   

        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
