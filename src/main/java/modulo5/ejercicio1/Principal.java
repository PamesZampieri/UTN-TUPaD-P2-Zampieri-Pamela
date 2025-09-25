package modulo5.ejercicio1;

import java.util.Date;

public class Principal {
    public static void main (String[] args) {
        Titular titular = new Titular("Pamela Zampieri", "33230742");
        Pasaporte pasaporte = new Pasaporte("12345", 1, "JPG", new Date(), titular);

        // Establecer relación bidireccional
        titular.setPasaporte(pasaporte);

        // Verificar relaciones
        System.out.println("1. Relación Pasaporte -> Titular:");
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());

        System.out.println("\n2. Relación Titular -> Pasaporte:");
        System.out.println("   Pasaporte del titular: " + titular.getPasaporte().getNumero());


        System.out.println("\n3. Relación Pasaporte -> Foto:");
        System.out.println("   Formato de la foto: " + pasaporte.getFoto().getFormato());
    }
}
