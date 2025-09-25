package modulo5.ejercicio8;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Pamela Zampieri", "pamela@email.com");

        // Crear un documento con firma digital y asociar el usuario
        Documento documento = new Documento(
                "Contrato Laboral",
                "Contenido del contrato...",
                "ABC123XYZ",
                new Date(),
                usuario
        );

        // Mostrar los datos del documento
        System.out.println("Documento:");
        System.out.println(documento);

        // Mostrar solo el usuario
        System.out.println("\nUsuario asociado:");
        System.out.println(usuario);

        // Mostrar solo la firma digital
        System.out.println("\nFirma Digital del documento:");
        System.out.println(documento.getFirmaDigital());
    }
}
