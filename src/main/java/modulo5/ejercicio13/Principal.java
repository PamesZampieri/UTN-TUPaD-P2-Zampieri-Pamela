package modulo5.ejercicio13;

public class Principal {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario1 = new Usuario("pamela@example.com", "Pamela Zampieri");

        // Crear un generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generar un código QR para el usuario
        generador.generar("QR123456", usuario1);

        // Se genera otro QR para el mismo usuario
        generador.generar("QR987654", usuario1);
    }
}

