import java.util. Scanner;
    public class Main {
        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la marca del coche: ");
            String marca = sc.nextLine();
            System.out.println("Ingrese el modelo del coche: ");
            String modelo = sc.nextLine();
            System.out.println("Ingrese la velocidad maxima: ");
            double velocidad = sc.nextDouble();
            System.out.println("Ingrese el gasto de gasolina: ");
            double gasto = sc.nextDouble();
            System.out.println("Ingrese uan distancia en kilometros: ");
            double distancia = sc.nextDouble();

            Coche coche1 = new Coche(marca, modelo,velocidad,gasto, distancia);
            coche1.mostrar();

            System.out.println("Deseas modificar algo del coche?");
            int a = sc.nextInt();

            if (a == 1){
                System.out.println("1. nueva marca");
                System.out.println("2. nueva modelo");
                System.out.println("3. nueva velocidad");
                System.out.println("4. nueva gasolina");
                int b = sc.nextInt();
                sc.nextLine();
            switch (b){
                case 1:
                    System.out.println("Ingrese la nueva marca:");
                    coche1.setMarca(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese la nueva modelo:");
                    coche1.setModelo(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese la nueva velocidad:");
                    coche1.setVelocidadMaxima(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Ingrese la nueva gasolina:");
                    coche1.setGastoGasolinaPorLitro(sc.nextDouble());
                    break;

            }

            }
            coche1.mostrar();
            System.out.println("El gasto de gasolina es:" + coche1.calcularGastoDeGasolina(distancia));
        }
}