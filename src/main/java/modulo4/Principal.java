package modulo4;

public class Principal {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Pamela Zampieri", "Programadora Junior", 2000000.0);
        Empleado empleado2 = new Empleado("Mauro Bastasini", "Technical Leader");
        Empleado empleado3 = new Empleado("María Laura Paván", "Project Leader");

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println();

        System.out.println("Se aumenta sueldo empleados: ");
        empleado1.actualizarSalario(10);
        System.out.println("Aumento del 10% -> " + empleado1);
        empleado2.actualizarSalario(1000000.0);
        System.out.println("Aumento de $1.000.000 -> " + empleado2);
        empleado3.actualizarSalario(500000.0);
        System.out.println("Aumento de $500.000 -> " + empleado3);

        System.out.println("\nEl total de los empleados es: " + Empleado.mostrarTotalEmpleados());
    }
}