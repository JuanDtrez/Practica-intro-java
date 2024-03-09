package EjercicioIntroJava02;

public class Producto {
    // Clase que define el formato de un producto
    private String nombre;
    private double precioUnitario;

    // Constructor de la clase producto
    public Producto (String nombre, int precioUnitario){
        this.nombre = nombre;
        this.precioUnitario =precioUnitario;
    }

    // Setter y getter para la variable nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    // Setter y getter para la variable precioUnitario
    public void setprecioUnitario(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public double getNota(){
        return precioUnitario;
    }



}
