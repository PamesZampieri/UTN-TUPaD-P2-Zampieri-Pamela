package modulo5.ejercicio14;

public class Principal {
    public static void main(String[] args) {
        // Crear un proyecto
        Proyecto proyecto1 = new Proyecto("Video Tutorial", 15);

        // Crear un editor de video
        EditorVideo editor = new EditorVideo();

        // Exportar un render del proyecto en formato MP4
        editor.exportar("MP4", proyecto1);

        // Exportar otro render del mismo proyecto en formato AVI
        editor.exportar("AVI", proyecto1);
    }
}
