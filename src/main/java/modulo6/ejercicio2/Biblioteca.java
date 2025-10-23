package modulo6.ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("No se agregó. Ya existe un libro con ISBN " + isbn);
            return;
        }
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo + " (ISBN " + isbn + ")");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("=== Listado de libros en " + nombre + " ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = null;
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Se eliminó el libro: " + libroAEliminar.getTitulo() + " (ISBN " + isbn + ")");
        } else {
            System.out.println("No se encontró libro con ISBN " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores porque no hay libros cargados.");
            return;
        }
        System.out.println("=== Autores disponibles en la biblioteca ===");
        Set<String> idsMostrados = new HashSet<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (idsMostrados.add(autor.getId())) {
                autor.mostrarInfo();
            }
        }
    }
}
