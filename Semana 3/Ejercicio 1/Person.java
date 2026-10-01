import java.io.Console;

public class Person {

    private String nombre;
    private float altura_en_cm;
    private float peso_en_kg;

    public Person(String nombre, float altura_en_cm, float peso_en_kg) {
        this.nombre = nombre;
        this.altura_en_cm = altura_en_cm;
        this.peso_en_kg = peso_en_kg;
    }

    // Getters and Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura_en_cm() {
        return this.altura_en_cm;
    }

    public void setAltura_en_cm(float altura_en_cm) {
        this.altura_en_cm = altura_en_cm;
    }

    public float getPeso_en_kg() {
        return this.peso_en_kg;
    }

    public void setPeso_en_kg(float peso_en_kg) {
        this.peso_en_kg = peso_en_kg;
    }

    public static void main(String[] args) {

        Console console = System.console();

        Person persona1 = new Person("", 0, 0);
        Person persona2 = new Person("", 0, 0);
        Person persona3 = new Person("", 0, 0);

        console.printf("Introduce los datos de la 1ª persona:%n");
        persona1.setNombre(console.readLine("Nombre: "));
        persona1.setAltura_en_cm(Float.parseFloat(console.readLine("Altura: ")));
        persona1.setPeso_en_kg(Float.parseFloat(console.readLine("Peso: ")));

        console.printf("Introduce los datos de la 2ª persona:%n");
        persona2.setNombre(console.readLine("Nombre: "));
        persona2.setAltura_en_cm(Float.parseFloat(console.readLine("Altura: ")));
        persona2.setPeso_en_kg(Float.parseFloat(console.readLine("Peso: ")));

        console.printf("Introduce los datos de la 3ª persona:%n");
        persona3.setNombre(console.readLine("Nombre: "));
        persona3.setAltura_en_cm(Float.parseFloat(console.readLine("Altura: ")));
        persona3.setPeso_en_kg(Float.parseFloat(console.readLine("Peso: ")));

        Person masAlto = persona1;

        if (persona2.getAltura_en_cm() > masAlto.getAltura_en_cm()) {
            masAlto = persona2;
        }

        if (persona3.getAltura_en_cm() > masAlto.getAltura_en_cm()) {
            masAlto = persona3;
        }

        Person masPeso = persona1;

        if (persona2.getPeso_en_kg() > masPeso.getPeso_en_kg()) {
            masPeso = persona2;
        }

        if (persona3.getPeso_en_kg() > masPeso.getPeso_en_kg()) {
            masPeso = persona3;
        }

        System.out.println("La persona más alta es: " + masAlto.getNombre()
                + " con una altura de " + masAlto.getAltura_en_cm() + " cm");

        System.out.println("La persona que más pesa es: " + masPeso.getNombre()
                + " con un peso de " + masPeso.getPeso_en_kg() + " kg");
    }
}