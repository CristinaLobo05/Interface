package CuartosEjercicios;

public class ejer10 {
	
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimo;

        System.out.println("Array después de la rotación:");
        for (int num : numeros) {
            System.out.print(num + " ");
            
        }
    }
}
