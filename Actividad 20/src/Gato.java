public class Gato extends  Animal{
    String color;

    Gato(String especie, String color){
        super(especie);
        if(color == null || color.length() <= 3 || !color.matches("[A-Za-z]+")){
            System.out.println("Error, el color debe tener mas de 3 caracteres y no tener numeros");
        } else {
            this.color = color;
        }
    }

    public void ronronear(){
        System.out.println("El gato ronronea felizmente");
    }
}
