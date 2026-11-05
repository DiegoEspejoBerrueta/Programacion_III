
package Modelo;

public class Cuidador {

    private String nombre;
    private String apellidos;
    private boolean formacion;

    public Cuidador(String nombre, String apellidos, boolean formacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.formacion = formacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public boolean tieneFormacion() {
        return formacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFormacion(boolean formacion) {
        this.formacion = formacion;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }
}
