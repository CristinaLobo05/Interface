package Parcial_2ºEvaluuacion_Cristina;

public class LibroDigital extends Libro {
    private double tamanoArchivo;
    private String formato;

    public LibroDigital(String titulo, String autor, String genero, double tamanoArchivo, String formato) {
        super(titulo, autor, genero);
        this.tamanoArchivo = tamanoArchivo;
        this.formato = formato;
    }

    public double getTamanoArchivo() { return tamanoArchivo; }
    public void setTamanoArchivo(double tamanoArchivo) { this.tamanoArchivo = tamanoArchivo; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño del archivo: " + tamanoArchivo + " MB");
        System.out.println("Formato: " + formato);
    }}
