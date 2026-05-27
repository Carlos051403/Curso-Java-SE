import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
/*
        //RETO DE PRODUCCION SEMANA CON BUCLE for

        Scanner teclado = new Scanner(System.in);

        int totalTazasVendidas = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cuántas tazas se vendieron en el día " + i + "?");
            totalTazasVendidas += teclado.nextInt();
        }

        System.out.println("¡Resumen completado! Esta semana se han vendido un total de " + totalTazasVendidas + " tazas.");
        teclado.close();

 */
       // RETO DE ARQUEO DE CAJA DE TURNO

       Scanner teclado = new Scanner(System.in);

       double sumaTotal = 0.0;
       double montoIngresado = 80.00;

       while (montoIngresado != 0) {
           System.out.println("Ingresa el monto a sumar (Teclea 0 para finalizar el arqueo): ");
           montoIngresado = teclado.nextDouble();
           if (montoIngresado < 0) { // en el if tenia (teclado.nextDouble() < 0) cuando debia ser (montoIngresado < 0)
               System.out.println("Error: No puedes ingresar montos negativos");
           } else {
               sumaTotal += montoIngresado;
           }
       }

        System.out.println("Cierre de caja completado. El total recaudado en el turno es: " + sumaTotal + "euros");
        teclado.close();
    }
}

