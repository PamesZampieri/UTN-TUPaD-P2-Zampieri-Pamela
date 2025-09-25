package modulo5.ejercicio9;

import java.sql.Time;
import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private Time hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(Date fecha, Time hora) {
        this.fecha = fecha;
        this.hora = hora;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", paciente=" + paciente +
                ", profesional=" + profesional +
                '}';
    }
}
