public class Vehiculo {
    String modelo;

    Vehiculo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Error no puede contener espacios o estar vacio");
        } else {
            this.modelo = modelo;
        }
    }


    public void enceder(){
        System.out.println("El VEHICULO ESTA ENCENDIENDO");
    }
}
