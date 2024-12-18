package QuintosEjercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Ingresar números en el ArrayList
        System.out.println("Introduce números enteros (escribe '0' para detener): ");
        int num;
        do {
            num = sc.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        } while (num != 0);
        
        // Eliminar duplicados usando un HashSet
        HashSet<Integer> sinDuplicados = new HashSet<>(numeros);
        
        // Convertir de nuevo a ArrayList para imprimir
        numeros = new ArrayList<>(sinDuplicados);
        
        System.out.println("Lista sin duplicados: " + numeros);
    }
}
