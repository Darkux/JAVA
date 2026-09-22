public class Empleado {
    String nombre;
    int sueldo;

    Empleado(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public void mostrarinfo(){
        System.out.printf("su nombre es: " + nombre + " y su sueldo es: "+ sueldo);
    }
}
