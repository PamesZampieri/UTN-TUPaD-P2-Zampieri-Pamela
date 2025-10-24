package modulo7.ejercicio3;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }
}
