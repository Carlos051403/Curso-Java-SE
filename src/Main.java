import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    /*
        // Vectores
        // Declaración
        int vector[] = new int[4];

       /* //Asignación manual
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;*/

        //Asignacion por teclado
       /* Scanner teclado = new Scanner(System.in);
        for (int i=0; i<vector.length; i++) {
            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = Integer.parseInt(teclado.nextLine());
        }

        // Recorrido
        for (int i=0; i<vector.length; i++) {
            System.out.println("Estoy en el índice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("________________________");
        }
        teclado.close; */

        // 2. EJERCICIO INTEGRADOR REGISTRO DE TEMPERATURAS
        // El programa debe pedirle al usuario las 5 temperaturas una por una y guardarlas en el vector.
        //Al final, debe recorrer el vector para calcular y mostrar por consola dos cosas:
        // 1. La temperatura media de esos días. y 2. Cuántos días la temperatura superó los 30°C.

        Scanner teclado = new Scanner(System.in);

        double temperaturas[] = new double[5];
        double sumaTotal = 0.0;
        int diasCalurosos = 0;

        System.out.println("Sistema de Registro Climático");
        System.out.println("=================================");

        //Este For es carga de datos
        for (int i=0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura del día " + (i + 1) + ":");
            temperaturas[i] = Double.parseDouble(teclado.nextLine());
        }

        //Este sera el bucle for de procesamiento de datos
        for (int i=0; i < temperaturas.length; i++) {
            sumaTotal += temperaturas[i];

            if (temperaturas[i] > 30.0) {
                diasCalurosos++;
            }
        }

        double media = sumaTotal / temperaturas.length;

        System.out.println("\n=================================");
        System.out.println("RESUMEN ESTADÍSTICO:");
        System.out.println("La temperatura media fue de: " + media + "°C");
        System.out.println("Días que superaron los 30°C: " + diasCalurosos);

        teclado.close(); // Liberamos memoria
    }
}
