    import java.util.Scanner;
    public class Main {
        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("1. Ingresa datos de un empleado;");
            System.out.println("2. ingresa datos de un departamento:");
            System.out.println("3.  SALIR");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Nombre del empleado:");
                    String nombre = sc.nextLine();
                    System.out.println("Edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Salario: ");
                    double salario = sc.nextDouble();

                    Empleado empleado1 = new Empleado(nombre, edad, salario);
                    empleado1.mostrarDetalles();
                    empleado1.cambiarAtributos();
                    empleado1.mostrarDetalles();
                    break;
                case 2:
                    System.out.println("Nombre del departamento:");
                    String nombredep = sc.nextLine();
                    System.out.println("numero de empleados: ");
                    int numemp = sc.nextInt();

                    DepartamentoInstrucciones depp = new DepartamentoInstrucciones(nombredep, numemp);
                    depp.mostrarInformacion();
                    depp.cambiarAtributos();
                    depp.clasificarNumeroEmpleados();
                    depp.mostrarInformacion();
                    break;
                case 3:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("error");
            }
        }while (op != 3) ;

        }
    }
