import java.util.Scanner;
    public class Main {
        public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();
        System.out.println("Ingrese su altura:");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su estado civil en clave:");
        char estado = sc.next().charAt(0);

        boolean mayor = edad >= 18;


        System.out.println("Nombre completo:" + nombre );
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estado civil: " + estado);
        System.out.println("Eres mayor de edad? " + mayor);
        System.out.println("Yo " + nombre + " " + "con la de edad de " + edad + " " + "Sacaque 10 en POO" );
        }
}