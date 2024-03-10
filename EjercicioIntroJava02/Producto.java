package EjercicioIntroJava02;

public class Producto {
    // Clase que define el formato de un producto
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    // Constructor de la clase producto
    public Producto (String nombre, double precioUnitario, int cantidad){
        this.nombre = nombre;
        this.precioUnitario =precioUnitario;
        this.cantidad = cantidad;
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

    public double getprecioUnitario(){
        return precioUnitario;
    }

    // Setter y getter para la variable Cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
