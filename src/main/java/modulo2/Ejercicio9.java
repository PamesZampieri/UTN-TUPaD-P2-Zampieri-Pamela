package modulo2;

import java.util.Scanner;

// 9. Composición de funciones para calcular costo de envío y total de compra.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);

        if (costoEnvio != -1) {
            System.out.printf("El costo de envío es: %.2f%n", costoEnvio);
            System.out.printf("El total a pagar es: %.2f" , calcularTotalCompra(precio, costoEnvio));
        }

        scanner.close();
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if(zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Error: la zona ingresada no es válida.");
            return -1;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
