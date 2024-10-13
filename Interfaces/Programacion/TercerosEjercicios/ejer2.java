package TercerosEjercicios;

import java.util.Scanner;

public class ejer2 {
	 public static void main(String[] args) {
	 
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Ingresa un número positivo: ");
	        int num = sc.nextInt();
	        int suma = 0;
	        
	        if (num < 0) {
	        	 System.out.println("Este numero es incorrecto");
	        } else { 
	        	for (int i = 1; i <= num; i++) {
	                suma += i;
	            }
	        	System.out.println("La suma de los primeros " + num + " números es: " + suma);
	        	}
	 }

}
	 
