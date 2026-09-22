public class Camion extends Automovil{
    double capacidad;

    Camion(String marca, String modelo, double capacidad){
        super(marca, modelo);
        this.capacidad=capacidad;
    }
    void cargar(){
        System.out.println("El camion esta cargando");
    }
}
