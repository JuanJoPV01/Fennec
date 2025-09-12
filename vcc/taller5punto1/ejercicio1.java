 class ejercicio1 {
    String nombre;
    Double precio;
    int stock;

    ejercicio1(String nombre, Double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
    }
    
}
class Main {
    public static void main(String[] args) {
        ejercicio1 producto1 = new ejercicio1("Televisor", 2500.00, 100);
        ejercicio1 producto2 = new ejercicio1("Telefono", 800.00, 150);
        
        producto1.mostrarInfo();
        System.out.println();
        producto2.mostrarInfo();
    }

    
}