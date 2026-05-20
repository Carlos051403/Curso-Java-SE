public class Main {
    public static void main(String[] args) {
        //Reto 1 El Gestor de tiendas (Variables y operadores basicos)
        double camiseta, pantalon, zapatos, total;
        camiseta = 18.7;
        pantalon = 25;
        zapatos = 59.80;

        total = camiseta + pantalon + zapatos;

        System.out.println("El total de su compra es: " + total);
        System.out.println(" ");

        //============================
        //Reto 2: El Descuento (Matematicas un poco más allá
        //============================
        int descuento = 15;
        double precioFinal;

        precioFinal = total - descuento;

        System.out.println("Con su cupón, el precio final se queda en: " + precioFinal);
        System.out.println(" ");

        //============================
        //Reto 3: El Clásico "Intercambio"(Gimnasia Mental)
        //============================
        int a = 5;
        int b = 10;
        int aux;

        System.out.println("-----Antes-----");
        System.out.println("a es: " + a);
        System.out.println("b es: " + b);

        aux = b;
        b = a;
        a = aux;

        System.out.println("-----Después-----");
        System.out.println("a es: " + a);
        System.out.println("b es: " + b);
    }
}