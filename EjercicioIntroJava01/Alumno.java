package EjercicioIntroJava01;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> asignaturas;
    
    // Cosntructor de la clase alumno
    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignaturas = new ArrayList<>();
    }
    
    // Setter y getter para la variable nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    // Setter y getter para la variable apellido
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    // Setter y getter para la variable asignatura
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }

    public double calcularNotaTotal(){

        double sumaNotas = 0;

        for (Asignatura asignatura : asignaturas){
            sumaNotas += asignatura.getNota();
        }
        return (asignaturas.size() > 0) ? sumaNotas / asignaturas.size() : 0;
    }

}  
    

