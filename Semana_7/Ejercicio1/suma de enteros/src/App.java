import View.Vista;
import Model.Modelo;

import java.lang.ModuleLayer.Controller;

import Controller.Controlador;

public class App {
    public static void main(String[] args) {
        Model modelo = new Model();
        View vista = new Vista();
        Controller controlador = new Controller();

        vista.setController(controlador);
        vista.mostrarMenuPrincipal();
    }
}
