package modulo5.ejercicio11;

public class Principal {
    public static void main(String[] args) {
        // Crear un artista
        Artista artista = new Artista("Shakira", "Pop");

        // Crear una canción y asignarle el artista
        Cancion cancion = new Cancion("Hips Don't Lie");
        cancion.setArtista(artista);

        // Crear un reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el reproductor para reproducir la canción
        reproductor.reproducir(cancion);
    }
}
