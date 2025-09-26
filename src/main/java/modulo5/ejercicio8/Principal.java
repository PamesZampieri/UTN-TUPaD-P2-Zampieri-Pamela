package modulo5.ejercicio8;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Pamela Zampieri", "pamela@email.com");

        // Crear un documento con firma digital (se crea la firma dentro del documento y se asocia al usuario)
        Documento documento = new Documento(
                "Contrato Laboral",
                "Contenido del contrato...",
                "ABC123XYZ",
                new Date(),
                usuario
        );

        // Mostrar los datos del documento completo
        System.out.println("📄 Documento:");
        System.out.println(documento);

        // Mostrar solo la firma digital
        System.out.println("\n🔏 Firma Digital del documento:");
        System.out.println(documento.getFirmaDigital());

        // Mostrar solo el usuario que firmó
        System.out.println("\n👤 Usuario asociado a la firma:");
        System.out.println(documento.getFirmaDigital().getUsuario());
    }
}
