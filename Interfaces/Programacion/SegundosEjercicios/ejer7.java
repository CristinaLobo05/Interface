package SegundosEjercicios;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();
        int digitos = 0;
        
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
}

