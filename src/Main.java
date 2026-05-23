import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // -----RETO CAJA REGISTRADORA-----
        double precioTazas = 10.00;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola!, Por favor introduce tu nombre completo: ");
        String nombre = teclado.nextLine();

        System.out.println("¿Cuantas Tazas deseas comprar?: ");
        int cantidadTazas = teclado.nextInt();

        double totalAPagar = 0.0;
        double descuento = 0.0;

        if (cantidadTazas <= 0) {
            System.out.println("Error: Debes pedir al menos 1 taza");
        } else if (cantidadTazas >= 1 && cantidadTazas <= 5) {
            totalAPagar = cantidadTazas * precioTazas;
            System.out.println("El total a pagar es de: " + totalAPagar + " Gracias por su pedido estándar");
        } else if (cantidadTazas >= 6 && cantidadTazas <= 11) {
            descuento = 0.10;
            totalAPagar = (cantidadTazas * precioTazas) * (1 - descuento);
            System.out.println("Has obtenido un 10% de descuento, El total a pagar es de: " + totalAPagar + " Gracias por su pedido!");
        } else if (cantidadTazas >= 12) {
            descuento = 0.20;
            totalAPagar = (cantidadTazas * precioTazas) * (1 - descuento);
            System.out.println("Has obtenido un 20% de descuento, El total a pagar es de: " + totalAPagar +
                    " ¡Felicidades! Al ser un pedido mayorista, tu envío es totalmente GRATIS.");
        }
        System.out.println("----TICKET DE COMPRA----");
        System.out.println("Cliente: " + nombre);
        System.out.println("Cantidad de Tazas: " + cantidadTazas);
        System.out.println("Total a Pagar: " + totalAPagar);

        teclado.close();

        //----CODIGO REFACTORIZADO----
        /*
                // 1. Declaración inicial
                double precioTazas = 10.00;
                Scanner teclado = new Scanner(System.in);

                System.out.println("Hola! Por favor introduce tu nombre completo:");
                String nombre = teclado.nextLine();

                System.out.println("¿Cuantas Tazas deseas comprar?:");
                int cantidadTazas = teclado.nextInt();

                double totalAPagar = 0.0;
                double descuento = 0.0;

                // 2. Control de errores primero (Validamos la trampa ninja)
                if (cantidadTazas <= 0) {
                    System.out.println("Error: Debes pedir al menos 1 taza.");
                    // Si entra aquí, el programa termina. Ya no calcula ni imprime el ticket.
                }
                else {
                    // Si el cliente pide 1 taza o más, entra a la lógica normal de venta.

                    // Calculamos el subtotal (Sin importar el descuento, esto siempre se hace igual)
                    double subtotal = cantidadTazas * precioTazas;

                    // Asignamos el porcentaje de descuento según el volumen
                    if (cantidadTazas >= 1 && cantidadTazas <= 5) {
                        descuento = 0.0; // 0% de descuento
                        System.out.println("Gracias por su pedido estándar.");
                    }
                    else if (cantidadTazas >= 6 && cantidadTazas <= 11) {
                        descuento = 0.10; // 10% de descuento
                        System.out.println("Has obtenido un 10% de descuento.");
                    }
                    else if (cantidadTazas >= 12) {
                        descuento = 0.20; // 20% de descuento
                        System.out.println("Has obtenido un 20%. ¡Felicidades! Al ser mayorista, tu envío es GRATIS.");
                    }

                    // Calculamos el precio final aplicando D.R.Y (Una sola fórmula matemática para todos)
                    totalAPagar = subtotal - (subtotal * descuento);

                    // Imprimimos el ticket DENTRO del 'else' (solo se imprime si la compra fue exitosa)
                    System.out.println("----TICKET DE COMPRA----");
                    System.out.println("Cliente: " + nombre);
                    System.out.println("Cantidad de Tazas: " + cantidadTazas);
                    System.out.println("Total a Pagar: " + totalAPagar + " euros");
                }

                teclado.close();
            }
        } */
    }
}