package modulo5.ejercicio4;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear banco
        Banco banco = new Banco("Banco Nación", "30-12345678-9");

        // Crear cliente
        Cliente cliente = new Cliente("Pamela Zampieri", "33230742");

        // Crear tarjeta de crédito
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", new Date(), banco);

        // Establecer relación bidireccional
        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);

        // Mostrar relaciones
        System.out.println("Tarjeta -> Cliente:");
        System.out.println("Cliente de la tarjeta: " + tarjeta.getCliente().getNombre());

        System.out.println("\nCliente -> Tarjeta:");
        System.out.println("Número de la tarjeta del cliente: " + cliente.getTarjeta().getNumero());

        System.out.println("\nTarjeta -> Banco:");
        System.out.println("Banco de la tarjeta: " + tarjeta.getBanco().getNombre());
    }
}
