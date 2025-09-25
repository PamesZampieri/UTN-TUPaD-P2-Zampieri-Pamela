package modulo5.ejercicio6;

import java.sql.Time;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Pamela Zampieri", "33230742");

        // Crear mesa
        Mesa mesa = new Mesa(5, 4);

        // Crear reserva
        Reserva reserva = new Reserva(new Date(), new Time(System.currentTimeMillis()), mesa);
        reserva.setCliente(cliente);

        // Mostrar datos
        System.out.println(reserva);
    }
}
