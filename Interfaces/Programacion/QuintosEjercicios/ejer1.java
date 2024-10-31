package QuintosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejer1
{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un número entero:");
            int num = scanner.nextInt();
            numeros.add(num); 
        }

        System.out.println("Los números ingresados son: " + numeros);
        
        scanner.close();
    }
}
