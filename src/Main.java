public class Main {
    public static void main (String[] args) {
        //RETO DE ARBOLITO CON ASCII

        // Declarar la altura del arbol
        int altura = 20;

        //bucle para recorrer las filas (altura)
        for ( int fila=0; fila<altura; fila++) {

            //bucle para los espacios
            for (int espacio=0; espacio<(altura-fila-1); espacio++) {
                System.out.print(" ");
            }
            //bucle para los asteriscos
            for (int asterisco=0; asterisco<(fila*2)+1; asterisco++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Tronco
        int largoTronco = 1;
        for (int base=0; base<largoTronco; base++) {

        }
        // Espacios Blanco
        for (int espacio=0; espacio<(altura-2); espacio++ ){
            System.out.print(" ");
        }
        //Barritas tronco
        for (int tronco=0; tronco<3; tronco++) {
            System.out.print("|");
        }
        System.out.println("");
    }
}