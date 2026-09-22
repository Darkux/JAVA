public class Robot implements Cocinero, Limpiador, Mensajero{
    String nombre;
    String mensaje;
    Robot(String nombre, String mensaje) {
                this.nombre = nombre;
                this.mensaje = mensaje;
            }

    boolean validad() {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre nop puede estar vacio");
            return false;
        } else {
            if (mensaje == null || mensaje.trim().isEmpty()) {
                System.out.println("Error el mensaje no debe estar vacio");
                return false;
            }
            return true;
        }
    }

    public void cocinar() {
        if (validad()) {
            System.out.println(nombre + " esta cocinado");
        }
    }
    public void limpiar() {
        if (validad()) {

            System.out.println(nombre + " esta limpiando");
        }
    }
            public void mensaje () {
                if (validad()) {
                    System.out.println(nombre + " esta entregando el mensaje que es: " + mensaje);
                }
            }
        }

