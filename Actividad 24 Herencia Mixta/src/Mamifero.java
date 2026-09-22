public class Mamifero extends  Animal{
    int edad;
    Mamifero(String nombre, int edad){
        super(nombre);
        this.edad = edad;
    }

    void alimentarse(){
        System.out.println("El mamifero se esta alimentado");
    }
}
