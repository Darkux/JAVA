public class Main {
    public static void main() {

    Circulo c1 = new Circulo("rojo", 2);
    Rectangulo r1 = new Rectangulo("blue", 10, 2);
    Cuadrado c2 = new Cuadrado("cafe", 10);
    Triangulo t1 = new Triangulo("morado", 12, 3);
    Trapecio l1 = new Trapecio("verde", 10, 4, 5);

    c1.mostrarColor();
    r1.mostrarColor();
    c2.mostrarColor();
    t1.mostrarColor();
    l1.mostrarColor();

        System.out.println("area del circulo: " + c1.calcularArea());
        System.out.println(" rectagulo: " + r1.calcularArea());
        System.out.println("area cuadrado: " + c2.calcularArea());
        System.out.println("area triangulo: " + t1.calcularArea());
        System.out.println("area trapecio: " + l1.calcularArea());




    }
}