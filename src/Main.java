import igu.Pantalla;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // Se crea el objeto de la pantalla para poder usarlo
        Pantalla ventana = new Pantalla();

        // Activamos el boton que arranca todo el bucle del menú
        ventana.menuPrincipal();
    }
}