package modulo2;

import java.util.Scanner;

// 13. Impresión recursiva de arrays antes y después de modificar un elemento.
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        imprimirPrecios(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados: ");
        imprimirPrecios(precios, 0);

        scanner.close();
    }

    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }

        System.out.println("Precio: $" + precios[indice]);

        imprimirPrecios(precios, indice + 1);
    }
}
