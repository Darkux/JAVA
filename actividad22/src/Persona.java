public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }
    void saludar(){
        System.out.println("Hola soy" + nombre);
    }
}
