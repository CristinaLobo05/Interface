package Interfaces;

public class act6 {

	public static void main(String[] args) {
		
		 int a = 5;
	        int b = 10;

	        System.out.println("Antes del intercambio:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        a = a + b; 
	        b = a - b; 
	        a = a - b; 

	        System.out.println("Después del intercambio:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	}

}
