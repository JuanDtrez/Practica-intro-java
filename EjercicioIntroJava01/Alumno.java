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
    public void Setnombre(String nombre){
        this.nombre = nombre;
    }

    public String Getnombre(){
        return nombre;
    }

    // Setter y getter para la variable apellido
    public void Setapellido(String apellido){
        this.apellido = apellido;
    }

    public String Getapellido(){
        return apellido;
    }

    // Setter y getter para la variable asignatura
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    
}  
    

