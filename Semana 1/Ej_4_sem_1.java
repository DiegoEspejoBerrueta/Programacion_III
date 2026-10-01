import java.util.Scanner;

public class Ej_4_sem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");        
        double num2 = sc.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double num3 = sc.nextDouble();

        if(num1 > num2 && num1 > num3) {
            System.out.println("El primer número es el mayor.");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("El segundo número es el mayor.");
        } else if(num3 > num1 && num3 > num2) {
            System.out.println("El tercer número es el mayor.");
        } else if(num1 == num2 && num1 > num3) {
            System.out.println("El primer y segundo número son iguales y mayores que el tercero.");
        } else if(num1 == num3 && num1 > num2) {
            System.out.println("El primer y tercer número son iguales y mayores que el segundo.");
        } else if(num2 == num3 && num2 > num1) {
            System.out.println("El segundo y tercer número son iguales y mayores que el primero.");
        } else {
            System.out.println("Los tres números son iguales.");
        }
        
        sc.close();
    }
}
