import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1: Coche\n2: Camión\n3: Motocicleta\n0: Salir\n");
            System.out.println("Seleccione la opcion deseada: ");
            op = sc.nextInt();
            sc.nextLine();

            Vehiculo v = null;

            switch (op) {

                case 1:
                    System.out.println("Ingrese el nombre del coche: ");
                    String nombre = sc.nextLine();

                    for (int i = 0; i < 3; i++) {

                        System.out.println("Ingrese consumo por litro: ");
                        double consumo = sc.nextDouble();
                        if (consumo < 0) {
                            System.out.println("Error el consumo debe ser mayor a 0");
                            continue;
                        }

                        System.out.println("Ingrese la potencia: ");
                        double potencia = sc.nextDouble();
                        if (potencia < 0) {
                            System.out.println("Error la potencia debe ser mayor a 0");
                            continue;
                        }

                        System.out.println("Ingrese la distancia: ");
                        double distancia = sc.nextDouble();
                        if (distancia < 0) {
                            System.out.println("Error la distancia debe ser mayor a 0");
                            continue;
                        }

                        Coche c = new Coche(nombre, consumo, potencia, distancia);
                        System.out.println("El nombre es: " + c.getNombre());
                        System.out.println("Consumo es: " + c.calcularConsumo());
                        System.out.println("Velocidad maxima: " + c.calcularVelocidadMaxima());
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del camión: ");
                    String nombre2 = sc.nextLine();

                    for (int i = 0; i < 3; i++) {

                        System.out.println("Ingrese consumo por tonelada: ");
                        double consumot = sc.nextDouble();
                        if (consumot < 0) {
                            System.out.println("Error el consumo debe ser mayor a 0");
                            continue;
                        }

                        System.out.println("Ingrese el peso: ");
                        double peso = sc.nextDouble();
                        if (peso < 0) {
                            System.out.println("Error el peso debe ser mayor a 0");
                            continue;
                        }

                        Camion c1 = new Camion(nombre2, consumot, peso);
                        System.out.println("El nombre es: " + c1.getNombre());
                        System.out.println("Consumo es: " + c1.calcularConsumo());
                        System.out.println("Velocidad maxima: " + c1.calcularVelocidadMaxima());
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la moto: ");
                    String nombre3 = sc.nextLine();

                    for (int i = 0; i < 3; i++) {

                        System.out.println("Ingrese consumo por litro: ");
                        double consumo3 = sc.nextDouble();
                        if (consumo3 < 0) {
                            System.out.println("Error el consumo debe ser mayor a 0");
                            continue;
                        }

                        System.out.println("Ingrese la potencia: ");
                        double potencia3 = sc.nextDouble();
                        if (potencia3 < 0) {
                            System.out.println("Error la potencia debe ser mayor a 0");
                            continue;
                        }

                        System.out.println("Ingrese la distancia: ");
                        double distancia3 = sc.nextDouble();
                        if (distancia3 < 0) {
                            System.out.println("Error la distancia debe ser mayor a 0");
                            continue;
                        }

                        Moto m = new Moto(nombre3, consumo3, potencia3, distancia3);
                        System.out.println("El nombre es: " + m.getNombre());
                        System.out.println("Consumo es: " + m.calcularConsumo());
                        System.out.println("Velocidad maxima: " + m.calcularVelocidadMaxima());
                        break;
                    }
                    break;



            }

            System.out.println("1= set 2= continuar");
            int op2 = sc.nextInt();
            sc.nextLine();
            if(op == 1){
                System.out.println("Nuevo nombre: ");
            }



        } while (op != 0);







    }



}