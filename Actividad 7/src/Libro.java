public class Libro {
    String titulo;
    String autor;
    int anio_public;

    //constructor
    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio_public = anio;
    }

    // metodos

    public void resumen(){
        System.out.println("Titulo: " + titulo );
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacion: " + anio_public);
    }



}
