package modulo5.ejercicio7;

public class Principal {
    public static void main(String[] args) {
        Motor motor = new Motor("V6", "M123456");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);
        Conductor conductor = new Conductor("Pamela Zampieri", "LIC12345");

        // Establecer relación bidireccional
        vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Vehículo -> Conductor:");
        System.out.println(vehiculo);

        System.out.println("\nConductor -> Vehículo:");
        System.out.println(conductor);
    }
}
