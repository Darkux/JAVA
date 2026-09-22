public class Perro extends  Mamifero implements Domestico{

    Perro(String nombre, int edad){
        super(nombre, edad);
    }
    void ladrar(){
        System.out.println("GUAU GUAU");
    }

    public void serDomesticado(){
        System.out.println("Dale croquetas para domesticarlo");
    }

}
