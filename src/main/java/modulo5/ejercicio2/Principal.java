package modulo5.ejercicio2;

public class Principal {
    public static void main(String[] args) {

        // Crear batería
        Bateria bateria = new Bateria("Li-Ion", 4000);

        // Crear usuario
        Usuario usuario = new Usuario("Pamela Zampieri", "33230742");

        // Crear celular y asignarle batería
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S23", bateria);

        // Establecer relación bidireccional Celular ↔ Usuario
        celular.setUsuario(usuario);
        usuario.setCelular(celular);

        // Mostrar relaciones
        System.out.println("Celular -> Usuario:");
        System.out.println("Usuario del celular: " + celular.getUsuario().getNombre());

        System.out.println("\nUsuario -> Celular:");
        System.out.println("Celular del usuario: " + usuario.getCelular().getModelo());

        System.out.println("\nCelular -> Batería:");
        System.out.println("Modelo de la batería: " + celular.getBateria().getModelo());
        System.out.println("Capacidad de la batería: " + celular.getBateria().getCapacidad() + " mAh");
    }
}

