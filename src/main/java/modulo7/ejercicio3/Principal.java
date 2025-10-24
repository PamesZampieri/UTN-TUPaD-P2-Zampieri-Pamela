package modulo7.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Lista de empleados (polimorfismo: misma referencia, distintos objetos)
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 750000));
        empleados.add(new EmpleadoTemporal("Luis", 160, 2500));
        empleados.add(new EmpleadoPlanta("Sofía", 920000));
        empleados.add(new EmpleadoTemporal("Marco", 100, 3000));

        int cantPlanta = 0;
        int cantTemporales = 0;
        double totalSueldos = 0;

        System.out.println("=== Nómina ===");
        for (Empleado e : empleados) {
            // Llamada polimórfica
            double sueldo = e.calcularSueldo();
            totalSueldos += sueldo;

            // Clasificación con instanceof
            if (e instanceof EmpleadoPlanta) {
                cantPlanta++;
                System.out.printf("[PLANTA] %-10s  Sueldo: $%.2f%n", e.getNombre(), sueldo);
            } else if (e instanceof EmpleadoTemporal) {
                cantTemporales++;
                System.out.printf("[TEMPORAL] %-10s  Sueldo: $%.2f%n", e.getNombre(), sueldo);
            } else {
                System.out.printf("[DESCONOCIDO] %-10s  Sueldo: $%.2f%n", e.getNombre(), sueldo);
            }
        }

        System.out.println("\n=== Resumen ===");
        System.out.println("Empleados de planta: " + cantPlanta);
        System.out.println("Empleados temporales: " + cantTemporales);
        System.out.printf("Total sueldos a pagar: $%.2f%n", totalSueldos);
    }
}
