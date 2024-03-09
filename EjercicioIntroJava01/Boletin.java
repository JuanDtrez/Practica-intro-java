package EjercicioIntroJava01;

import java.util.ArrayList;

public class Boletin {
    private ArrayList<Alumno> alumnos;

    public Boletin(){
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }

    
    public void imprimirBoletin(){
        for (Alumno alumno : alumnos){
            System.out.println("");
            System.out.println("Alumno: " + alumno.getNombre() +" "+ alumno.getApellido());
            System.out.println("");
            System.out.printf("Asignatura                                   Nota");
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
