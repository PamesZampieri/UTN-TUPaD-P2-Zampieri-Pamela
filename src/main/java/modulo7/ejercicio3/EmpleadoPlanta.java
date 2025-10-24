package modulo7.ejercicio3;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;

    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase; // sueldo fijo
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
}