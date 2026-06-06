import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // -------- CUANTAS VECES APARECE EL NUMERO 3 ----------
        /*int vector [] = new int[15];
        Scanner teclado = new Scanner(System.in);

        for (int i=0; i< vector.length; i++) {
            System.out.println("Ingrese el número del vector: " + i);
            vector [i] = Integer.parseInt(teclado.nextLine());
        }
        int cantRepetida = 0;
        for (int i=0; i< vector.length; i++) {
            if (vector [i] == 3) {
                cantRepetida = cantRepetida + 1;
            }
        }
        System.out.println("El numero 3 se repite: " + cantRepetida + " veces");
        teclado.close();*/

        // ========== RETO INTEGRADOR NOTAS Y PROMEDIOS ===============

        /*Scanner teclado = new Scanner(System.in);
        Double matriz[][] = new Double[4][4];
        Double suma = 0.0;

        // for para carga de nuestra matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length - 1; c++) {
                System.out.println("Ingrese el alumno # " + f);
                matriz[f][c] = Double.parseDouble(teclado.nextLine());
                suma += matriz[f][c];
            }
            int ultimaColumna = matriz[f].length - 1; //Con esto se calcula la ultima columna automaticamente
            int cantidadDatos = matriz[f].length - 1; // Con esto la cantidad de datos exacta

            matriz[f][ultimaColumna] = suma / cantidadDatos; // Guardo el promedio directo sustituyo matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        // for para recorrer
        for (int f = 0; f < matriz.length; f++) {
            System.out.println("Las notas del alumno # " + f + " son: ");
            for (int c = 0; c < matriz.length - 1; c++) {
                System.out.println("Nota # " + c + ": " + matriz[f][c]);
            }
            int ultimaColumna = matriz[f].length - 1; //Hacemos el mismo procedimiento Con esto se calcula la ultima columna automaticamente
            System.out.println("El promedio de las notas es: " +  matriz[f][ultimaColumna]);
        }
        teclado.close();*/

        // 3. ========== EJERCICIO DE RECORRIDO Y CARGAS DE NOMBRES ===============

        String vector[] = new String[8];
        vector[0] = "Gabriel";
        vector[1] = "Adrian";
        vector[2] = "Verusca";
        vector[3] = "Nicol";
        vector[4] = "Papá";
        vector[5] = "Mamá";
        vector[6] = "Abuela";
        vector[7] = "Vero";

        for (int i=0; i< vector.length; i++) {
            System.out.println("El la posición: " + i + " Está el nombre: " + vector[i]);
        }

    }
}