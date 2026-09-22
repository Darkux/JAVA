public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        if (nombre != null && nombre.length() > 3 && !nombre.matches(".*\\d.*")) {
            this.edad = edad;
        } else {
            System.out.printf("Error en el nombre");
        }
        if (edad > 6 && edad < 100) {
            this.nombre = nombre;
        } else {
            System.out.printf("error la edad tiene que ser mas de 6 y menor de 100");
        }
    }

    public void mostrarDatos(){
        System.out.printf("\nnombre:" + nombre + " edad: "+ edad + "\n");
    }
}
