public class Secretario extends  Persona{
    String oficina;

    Secretario(String nombre, int edad, String oficina){
        super(nombre, edad);
        this.oficina = oficina;
    }
    void atender(){
        System.out.println("el Secretario atienda la oficina");
    }
}
