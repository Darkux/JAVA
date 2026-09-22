public class Empleado extends  Persona{
    double sueldo;
    Empleado(String nombre, int edad, double sueldo){
        super(nombre, edad);
        this.sueldo=sueldo;
    }
    void mostrarSueldo(){
        System.out.println("Su sueldo es: " + sueldo);
    }
}
