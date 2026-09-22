public class Dispositivo {
    String marca;
    String modelo;

    Dispositivo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    void enserder(){
        System.out.println("El dispositivo esta encendiendo...");
    }
}
