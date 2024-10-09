package SegundosEjercicios;

import java.util.Scanner;
import java.util.Random;

public class ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        int numeroUsuario = 0;

        System.out.println("Adivina un número entre 1 y 100.");

        while (numeroUsuario != numeroAleatorio) {
            System.out.print("Introduce un número: ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! El número es " + numeroAleatorio);
            }
        }
        sc.close();

}

}


		

	


