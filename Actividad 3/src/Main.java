import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificación del primer parcial: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese la calificación del segunda parcial: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese la calificación del Tercera parcial: ");
        double c = sc.nextDouble();
        System.out.println("Ingrese la calificación del cuarta parcial:");
        double d = sc.nextDouble();
        System.out.println("Ingrese la calificación del Quinto parcial:");
        double e = sc.nextDouble();

        if (a <=0 || b<=0 || c<= 0 || d<= 0 || e <= 0){
            System.out.println("Necesitas recursar el semestre.");
        } else {
            double promedio = (a + b + c + d + e)/5;
            if (promedio >= 6){
                System.out.println("Aprobaste la materia.");
            } else {
                System.out.println("No aprobaste la materia.");
            }
        }
    }
}