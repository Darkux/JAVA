public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos
    public void mostrarDatos(){
        System.out.println("su nombre es: " + nombre +" y tiene la edad de: " + edad );
    }
}
