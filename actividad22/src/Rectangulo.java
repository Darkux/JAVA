public class Rectangulo extends FiguraGeometrica{
    double base;
    double altura;

    Rectangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }
}

