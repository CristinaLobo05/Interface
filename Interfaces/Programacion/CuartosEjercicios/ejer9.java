package CuartosEjercicios;

public class ejer9 {
    public static void main(String[] args) {
        char[] caracteres = {'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o'};
        int contadorVocales = 0;

        for (char c : caracteres) {
            if (esVocal(c)) {
                contadorVocales++;
            }
        }

        System.out.println("Número de vocales: " + contadorVocales);
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c); // Convertir a minúscula
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
