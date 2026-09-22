public class Profesor extends Persona implements Estudiante, trabador{
    Profesor(String nombre, int edad){
        super(nombre, edad);
    }

    void ensenar(){
        System.out.println("El profe esta ensenado");
    }

    public void trabajar() {
        System.out.println("el profe esta trabajado");
    }


    public void estudiar() {
        System.out.println("El profe esta estudiando su clase");
    }
}
