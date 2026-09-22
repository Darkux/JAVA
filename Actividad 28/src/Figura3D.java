abstract class Figura3D {
    private String nombre;

    Figura3D(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularVolumen();

    public void mostrarNombre(){
        System.out.println("La figura es: " + nombre);
    }
}
