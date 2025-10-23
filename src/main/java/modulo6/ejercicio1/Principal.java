package modulo6.ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1) Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Arroz 1Kg", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares BT", 8500, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera algodón", 3000, 80, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Tostadora", 2700, 25, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Yerba 1Kg", 1800, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println();

        // 2) Listar todos los productos mostrando su información y categoría.
        inventario.listarProductos();
        System.out.println();

        // 3) Buscar un producto por ID y mostrar su información.
        System.out.println("=== BUSCAR POR ID: P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println();

        // 4) Filtrar y mostrar productos que pertenezcan a una categoría específica.
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println();

        // 5) Eliminar un producto por su ID y listar los productos restantes.
        inventario.eliminarProducto("P002"); // Eliminamos "Auriculares BT"
        System.out.println();
        inventario.listarProductos();
        System.out.println();

        // 6) Actualizar el stock de un producto existente.
        inventario.actualizarStock("P005", 120); // Yerba pasa a 120 unidades
        System.out.println();

        // 7) Mostrar el total de stock disponible.
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("=== TOTAL DE STOCK DISPONIBLE ===");
        System.out.println("Unidades totales: " + totalStock);
        System.out.println();

        // 8) Obtener y mostrar el producto con mayor stock.
        System.out.println("=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
        System.out.println();

        // 9) Filtrar productos con precios entre $1000 y $3000.
        inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println();

        // 10) Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
    }
}
