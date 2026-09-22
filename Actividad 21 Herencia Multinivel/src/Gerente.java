public class Gerente extends Empleado{
    String departamento;

    Gerente(String nombre, int edad, double sueldo, String departamento){
        super(nombre, edad, sueldo);
        this.departamento=departamento;
    }

    void mostrarDepa(){
        System.out.println("su departamento es: " + departamento);
    }
}
