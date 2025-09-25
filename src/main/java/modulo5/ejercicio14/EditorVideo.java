package modulo5.ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);

        System.out.println("Se exportó el siguiente render: " + render + " del Proyecto: " + proyecto);
    }
}
