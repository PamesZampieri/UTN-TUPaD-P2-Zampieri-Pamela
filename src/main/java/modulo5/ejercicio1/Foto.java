package modulo5.ejercicio1;

public class Foto {
    private int imagen;
    private String formato;

    public Foto(int imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Getters y setters
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "imagen=" + imagen +
                ", formato='" + formato + '\'' +
                '}';
    }
}
