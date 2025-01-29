package Parcial_2ºEvaluuacion_Cristina;

public class LibroFisico extends Libro {
    private String ubicacion;
    private int numPaginas;

    public LibroFisico(String titulo, String autor, String genero, String ubicacion, int numPaginas) {
        super(titulo, autor, genero);
        this.ubicacion = ubicacion;
        this.numPaginas = numPaginas;
    }


    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public int getNumPaginas() { return numPaginas; }
    public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Número de páginas: " + numPaginas);
        
    }
}
