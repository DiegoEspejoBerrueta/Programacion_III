
import static es.usal.progiii.tools.Esdia.*;
import java.util.HashSet;


public class CrudHashSet {
    
    private static HashSet<Coches> coches = new HashSet<>();

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
        String matricula = readString_ne("Ingrese la matrícula del coche: ");
        String marca = readString_ne("Ingrese la marca del coche: ");
        double velocidad = readDouble("Ingrese la velocidad del coche: ");
        int caballos = readInt("Ingrese los caballos del coche: ");
        Coches nuevoCoche = new Coches(matricula, marca, velocidad, caballos);
        if (!coches.add(nuevoCoche)) {
            System.out.println("Coche con esa matrícula ya existe.");
        }
    }

    public static void eliminarCoche() {
        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        Coches cocheAEliminar = new Coches(matricula, "seat", 0, 0); 
        if (!coches.remove(cocheAEliminar)) {
            System.out.println("Coche no encontrado.");
        } else {
            System.out.println("Coche eliminado.");
        }
    }

    public static void modificarCoche() {
        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        Coches cocheAModificar = new Coches(matricula, "seat", 0, 0);
        if (!coches.contains(cocheAModificar)) {
            System.out.println("Coche no encontrado.");
            return;
        }

        String nuevamatricula = readString_ne("Ingrese la nueva matrícula del coche: ");
        String nuevamarca = readString_ne("Ingrese la nueva marca del coche: ");
        double nuevavelocidad = readDouble("Ingrese la nueva velocidad del coche: ");
        int nuevoscaballos = readInt("Ingrese los nuevos caballos del coche: ");

        coches.remove(cocheAModificar);
        coches.add(new Coches(nuevamatricula, nuevamarca, nuevavelocidad, nuevoscaballos));
    }

    public static void listarCoches() {

        if (coches.isEmpty()) {
            System.out.println("No hay coches para mostrar.");
            return;
        }

        for (Coches coche : coches) {
            System.out.println(String.format("HashCode:%10d - %s",coches.hashCode(), ((Coches) coche).getEstadoComoString()));
        }
    }
    
}
