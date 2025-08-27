package modulo2;

import java.util.Scanner;

// 8. Cálculo del Precio Final con impuesto y descuento.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):  ");
        double impuesto = scanner.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):   ");
        double descuento = scanner.nextDouble();

        System.out.printf("El precio final del producto es: %.2f%n",
                calcularPrecioFinal(precioBase, impuesto, descuento));

        scanner.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }
}
