package SextosEjercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 5);
        mapa.put("D", 15);
        mapa.put("E", 3);

        System.out.println("HashMap original: " + mapa);

        System.out.print("Ingresa un número límite: ");
        int limite = scanner.nextInt();

       Iterator<Map.Entry<String, Integer>> iterador = mapa.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<String, Integer> entrada = iterador.next();
            if (entrada.getValue() < limite) {
                iterador.remove();
            }
        }

        System.out.println("HashMap después de eliminar elementos con valores menores a " + limite + ": " + mapa);
        scanner.close();
    }
}
