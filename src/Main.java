import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. - EJERCICIO MOSTRAR NUMEROS HASTA EL LIMITE
        // tenemos un limite hasta el que tenemos que contar
        // ingresar ese limite

       /* System.out.println("Ingrese el límite hasta el que quiere contar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int cont = 1;

        while (cont <= limite) {
            System.out.println(cont);
            cont += 1;
        }
        teclado.close(); */

        // 2. - EJERCICIO CONTAR DE 2 EN 2
        /*Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en 2.
        La secuencia deberia ser: 200... 202... 204... etc */
        /*int cont = 200;
        while (cont <= 250) {
            System.out.println(cont);
            cont += 2;
        }*/

        // 3. - Ejercicio Ingreso de palabra controlado por centinela

        System.out.println("Ingrese una palabra: ");
        Scanner teclado = new Scanner(System.in);

        String palabra = teclado.nextLine();

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " + palabra);

            System.out.println("Ingrese una palabra: ");
            palabra = teclado.nextLine();

        }
        teclado.close();
    }
}