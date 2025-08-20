// Introducción a Java

package modulo1;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // 2. Escribir y ejecutar un programa básico en Java.
        System.out.println("¡Hola, Java!");

        // 3. Crea un programa que declare las siguientes variables con valores asignados:
        String nombre = "Pamela";
        int edad = 37;
        double altura = 1.62;
        boolean estudiante = true;

        System.out.println("Estos son mis datos: \nNombre: " + nombre + "\nEdad: " + edad +
                "\nAltura: " + altura + "\nEstudiante: " + estudiante);

        // 4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los muestre en pantalla.
        // Usa Scanner para capturar los datos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.println("Su nombre es " + nombre + " y su edad " + edad + " años.");

        /*
        5. Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
        a. Suma
        b. Resta
        c. Multiplicación
        d. División
        */

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = sc.nextInt();

        System.out.printf("La suma de los dos números ingresados es: %d%n", numero1 + numero2);
        System.out.printf("La resta de los dos números ingresados es: %d%n", numero1 - numero2);
        System.out.printf("La multiplicación de los dos números ingresados es: %d%n", numero1 * numero2);
        System.out.printf("La división de los dos números ingresados es: %.2f%n", (double) numero1 / numero2);

        /*
        6. Escribe un programa que muestre el siguiente mensaje en consola:
        Nombre: Juan Pérez
        Edad: 30 años
        Dirección: "Calle Falsa 123"

        Usa caracteres de escape (\n, \") en System.out.println().
        */

        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");

       /*
        8. Manejar conversiones de tipo y división en Java.
        a. Escribe un programa que divida dos números enteros ingresados por el usuario.
        b. Modifica el código para usar double en lugar de int y compara los resultados.
        */

        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();

        // División de enteros
        int resultadoEntero = num1 / num2;

        System.out.println("Resultado de la división entera: " + resultadoEntero);

        System.out.print("Ingrese el primer número: ");
        double numDouble1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numDouble2 = sc.nextDouble();

        // División de decimales
        double resultado = numDouble1 / numDouble2;

        System.out.println("Resultado de la división con decimales: " + resultado);

        /*
        9. Corrige el siguiente código para que funcione correctamente. Explica qué error tenía y cómo lo solucionaste.

        import java.util.Scanner;

        public class ErrorEjemplo {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa tu nombre: ");

                String nombre = scanner.nextInt(); // ERROR

                System.out.println("Hola, " + nombre);
            }
        }
        */

        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();

        System.out.println("Hola, " + name);

        sc.close();
    }
}