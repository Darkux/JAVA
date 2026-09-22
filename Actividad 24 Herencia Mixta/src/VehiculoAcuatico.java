public class VehiculoAcuatico extends Vehiculo implements Acuatico {

    VehiculoAcuatico(String modelo){
        super(modelo);
    }

    public void navegar(){
        System.out.println("El vehiculo se esta navegando..");
    }

}
