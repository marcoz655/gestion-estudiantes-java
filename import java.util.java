
import java.util.Locale;

/**
 * Clase Estudiante
 * Representa a un estudiante con sus datos personales y calificaciones.
 */
public class Estudiante {
    // ---------------- ATRIBUTOS ----------------
    private String nombre;       // Nombre completo del estudiante
    private int matricula;       // Número de identificación escolar
    private double nota1;        // Primera calificación
    private double nota2;        // Segunda calificación
    private double nota3;        // Tercera calificación

    // ---------------- CONSTRUCTORES ----------------
    /**
     * Constructor con parámetros
     * Inicializa todos los atributos al crear un objeto Estudiante
     * @param nombre Nombre del estudiante
     * @param matricula Número de matrícula
     * @param nota1 Calificación 1
     * @param nota2 Calificación 2
     * @param nota3 Calificación 3
     */
    public Estudiante(String nombre, int matricula, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // ---------------- MÉTODOS ----------------
    /**
     * Calcula el promedio de las tres calificaciones
     * @return Promedio aritmético
     */
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    /**
     * Determina si el estudiante aprueba
     * Se aprueba con promedio mayor o igual a 6.0
     * @return true si aprueba, false si reprueba
     */
    public boolean aprobo() {
        return calcularPromedio() >= 6.0;
    }

    /**
     * Muestra todos los datos del estudiante en consola
     */
    public void mostrarDatos() {
        System.out.println("==============================");
        System.out.println("Nombre:    " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.printf(Locale.US, "Promedio:  %.2f%n", calcularPromedio());
        System.out.println("Estado:    " + (aprobo() ? "✅ APROBADO" : "❌ REPROBADO"));
    }

    // Métodos GETTER y SETTER (buena práctica de encapsulamiento)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }
}

/**
 * Clase Principal (punto de entrada del programa)
 * Crea objetos Estudiante, llama a sus métodos y muestra resultados
 */
class SistemaGestion {
    public static void main(String[] args) {
        // Creación (instanciación) de objetos usando el constructor
        Estudiante estudiante1 = new Estudiante("Ana García", 12345, 8.5, 9.0, 7.8);
        Estudiante estudiante2 = new Estudiante("Luis Pérez", 12346, 5.0, 4.5, 6.0);
        Estudiante estudiante3 = new Estudiante("Sofía Ruiz", 12347, 9.2, 8.8, 9.5);

        // Uso de métodos: mostrar información de cada estudiante
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
        estudiante3.mostrarDatos();

        // Ejemplo de uso de un método individual
        System.out.println("\n=== RESUMEN ===");
        System.out.println(estudiante1.getNombre() + " — Promedio: " + String.format(Locale.US, "%.2f", estudiante1.calcularPromedio()));
        System.out.println(estudiante2.getNombre() + " — " + (estudiante2.aprobo() ? "Sí aprueba" : "No aprueba"));
    }
}