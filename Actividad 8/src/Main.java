public class Main {
    public static void main (String [] args){

        CuentaBancaria cliente1 = new CuentaBancaria("David", 20220994, 200);

        cliente1.depositar();
        cliente1.mostrar();
        cliente1.retirar();
        cliente1.mostrar();
    }
}