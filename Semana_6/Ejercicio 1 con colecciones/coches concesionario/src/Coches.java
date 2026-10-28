

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return result = prime * result + ((matricula == null) ? 0 : matricula.hashCode()); 
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        Coches other = (Coches) obj; 
        if (matricula == null) {
            if (other.matricula != null) 
                return false;
        } else if (!matricula.equals(other.matricula))
            return false; 
        return true;  
    }
    
    
}