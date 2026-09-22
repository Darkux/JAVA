public class Libro {
   private String titulo;
   private String autor;
    private int anioPublicacion;

    //constructor
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //metodos getter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    //metodos setter;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    //metodos

    public void verificarAnio(){
        if (anioPublicacion < 2000){
            System.out.println("El libro fue publicado antes del 2000");
        } else {
            System.out.println("El libro fue publicado despues del 2000");
        }
    }




}
