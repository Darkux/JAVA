public class Gerente extends Empleado{
    String departamento;
    Gerente(String nombre, int sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;

    }
    public void dep(){
        System.out.printf("departamento: " + departamento);
    }
}
