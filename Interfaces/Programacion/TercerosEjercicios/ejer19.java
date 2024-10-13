package TercerosEjercicios;
import java.util.Scanner;
import java.util.Random;

public class ejer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 5;

        while (intentos > 0) {
            System.out.print("Adivina el número (entre 1 y 100): ");
            int intento = sc.nextInt();
            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Has adivinado el número.");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("Es mayor.");
            } else {
                System.out.println("Es menor.");
            }
            intentos--;
            System.out.println("Te quedan " + intentos + " intentos.");
        }

        if (intentos == 0) {
            System.out.println("Lo siento, se acabaron los intentos. El número era: " + numeroSecreto);
        }
    }
}
