public class Coche extends Vehiculo{
    private double consumoporlitro;
    private double potencia;
    private double distacia;

    Coche(String nombre, double consumoporlitro, double potencia, double distacia){
        super(nombre);
        this.consumoporlitro = consumoporlitro;
        this.distacia = distacia;
        this.potencia = potencia;
    }

    public double getConsumoporlitro() {
        return consumoporlitro;
    }

    public double getDistacia() {
        return distacia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setConsumoporlitro(double consumoporlitro) {
        this.consumoporlitro = consumoporlitro;
    }

    public void setDistacia(double distacia) {
        this.distacia = distacia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularConsumo() {
        return consumoporlitro * distacia;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return potencia * 10;
    }
}
