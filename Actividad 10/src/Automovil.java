import java.util.Scanner;

public class Automovil {
    String marca;
    String modelo;
    int anio;
    double kilometraje;

    //constructor
    public Automovil(String marca, String modelo, int anio, double kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }
    Scanner sc = new Scanner(System.in);
    //metodos
    public void conducir(){
        System.out.println("Ingrese el kilometraje: ");
        int kilo = sc.nextInt();
        kilometraje = kilometraje + kilo;
        System.out.println("Tu kilometraje es: " + kilometraje);
    }

    public void informacion(){
        System.out.println("Marca : " + marca + " Modelo " + modelo +" Anio : "+ anio);
    }




}
