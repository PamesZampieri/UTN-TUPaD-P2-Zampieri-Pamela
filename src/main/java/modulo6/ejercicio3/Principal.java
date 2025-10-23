package modulo6.ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional de ChatGPT");

        // 1) Crear al menos 3 profesores y 5 cursos.
        Profesor pr1 = new Profesor("PR001", "Ada Lovelace", "Algoritmos");
        Profesor pr2 = new Profesor("PR002", "Edsger Dijkstra", "Teoría de Grafos");
        Profesor pr3 = new Profesor("PR003", "Barbara Liskov", "POO");

        Curso c1 = new Curso("CS101", "Introducción a la Programación");
        Curso c2 = new Curso("CS201", "Estructuras de Datos");
        Curso c3 = new Curso("CS301", "Algoritmos");
        Curso c4 = new Curso("CS401", "Sistemas Operativos");
        Curso c5 = new Curso("CS501", "POO Avanzada");

        // 2) Agregar profesores y cursos a la universidad.
        uni.agregarProfesor(pr1);
        uni.agregarProfesor(pr2);
        uni.agregarProfesor(pr3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println();

        // 3) Asignar profesores a cursos usando asignarProfesorACurso(...)
        uni.asignarProfesorACurso("CS101", "PR001");
        uni.asignarProfesorACurso("CS201", "PR002");
        uni.asignarProfesorACurso("CS301", "PR002");
        uni.asignarProfesorACurso("CS401", "PR003");
        uni.asignarProfesorACurso("CS501", "PR003");

        System.out.println();

        // 4) Listar cursos con su profesor y profesores con sus cursos.
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();
        System.out.println();
        pr1.listarCursos();
        pr2.listarCursos();
        pr3.listarCursos();
        System.out.println();

        // 5) Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("=== Cambio de profesor: CS301 -> PR003 ===");
        uni.asignarProfesorACurso("CS301", "PR003");
        pr2.listarCursos(); // Dijkstra ya no debe tener CS301
        pr3.listarCursos(); // Liskov ahora debe tener CS301
        System.out.println();

        // 6) Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("=== Eliminar curso CS401 ===");
        uni.eliminarCurso("CS401");
        pr3.listarCursos();
        System.out.println();

        // 7) Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("=== Eliminar profesor PR002 (Dijkstra) ===");
        uni.eliminarProfesor("PR002");
        uni.listarCursos();
        System.out.println();

        // 8) Reporte: cantidad de cursos por profesor.
        uni.reporteCursosPorProfesor();
    }
}
