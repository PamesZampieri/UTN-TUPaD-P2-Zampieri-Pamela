package modulo2;

import java.util.Scanner;

// 1. Verificación de Año Bisiesto.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        System.out.println("El año " + year + ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                ? " es bisiesto."
                : " no es bisiesto."));

        scanner.close();
    }
}
