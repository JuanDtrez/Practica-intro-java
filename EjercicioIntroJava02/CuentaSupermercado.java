package EjercicioIntroJava02;
import java.util.ArrayList;

public class CuentaSupermercado {
    private ArrayList <Producto> productos;

    // Constructor de la clase CuentaSupermercado
    public CuentaSupermercado(){
        this.productos = new ArrayList<>();
    }

    // Setter y getter para la lista productos
    public void setProducto(ArrayList<Producto> productos){
        this.productos = productos;
    }

    public ArrayList<Producto> getProducto(){
        return productos;
    }

    // Metodo para agregar productos a la cuenta 
    public void agregarProducto(String nombre,double precioUnitario, int cantidad){
        for (Producto p: productos){
            if(p.getNombre().equals(nombre)){
                p.setCantidad(p.getCantidad() + cantidad);
                return;
            }
        }
        Producto nuevoProducto = new Producto(nombre, precioUnitario, cantidad);
        productos.add(nuevoProducto);
    }
    
    // Metodo para calcular el total de productos
    public double calcularTotal(){
        double total = 0;

        for (Producto p: productos){
            total += p.getprecioUnitario() * p.getCantidad();
        }
        return total;  
    }


    // Método para mostrar el listado de productos y el precio total
    public void mostrarFactura() {
        System.out.println("TICKET\n");
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Producto", "Un.", "PU", "Total");
        System.out.println("-----------------------------------------------");
        for (Producto producto : productos) {
            System.out.printf("%-20s%-10d%-10.2f%-10.2f\n", producto.getNombre(), producto.getCantidad(), producto.getprecioUnitario(), producto.getprecioUnitario() * producto.getCantidad());
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total: %.2f\n", calcularTotal());
    }
}



