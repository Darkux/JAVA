import java.util.Scanner;
public class Main {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();
        System.out.println("Ingrese el anio de publicacion: ");
        int anio = sc.nextInt();

        Libro librito = new Libro(titulo,autor,anio);

        System.out.println("Titulo: " + librito.getTitulo());
        System.out.println("Autor: " + librito.getAutor());
        System.out.println("Anio: " + librito.getAnioPublicacion());

        System.out.println("Deseas cambiar algun atributo?");
        int a = sc.nextInt();

        if (a == 1){
            System.out.println("1. Título\n" + "2. Autor\n" + "3. Año de publicación\n");
            int b = sc.nextInt();
            sc.nextLine();
            switch (b){
                case 1:
                    System.out.println("Cual es el nuevo nombre: ");
                    librito.setTitulo(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Cual es el nuevo autor: ");
                    librito.setAutor(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Cual es el nuevo anio: ");
                    librito.setAnioPublicacion(sc.nextInt());
                    break;
            }
            System.out.println("Titulo: " + librito.getTitulo());
            System.out.println("Autor: " + librito.getAutor());
            System.out.println("Anio: " + librito.getAnioPublicacion());
            librito.verificarAnio();

        }

    }
}