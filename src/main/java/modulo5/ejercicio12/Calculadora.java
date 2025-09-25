package modulo5.ejercicio12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("El monto del impuesto que debe abonar el contribuyente: " + impuesto.getContribuyente() +
                " es: $ " + impuesto.getMonto());
    }
}
