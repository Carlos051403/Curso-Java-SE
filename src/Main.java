import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.println("Nombre del Cliente: ");
        String cliente = teclado.nextLine();

        System.out.println("Cantidad de articulos a comprar: ");
        int cantidad = teclado.nextInt();

        System.out.println("Precio Base de Articulo Individual: ");
        double precioBase = teclado.nextDouble();

        double subtotal = cantidad * precioBase;
        double descuentos = 0.00;
        double costoEnvio = 0.00;
        double totalFinal = 0.00;

        if (cantidad <= 0){
            System.out.println("Error debes pedir al menos 1 articulo");
        }
        if (subtotal >= 100.0){
            descuentos = 0.15;
            costoEnvio = 0.0;
            System.out.println("¡ENVIO GRATIS!");
        } else if (subtotal <= 100.0 && subtotal >= 50.0) {
            descuentos = 0.05;
            costoEnvio = 5.50;
        } else {
            descuentos = 0.0;
            costoEnvio = 10.25;
        }

        totalFinal = ((subtotal - (subtotal * descuentos)) + costoEnvio) * 1.21;

        if (cantidad >= 1) {
            System.out.println("---FACTURA---");
            System.out.println("Nombre Cliente: " + cliente);
            System.out.println("Cantidad de articulos: " + cantidad);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Costo de Envio: " + costoEnvio);
            System.out.println("Total Final con Iva Incluido: " + totalFinal);
        }
        teclado.close();

    }
}