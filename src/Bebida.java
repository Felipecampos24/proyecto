 public class Bebida extends Producto {
    public Bebida(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando bebida: " + nombre);
    }

     @Override
     public void agregarServicio() {

     }
 }

