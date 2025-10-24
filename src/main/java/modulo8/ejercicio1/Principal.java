package modulo8.ejercicio1;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== PARTE 1: Interfaces (E-commerce) ===");
        demoEcommerce();

        System.out.println("\n=== PARTE 2: Ejercicios de Excepciones ===");
        demoDivisionSegura();
        demoConversionCadenaANumero();
        demoLecturaArchivo();
        demoEdadPersonalizada();
        demoTryWithResourcesLecturaYaml();
    }

    private static void demoEcommerce() {
        Cliente cliente = new Cliente("Pamela");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse inalámbrico", 8999));
        pedido.agregarProducto(new Producto("Teclado mecánico", 25999));
        pedido.agregarProducto(new Producto("Pad XL", 4999));

        System.out.println(pedido);
        pedido.cambiarEstado("PAGANDO");

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Pago con tarjeta con descuento
        PagoConDescuento tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total, 10.0);
        tarjeta.procesarPago(totalConDescuento);
        pedido.cambiarEstado("PAGADO");

        // Otro medio de pago sin descuento
        Pago paypal = new PayPal();
        System.out.println("Ejemplo alternativo (sin ejecutar): PayPal procesaría $" + total);
        // paypal.procesarPago(total);
    }

    // 1) División segura (ArithmeticException)
    private static void demoDivisionSegura() {
        System.out.println("\n[1] División segura");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresá dividendo (entero): ");
            int a = sc.nextInt();
            System.out.print("Ingresá divisor (entero): ");
            int b = sc.nextInt();
            int r = a / b;
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero no permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada inválida, debés ingresar enteros.");
        } finally {
        }
    }

    // 2) Conversión de cadena a número (NumberFormatException)
    private static void demoConversionCadenaANumero() {
        System.out.println("\n[2] Conversión de cadena a número");
        String texto = "123x";
        try {
            int n = Integer.parseInt(texto);
            System.out.println("Convertido OK: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + texto + "\" no es un entero válido.");
        }
    }

    // 3) Lectura de archivo (FileNotFoundException)
    private static void demoLecturaArchivo() {
        System.out.println("\n[3] Lectura de archivo (FileNotFoundException)");
        File f = new File("no_existe.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + f.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error de I/O: " + e.getMessage());
        }
    }

    // 4) Excepción personalizada (EdadInvalidaException)
    private static void demoEdadPersonalizada() {
        System.out.println("\n[4] Excepción personalizada (EdadInvalidaException)");
        try {
            validarEdad(25);
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Capturada EdadInvalidaException: " + e.getMessage());
        }
    }

    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }

    // 5) try-with-resources con BufferedReader (IOException)
    private static void demoTryWithResourcesLecturaYaml() {
        System.out.println("\n[5] try-with-resources leyendo YAML (classpath)");
        try (var in = Principal.class.getResourceAsStream("/datos.yaml")) {
            if (in == null) {
                System.out.println("Archivo datos.yaml no encontrado en resources.");
                return;
            }
            try (var br = new BufferedReader(new InputStreamReader(in))) {
                String line;
                while ((line = br.readLine()) != null) System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo YAML → " + e.getMessage());
        }
    }
}
