public class Cilindro extends  Figura3D{
    double radio;
    double altura;

    Cilindro(String nombre, double radio, double altura){
        super(nombre);
        this.altura = altura;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double calcularVolumen() {
        return Math.PI * (radio * radio) * altura;
    }
}
