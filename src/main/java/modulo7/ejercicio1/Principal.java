package modulo7.ejercicio1;

public class Principal {
    public static void main(String[] args) {
        // Instanciar un auto y mostrar su información completa (requisito)
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

        // (Extra) Demostración de polimorfismo por herencia:
        Vehiculo v = new Auto("Ford", "Focus", 5);
        v.mostrarInfo();
    }
}
