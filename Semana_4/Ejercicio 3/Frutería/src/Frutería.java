import java.io.Console;


public class Frutería {
    public static void main(String[] args) {
        Console consola = System.console();
        final double iva =  0.04;

        if (consola == null) {
            System.out.println("Ejecuta el programa desde la terminal.");
            return;
        }

        double precioManzanas = Double.parseDouble(
            consola.readLine("Precio/kg de manzanas sin IVA: ")
        );

        double precioPeras = Double.parseDouble(
            consola.readLine("Precio/kg de peras sin IVA: ")
        );
        
        // Array de objetos Producto
        Producto[] productos = {
            new Producto("Manzanas", precioManzanas),
            new Producto("Peras", precioPeras)
        };

        int cliente = 1;
        String continuar;

        do {
            consola.printf("%n=== FACTURA DEL CLIENTE %d ===%n", cliente);

            double[] cantidades = new double[productos.length];

            for (int i = 0; i < productos.length; i++) {
                cantidades[i] = Double.parseDouble(
                    consola.readLine(
                        "Kg de " + productos[i].getNombre() + ": "
                    )
                );
            }

            // Mostrar la factura
            consola.printf("%n--------------------------------------------------------------%n");
            consola.printf("%-12s | %10s | %18s | %12s%n",
                "Producto", "Cantidad", "Precio con IVA/kg", "Total");
            consola.printf("--------------------------------------------------------------%n");

            double totalFactura = 0;

            for (int i = 0; i < productos.length; i++) {

                double precio_iva = productos[i].getPrecio_iva(iva);
                double totalProducto = cantidades[i] * precio_iva;

                totalFactura += totalProducto;

                consola.printf(
                    "%10s | %10.2f kg | %20f euros | %9.2f euros%n",
                    productos[i].getNombre(),
                    cantidades[i],
                    precio_iva,
                    totalProducto
                );
            }

            consola.printf("--------------------------------------------------------------%n");
            consola.printf("Total con IVA: %.2f €%n", totalFactura);
            consola.printf("--------------------------------------------------------------%n");

            continuar = consola.readLine(
                "%n¿Desea atender a otro cliente? (Si o No): "
            );

            if (continuar.equalsIgnoreCase("Si")) {
                cliente++;
            }

        } while (continuar.equalsIgnoreCase("Si"));

        consola.printf("%nJornada finalizada.%n");
        consola.printf("Número de clientes atendidos: %d%n", cliente);
    }
}

