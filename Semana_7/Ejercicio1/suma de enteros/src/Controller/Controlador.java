package Controller;
import View.Vista;
import Model.Modelo;

public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }

    public void leerNumero(int num1, int num2){
        modelo.setNum1(num1);
        modelo.setNum2(num2);
    }

    public void calcularSuma(){
        modelo.calcularSuma();
    }

    public int mostrarResultado(){
        return modelo.getsuma();
    }
     
}
 