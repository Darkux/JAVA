public class ClienteProducto extends Producto implements cliente{
    ClienteProducto(String nombre){
        super(nombre);
    }


    public void comprarProducto() {
        System.out.println("El cliente esta comprado el producto: " + nombre);
    }

    void recibirfactura(){
        System.out.println("El cliente esta recibiendo su factura del producto");
    }
}
