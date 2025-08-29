package modulo3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >= 0 && anioPublicacion <= 9999) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año inválido: " + anioPublicacion);
        }
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año publicación: " + anioPublicacion);
    }
}
