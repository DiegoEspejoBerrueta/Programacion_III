package vista;
import controlador.Controlador;
import java.io.console;

public class Vista {
    Controlador controlador;
    private Console consola = System.console();

    public void mostrarMenu(){
        String opcion;
        do {
            System.out.println();
            System.out.println("Menú:");
            System.out.println("1.- Leer tabla de ventas");
            System.out.println("2.- Leer tabla de precios");
            System.out.println("3.- Calcular ingresos totales");
            System.out.println("4.- Mostrar resultados");
            System.out.println("q. Salir");
            opcion = consola.readLine();
            
            switch (opcion) {
                case "1": leerVentas(); break;
                case "2": leerPrecios(); break;
                case "3": calcularIngresosTotales(); break;
                case "4": mostrarResultado(); break;
                case "q": System.out.println("Saliendo... Gracias por usar"); break;
                default: System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("q"));
    }
 
    
    //Leer la tabla de ventas
    public void leerVentas(){
        int[][] ventas = new int[5][2];
        System.out.println("\nIntroduce las ventas: ");
        for(int i=0; i<5; i++){
            System.out.println("Almacén " + (i+1));
            for(int j=0; j<2; j++){
                int valor;
                System.out.println(
                    "Producto " + (j+1) + ": "
                );
                valor = Integer.parseInt(consola.readLine());
                ventas[i][j] = valor;
            }
        }
        System.out.println("Ventas leídas correctamente")
    }


    //Leer la tabla de precios
    public void leerPrecios(){
        double[] precios = new double[2];
        System.out.println("\nIntroduce los precios de los productos: ");
        for(int i=0; i<2; i++){
            double valor;
            System.out.println(
                "Precio del producto " + (j+1) + ": "
            );
            String entrada = consola.readLine().replace(',', '.');
            valor = Double.parseDouble(entrada);
            precios[i] = valor;
            
        }
        System.out.println("Precios leídos correctamente")
    }

}
