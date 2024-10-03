package Interfaces;

public class act10 {
    public static void main(String[] args) {
        double precio = 100.0;  
        double iva = 21.0;   

        double precioFinal = precio + (precio * iva / 100);

        System.out.println("El precio final con IVA es: " + precioFinal);
    }
}

	
