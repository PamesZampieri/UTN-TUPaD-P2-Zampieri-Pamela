package modulo5.ejercicio9;

import java.sql.Time;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear paciente
        Paciente paciente = new Paciente("Juan Perez", "OSDE");

        // Crear profesional
        Profesional profesional = new Profesional("Dra. Ana Gomez", "Cardiología");

        // Crear cita médica y asociar paciente y profesional
        CitaMedica cita = new CitaMedica(new Date(), new Time(System.currentTimeMillis()));
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        // Mostrar datos de la cita
        System.out.println("Cita Médica:");
        System.out.println(cita);

        // Mostrar solo paciente
        System.out.println("\nPaciente asociado:");
        System.out.println(paciente);

        // Mostrar solo profesional
        System.out.println("\nProfesional asociado:");
        System.out.println(profesional);
    }
}
