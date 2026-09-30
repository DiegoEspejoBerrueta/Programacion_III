import java.util.Scanner;

public class Ej_1_sem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        System.out.print("Ingrese el año actual: ");
        int añoActual = scanner.nextInt();

        int edad = añoActual - añoNacimiento;

        System.out.println("Tu edad es: " + edad + " años.");

        scanner.close();
    }
}
