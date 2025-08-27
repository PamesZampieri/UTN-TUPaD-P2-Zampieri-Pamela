package modulo2;

import java.util.Scanner;

// 10. Actualización de stock a partir de venta y recepción de productos.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));

        scanner.close();
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
