import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        // Genera un número aleatorio entre 0 y 99, le sumamos 1 para que sea del 1 al 100
        int numeroSecreto = generador.nextInt(100);

        int intento = 0; // número que ingrese el usuario

        System.out.println("¡BIENVENIDO AL JUEGO DE ADIVINANZA!");
        System.out.println("He pensado un número entre el 1 y 100. ¿Puedes adivinarlo?");

        do {
            System.out.println("Ingresa tu número");
            intento = Integer.parseInt(teclado.nextLine());

            if (intento > numeroSecreto){
                System.out.println("X Es menor. ¡Sigue intentando!");
            } else if (intento < numeroSecreto) {
                System.out.println("X Es mayor. ¡Sigue intentando!");
            } else {
                System.out.println("¡ACERTASTE! El número secreto era: " + numeroSecreto);
            }
        } while (intento != numeroSecreto);

    }
}
