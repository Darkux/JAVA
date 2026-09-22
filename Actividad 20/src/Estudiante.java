public class Estudiante extends Persona{

    String matricula;

    Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        if (matricula != null && Character.isLetter(matricula.charAt(0)) && matricula.length() >= 6 && matricula.matches("[a-zA-Z0-9]+")){
            this.matricula = matricula;
        } else {
            System.out.printf("Error en la matricula");
        }
    }
    public void mostrarEstudiante(){
        System.out.printf("nombre: " + nombre + " edad: " + edad + " matricula: " + matricula );
    }
}
