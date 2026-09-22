public class HidroAvion extends Vehiculo implements  Volador, Acuatico{

    HidroAvion(String nombre){
        super(nombre);
    }

    public boolean validar(){
        if(nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error el nombre no puede estar vacio");
            return false;
        }
        return true;
    }

    public void volar() {
        if (validar()) {
            System.out.println("Avion esta volando");
        }
    }

        public void navegar () {
            if (validar() ){

                System.out.println("El avion esta navegando");
            }
        }
    }
