public class Animal {
    String especie;

    Animal(String especie){
        if(especie == null || !especie.matches("[A-Za-z]+")){
            System.out.println("Error la especie no puede contener numeros o letras especiales");
        } else {
            this.especie = especie;
        }
    }

    public void  hacersonido(){
        System.out.println("el animal esta haciendo sonido...");
    }
}
