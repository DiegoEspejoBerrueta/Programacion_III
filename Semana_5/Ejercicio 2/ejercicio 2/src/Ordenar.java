import java.io.Console;
import java.util.Arrays;

public class Ordenar {
    static String[] cadena = new String[5];
    public static void main(String[] args) throws Exception {
        Console consola = System.console();
        for (int i = 0; i < cadena.length ; i++){
            cadena[i] = consola.readLine("Introduce una palabra: ");
        }
        
    Arrays.sort(cadena);
    System.out.printf("Las 5 fucking palabras son: %s%n", Arrays.toString(cadena));
    }
}
