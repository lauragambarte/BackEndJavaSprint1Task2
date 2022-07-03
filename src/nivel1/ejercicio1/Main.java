package nivel1.ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Venta venta1 = new Venta(new ArrayList<>());
        //you need to know which type of collection to send. In this case a collection(type arraylist) of productos
        try {
            venta1.calcularTotal();
        } catch (VentaBuidaException e) {
            System.out.println(e.getMessage());
        }

        Producto producto1 = new Producto("Macbook", 1300);
        Producto producto2 = new Producto("Dell", 1000);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        //adding a producto1 to the arraylist productos
        productos.add(producto2);
        try {
            for (int i = 0; i <= productos.size(); i++) {

                System.out.println(productos.get(i).getName());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El indice indicado es mayor que el tamaño de la lista");
        }



    }
}