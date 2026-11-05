
import java.io.Console;
import Modelo.Animal;
import Modelo.Cuidador;
import Modelo.Refugio;

public class App {

    private static Console console = System.console();

    private static Refugio refugio = new Refugio();

    public static void main(String[] args) {

        if (console == null) {
            System.err.println("Error: ejecuta el programa desde una terminal.");
            return;
        }

        int opcion;

        do {

            mostrarMenu();

            opcion = leerEntero("Seleccione una opcion (1-7): ");

            switch (opcion) {

                case 1:
                    anadirAnimal();
                    break;

                case 2:
                    mostrarAnimales();
                    break;

                case 3:
                    consultarAnimal();
                    break;

                case 4:
                    modificarAnimal();
                    break;

                case 5:
                    eliminarAnimal();
                    break;

                case 6:
                    configurarPrecio();
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 7);
    }

    // Mostrar menu

    private static void mostrarMenu() {

        System.out.printf("\n");
        System.out.printf("|---------------------------------------------------|\n");
        System.out.printf("|              GESTION DEL REFUGIO                  |\n");
        System.out.printf("|---------------------------------------------------|\n");
        System.out.printf("| 1) Anadir un nuevo animal                         |\n");
        System.out.printf("| 2) Mostrar todos los animales                     |\n");
        System.out.printf("| 3) Consultar un animal                            |\n");
        System.out.printf("| 4) Modificar un animal                            |\n");
        System.out.printf("| 5) Eliminar un animal                             |\n");
        System.out.printf("| 6) Configurar el precio del alimento              |\n");
        System.out.printf("| 7) Salir                                          |\n");
        System.out.printf("|---------------------------------------------------|\n");
    }

    // CREATE: anadir un animal

    private static void anadirAnimal() {

        System.out.println("\n--- AÑADIR NUEVO ANIMAL ---");

        Animal animal = leerDatosAnimal();

        refugio.anadirAnimal(animal);

        System.out.println("Animal anadido correctamente.");
    }

    // READ: mostrar todos los animales

    private static void mostrarAnimales() {

        System.out.println("\n--- ANIMALES DEL REFUGIO ---");

        if (refugio.estaVacio()) {
            System.out.println("No hay animales registrados.");
            return;
        }

        mostrarTabla();
    }

    // READ: consultar un animal concreto

    private static void consultarAnimal() {

        System.out.println("\n--- CONSULTAR ANIMAL ---");

        if (refugio.estaVacio()) {
            System.out.println("No hay animales registrados.");
            return;
        }

        mostrarListaNumerada();

        int numero = leerEntero("Introduzca el numero del animal: ");

        Animal animal = refugio.buscarAnimal(numero - 1);

        if (animal == null) {
            System.out.println("No existe un animal con ese numero.");
        } else {
            mostrarDetalleAnimal(animal);
        }
    }

    // UPDATE: modificar un animal

    private static void modificarAnimal() {

        System.out.println("\n--- MODIFICAR ANIMAL ---");

        if (refugio.estaVacio()) {
            System.out.println("No hay animales registrados.");
            return;
        }

        mostrarListaNumerada();

        int numero = leerEntero("Introduzca el numero del animal: ");

        Animal animalActual = refugio.buscarAnimal(numero - 1);

        if (animalActual == null) {
            System.out.println("No existe un animal con ese numero.");
            return;
        }

        System.out.println("\nIntroduzca los nuevos datos del animal:");

        Animal animalModificado = leerDatosAnimal();

        refugio.modificarAnimal(numero - 1, animalModificado);

        System.out.println("Animal modificado correctamente.");
    }

    // DELETE: eliminar un animal

    private static void eliminarAnimal() {

        System.out.println("\n--- ELIMINAR ANIMAL ---");

        if (refugio.estaVacio()) {
            System.out.println("No hay animales registrados.");
            return;
        }

        mostrarListaNumerada();

        int numero = leerEntero("Introduzca el numero del animal: ");

        Animal animal = refugio.buscarAnimal(numero - 1);

        if (animal == null) {
            System.out.println("No existe un animal con ese numero.");
            return;
        }

        System.out.println("Animal seleccionado: " + animal.getNombre());

        String confirmacion = console.readLine(
            "¿Esta seguro de eliminarlo? (s/n): "
        );

        if (confirmacion.equalsIgnoreCase("s")) {

            refugio.eliminarAnimal(numero - 1);

            System.out.println("Animal eliminado correctamente.");

        } else {

            System.out.println("Operacion cancelada.");
        }
    }

    // Configurar precio del alimento

    private static void configurarPrecio() {

        System.out.println("\n--- PRECIO DEL ALIMENTO ---");

        System.out.printf(
            "Precio actual: %.2f EUR/kg\n",
            refugio.getPrecioAlimento()
        );

        float precio = leerFloatPositivo(
            "Introduzca el nuevo precio por kg: "
        );

        refugio.setPrecioAlimento(precio);

        System.out.println("Precio actualizado correctamente.");
    }

    // Mostrar estadisticas

    private static void mostrarEstadisticas() {

        System.out.println("\n--- ESTADISTICAS DEL REFUGIO ---");

        if (refugio.estaVacio()) {
            System.out.println("No hay animales registrados.");
            return;
        }

        System.out.printf(
            "Numero de animales: %d\n",
            refugio.getNumeroAnimales()
        );

        System.out.printf(
            "Precio del alimento: %.2f EUR/kg\n",
            refugio.getPrecioAlimento()
        );

        System.out.printf(
            "Coste diario total: %.2f EUR\n",
            refugio.calcularCosteTotal()
        );

        System.out.printf(
            "Peso medio: %.2f kg\n",
            refugio.calcularPesoMedio()
        );
    }

    // Solicitar todos los datos de un animal

    private static Animal leerDatosAnimal() {

        String nombre = leerTexto("Nombre del animal: ");

        String especie = leerTexto("Especie: ");

        float peso = leerFloatPositivo("Peso en kg: ");

        float consumo = leerFloatPositivo(
            "Consumo diario de alimento en kg: "
        );

        System.out.println("\nDatos del cuidador:");

        String nombreCuidador = leerTexto("Nombre: ");

        String apellidos = leerTexto("Apellidos: ");

        boolean formacion = leerBooleano(
            "¿Tiene formacion en cuidado animal? (s/n): "
        );

        Cuidador cuidador = new Cuidador(
            nombreCuidador,
            apellidos,
            formacion
        );

        return new Animal(
            cuidador,
            nombre,
            especie,
            peso,
            consumo
        );
    }

    // Mostrar lista numerada de animales

    private static void mostrarListaNumerada() {

        for (int i = 0; i < refugio.getNumeroAnimales(); i++) {

            Animal animal = refugio.buscarAnimal(i);

            System.out.printf(
                "%d) %s (%s)\n",
                i + 1,
                animal.getNombre(),
                animal.getEspecie()
            );
        }
    }

    // Mostrar informacion detallada de un animal

    private static void mostrarDetalleAnimal(Animal animal) {

        System.out.println("------------------------------------------");

        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Especie: " + animal.getEspecie());

        System.out.printf("Peso: %.2f kg\n", animal.getPeso());

        System.out.printf(
            "Consumo diario: %.2f kg\n",
            animal.getConsumoDiario()
        );

        System.out.println(
            "Cuidador: " + animal.getCuidador().getNombreCompleto()
        );

        System.out.println(
            "Formacion: " +
            (animal.getCuidador().tieneFormacion() ? "Si" : "No")
        );

        System.out.printf(
            "Coste diario: %.2f EUR\n",
            animal.calcularCosteDiario(refugio.getPrecioAlimento())
        );

        System.out.println("------------------------------------------");
    }

    // Mostrar tabla de animales

    private static void mostrarTabla() {

        System.out.printf(
            "%-4s | %-12s | %-12s | %-20s | %-9s | %-11s | %-9s\n",
            "Nº", "Nombre", "Especie", "Cuidador",
            "Peso (kg)", "Consumo kg", "Coste EUR"
        );

        System.out.println(
            "-----------------------------------------------------------------------------------------"
        );

        for (int i = 0; i < refugio.getNumeroAnimales(); i++) {

            Animal animal = refugio.buscarAnimal(i);

            System.out.printf(
                "%-4d | %-12s | %-12s | %-20s | %9.2f | %11.2f | %9.2f\n",
                i + 1,
                animal.getNombre(),
                animal.getEspecie(),
                animal.getCuidador().getNombreCompleto(),
                animal.getPeso(),
                animal.getConsumoDiario(),
                animal.calcularCosteDiario(refugio.getPrecioAlimento())
            );
        }

        System.out.println(
            "-----------------------------------------------------------------------------------------"
        );

        System.out.printf(
            "Coste diario total: %.2f EUR\n",
            refugio.calcularCosteTotal()
        );

        System.out.printf(
            "Peso medio: %.2f kg\n",
            refugio.calcularPesoMedio()
        );
    }

    // Leer texto no vacio

    private static String leerTexto(String mensaje) {

        String texto;

        do {

            texto = console.readLine(mensaje);

            if (texto == null || texto.trim().isEmpty()) {
                System.out.println("El campo no puede estar vacio.");
            }

        } while (texto == null || texto.trim().isEmpty());

        return texto.trim();
    }

    // Leer entero

    private static int leerEntero(String mensaje) {

        while (true) {

            try {

                return Integer.parseInt(console.readLine(mensaje).trim());

            } catch (NumberFormatException e) {

                System.out.println("Introduzca un numero entero valido.");
            }
        }
    }

    // Leer float positivo

    private static float leerFloatPositivo(String mensaje) {

        while (true) {

            try {

                String entrada = console.readLine(mensaje).trim();

                float valor = Float.parseFloat(
                    entrada.replace(',', '.')
                );

                if (Float.isFinite(valor) && valor > 0) {
                    return valor;
                }

                System.out.println("El valor debe ser mayor que cero.");

            } catch (NumberFormatException e) {

                System.out.println("Introduzca un numero valido.");
            }
        }
    }

    // Leer respuesta si/no

    private static boolean leerBooleano(String mensaje) {

        while (true) {

            String respuesta = console.readLine(mensaje);

            if (respuesta.equalsIgnoreCase("s")) {
                return true;
            }

            if (respuesta.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Introduzca s o n.");
        }
    }
}
