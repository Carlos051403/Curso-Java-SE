package igu;

import logica.ControladorLogica;

import java.util.Scanner;

public class PantallaConsola {
    ControladorLogica controlLogica = new ControladorLogica();
    Scanner teclado = new Scanner(System.in);

    public void mostrarPantalla () {
        System.out.println("Escribe el nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Escribe el DNI: ");
        String dni = teclado.nextLine();

        System.out.println("Escribe la Edad: ");
        int edad = Integer.parseInt(teclado.nextLine());

        controlLogica.validarYRegistrarCliente(nombre, dni, edad);
    }
}
