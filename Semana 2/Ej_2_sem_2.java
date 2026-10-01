import java.io.Console;

public class Ej_2_sem_2 {
    public static void main(String[] args) {
        Console consola = System.console();

        String nacimiento = consola.readLine("Introduce tu año de nacimiento: ");
        String actual = consola.readLine("Introduce el año actual: ");

        int añoNacimiento = Integer.parseInt(nacimiento);
        int añoActual = Integer.parseInt(actual);

        int edad = añoActual - añoNacimiento;

        System.out.printf("Tu edad es: %d años.%n", edad);
    }
}
