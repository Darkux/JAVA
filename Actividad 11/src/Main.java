import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese 3 calidicaciones: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        Estudiante estudiante = new Estudiante("David", 20220994, a, b, c);

        estudiante.calcularPromedio();
        estudiante.mostrar();


    }
}