package modulo2;

import java.util.Scanner;

// 12. Modificación de un array de precios y visualización de resultados.
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        imprimirPrecios(precios);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados: ");
        imprimirPrecios(precios);

        scanner.close();
    }

    public static void imprimirPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $ " + precio);
        }
    }
}
