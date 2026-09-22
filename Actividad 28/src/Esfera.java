public class Esfera extends  Figura3D{
    double radio;

    Esfera(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularVolumen() {
        return (4/3) * Math.PI * (radio * radio *radio);

    }
}
