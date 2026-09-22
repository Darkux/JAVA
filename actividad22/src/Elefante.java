public class Elefante extends  Animal{
    double peso;

    Elefante(String nombre, int edad, double peso){
        super(nombre, edad);
        this.peso = peso;
    }

    void usarTropa(){
        System.out.println("El elefante esta usando su trompa");
    }
}
