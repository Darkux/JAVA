public class Estudiante extends Persona{
    String matricula;

    Estudiante(String nombre,int edad, String matricula){
        super(nombre,edad);
        this.matricula = matricula;
    }
}
