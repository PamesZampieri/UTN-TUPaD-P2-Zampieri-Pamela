package modulo5.ejercicio10;

public class Principal {
    public static void main(String[] args) {
        // Crear el titular
        Titular titular = new Titular("Juan Pérez", "12345678");

        // Crear la cuenta bancaria con su clave de seguridad
        CuentaBancaria cuenta = new CuentaBancaria("001122334455", 5000.0, "ABC123", "2025-09-24");

        // Vincular titular y cuenta (asociación bidireccional)
        cuenta.setTitular(titular);
        titular.setCuentaBancaria(cuenta);

        // Imprimir los objetos
        System.out.println(cuenta);
        System.out.println(titular);
        System.out.println("Clave de seguridad: " + cuenta.getClaveSeguridad());
    }
}
