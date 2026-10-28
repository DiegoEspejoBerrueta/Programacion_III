

import static es.usal.progiii.tools.Esdia.*;

public class CrudArrays {
    
    private static final int MAX_SIZE = 5;
    private static Coches[] coches = new Coches[MAX_SIZE];
    private static int cochesCount = 0;

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
        if (cochesCount < MAX_SIZE) {
            String matricula = readString_ne("Ingrese la matrícula del coche: ");
            String marca = readString_ne("Ingrese la marca del coche: ");
            double velocidad = readDouble("Ingrese la velocidad del coche: ");
            int caballos = readInt("Ingrese los caballos del coche: ");
            coches[cochesCount++] = new Coches(matricula, marca, velocidad, caballos);
            System.out.println("Coche añadido correctamente.");
        } else {
            System.out.println("La lista de coches está llena.");
        }
    }

    public static void eliminarCoche() {
        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        boolean encontrado = false;
        for (int i = 0; i < cochesCount; i++) {
            if (coches[i].getMatricula().equals(matricula)) {
                encontrado = true;
                for (int j = i; j < cochesCount - 1; j++) {
                    coches[j] = coches[j + 1];
                }
                cochesCount--;

                System.out.println("Coche eliminado correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void modificarCoche() {

        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        boolean encontrado = false;
        for (int i = 0; i < cochesCount; i++) {
            if (coches[i].getMatricula().equals(matricula)) {
                String nuevaMatricula = readString_ne("Ingrese la nueva matrícula: ");
                String nuevaMarca = readString_ne("Ingrese la nueva marca: ");
                double nuevaVelocidad = readDouble("Ingrese la nueva velocidad: ");
                int nuevosCaballos = readInt("Ingrese los nuevos caballos: ");
                
                coches[i].setMatricula(nuevaMatricula);
                coches[i].setMarca(nuevaMarca);
                coches[i].setVelocidad(nuevaVelocidad);
                coches[i].setCaballos(nuevosCaballos);

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrada.");
        }
    }

    public static void listarCoches() {

        if (cochesCount == 0) {
            System.out.println("No hay coches en la lista.");
            return;
        }

        for (int i = 0; i < cochesCount; i++) {
            System.out.println(coches[i].getEstadoComoString());
        }
    }
    
}
