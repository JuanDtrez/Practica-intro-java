package EjercicioIntroJava01;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Boletin boletin = new Boletin();

        // Crear algunos alumnos y asignarles asignaturas y notas
        Alumno alumno1 = new Alumno("Juan", "Perez");
        alumno1.agregarAsignatura(new Asignatura("Matemáticas", 8.5));
        alumno1.agregarAsignatura(new Asignatura("Física", 7.8));
        alumno1.agregarAsignatura(new Asignatura("Historia", 9.2));
        alumno1.agregarAsignatura(new Asignatura("Ciencias", 7.8));
        alumno1.agregarAsignatura(new Asignatura("Literatura", 6.9));
        alumno1.agregarAsignatura(new Asignatura("Física", 9.1));

        Alumno alumno2 = new Alumno("María", "Gomez");
        alumno2.agregarAsignatura(new Asignatura("Lengua", 7.0));
        alumno2.agregarAsignatura(new Asignatura("Química", 8.3));
        alumno2.agregarAsignatura(new Asignatura("Geografía", 6.5));
        alumno2.agregarAsignatura(new Asignatura("Economía", 8.7));
        alumno2.agregarAsignatura(new Asignatura("Informática", 9.4));
        alumno2.agregarAsignatura(new Asignatura("Educación Física", 8.0));
        alumno2.agregarAsignatura(new Asignatura("Historia del Arte", 7.6));
        alumno2.agregarAsignatura(new Asignatura("Programación", 9.3));
        alumno2.agregarAsignatura(new Asignatura("Dibujo Técnico", 8.8));

        // Agregar los alumnos al boletín
        boletin.agregarAlumno(alumno1);
        boletin.agregarAlumno(alumno2);

        // Imprimir el boletín de notas
        boletin.imprimirBoletin();        
    }
    
}
