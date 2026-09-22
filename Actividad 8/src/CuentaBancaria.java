import java.util.Scanner;
public class CuentaBancaria {
    String titular;
    int numeroCuenta;
    double saldo;
    Scanner sc = new Scanner(System.in);


    //contrusctor
    public CuentaBancaria(String titular, int numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    //metodos
    public void depositar(){
        System.out.println("Cuanto quieres depositar: ");
        int depo = sc.nextInt();
        saldo = saldo + depo;
    }
    public void retirar() {
        System.out.println("Cuanto quieres retirar: ");
        int retiro = sc.nextInt();
        if (retiro > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - retiro;
        }
    }
    public void mostrar(){
        System.out.println("Tu saldo es: " + saldo);
    }

}
