package modulo8.ejercicio1;

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto, double porcentaje);
}