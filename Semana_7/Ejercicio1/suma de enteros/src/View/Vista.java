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
        String opcion;
        do {
            System.out.println();
            System.out.println("Menú:");
            System.out.println("1. Leer los números");
            System.out.println("2. Calcular la suma");
            System.out.println("3. Mostrar el resultado");
            System.out.println("q. Salir");
            opcion = sc.nextLine();
            
            switch (opcion) {
                case "1": leerNumero(); break;
                case "2": calcularSuma(); break;
                case "3": mostrarResultado(); break;
                case "q": System.out.println("Saliendo... Gracias por usar"); break;
                default: System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("q"));
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

    
}
 

