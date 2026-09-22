public class Camion extends Vehiculo{
    private double consumoportonelada;
    private double peso;

    Camion(String nombre, double consumoportonelada, double peso  ){
        super(nombre);
        this.consumoportonelada = consumoportonelada;
        this.peso = peso;
    }

    public double getConsumoportonelada() {
        return consumoportonelada;
    }

    public void setConsumoportonelada(double consumoportonelada) {
        this.consumoportonelada = consumoportonelada;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularConsumo() {
        return consumoportonelada * peso;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return peso *  5;
    }
}
