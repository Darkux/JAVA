import javax.xml.crypto.dom.DOMCryptoContext;

public  abstract class Vehiculo {

    private  String nombre;

    Vehiculo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularConsumo();
    public  abstract  double calcularVelocidadMaxima();
}
