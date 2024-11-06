package SeptimosEjercicios;

class EdadInvalidaException extends Exception {
 public EdadInvalidaException(String mensaje) {
     super(mensaje);
 }
}

class Persona {
 private String nombre;
 private int edad;

 public Persona(String nombre) {
     this.nombre = nombre;
 }

 public void setEdad(int edad) throws EdadInvalidaException {
     if (edad < 0) {
         throw new EdadInvalidaException("La edad no puede ser negativa.");
     }
     this.edad = edad;
 }

 public int getEdad() {
     return edad;
 }

 public String getNombre() {
     return nombre;
 }
}

public class ejer2 {

 public static void main(String[] args) {
     Persona persona = new Persona("Juan");

     try {
         persona.setEdad(-5);  
     } catch (EdadInvalidaException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
