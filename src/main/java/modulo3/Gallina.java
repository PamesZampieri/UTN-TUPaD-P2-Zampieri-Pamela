package modulo3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Getters y Setters
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    // Métodos
    public void ponerHuevo() {
        this.huevosPuestos++;
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("Id Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
