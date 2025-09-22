package modulo4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static final double SALARIO_POR_DEFECTO = 3000000.0;

    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Constructor con nombre y puesto
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    // Sobrecarga de métodos actualizarSalario
    public void actualizarSalario(int porcentaje) {
        this.salario += (this.salario * porcentaje / 100);
    }

    public void actualizarSalario(double cantidad) {
        this.salario += cantidad;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre='" + nombre + '\'' + ", puesto='" + puesto + '\'' + ", salario=" + salario + '}';
    }
}