public class Argumentos {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Error: debes introducir exactamente dos numeros.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double suma = num1 + num2;
            System.out.println("La suma es: " + suma);

        } catch (NumberFormatException e) {
            System.out.println("Error: los dos argumentos deben ser numeros validos.");
        }
    }
} 
