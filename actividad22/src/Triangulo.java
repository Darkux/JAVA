public class Triangulo extends FiguraGeometrica{
    double base;
    double altura;

    Triangulo(String color, double base, double altura ){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura / 2;
    }
}

