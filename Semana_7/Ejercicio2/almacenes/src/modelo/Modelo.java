package modelo;

public class Modelo {
    private int[][] ventas = new int[5][2];
    private double[] precios = new double[2];
    private double[][] ingresos = new double[5][2];

    private double ingresosTotales;

    private boolean ventasLeidas = false;
    private boolean preciosLeidos = false;
    private boolean ingresosCalculados = false;


    // Guardar la tabla de ventas
    public void setVentas(int[][] ventas) {
        this.ventas = ventas;
        ventasLeidas = true;
        ingresosCalculados = false;
    }

    // Guardar la tabla de precios
    public void setPrecios(double[] precios) {
        this.precios = precios;
        preciosLeidos = true;
        ingresosCalculados = false;
    }

    // Comprobar si se han introducido las ventas
    public boolean isVentasLeidas() {
        return ventasLeidas;
    }

    // Comprobar si se han introducido los precios
    public boolean isPreciosLeidos() {
        return preciosLeidos;
    }

    // Comprobar si se han calculado los ingresos
    public boolean isIngresosCalculados(){
        return ingresosCalculados;
    }


    // Calcular los ingresos
    public void calcularIngresos(){
        ingresosTotales = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<2; j++){
                ingresos[i][j] = ventas[i][j] * precios[j];
                ingresosTotales += ingresos[i][j];
            }
        }
        ingresosCalculados = true;
    }


    //Obtener las ventas
    public int[][] getVentas(){
        return ventas;
    }
    
    //Obtener las ventas
    public double[] getPrecios(){
        return precios;
    }

    //Obtener los ingresos
        public double[][] getIngresos(){
            return ingresos;
        }

    //Obtener los ingresos totales
    public double getIngresosTotales(){
        return ingresosTotales;
    }

    
}




