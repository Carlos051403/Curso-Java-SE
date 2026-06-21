package igu;

import logica.ControladoraLogica;

import java.util.Scanner;

public class Pantalla {

    ControladoraLogica control = new ControladoraLogica();
    Scanner teclado = new Scanner(System.in);

   public void menuPrincipal() {
       int opcion;

       do {
           System.out.println("1. Ver Estado de suministros");
           System.out.println("2. Servir Café");
           System.out.println("3. Recargar Maquina");
           System.out.println("4. Apagar Maquina");

           System.out.println("Elige una opcion: ");
           opcion = Integer.parseInt(teclado.nextLine());

           switch (opcion) {
               case 1:
                   System.out.println("Estado de suministros");
                   System.out.println("Agua: " + control.agua + " ml");
                   System.out.println("Café: " + control.cafe + " g");
                   System.out.println("Vasos: " + control.vasos + " unidades");
                   break;

               case 2:
                   boolean cafeServido = false;

                   while (!cafeServido) {
                       System.out.println("¿Que café deseas? ¿Expreso o Largo?: ");
                       String tipoCafe = teclado.nextLine();

                       cafeServido = control.servirCafe(tipoCafe);

                       if (cafeServido) {
                           System.out.println("¡Café servido con éxito! Disfrútelo.");
                       }else {
                           System.out.println("Seleccione una opcion valida");
                       }
                   }
                   break;

               case 3:
                   boolean cargaExitosa = false;

                   while (!cargaExitosa) {
                       System.out.println("Elige producto a recargar: ");
                       String producto = teclado.nextLine();

                       System.out.println("Que cantidad deseas recargar?");
                       int cantidad = Integer.parseInt(teclado.nextLine());

                       cargaExitosa = control.recargarSuministros(producto, cantidad);

                       if (!cargaExitosa){
                           System.out.println("Producto no existe, selecciona opcion valida: ");
                       }
                   }
                   System.out.println("¡Suministros actualizados con éxito!");
                   break;

               case 4:
                   System.out.println("Apagando Maquina");
                   break;

               default:
                   System.out.println("Opcion no Valida");
           }
       } while (opcion != 4) ;
   }
}
