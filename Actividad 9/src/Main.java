import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
Scanner sc = new Scanner(System.in);

System.out.println("Ingrese la base: ");
double a = sc.nextDouble();
System.out.println("Ingrese la altura :");
double b = sc.nextDouble();

Rectangulo calculo1 = new Rectangulo(a,b);

System.out.println("El area es: " + calculo1.calcularArea());
System.out.println("El perimetro es: " + calculo1.calcularPerimetro());

    }
}