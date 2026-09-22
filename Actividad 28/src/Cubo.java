public class Cubo extends  Figura3D{
    double lado;

    Cubo(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularVolumen() {
        return lado * lado * lado;
    }
}
