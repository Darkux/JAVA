public class Automovil extends Vehiculo{
    String modelo;

    Automovil(String marca, String modelo){
        super(marca);
        this.modelo =modelo;
    }

    void encendermotor(){
        System.out.println("El motor del vehiculo esta encendido");
    }
}
