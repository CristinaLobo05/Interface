package CuartosEjercicios;

public class ejer3 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 15, 7, 3, 30, 18, 2};
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
