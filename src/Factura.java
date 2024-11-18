import java.util.ArrayList;
import java.util.List;

public class Factura implements Propina{
    private int numeroMesa;
    private List<Producto> productos;
    private double total;

    public Factura(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public void mostrarFactura() {
        System.out.println("Factura para Mesa " + numeroMesa);
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println("Total: $" + total);
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void agregarServicio() {
        double propina = total * 0.10;
        double totalConServicio = total + propina;
        System.out.println("El total con el servicio es: " + totalConServicio);
    }
}

