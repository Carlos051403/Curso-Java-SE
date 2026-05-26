import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola! Elige el numero de tu opción deseada: ");
        int opcion = teclado.nextInt();
        String opcionElegida = "Opción Elegida";

        // Asi lo hice la primera vez

       /* switch (opcion) {

            case 1: opcionElegida = "Verificar acceso de un cliente";
            break;
            case 2: opcionElegida = "Aplicar recarga con bono promocional";
            break;
            case 3: opcionElegida = "Cerrar el sistema";
            break;
            default: opcionElegida = "Opcion Invalida";
            break;
        }

        int edad;
        double recarga;
        double saldo;
        if ( opcion == 1) {
            System.out.println("Que edad tiene el cliente: ");
            edad = teclado.nextInt();
            String condicionAcceso = edad >= 18 ? "Autorizado" : "Denegado";
            System.out.println("Acceso: " + condicionAcceso);
        } else if (opcion == 2) {
            System.out.println("Cuanto desea recargar? : ");
            recarga = teclado.nextDouble();
            saldo = (recarga * 0.05) + recarga;
            System.out.println("Su saldo total es de: " + saldo);
        } else if (opcion == 3) {
            System.out.println("Cerrando Terminal. ¡Buen Turno!");
        } */

        // COMO DEBI REDACTARLO
        int edad;
        String resultado;
        double recarga;
        double saldo;
        switch (opcion) {
            case 1:
                System.out.println("Que edad tiene el cliente?");
                edad = teclado.nextInt();
                resultado = (edad >= 18) ? "Acceso Autorizado" : "Acceso Denegado";
                System.out.println(resultado);
                break; // El break es OBLIGATORIO para que no siga ejecutando lo de abajo

            case 2:
                System.out.println("Cuanto saldo desea recargar?");
                recarga = teclado.nextDouble();
                saldo = recarga * 1.05;
                System.out.println("Su nuevo saldo es de: " + saldo);
                break;

            case 3:
                System.out.println("Cerrando terminal. ¡Buen turno!");
                break;

            default:
                // ¡Aquí entra cualquier número que no sea 1, 2 o 3!
                System.out.println("Error: Opción no válida.");
                break;
        }
    }
}