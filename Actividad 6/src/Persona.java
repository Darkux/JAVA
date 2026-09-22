public class Persona {
    String nombre;
    int edad;
    double altura;
    double peso;

    // constructor
    public Persona (String nombre, int edad, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // metodos

    public void mostrar_datos(){
        System.out.println("Mi nombre es: " + nombre + " Mi edad es: " + edad + " Mi altura y peso son: " + altura + " " + peso);
    }


}
