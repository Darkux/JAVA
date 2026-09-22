public class Trapecio extends  FiguraGeometrica{
    double basemenor;
    double basemayor;
    double altura;

    Trapecio(String color, double altura, double basemayor, double basemenor ){
        super(color);
        this.altura = altura;
        this.basemayor = basemayor;
        this.basemenor = basemenor;
    }
    public double calcularArea(){
        return ((basemayor + basemenor) * altura) / 2;
    }
}

