package EjercicioIntroJava02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("------------------------------------");
        System.out.println("| BIENVENIDO AL SISTEMA DE COMPRAS |");
        System.out.println("------------------------------------");
        
        System.out.print("Introduce el numero de productos:");
        int nProductos = Integer.parseInt(input.nextLine());
        System.out.println("");
        
        CuentaSupermercado cuenta = new CuentaSupermercado();

        int cont = 0;
        String respuesta = "";
        while(!respuesta.equalsIgnoreCase("n")){
            while (cont < nProductos){
                System.out.print("Introduce el nombre del producto: ");
                String nombre = input.nextLine();
                System.out.print("Introduce el precio unitario del producto: ");
                double precioUnitario = Double.parseDouble(input.nextLine());
                System.out.print("Introduce la cantidad: ");
                int cantidad = Integer.parseInt(input.nextLine());
                System.out.println("");
                cuenta.agregarProducto(nombre, precioUnitario, cantidad);
                cont++;
            } 
            System.out.println("¿Hay otro producto? (s/n)");
            respuesta = input.nextLine();
            cont = 0;
        }
        cuenta.mostrarFactura();
        input.close();
    }
}

    

