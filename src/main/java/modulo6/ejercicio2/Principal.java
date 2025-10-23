package modulo6.ejercicio2;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // 1) Creamos una biblioteca.
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // 2) Crear al menos tres autores.
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A003", "Haruki Murakami", "Japón");

        // 3) Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblio.agregarLibro("ISBN-001", "Ficciones", 1944, a1);
        biblio.agregarLibro("ISBN-002", "El Aleph", 1949, a1);
        biblio.agregarLibro("ISBN-003", "La casa de los espíritus", 1982, a2);
        biblio.agregarLibro("ISBN-004", "Kafka en la orilla", 2002, a3);
        biblio.agregarLibro("ISBN-005", "Tokio Blues (Norwegian Wood)", 1987, a3);

        System.out.println();

        // 4) Listar todos los libros con su información y la del autor.
        biblio.listarLibros();
        System.out.println();

        // 5) Buscar un libro por su ISBN y mostrar su información.
        System.out.println("=== Buscar por ISBN: ISBN-003 ===");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN-003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }
        System.out.println();

        // 6) Filtrar y mostrar los libros publicados en un año específico.
        int anioFiltro = 1949;
        System.out.println("=== Libros publicados en el año " + anioFiltro + " ===");
        List<Libro> porAnio = biblio.filtrarLibrosPorAnio(anioFiltro);
        if (porAnio.isEmpty()) {
            System.out.println("No hay libros del año " + anioFiltro + ".");
        } else {
            for (Libro l : porAnio) l.mostrarInfo();
        }
        System.out.println();

        // 7) Eliminar un libro por su ISBN y listar los libros restantes.
        biblio.eliminarLibro("ISBN-002"); // El Aleph
        System.out.println();
        biblio.listarLibros();
        System.out.println();

        // 8) Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("=== Cantidad total de libros ===");
        System.out.println("Total: " + biblio.obtenerCantidadLibros());
        System.out.println();

        // 9) Listar todos los autores de los libros disponibles en la biblioteca.
        biblio.mostrarAutoresDisponibles();
    }
}
