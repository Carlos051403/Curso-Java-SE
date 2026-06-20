package igu;

import logica.ControladoraLogica;

import java.util.Scanner;

public class Pantalla {

    //Esto hace la funcion como el Scanner toca crear el objeto para llamar a la logica
    ControladoraLogica logica = new ControladoraLogica();

    //Aca creamos el metodo del menu en el cual ira el swich y el bucle
    public void menuPrincipal(){

        //La variable Scanner y opcion van aqui porque pertenecen a la interaccion del menu
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Ver stock actual");
            System.out.println("2. Añadir stock");
            System.out.println("3. Restar stock");
            System.out.println("4. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Mugs: " + logica.mugs);
                    System.out.println("Camisetas: " + logica.camisetas);
                    System.out.println("Llaveros: " + logica.llaveros);
                    break;

                case 2:
                    String producto;
                    System.out.println("Selecciona Producto: ");
                    producto = teclado.nextLine();

                    System.out.println("¿Cuanto añadiras al Stock?: ");
                    int cantidad = Integer.parseInt(teclado.nextLine());

                    logica.agregarStock(producto, cantidad);
                    break;

                case 3:
                    System.out.println("Selecciona Producto: ");
                    producto = teclado.nextLine();

                    System.out.println("¿Cuanto restaras al Stock?: ");
                    cantidad = Integer.parseInt(teclado.nextLine());

                    logica.restarStock(producto, cantidad);
                    break;

                case 4:
                    System.out.println("Saliendo del Sistema....");
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
