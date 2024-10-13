package TercerosEjercicios;

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
}
