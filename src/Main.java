
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sushi sushi1 = new Sushi("fauno roll", 29000);
        Sushi sushi2 = new Sushi("philadelphia", 28000);
        Sushi sushi3 = new Sushi("acevichado", 25000);
        Sushi sushi4 = new Sushi("zeus", 34000);
        Sushi sushi5 = new Sushi("sweet roll", 34000);
        Sushi sushi6 = new Sushi("ojo de satiro", 28000);
        Sushi sushi7 = new Sushi("", 0.000);


        Bebida bebida1 = new Bebida("hatsu", 6000);
        Bebida bebida2 = new Bebida("Sake", 15000);
        Bebida bebida3 = new Bebida("coronita", 6000);
        Bebida bebida4 = new Bebida("agua", 5000);
        Bebida bebida5 = new Bebida("coca cola", 6000);

        System.out.println("------------------------------------------");


        Producto[] productos = {sushi1, sushi2, sushi3, sushi4, sushi5, sushi6, bebida1, bebida2, bebida3, bebida4, bebida5};


        Mesa[] mesas = new Mesa[10];
        for (int i = 0; i < 10; i++) {
            mesas[i] = new Mesa(i + 1);
        }


        System.out.println("Ingrese el número de la mesa:");
        int numeroMesa = scanner.nextInt();
        Factura factura = new Factura(numeroMesa);


        String opcion;
        do {
            System.out.println("Seleccione un producto por su número:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println("--------------");
                System.out.println((i + 1) + ". " + productos[i].getNombre() + " - $" + productos[i].getPrecio());
            }
            System.out.println("seleccione productos");

            int seleccion = scanner.nextInt();
            factura.agregarProducto(productos[seleccion - 1]);

            System.out.println("¿Desea agregar otro producto? (si / no)");
            System.out.println("-------------");
            opcion = scanner.next();
            System.out.println("-------------");


        } while (opcion.equalsIgnoreCase("si"));

        System.out.println("desea agregar servicio? (si / no)");
        String opc;
        opc = scanner.next();
        factura.mostrarFactura();
        if (opc.equalsIgnoreCase("si"))

            factura.agregarServicio();

        else
            System.out.println("Gracias por tu compra.");

    }

}
