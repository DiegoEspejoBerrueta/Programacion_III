

public class Coches {
    
    private String matricula;
    private String marca;
    private double velocidad;
    private int caballos;

    public Coches(String matricula, String marca, double velocidad, int caballos) {
        this.matricula = matricula;
        this.marca = marca;
        this.velocidad = velocidad;
        this.caballos = caballos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setCaballos(int caballos) {
            this.caballos = caballos;
        }

    public String getEstadoComoString() {
        return "Coche [matrícula = " + matricula + ", marca = " + marca + ", velocidad = " + velocidad + ", caballos = " + caballos + "]";
    }
}