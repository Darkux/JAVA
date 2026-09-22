interface Acuatico{
    void navegar();
}
interface  Domestico{
    void serDomesticado();
}
interface movil{
    void realizarLLamada();
}
interface computadora{
    void ejecutarPrograma();
}
interface Estudiante{
    void estudiar();
}
interface trabador{
    void trabajar();
}
interface cliente{
    void comprarProducto();
}

public class Main {
    public static void main (String[]args){

    ClienteProducto c1 = new ClienteProducto("Coca COla");

    c1.mostrarDetalles();
    c1.comprarProducto();
    c1.recibirfactura();
    }
}