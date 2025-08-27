package modulo2;

import java.util.Scanner;

// 11. Cálculo de descuento especial usando variable global.
public class Ejercicio11 {
    static double descuentoEspecial = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        double descuento = calcularDescuentoEspecial(precio);

        System.out.printf("El descuento especial aplicado es: %.2f%n", descuento);
        System.out.printf("El precio final con descuento es: %.2f", (precio - descuento));

        scanner.close();
    }

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;

        return descuentoAplicado;
    }
}
