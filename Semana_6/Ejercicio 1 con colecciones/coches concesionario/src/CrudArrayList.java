
import static es.usal.progiii.tools.Esdia.*;
import java.util.ArrayList;


public class CrudArrayList {

    private static ArrayList<Coches> coches = new ArrayList<>();

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
        coches.add(new Coches(matricula, marca, velocidad, caballos));
    }

    public static void eliminarCoche() {

        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        Coches cocheAEliminar = null;

        for (Coches coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                cocheAEliminar = coche;
                break;
            }
        }
        if (cocheAEliminar != null) {
            coches.remove(cocheAEliminar);
            System.out.println("Coche eliminado.");
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void modificarCoche() {
        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        Coches cocheAModificar = null;

        for (Coches coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                cocheAModificar = coche;
                break;
            }
        }
        if (cocheAModificar != null) {
            String nuevamatricula = readString_ne("Ingrese la nueva matrícula del coche: ");
            String nuevamarca = readString_ne("Ingrese la nueva marca del coche: ");
            double nuevavelocidad = readDouble("Ingrese la nueva velocidad del coche: ");
            int nuevoscaballos = readInt("Ingrese los nuevos caballos del coche: ");
            
            cocheAModificar.setMatricula(nuevamatricula);
            cocheAModificar.setMarca(nuevamarca);
            cocheAModificar.setVelocidad(nuevavelocidad);
            cocheAModificar.setCaballos(nuevoscaballos);
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void listarCoches() {

        if (coches.isEmpty()) {
            System.out.println("No hay coches en la lista.");
            return;
        }

        for (Coches coche : coches) {
            System.out.println(coche.getEstadoComoString());
        }
    }

}
