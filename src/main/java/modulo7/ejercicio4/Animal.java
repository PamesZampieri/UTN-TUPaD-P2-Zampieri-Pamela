package modulo7.ejercicio4;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void describirAnimal() {
        System.out.println("Soy un " + nombre);
    }
}
