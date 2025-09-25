package modulo5.ejercicio6;

import java.sql.Time;
import java.util.Date;

public class Reserva {
    private Date fecha;
    private Time hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(Date fecha, Time hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                '}';
    }
}
