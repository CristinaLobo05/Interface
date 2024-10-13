package TercerosEjercicios;

import java.util.Scanner;
import java.util.Random;

public class ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = sc.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("Es menor.");
            } else {
                System.out.println("¡Correcto!");
            }
        } while (intento != numeroSecreto);
    }
}
