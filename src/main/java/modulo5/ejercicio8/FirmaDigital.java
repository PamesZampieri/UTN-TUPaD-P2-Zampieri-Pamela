package modulo5.ejercicio8;

import java.util.Date;

public class FirmaDigital {
    private String codigoHash;
    private Date fecha;

    public FirmaDigital(String codigoHash, Date fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" +
                "codigoHash='" + codigoHash + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
