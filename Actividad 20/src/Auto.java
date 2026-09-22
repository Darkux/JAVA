public class Auto extends Vehiculo{
    String placa;

    Auto(String placa, String modelo) {
        super(modelo);
        if (placa == null || placa.length() != 7 || !placa.matches(".*[A-za-z].*")
                || !placa.matches(".*\\d.*")) {
            System.out.println("Error la placa debe tener 7 caracterez");
        } else {
            this.placa = placa;
        }
    }

    public void tocarBocina(){
        System.out.println("beep, beep");
    }
}
