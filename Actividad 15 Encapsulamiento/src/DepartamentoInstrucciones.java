import java.util.Scanner;

public class DepartamentoInstrucciones {

    private String nombre;
    private int numeroEmpleados;

    //constructor
    public DepartamentoInstrucciones(String nombre, int numeroEmpleados) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
    }

    //metodos
    public String getNombre() {
        return nombre;
    }


    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    //metodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }


    public void clasificarNumeroEmpleados() {
        int digitos = String.valueOf(numeroEmpleados).length();

        if (digitos == 1) {
            System.out.println("Tiene un digito");
        } else if (digitos == 2) {
            System.out.println("Tienes dos digitos");
        } else if (digitos == 3) {
            System.out.println("Tiene 3 digitos");
        } else {
            System.out.print("tiene mas de 3");
        }
    }

    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre);
        System.out.println("Numeros de empleados: " + numeroEmpleados);
    }

    public void cambiarAtributos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseas cambiar un atributo:");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("1. nombre \n 2. numero de empleados \n 3. empleados\n");
            System.out.println("Que atributo quieres cambiar:");
            int b = sc.nextInt();
            sc.nextLine();

            switch (b) {
                case 1:
                    System.out.println("Cual es el nuevo nombre?");
                    setNombre(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Cual es su nuevo numero de empleados: ");
                    setNumeroEmpleados(sc.nextInt());
                    break;

            }
        }
    }
}
