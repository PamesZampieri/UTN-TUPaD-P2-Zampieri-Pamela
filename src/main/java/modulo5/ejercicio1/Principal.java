package modulo5.ejercicio1;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Pamela Zampieri", "33230742");

        // Crear pasaporte (incluye la composición con Foto)
        Pasaporte pasaporte = new Pasaporte("12345", 1, "JPG", new Date());

        // Establecer relación bidireccional
        titular.setPasaporte(pasaporte);
        pasaporte.setTitular(titular);

        // Mostrar información completa
        System.out.println("\n--- Relación Titular -> Pasaporte ---");
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());

        System.out.println("\n--- Relación Pasaporte -> Titular ---");
        System.out.println("Pasaporte Nº: " + pasaporte.getNumero());
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());

        System.out.println("\n--- Relación Pasaporte -> Foto (composición) ---");
        System.out.println("Formato de la foto del pasaporte: " + pasaporte.getFoto().getFormato());

        // Mostrar todos los objetos con toString
        System.out.println("\n--- Objetos completos ---");
        System.out.println(titular);
        System.out.println(pasaporte);
        System.out.println(pasaporte.getFoto());
    }
}
