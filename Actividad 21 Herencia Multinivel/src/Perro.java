public class Perro extends Mamifero{
    String raza;

    Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }
    void ladrar(){
        System.out.printf("el perro hace: guau guau");
    }
}
