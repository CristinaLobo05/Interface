

package SextosEjercicios;


import java.util.HashMap;


public class ejer1 {

	public static void main(String[] args) {

		        String[] colores = {"azul", "rojo", "rojo", "naraja", "amarillo", "amarillo"};

		        HashMap<String, Integer> repeticiones = new HashMap<>();

		        for (String word : colores) {
		            if (repeticiones.containsKey(word)) {
		                repeticiones.put(word, repeticiones.get(word) + 1);
		            } else {
		                repeticiones.put(word, 1);
		            }
		        }

		        for (String key : repeticiones.keySet()) {
		            System.out.println(key + ": " + repeticiones.get(key));
		        }
		    }


		
	}