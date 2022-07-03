package nivel1.ejercicio1;

import java.util.Collection;

public class Venta {
    //ATRIBUTOS
    private Collection<Producto> productos;
            //variable productos is of type Collection of class Producto
    private float totalSalePrice;
//CONSTRUCTOR
    public Venta(Collection<Producto> productos) {
        this.productos = productos;
        //atributo de venta points to the same collection as the parameter productos(like conjunto)
        this.totalSalePrice=0;
        //we dont have a parameter for totalsaleprice, and also don't want a parameter.
    }

    public void calcularTotal() throws VentaBuidaException {
        float sum = 0;
        if (productos.isEmpty()){
         throw new VentaBuidaException("Para hacer una venta debes añadir productos");
         //creating an object of type ventabuidaexception
        }
        //i dont need "else" because if i get to the exception i wont get to the for each.
        for (Producto producto:productos)
              {
            sum+=producto.getPrice();
        }
        totalSalePrice=sum;

    }
}

