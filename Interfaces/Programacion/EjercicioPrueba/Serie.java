package EjercicioPrueba;

import java.util.ArrayList;

public class Serie {
    private String nombre;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String string, String string2, int i) {
        this.temporadas = new ArrayList<>();
    }

    public Serie(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void addTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }
}
