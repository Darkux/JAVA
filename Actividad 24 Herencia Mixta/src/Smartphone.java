public class Smartphone extends Dispositivo implements movil, computadora{

    Smartphone(String modelo, String marca){
        super(marca, modelo);
    }

    public void realizarLLamada(){
        System.out.println("Inserte numero de 10 digitos para realizar la llamada");
    }

    public void ejecutarPrograma() {
        System.out.println("Seleccione el programa a ejecutar");
    }
}
