package EjercicioPrueba;

import java.util.ArrayList;

public class Temporada {
    private int numero;
    private ArrayList<Capitulo> capitulos;

    public Temporada(int numero) {
        this.numero = numero;
        this.capitulos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void addCapitulo(Capitulo capitulo) {
        this.capitulos.add(capitulo);
    }
}
