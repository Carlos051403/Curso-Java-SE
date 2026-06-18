import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        int mugs = 10;
        int camisetas = 10;
        int llaveros = 10;

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Ver stock actual");
            System.out.println("2. Añadir stock");
            System.out.println("3. Restar stock");
            System.out.println("4. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Mugs: " + mugs);
                    System.out.println("Camisetas: " + camisetas);
                    System.out.println("Llaveros: " + llaveros);
                    break;

                case 2:
                    String producto;
                    System.out.println("Selecciona Producto: ");
                    producto = teclado.nextLine();

                    System.out.println("¿Cuanto añadiras al Stock?: ");
                    int cantidad = Integer.parseInt(teclado.nextLine());

                    if (producto.equalsIgnoreCase("mugs")) {
                        mugs += cantidad;
                    } else if (producto.equalsIgnoreCase ("camisetas")) {
                        camisetas += cantidad;
                    } else if (producto.equalsIgnoreCase("llaveros")) {
                        llaveros += cantidad;
                    } else {
                        System.out.println("Producto no existe");
                    }
                    break;

                case 3:
                    System.out.println("Selecciona Producto: ");
                    producto = teclado.nextLine();

                    System.out.println("¿Cuanto restaras al Stock?: ");
                    cantidad = Integer.parseInt(teclado.nextLine());

                    if (producto.equalsIgnoreCase("mugs")) {
                        mugs -= cantidad;
                    } else if (producto.equalsIgnoreCase ("camisetas")) {
                        camisetas -= cantidad;
                    } else if (producto.equalsIgnoreCase("llaveros")) {
                        llaveros -= cantidad;
                    } else {
                        System.out.println("Producto no existe");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del Sistema....");
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo.");
            }
        } while (opcion != 4);
    }
}