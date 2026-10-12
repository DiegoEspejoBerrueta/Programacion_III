public class Producto {
    // Atributos
    private String nombre;
    private double precio_kg;

    // Constructores
    public Producto(String nombre, double precioManzanas) {
        this.nombre = nombre;
        this.precio_kg = precioManzanas;
    }

    // Getters and Setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public double getPrecio_kg(){
        return this.precio_kg;
    }
    public void setPrecio_kg (double precio_kg){
        this.precio_kg = precio_kg;
    }

    public double getPrecio_iva(double iva){
        return precio_kg * (1 + iva);
    }
}
