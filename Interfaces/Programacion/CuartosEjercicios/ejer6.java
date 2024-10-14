package CuartosEjercicios;


public class ejer6 {
    public static void main(String[] args) {
        float[] numeros = {3.5f, 7.2f, 4.8f, 6.0f, 9.1f, 2.3f};
        float suma = 0;

        for (float num : numeros) {
            suma += num;
        }

        float promedio = suma / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
}
