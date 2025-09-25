package modulo5.ejercicio5;

public class Principal {
    public static void main(String[] args) {
        // Crear propietario
        Propietario propietario = new Propietario("Pamela Zampieri", "33230742");

        // Crear computadora (la placa madre se crea internamente)
        Computadora computadora = new Computadora("HP", "SN12345678", "Asus Prime", "Intel Z590");

        // Establecer relación bidireccional
        computadora.setPropietario(propietario);
        propietario.setComputadora(computadora);

        // Mostrar relaciones
        System.out.println("Computadora -> Propietario:");
        System.out.println("Propietario de la computadora: " + computadora.getPropietario().getNombre());

        System.out.println("\nPropietario -> Computadora:");
        System.out.println("Número de serie de la computadora del propietario: " + propietario.getComputadora().getNumeroSerie());

        System.out.println("\nComputadora -> PlacaMadre:");
        System.out.println("Modelo de la placa madre: " + computadora.getPlacaMadre().getModelo());
        System.out.println("Chipset de la placa madre: " + computadora.getPlacaMadre().getChipset());
    }
}
