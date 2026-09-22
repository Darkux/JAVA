public class Producto {
    String nombre;

    Producto(String nombre){
        this.nombre = nombre;
    }

    void mostrarDetalles(){
        System.out.println("EL NOMBRE DEL PRODUCTO ES: " + nombre);
    }
}
