package modulo8.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido implements Pagable {
    private final List<Producto> productos = new ArrayList<>();
    private final Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "CREADO";
        cliente.notificar("Se creó tu pedido.");
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        cliente.notificar("Se agregó el producto: " + p.getNombre());
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió a estado: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }

    public Cliente getCliente() { return cliente; }
    public String getEstado() { return estado; }
    public List<Producto> getProductos() { return Collections.unmodifiableList(productos); }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() + " " + productos + " | Estado: " + estado + " | Total: $" + calcularTotal();
    }
}
