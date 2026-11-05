
package Modelo;

import java.util.ArrayList;

public class Refugio {

    private ArrayList<Animal> animales;
    private float precioAlimento;

    public Refugio() {
        animales = new ArrayList<>();
        precioAlimento = 3.0f;
    }

    // CREATE: añadir un animal

    public void anadirAnimal(Animal animal) {
        animales.add(animal);
    }

    // READ: obtener todos los animales

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    // READ: consultar un animal por su posición

    public Animal buscarAnimal(int posicion) {

        if (posicion >= 0 && posicion < animales.size()) {
            return animales.get(posicion);
        }

        return null;
    }

    // UPDATE: modificar un animal

    public boolean modificarAnimal(int posicion, Animal animal) {

        if (posicion >= 0 && posicion < animales.size()) {
            animales.set(posicion, animal);
            return true;
        }

        return false;
    }

    // DELETE: eliminar un animal

    public boolean eliminarAnimal(int posicion) {

        if (posicion >= 0 && posicion < animales.size()) {
            animales.remove(posicion);
            return true;
        }

        return false;
    }

    // Configurar el precio del alimento

    public void setPrecioAlimento(float precioAlimento) {

        if (precioAlimento > 0) {
            this.precioAlimento = precioAlimento;
        }
    }

    public float getPrecioAlimento() {
        return precioAlimento;
    }

    // Calcular el coste diario total

    public float calcularCosteTotal() {

        float total = 0;

        for (Animal animal : animales) {
            total += animal.calcularCosteDiario(precioAlimento);
        }

        return total;
    }

    // Calcular el peso medio

    public float calcularPesoMedio() {

        if (animales.isEmpty()) {
            return 0;
        }

        float suma = 0;

        for (Animal animal : animales) {
            suma += animal.getPeso();
        }

        return suma / animales.size();
    }

    // Comprobar si el refugio está vacío

    public boolean estaVacio() {
        return animales.isEmpty();
    }

    // Obtener el número de animales

    public int getNumeroAnimales() {
        return animales.size();
    }
}
