package modulo3;

public class Principal {
    public static void main(String[] args) {
        // 1. Registro de Estudiantes
        Estudiante estudiante = new Estudiante();

        estudiante.mostrarDatos();
        estudiante.mostrarCalificacion();
        System.out.println();

        estudiante.setNombre("Pamela");
        estudiante.setApellido("Zampieri");
        estudiante.setCurso("Programación 2");
        estudiante.setCalificacion(8.0);
        estudiante.mostrarDatos();
        estudiante.mostrarCalificacion();
        System.out.println();

        estudiante.subirCalificacion(2.0);
        estudiante.bajarCalificacion(1.0);
        estudiante.mostrarDatos();
        estudiante.mostrarCalificacion();

        // 2.  Registro de Mascotas
        Mascota mascota = new Mascota();

        mascota.mostrarInfo();
        System.out.println();

        mascota.setNombre("Pepa");
        mascota.setEspecie("Loro");
        mascota.setEdad(23);
        mascota.mostrarInfo();
        System.out.println();

        mascota.cumplirAnios();
        mascota.mostrarInfo();
        System.out.println();

        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
        System.out.println();

        // 3. Encapsulamiento con la Clase Libro
        Libro libro = new Libro();
        libro.setTitulo("Las ventajas de ser invisible");
        libro.setAutor("Stephen Chbosky");
        libro.setAnioPublicacion(-13);
        libro.mostrarInfo();
        System.out.println();

        libro.setAnioPublicacion(1999);
        libro.mostrarInfo();

        // 4. Gestión de Gallinas en Granja Digital
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);
        gallina1.setEdad(1);
        gallina1.setHuevosPuestos(20);
        gallina1.mostrarEstado();
        System.out.println();

        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(2);
        gallina2.setHuevosPuestos(40);
        gallina2.mostrarEstado();
        System.out.println();

        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.mostrarEstado();
        System.out.println();

        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.mostrarEstado();
        System.out.println();

        // 5. Simulación de Nave Espacial
        NaveEspacial naveEspacial = new NaveEspacial();
        naveEspacial.setNombre("Apolo 11");
        naveEspacial.setCombustible(50);

        naveEspacial.mostrarEstado();
        System.out.println();

        naveEspacial.avanzar(60);
        System.out.println();

        naveEspacial.recargarCombustible(150);
        naveEspacial.mostrarEstado();
        System.out.println();

        naveEspacial.despegar();
        naveEspacial.avanzar(100);
        naveEspacial.mostrarEstado();
    }
}
