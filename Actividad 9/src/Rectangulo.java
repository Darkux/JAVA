public class Rectangulo {
    double base;
    double altura;

    //constructor

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //metodos

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro (){
        return ( 2 * (base + altura));
    }

}
