package modulo7.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Crear lista polimórfica de animales
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Perro"));
        animales.add(new Gato("Gato"));
        animales.add(new Vaca("Vaca"));

        // Mostrar descripción y sonido de cada uno
        System.out.println("=== Sonidos de los animales ===");
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("-----------------------------");
        }
    }
}

