package modulo3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
    }

    public void mostrarCalificacion() {
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        if (this.calificacion > 10.0) {
            this.calificacion = 10.0;
        }
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        if (this.calificacion < 0.0) {
            this.calificacion = 0.0;
        }
    }
}
