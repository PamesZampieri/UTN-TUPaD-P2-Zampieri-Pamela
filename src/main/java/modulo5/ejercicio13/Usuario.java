package modulo5.ejercicio13;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
