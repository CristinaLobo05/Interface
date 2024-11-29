package EjercicioPrueba;

public class Capitulo {
    private int numero;
    private int duracion;

    public Capitulo(int numero, int duracion) {
        this.numero = numero;
        this.duracion = duracion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
