package modulo3;

public class NaveEspacial {
    private String nombre;
    private double combustible;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    // Métodos
    public void despegar() {
        if (combustible >= 20) {
            combustible -= 20;
            System.out.println("¡La nave " + nombre + " ha despegado!");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("La nave avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(double cantidad) {
        double maxCombustible = 200;
        if (combustible + cantidad > maxCombustible) {
            combustible = maxCombustible;
            System.out.println("El tanque se llenó al máximo (" + maxCombustible + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}
