package modulo7.ejercicio2;

public class Principal {
    public static void main(String[] args) {
        // Crear un array de figuras (polimorfismo)
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo 1", 5.0);
        figuras[1] = new Rectangulo("Rectángulo 1", 4.0, 6.0);
        figuras[2] = new Circulo("Círculo 2", 2.5);

        // Mostrar el área de cada figura
        System.out.println("=== Áreas de las Figuras ===");
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " → Área = " + f.calcularArea());
        }
    }
}
