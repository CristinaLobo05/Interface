package TercerosEjercicios;

	import java.util.Scanner;

	public class ejer8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        int numero = sc.nextInt();
	        int invertido = 0;

	        while (numero != 0) {
	            invertido = invertido * 10 + numero % 10;
	            numero /= 10;
	        }
	        System.out.println("Número invertido: " + invertido);
	    }
	}

