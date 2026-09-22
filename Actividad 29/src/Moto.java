public class Moto extends Vehiculo{
    private double consumoporlitro;
    private double potencia;
    private double distancia;

    Moto(String nombre, double consumoporlitro, double potencia, double distancia){
        super(nombre);
        this.consumoporlitro = consumoporlitro;
        this.potencia = potencia;
        this.distancia = distancia;
    }

    public double getConsumoporlitro() {
        return consumoporlitro;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setConsumoporlitro(double consumoporlitro) {
        this.consumoporlitro = consumoporlitro;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularConsumo() {
        return consumoporlitro * distancia;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return potencia * 20;
    }
}
