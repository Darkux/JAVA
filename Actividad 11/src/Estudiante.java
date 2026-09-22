public class Estudiante {
    String nombre;
    int matricula;
    double cali1;
    double cali2;
    double cali3;


    //contructor
    public Estudiante(String nombre, int matricula, double cali1, double cali2, double cali3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cali1 = cali1;
        this.cali2 = cali2;
        this.cali3 = cali3;
    }


    //metodos

    public void calcularPromedio() {
        double t = (cali1 + cali2 + cali3) / 3;
        if (t == 10) {
            System.out.println("Felicidades sacaste 10");
        } else if (t < 10 && t > 8) {
            System.out.println("Exlente sacaste: " + t);
        } else if (t < 8 && t > 6) {
            System.out.println("Intenta mejorar el siguente semestre, tu promedio es: " + t);
        } else {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Necesito ponerme a estudiar mas \n. ");
            }
        }


    }
    public void mostrar(){
        double t = (cali1 + cali2 + cali3) / 3;
        System.out.println("Nombre: " + nombre + " Matricula: " + matricula + " Tu promedio es: " + t);
    }





}
