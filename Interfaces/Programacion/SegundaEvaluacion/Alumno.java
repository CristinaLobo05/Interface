package SegundaEvaluacion;

public class Alumno {

   
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

   
    public Alumno() {
    }

   
    public Alumno(String nom, String ape, String nif, int años) {
        this.nombre = nom;
        this.apellidos = ape;
        this.dni = nif;
        this.edad = años;
    }

  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
