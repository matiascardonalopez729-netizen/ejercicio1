import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definir tamaño de la matriz (ejemplo: 2x2)
        int filas = 2;
        int columnas = 2;
        producto[][] matriz = new producto[filas][columnas];

        // Ingresar productos
        System.out.println("Ingrese la información de los productos:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Producto en posición (" + i + "," + j + "):");
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                matriz[i][j] = new producto(nombre, precio, cantidad);
            }
        }

        // Crear almacén
        Almacen almacen = new Almacen(matriz);

        // Buscar producto
        System.out.print("\nIngrese el nombre del producto a buscar: ");
        String nombrebuscado = sc.nextLine();

        String resultado = almacen.buscarproducto(nombrebuscado);
        System.out.println(resultado);

        sc.close();
    }
}
