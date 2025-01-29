package Parcial_2ºEvaluuacion_Cristina;
 
	public class Libro {
	 
	    private String titulo;
	    private String autor;
	    private String genero;
	    private boolean disponible;

	  
	    public Libro(String titulo, String autor, String genero) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.genero = genero;
	        this.disponible = true; 
	        }

	   
	    public String getTitulo() { return titulo; }
	    public void setTitulo(String titulo) { this.titulo = titulo; }

	    public String getAutor() { return autor; }
	    public void setAutor(String autor) { this.autor = autor; }

	    public String getGenero() { return genero; }
	    public void setGenero(String genero) { this.genero = genero; }

	    public boolean isDisponible() { return disponible; }
	    public void setDisponible(boolean disponible) { this.disponible = disponible; }

	    
	    public void mostrarInfo() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Género: " + genero);
	        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
	    }

	    public void prestar() {
	        if (disponible) {
	            disponible = false;
	            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
	        } else {
	            System.out.println("El libro \"" + titulo + "\" no está disponible.");
	        }
	    }

	    public void devolver() {
	        if (!disponible) {
	            disponible = true;
	            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
	        } else {
	            System.out.println("El libro \"" + titulo + "\" ya estaba disponible.");
	        }
	    }
	}


