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
    public void Setnombre(String nombre){
        this.nombre = nombre;
    }

    public String Getnombre(){
        return nombre;
    }

    //Setter y getter para la variable nota
    public void Setnota(double nota){
        this.nota = nota;
    }

    public double Getnota(){
        return nota;
    }
    
}






