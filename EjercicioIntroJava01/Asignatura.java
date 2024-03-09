package EjercicioIntroJava01;

public class Asignatura {
    private String nombre;
    private double nota;

    //Cosntructor de la clase asignatura
    public Asignatura (String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    //Setter y getter para la variable nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    //Setter y getter para la variable nota
    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }
    
    
    
}






