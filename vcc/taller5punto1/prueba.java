public class prueba {

    public static void main(String[] args) {
        producto producto1 = new producto("Televisor", 2500.00, 100);

        producto1.mostrarInfo();

        System.out.println("nombre: " + producto1.nombre);
        System.out.println("precio: " + producto1.precio);
        System.out.println("stock: " + producto1.stock);
    }
}

class producto {
    String nombre;
    double precio;
    int stock;

    public producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}