
import View.Vista;
import Model.Modelo;
import Controller.Controlador;

public class App {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);

        vista.setControlador(controlador);
        vista.mostrarMenu();
    }
}
 