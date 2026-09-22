import java.util.Scanner;

public class Empleado {

  private String nombre;
  private int  edad;
  private double salario;

//constructor

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //metodos getter


    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario(){
        return salario;
    }

    //metodos de setter
    public void  setNombre(String nombre){
        this.nombre =  nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void clasificarSalario(){
        if(salario >= 50000){
            System.out.println("Su salario es ALTO");
        } else if (salario < 50000 && salario > 10000) {
            System.out.println("Su salario es MEDIO");
        } else if (salario <= 10000) {
            System.out.println("Su salario es BAJO");
        } else {
            System.out.println("Su salario no esta medido");
        }
    }

   public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Clasificacion: ");
        clasificarSalario();

   }

   public void cambiarAtributos(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Deseas cambiar un atributo:");
        int a = sc.nextInt();

        if(a == 1) {
            System.out.println("1. nombre \n 2. edad \n 3. salario\n");
            System.out.println("Que atributo quieres cambiar:");
            int b = sc.nextInt();
            sc.nextLine();

            switch (b){
                case 1:
                    System.out.println("Cual es el nuevo nombre?");
                    setNombre(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Cual es su nueva edad: ");
                    setEdad(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Cual es su nuevo salario: ");
                    setSalario(sc.nextDouble());
                    break;
            }
        }
   }

}


