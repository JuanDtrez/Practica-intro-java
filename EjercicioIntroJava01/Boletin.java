package EjercicioIntroJava01;
import java.util.ArrayList;
// Clase que gestiona el formato y la imprenta del boletin
public class Boletin {
    private ArrayList<Alumno> alumnos;

    // Constructor de la clase boletin
    public Boletin(){
        this.alumnos = new ArrayList<>();
    }
    // Metodo para agregar alumnos
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    // Metodo para eliminar alumnos
    public void eliminarAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }

    // Metodo para imprimir el boletin
    public void imprimirBoletin(){
        for (Alumno alumno : alumnos){
            System.out.println("");
            System.out.println("Alumno: " + alumno.getNombre() +" "+ alumno.getApellido());
            System.out.println();
            System.out.printf("Asignatura %38s", "Nota");
            System.out.println();
            System.out.println("-------------------------------------------------");
            for (Asignatura asignatura : alumno.getAsignaturas()){
                System.out.printf("%-30s %18.2f\n",asignatura.getNombre(),asignatura.getNota());
            }
            System.out.println("-------------------------------------------------");
            System.out.printf("Notas Media: %36.2f\n", alumno.calcularNotaTotal());
        }
    }
}
