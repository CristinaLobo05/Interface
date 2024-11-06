package EjercicioRepaso;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la matrícula (formato XXXX XXX): ");
        String matricula = scanner.nextLine().toUpperCase().trim();
        
        String[] partes = matricula.split(" ");
        int numero = Integer.parseInt(partes[0]); 
        String letras = partes[1]; 
        
        System.out.printf("Matrícula actual: %04d %s%n", numero, letras);
        
        
        numero++;
        if (numero > 9999) {
            numero = 0;
            letras = incrementarLetras(letras);
        }

        System.out.printf("Siguiente matrícula: %04d %s%n", numero, letras);
    }

    private static String incrementarLetras(String letras) {
        String alfabeto = "BCDFGHJKLMNPQRSTVWXYZ";
        
        char[] letrasArray = letras.toCharArray();
        
        for (int i = letrasArray.length - 1; i >= 0; i--) {
            int pos = alfabeto.indexOf(letrasArray[i]) + 1;
            
            if (pos == alfabeto.length()) {
                 letrasArray[i] = alfabeto.charAt(0);
            } else {
                letrasArray[i] = alfabeto.charAt(pos);
                break;
            }
        }

        return new String(letrasArray);
    }
}

