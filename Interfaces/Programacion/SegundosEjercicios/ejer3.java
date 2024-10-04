package SegundosEjercicios;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una puntuación (0-100): ");
        int puntuacion = sc.nextInt();
        
        if (puntuacion >= 90) {
            System.out.println("A");
        } else if (puntuacion >= 80) {
            System.out.println("B");
        } else if (puntuacion >= 70) {
            System.out.println("C");
        } else if (puntuacion >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}






