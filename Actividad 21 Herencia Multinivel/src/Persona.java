public class Persona {
    String nombre;
    int edad;
    Persona(String nombre, int edad){
        this.edad=edad;
        this.nombre=nombre;
    }
    void mostrarDatos(){
        System.out.println("Nombre: " + nombre + "su edad es: " + edad);
    }
}
