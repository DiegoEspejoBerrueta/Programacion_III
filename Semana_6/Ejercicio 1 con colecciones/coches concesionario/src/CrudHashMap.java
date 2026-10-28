
import static es.usal.progiii.tools.Esdia.*;
import java.util.HashMap;
import java.util.Map;

public class CrudHashMap {

    private static HashMap<String, Coches> coches = new HashMap<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Modificar coche");
            System.out.println("4. Listar coches");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");
            
            switch (opcion) {
                case 1: agregarCoche(); break;
                case 2: eliminarCoche(); break;
                case 3: modificarCoche(); break;
                case 4: listarCoches(); break;
                case 5: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void agregarCoche() {
        String codigo = readString("Ingrese el código del coche: ");
        String matricula = readString_ne("Ingrese la matrícula del coche: ");
        String marca = readString_ne("Ingrese la marca del coche: ");
        double velocidad = readDouble("Ingrese la velocidad del coche: ");
        int caballos = readInt("Ingrese los caballos del coche: ");
        coches.put(codigo, new Coches(matricula, marca, velocidad, caballos));
    }

    public static void eliminarCoche() {
        String codigo = readString_ne("Ingrese el código del coche a eliminar: ");
        if (coches.containsKey(codigo)) {
            coches.remove(codigo);
            System.out.println("Coche eliminado.");
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void modificarCoche() {
        String codigo = readString_ne("Ingrese el código del coche a eliminar: ");
        if (coches.containsKey(codigo)) {

            String nuevamatricula = readString_ne("Ingrese la nueva matrícula del coche: ");
            String nuevamarca = readString_ne("Ingrese la nueva marca del coche: ");
            double nuevavelocidad = readDouble("Ingrese la nueva velocidad del coche: ");
            int nuevoscaballos = readInt("Ingrese los nuevos caballos del coche: ");

            Coches cocheModificado = new Coches(nuevamatricula, nuevamarca, nuevavelocidad, nuevoscaballos);
            coches.put(codigo, cocheModificado);

        } else {
            System.out.println("Coche no encontrado.");
        }
    }
    

    public static void listarCoches() {
        if (coches.isEmpty()) {
            System.out.println("No hay coches en la lista.");
            return;
        }

        for (Map.Entry<String, Coches> entry : coches.entrySet()) {
            String codigo = entry.getKey();
            Coches value = entry.getValue();
            System.out.println(String.format("Código:%9s - %s",codigo,value.getEstadoComoString()));
        }
    }

}

