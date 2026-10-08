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

        while (persona1.getAltura_en_cm() <= 0) {
            System.err.println("La altura de la 1ª persona debe ser mayor que 0");
            persona1.setAltura_en_cm(Float.parseFloat(console.readLine("Altura: ")));
        }
        while (persona1.getPeso_en_kg() <= 0) {
            System.err.println("El peso de la 1ª persona debe ser mayor que 0");
            persona1.setPeso_en_kg(Float.parseFloat(console.readLine("Peso: ")));
        }

        while (persona2.getAltura_en_cm() <= 0) {
            System.err.println("La altura de la 2ª persona debe ser mayor que 0");
            persona2.setAltura_en_cm(Float.parseFloat(console.readLine("Altura: ")));
        }
        while (persona2.getPeso_en_kg() <= 0) {
            System.err.println("El peso de la 2ª persona debe ser mayor que 0");
            persona2.setPeso_en_kg(Float.parseFloat(console.readLine("Peso: ")));
        }

        while (persona3.getAltura_en_cm() <= 0) {
            System.err.println("La altura de la 3ª persona debe ser mayor que 0");
            persona3.setAltura_en_cm(Float.parseFloat(console.readLine("Altura: ")));
        }
        while (persona3.getPeso_en_kg() <= 0) {
            System.err.println("El peso de la 3ª persona debe ser mayor que 0");
            persona3.setPeso_en_kg(Float.parseFloat(console.readLine("Peso: ")));
        }

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


        float imc1 = persona1.getPeso_en_kg() / (float) Math.pow(persona1.getAltura_en_cm() / 100.0, 2);
        float imc2 = persona2.getPeso_en_kg() / (float) Math.pow(persona2.getAltura_en_cm() / 100.0, 2);
        float imc3 = persona3.getPeso_en_kg() / (float) Math.pow(persona3.getAltura_en_cm() / 100.0, 2);
        
        System.out.println("El IMC de la 1ª persona es: " + imc1);
        System.out.println("El IMC de la 2ª persona es: " + imc2);
        System.out.println("El IMC de la 3ª persona es: " + imc3);
    }
}
