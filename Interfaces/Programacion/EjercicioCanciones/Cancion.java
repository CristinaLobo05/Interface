package EjercicioCanciones;

/* 2.->Una clase llamada cancion:
 * Que va a tener los siguientes atributos. Nombre de la canción: String Grupo
 * música: String Año de publicación: int Realizaremos los métodos get y setter,
 * correspondientes. */

public class Cancion {
	private String nombre;
	private String grupo;
	private int anio;

	public Cancion() {// hay que utilizar lso setter para meterle info al objeto
	}

	public Cancion(String nom, String g, int year) {
		this.nombre = nom;
		this.grupo = g;
		this.anio = year;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", grupo=" + grupo + ", anio=" + anio + "]";
	}

}
