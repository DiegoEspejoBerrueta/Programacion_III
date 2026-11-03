package View;
import Controller.Controlador;
import java.util.Scanner;

public class Vista {
    
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println();
        System.out.println("Menú:");
        System.out.println("1. Leer los números");
        System.out.println("2. Calcular la suma");
        System.out.println("3. Mostrar el resultado");
        System.out.println("q. Salir");
        System.out.print("Seleccione una opción: ");
    }

}
