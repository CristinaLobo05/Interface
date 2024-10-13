package TercerosEjercicios;

import java.util.Scanner;

public class ejer5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
       }
    }
        
}
