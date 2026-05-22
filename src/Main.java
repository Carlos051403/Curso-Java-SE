import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, Por favor ingresa tu nombre completo: ");
        String nombre = teclado.nextLine();

        System.out.println("Cuanto dinero quieres recargar en tu tarjeta de juego?: ");
        double recarga = teclado.nextDouble();

        double saldo = 0;

        if (recarga < 20) {
            saldo = recarga;
            System.out.println("Muchas gracias por tu recarga de " + recarga + " Mucha Suerte!");
        } else if (recarga >= 20 && recarga <50) {
            saldo = recarga + (recarga * 0.10);
            System.out.println("Muchas gracias por tu recarga de " + recarga + " Ten un Regalo del 10% tu saldo ahora es de: " + saldo + " Mucha Suerte!");
        }
        else if (recarga >= 50) {
            saldo = recarga + (recarga * 0.20);
            System.out.println("Muchas gracias por tu recarga de " + recarga +
                    " Ten un Regalo del 20% tu saldo ahora es de: " + saldo + "¡ Tienes derecho a una bebida gratis en barra! Mucha Suerte!");
        }
        System.out.println("Muchas gracias por usar nuestras plataformas de recarga: " + nombre + " Tu saldo total es de: " + saldo);
    }
}