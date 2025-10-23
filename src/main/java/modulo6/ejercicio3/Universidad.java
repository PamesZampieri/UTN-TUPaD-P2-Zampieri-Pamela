package modulo6.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("No se agregó. Ya existe un profesor con ID " + p.getId());
            return;
        }
        profesores.add(p);
        System.out.println("Profesor agregado: " + p.getNombre() + " (ID " + p.getId() + ")");
    }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("No se agregó. Ya existe un curso con código " + c.getCodigo());
            return;
        }
        cursos.add(c);
        System.out.println("Curso agregado: " + c.getCodigo() + " - " + c.getNombre());
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso == null) {
            System.out.println("No existe curso con código: " + codigoCurso);
            return;
        }
        if (profesor == null) {
            System.out.println("No existe profesor con id: " + idProfesor);
            return;
        }
        curso.setProfesor(profesor);
        System.out.println("Asignado profesor " + profesor.getNombre() + " al curso " + curso.getCodigo());
    }

    public void listarProfesores() {
        System.out.println("=== Profesores en " + nombre + " ===");
        if (profesores.isEmpty()) {
            System.out.println("(sin profesores)");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("=== Cursos en " + nombre + " ===");
        if (cursos.isEmpty()) {
            System.out.println("(sin cursos)");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null);
            cursos.remove(curso);
            System.out.println("Se eliminó el curso " + codigo);
        } else {
            System.out.println("No se encontró curso con código " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso c : new ArrayList<>(cursos)) {
                if (c.getProfesor() == profesor) {
                    c.setProfesor(null);
                }
            }
            profesores.remove(profesor);
            System.out.println("Se eliminó el profesor " + profesor.getNombre() + " (ID " + id + ")");
        } else {
            System.out.println("No se encontró profesor con ID " + id);
        }
    }

    public void reporteCursosPorProfesor() {
        System.out.println("=== Reporte: cantidad de cursos por profesor ===");
        if (profesores.isEmpty()) {
            System.out.println("(sin profesores)");
            return;
        }
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.cantidadCursos() + " curso(s)");
        }
    }
}
