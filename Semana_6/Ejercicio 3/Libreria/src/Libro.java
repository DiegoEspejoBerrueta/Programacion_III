public class Libro {
    private String nombre;
    private String genero;
    private int n_paginas;
    private double precio;

    public Libro(String nombre, String genero, int n_paginas, double precio){
        this.nombre = nombre;
        this.genero = genero;
        this.n_paginas = n_paginas;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setN_paginas(int n_paginas){
        this.n_paginas = n_paginas;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getEstadoComoString() {
        return "Libro [nombre = " + nombre + ", género = " + genero + ", número de páginas = " + n_paginas + ", precio = " + precio + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        return result = prime * result + ((nombre == null) ? 0 : nombre.hashCode()); 
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        Libro other = (Libro) obj; 
        if (nombre == null) {
            if (other.nombre != null) 
                return false;
        } else if (!nombre.equals(other.nombre))
            return false; 
        return true;  
    }









}
