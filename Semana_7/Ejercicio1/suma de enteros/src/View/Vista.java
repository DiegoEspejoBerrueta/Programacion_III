package View;
import Controller.Controlador;
import java.util.Scanner;

public class Vista {
    Controlador controlador;
    Scanner sc = new Scanner(System.in);

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }

    public void mostrarMenu(){
        System.out.println();
        System.out.println("Menú:");
        System.out.println("1. Leer los números");
        System.out.println("2. Calcular la suma");
        System.out.println("3. Mostrar el resultado");
        System.out.println("q. Salir");
    }

    public String opcion(){
        mostrarMenu();
        System.out.print("Seleccione una opción: ");
        return sc.nextLine();
    }

    public void leerNumero(){
        System.out.println("Introduzca dos números enteros: ");
        controlador.leerNumero(sc.nextInt(), sc.nextInt());
    }


    public void calcularSuma(){
        controlador.calcularSuma();
        System.out.println("Suma calculada correctamente.");
    }

    public void mostrarResultado(){
        System.out.println("La suma es: " + controlador.mostrarResultado());
    }

    public void salir(){
        System.out.println("Saliendo...");
        System.out.println("Listo. Gracias por usar.");
    }
}
 

