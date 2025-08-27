package modulo2;

import java.util.Scanner;

// 5. Suma de Números Pares (while).
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        int total = 0;

        while (n != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            n = scanner.nextInt();

            if (n != 0 && n % 2 == 0) {
                total += n;
            }
        }

        System.out.println("La suma de los números pares es: " + total);

        scanner.close();
    }
}
