package modulo8.ejercicio1;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito por: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        double finalConDesc = monto * (1 - (porcentaje / 100.0));
        System.out.println("Aplicando " + porcentaje + "% de descuento con Tarjeta → Total con descuento: $" + finalConDesc);
        return finalConDesc;
    }
}