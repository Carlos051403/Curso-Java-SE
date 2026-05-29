import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // RETO MARATÓN DEL INMIGRANTE
        // pedir datos a las personas dni, nombre y edad
        // determinar a que categoria se tiene que inscribir
        //informarle a la persona
        // no sabemos la cantidad de personas

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el DNI de la persona: ");
        String dni = teclado.nextLine();

        System.out.println("Ingrese el Nombre de la persona: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese la Edad de la persona: ");
        int edad = Integer.parseInt(teclado.nextLine());

        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {

            if (edad >= 6 && edad <= 10) {
                System.out.println("Pertenece a la categoria de Menores A");
            } else if (edad >= 11 && edad <= 17) {
                System.out.println("Pertenece a la categoria de  Menores B");
            } else if (edad >= 18 && edad <= 30) {
                System.out.println("Pertenece a la categoria de Juveniles");
            } else if (edad >= 31 && edad <= 50) {
                System.out.println("Pertenece a la categoria de Adultos");
            } else if (edad >= 51) {
                System.out.println("Pertenece a la categoria de Adultos Mayores");
            } else {
                System.out.println("Edad invalida, debes tener 6 años en adelante para poder inscribirte");
            }

            System.out.println("Ingrese el DNI de la persona: ");
            dni = teclado.nextLine();

            System.out.println("Ingrese el Nombre de la persona: ");
            nombre = teclado.nextLine();

            System.out.println("Ingrese la Edad de la persona: ");
            edad = Integer.parseInt(teclado.nextLine());
        }
    }
}