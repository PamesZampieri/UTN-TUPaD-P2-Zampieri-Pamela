package modulo2;

import java.util.Scanner;

// 2. Determinar el Mayor de Tres Números.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int primero = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int segundo = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int tercero = scanner.nextInt();

        int mayor = primero;

        if (segundo > mayor) {
            mayor = segundo;
        }
        if (tercero > mayor) {
            mayor = tercero;
        }

        System.out.println("El mayor de los tres números ingresados es: " + mayor);

        scanner.close();
    }
}
