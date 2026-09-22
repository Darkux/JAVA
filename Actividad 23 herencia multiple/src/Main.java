interface Estudiante {
    void estudiar();
}

interface Deportista {
    void entrenar();
}

interface Artista {
    void practicarArte();
}

interface Volador{
    void volar();
}
interface Acuatico{
    void navegar();
}

interface  Cocinero{
    void cocinar();
}
interface Limpiador{
    void limpiar();
}
interface Mensajero{
    void mensaje();
}

public class Main {
    static void main(String[]args) {

        Robot r1 = new Robot("RK900", "IAM CONNOR");
        Robot r2 = new Robot(" ef ", "fsf");

        r1.cocinar();
        r1.limpiar();
        r1.mensaje();
        r2.cocinar();
        r2.limpiar();
        r2.mensaje();
    }
}