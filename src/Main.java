import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Main {
    public static void main(String[] args) {

        // 1.----Vectores Avanzados "EL PODIO DE LA MARATON"------

        /*Scanner teclado = new Scanner(System.in);
        Double tiemposCarreras[] = new Double[5];

        for (int i = 0; i < tiemposCarreras.length; i++) {
            System.out.println("Ingresa el tiempo del corredor de la posicion: " + i);
            tiemposCarreras [i] = Double.parseDouble(teclado.nextLine());
        }

        Double tiempoMenor = tiemposCarreras[0];
        int posicionGanador = 0;

        for (int i = 1; i< tiemposCarreras.length; i++) {
            if (tiemposCarreras[i]<tiempoMenor) {
                tiempoMenor = tiemposCarreras [i];
                posicionGanador = i;
            }
        }
        System.out.println("El Ganador de la carrera es la posición: " + posicionGanador);
        System.out.println("Con un tiempo de: " + tiempoMenor);

        teclado.close();*/

        //2.------ EL CONCESIONARIO MATRICES + VECTORES COMBINADOS-------

        Scanner teclado = new Scanner(System.in);

        int ventas[][] = new int[3][3];
        int totalVentas[] = new int[3];

        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas.length; c++) {
                System.out.println("Ingresa una venta: " + f + c);
                ventas[f][c] = Integer.parseInt(teclado.nextLine());
            }
        }
        for (int f = 0; f < ventas.length; f++) {
            int sumaFila = 0;
            for (int c = 0; c < ventas.length; c++) {
                sumaFila += ventas[f][c];
            }
            totalVentas [f] = sumaFila;
        }
        for (int i=0; i< totalVentas.length; i++) {
            System.out.println("El vendedor" + i + "vendió un total de: " + totalVentas[i]);
        }
        teclado.close();
    }
}