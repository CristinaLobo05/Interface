package EjercicioRepaso;
import java.io.*;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        String rutaArchivo = "lista_alumnos.csv";
        List<String[]> estudiantes = new ArrayList<>();
        int totalEstudiantes = 0;
        double sumaEdades = 0;
        double sumaNotas = 0;
        double notaMaxima = Double.MIN_VALUE;
        double notaMinima = Double.MAX_VALUE;

        try {
            
            Scanner lector = new Scanner(new File(rutaArchivo));
            lector.nextLine(); 
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split(",");
                estudiantes.add(datos);
                totalEstudiantes++;

                
                int edad = Integer.parseInt(datos[3]);
                double nota = Double.parseDouble(datos[4]);
                sumaEdades += edad;
                sumaNotas += nota;
                notaMaxima = Math.max(notaMaxima, nota);
                notaMinima = Math.min(notaMinima, nota);
            }
            lector.close();

            
            int edadMedia = (int) Math.round(sumaEdades / totalEstudiantes);
            double notaMedia = Math.round((sumaNotas / totalEstudiantes) * 100.0) / 100.0;

            System.out.println("Contenido del archivo:");
            for (String[] estudiante : estudiantes) {
                System.out.println(Arrays.toString(estudiante));
            }
            System.out.println("Esta clase tiene " + totalEstudiantes + " estudiantes.");
            System.out.println("Edad media: " + edadMedia);
            System.out.println("Nota media: " + notaMedia);
            System.out.println("Nota máxima: " + notaMaxima);
            System.out.println("Nota mínima: " + notaMinima);

            FileWriter escritorCSV = new FileWriter(rutaArchivo, true);
            escritorCSV.write("\n---\n");
            escritorCSV.write("Número de estudiantes: " + totalEstudiantes + "\n");
            escritorCSV.write("Edad media: " + edadMedia + "\n");
            escritorCSV.write("Nota media: " + notaMedia + "\n");
            escritorCSV.close();
            
            FileWriter escritorInforme = new FileWriter("informe-clase.txt");
            escritorInforme.write("Número de estudiantes: " + totalEstudiantes + "\n");
            escritorInforme.write("Edad media: " + edadMedia + "\n");
            escritorInforme.write("Nota media: " + notaMedia + "\n");
            escritorInforme.write("Nota máxima: " + notaMaxima + "\n");
            escritorInforme.write("Nota mínima: " + notaMinima + "\n");
            escritorInforme.close();

            System.out.println("Resultados escritos en 'lista_alumnos.csv' y 'informe-clase.txt'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}
