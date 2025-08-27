package modulo2;

import java.util.Scanner;

// 4. Calculadora de Descuento según categoría.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        if (precio <= 0) {
            System.out.println("El precio debe ser mayor a 0.");
            return;
        }

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double porcentajeDescuento = switch (categoria) {
            case 'A' -> 10;
            case 'B' -> 15;
            case 'C' -> 20;
            default -> 0;
        };

        if (porcentajeDescuento == 0) {
            System.out.println("Categoría inválida. Debe ser A, B o C.");
            return;
        }

        double precioFinal = precio * (1 - porcentajeDescuento / 100);

        System.out.printf("Precio original: %.2f%n", precio);
        System.out.printf("Descuento aplicado: %.0f%%%n", porcentajeDescuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);

        scanner.close();
    }
}
