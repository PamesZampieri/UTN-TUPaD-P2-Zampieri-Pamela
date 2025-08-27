package modulo2;

import java.util.Scanner;

// 6. Contador de Positivos, Negativos y Ceros (for).
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("Resultados: ");
        System.out.println("Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos);
        System.out.println("Ceros: " + contadorCeros);

        scanner.close();
    }
}
