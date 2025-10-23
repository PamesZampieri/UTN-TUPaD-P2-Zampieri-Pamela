package modulo6.ejercicio1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) != null) {
            System.out.println("No se agregó. Ya existe un producto con ID " + p.getId());
            return;
        }
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre() + " (ID " + p.getId() + ")");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("=== LISTA DE PRODUCTOS ===");
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            encontrado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para producto " + id + " → " + nuevaCantidad + " unidades.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        boolean alguno = false;
        System.out.println("=== FILTRO POR CATEGORÍA: " + categoria + " ===");
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                alguno = true;
            }
        }
        if (!alguno) System.out.println("No hay productos en la categoría " + categoria + ".");
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        boolean alguno = false;
        System.out.println("=== FILTRO POR PRECIO: $" + min + " a $" + max + " ===");
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                alguno = true;
            }
        }
        if (!alguno) System.out.println("No hay productos en ese rango de precios.");
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("=== CATEGORÍAS DISPONIBLES ===");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " → " + c.getDescripcion());
        }
    }
}
