package SegundosEjercicios;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                int num1 = sc.nextInt();
                System.out.print("Introduce el segundo número: ");
                int num2 = sc.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir por 0.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
            
        } while (opcion != 5);
        sc.close();
    }
}
