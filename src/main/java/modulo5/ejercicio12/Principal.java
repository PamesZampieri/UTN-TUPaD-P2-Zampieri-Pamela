package modulo5.ejercicio12;

public class Principal {
    public static void main(String[] args) {
        // Crear un contribuyente
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20-12345678-9");

        // Crear un impuesto asociado al contribuyente
        Impuesto impuesto = new Impuesto(50000.0);
        impuesto.setContribuyente(contribuyente);

        // Crear la calculadora
        Calculadora calculadora = new Calculadora();

        // Usar la calculadora para calcular el impuesto
        calculadora.calcular(impuesto);
    }
}
