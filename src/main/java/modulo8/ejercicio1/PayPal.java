package modulo8.ejercicio1;

public class PayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado: $" + monto);
    }
}
