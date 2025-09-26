package modulo5.ejercicio1;

import java.util.Date;

public class Pasaporte {
    private String numero;
    private Foto foto;
    private Date fechaEmision;
    private Titular titular;

    public Pasaporte(String numero, int idFoto, String formatoFoto, Date fechaEmision) {
        this.numero = numero;
        this.foto = new Foto(idFoto, formatoFoto);
        this.fechaEmision = fechaEmision;
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", foto=" + foto +
                ", fechaEmision=" + fechaEmision +
                ", titular=" + titular +
                '}';
    }
}
