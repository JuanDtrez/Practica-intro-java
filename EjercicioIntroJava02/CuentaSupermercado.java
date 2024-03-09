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
}
