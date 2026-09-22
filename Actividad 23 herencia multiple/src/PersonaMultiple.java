import java.lang.foreign.StructLayout;

public class PersonaMultiple implements Estudiante, Deportista, Artista {

    String nombre;
    int edad;
    String habilidad;

    PersonaMultiple(String nombre, int edad, String habilidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidad = habilidad;
    }

    public boolean validar() {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error el nombre no puede estar vacio");
            return false;
        }
        if (edad <= 0) {
            System.out.println("Errore la edad no puede ser menor a cero");
            return false;
        }
        if (habilidad == null || habilidad.isEmpty()) {
            System.out.println("Error la habilidad no puede estar vacia");
            return false;
        }
        return true;
    }


    public void estudiar() {
        if (validar()) {
            System.out.println(nombre + " Esta estudiando");
        }
    }

    public void entrenar() {
        if (validar()) {
            System.out.println(nombre + " Esta entrenado en GYM");
        }
    }

    public void practicarArte() {
        if (validar()) {
            System.out.println(nombre + " con la edad de: " + edad + " esta practicando " + habilidad);
        }
    }
}
