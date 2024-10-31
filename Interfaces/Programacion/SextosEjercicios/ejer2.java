package SextosEjercicios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer2{
    public static void main(String[] args) {
        Map<String, Integer> alumnos = new HashMap<>();
        
        alumnos.put("Juan", 90);
        alumnos.put("Ana", 85);
        alumnos.put("Carlos", 78);
       
        System.out.println(alumnos.keySet());
        System.out.println("De que alumno quieres saber la nota?");
        
        Scanner scanner = new Scanner(System.in);
        String estudiante = scanner.nextLine();
        
        if ( alumnos.containsKey(estudiante)) {
        	System.out.println("La nota es: " + alumnos.get(estudiante));
        	
        }else System.out.println("Introduxca un nombre de la lista");
        

    
    }
   }