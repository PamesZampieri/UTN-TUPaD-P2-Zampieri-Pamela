package modulo2;

import java.util.Scanner;

// 3. Clasificación de Edad.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad <= 0) {
            System.out.println("Edad no válida.");
            return;
        }

        if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }

        scanner.close();
    }
}
