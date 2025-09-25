package modulo5.ejercicio3;

public class Principal {
    public static void main(String[] args) {
        // Crear editorial
        Editorial editorial = new Editorial("Planeta", "Calle Falsa 123");

        // Crear autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");

        // Crear libro con editorial
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", editorial);

        // Asociar autor al libro (unidireccional)
        libro.setAutor(autor);

        // Mostrar relaciones
        System.out.println("Libro -> Autor:");
        System.out.println("Autor del libro: " + libro.getAutor().getNombre() +
                " (" + libro.getAutor().getNacionalidad() + ")");

        System.out.println("\nLibro -> Editorial:");
        System.out.println("Editorial del libro: " + libro.getEditorial().getNombre() +
                ", Dirección: " + libro.getEditorial().getDireccion());
    }
}
