package modulo7.ejercicio1;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("vehiculo{" + "marca=" + marca + ", modelo=" + modelo + '}');
    }
}
