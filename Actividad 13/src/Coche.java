public class Coche {
    private String marca;
   private String modelo;
   private double velocidadMaxima;
   private double gastoGasolinaPorLitro;
   private double distancia;


    //constructor

    public Coche(String marca, String modelo, double velocidadMaxima, double gastoGasolinaPorLitro, double distancia){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
        this.distancia = distancia;
    }

    //metodos getter

    public String getmarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public double getGastoGasolinaPorLitro(){
        return gastoGasolinaPorLitro;
    }
    //metodo setter
    public void setMarca(String marca){
        this.marca = marca;
    }
    public  void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setGastoGasolinaPorLitro(double gastoGasolinaPorLitro){
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }

    public double calcularGastoDeGasolina(double distacia){
        return distacia / gastoGasolinaPorLitro;
    }

    public void mostrar(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("velocidad maxima: " + velocidadMaxima);
        System.out.println("Gasto de gasolina: " + gastoGasolinaPorLitro);
    }






}
