package CuartosEjercicios;

public class ejer8 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};

        int[] fusionArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            fusionArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            fusionArray[array1.length + i] = array2[i];
        }

        System.out.println("Array fusionado:");
        for (int num : fusionArray) {
            System.out.print(num + " ");
        }
    }
}

