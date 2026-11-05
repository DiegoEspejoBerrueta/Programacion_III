
package Modelo;

public class Animal {

    private Cuidador cuidador;
    private String nombre;
    private String especie;
    private float peso;
    private float consumoDiario;

    public Animal(Cuidador cuidador, String nombre, String especie,
                  float peso, float consumoDiario) {

        this.cuidador = cuidador;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.consumoDiario = consumoDiario;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public float getPeso() {
        return peso;
    }

    public float getConsumoDiario() {
        return consumoDiario;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setConsumoDiario(float consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public float calcularCosteDiario(float precioKg) {
        return consumoDiario * precioKg;
    }
}