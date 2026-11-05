package Model;

public class Modelo {
    
    //Atributos del modelo
    private int num1;
    private int num2;
    private int suma;

    //Getter y setter para el 1er nº
    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }

    //Getter y setter para el 2º nº
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public void calcularSuma(){
        this.suma = this.num1 + this.num2;
    }

    public int getsuma(){
        return this.suma;
    }


} 
