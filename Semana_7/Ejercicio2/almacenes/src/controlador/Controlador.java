package controlador;
import modelo.Modelo;
import vista.Vista;


public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
    }

    // Opcion 1: Leer tabla de ventas
    public void leerVentas() {
        int[][] ventas = vista.leerVentas();
        modelo.setVentas(ventas);
    }

    // Opcion 2: Leer tabla de precios
    public void leerPrecios(){
        double[] precios = vista.leerPrecios();
        modelo.setPrecios(precios);
    }

    // Opcion 3: Calcular ingresos totales
    public void calcularIngresos(){
        if (!modelo.isVentasLeidas() || !modelo.isPreciosLeidos()) {
            vista.mostrarMensaje(
                "Error: primero debes introducir las ventas y los precios."
            );
        } else {
            modelo.calcularIngresos();
            vista.mostrarMensaje(
                "Ingresos calculados correctamente."
            );
        }
    }

     // Opcion 4: Mostrar resultados
    public void mostrarResultados() {
        if (!modelo.isIngresosCalculados()) {
            vista.mostrarMensaje(
                "Primero debes introducir las ventas y los precios y calcular los ingresos."
            );
        } else {
            vista.mostrarResultados(
                modelo.getVentas(),
                modelo.getPrecios(),
                modelo.getIngresos(),
                modelo.getIngresosTotales()
            );
        }
    }
}
