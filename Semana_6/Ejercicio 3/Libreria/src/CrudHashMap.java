
import static es.usal.progiii.tools.Esdia.*;
import java.util.HashMap;
import java.util.Map;

public class CrudHashMap {

    private static HashMap<String, Libro> libros = new HashMap<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Modificar libro");
            System.out.println("4. Listar libro");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");
            
            switch (opcion) {
                case 1: agregarLibro(); break;
                case 2: eliminarLibro(); break;
                case 3: modificarLibro(); break;
                case 4: listarLibro(); break;
                case 5: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void agregarLibro() {
        String codigoISBN = readString("Ingrese el código ISBN del libro: ");
        String nombre = readString_ne("Ingrese el nombre del libro: ");
        String genero = readString_ne("Ingrese el género del libro: ");
        int n_paginas = readInt("Ingrese el número de páginas del libro: ");
        double precio = readDouble("Ingrese el precio del libro: ");
        libros.put(codigoISBN, new Libro(nombre, genero, n_paginas, precio));
    }

    public static void eliminarLibro() {
        String codigoISBN = readString("Ingrese el código ISBN del libro: ");
        if (libros.containsKey(codigoISBN)) {
            libros.remove(codigoISBN);
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void modificarLibro() {
        String codigoISBN = readString("Ingrese el código ISBN del libro: ");
        if (libros.containsKey(codigoISBN)) {

            String nuevonombre = readString_ne("Ingrese el nuevo nombre del libro: ");
            String nuevogenero = readString_ne("Ingrese el nuevo género del libro: ");
            int nuevon_paginas = readInt("Ingrese el nuevo número de páginas del libro: ");
            double nuevoprecio = readDouble("Ingrese el nuevo precio del libro: ");

            Libro libroModificado = new Libro(nuevonombre, nuevogenero, nuevon_paginas, nuevoprecio);
            libros.put(codigoISBN, libroModificado);

        } else {
            System.out.println("Libro no encontrado.");
        }
    }
    

    public static void listarLibro() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Map.Entry<String, Libro> entry : libros.entrySet()) {
            String codigoISBN = entry.getKey();
            Libro value = entry.getValue();
            System.out.println(String.format("Código:%9s - %s",codigoISBN,value.getEstadoComoString()));
        }
    }

}

