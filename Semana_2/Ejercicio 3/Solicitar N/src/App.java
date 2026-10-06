import es.usal.progiii.tools.Esdia;

public class App {

    public static void main(String[] args) {

        int n;

        do {
            n = Esdia.readInt("Introduce un número entero mayor que 0: ");

            if (n <= 0) {
                System.err.println("Error: el número debe ser mayor que 0.");
            }

        } while (n <= 0);

        float suma = 0;

        for (int i = 0; i < n; i++) {
            float numero = Esdia.readFloat("Introduce un número decimal: ");
            suma += numero;
        }

        float media = suma / n;

        System.out.println("La media es: " + media);
    }
}