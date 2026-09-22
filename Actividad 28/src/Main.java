import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int op;

        do{
            System.out.println("1: Cubo\n 2: Esfera\n" +
                    "3: Cilindro \n 0: Salir\n");

            op = sc.nextInt();

            if(op < 0 || op > 3){
                System.out.println("Error elegia una opcion valida");
                break;
            }  else{
                Figura3D figura = null;
                switch (op){

                    case 1:
                        for (int i= 1; i <= 3; i++ ) {
                            System.out.println("Ingrese el lado del cubo: ");
                            double lado = sc.nextDouble();
                            if (lado < 0) {
                                System.out.println("Error, intente de nuevo con otro dato, numero de intento: " + i);
                                continue;
                            } else {
                                figura = new Cubo("Cubo", lado);

                                figura.mostrarNombre();
                                System.out.println("El volumen es: " + figura.calcularVolumen());
                                break;

                            }
                        }
                        break;

                    case 2:
                        for (int i= 1; i <= 3; i++ ) {
                            System.out.println("Ingrese el radio de la esfera: ");
                            double radio = sc.nextDouble();
                            if (radio < 0) {
                                System.out.println("Error, intente de nuevo con otro dato, numero de intento: " + i);
                                continue;
                            } else {
                                figura = new Esfera("Esfera", radio);

                                figura.mostrarNombre();
                                System.out.println("El volumen es: " + figura.calcularVolumen());
                                break;

                            }
                        }
                        break;
                    case 3:
                        for (int i= 1; i <= 3; i++ ) {
                            System.out.println("Ingrese el radio de la esfera: ");
                            double radio2 = sc.nextDouble();
                            System.out.println("Ingrese el altura del cilindro: " );
                            double altura = sc.nextDouble();
                            if (radio2 < 0 || altura < 0) {
                                System.out.println("Error, intente de nuevo con otro dato, numero de intento: " + i);
                                continue;
                            } else {
                                figura = new Cilindro("Cilindro", radio2,altura);

                                figura.mostrarNombre();
                                System.out.println("El volumen es: " + figura.calcularVolumen());
                                break;

                            }
                        }
                        break;

                    case 0:
                        break;



                }
                if(op == 0){
                    break;
                }
                System.out.println("Deseas modificar algo? ");
                System.out.println("1 = SI,  2 = NO");
                int a = sc.nextInt();
                sc.nextLine();



                switch (a){
                    case 1:
                        System.out.println("Nuevo nombre: ");
                        String newname = sc.nextLine();

                        figura.setNombre(newname);

                        if(figura instanceof Cubo) {

                            System.out.println("Nuevo lado: ");
                            double ati = sc.nextDouble();
                            Cubo c = new Cubo(newname, ati);

                            c.mostrarNombre();
                            System.out.println("Nuevo lado: " + c.getLado());
                            System.out.println("El volumen es: " + c.calcularVolumen());
                        } else if (figura instanceof Esfera) {
                            System.out.println("Nuevo radio: ");
                            double rad = sc.nextDouble();

                            Esfera e = new Esfera(newname, rad);
                            e.mostrarNombre();
                            System.out.println("Nuevo radio: " + e.getRadio());
                            System.out.println("El volumen es: " +  e.calcularVolumen());
                        } else if (figura instanceof Cilindro){
                            System.out.println("Nuevo radio: ");
                            double radd = sc.nextDouble();
                            System.out.println("Nueva altura: ");
                            double alt = sc.nextDouble();

                            Cilindro d = new Cilindro(newname, radd, alt);
                            d.mostrarNombre();
                            System.out.println("Nuevo radio: " + d.getRadio());
                            System.out.println("Nueva altura: " + d.getAltura());
                            System.out.println("El volumen es: " +  d.calcularVolumen());


                        }

                }
            }








        } while (op != 0);



    }
}