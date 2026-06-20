package logica;

public class ControladoraLogica {

    public int mugs = 10;
    public int camisetas = 10;
    public int llaveros = 10;

    // Estas funcionan como tuberias para recibir datos de fuera y operar
    public void agregarStock(String producto, int cantidad) {

        //Este if pertenece al case 2 del swich
        if (producto.equalsIgnoreCase("mugs")) {
            mugs += cantidad;
        } else if (producto.equalsIgnoreCase ("camisetas")) {
            camisetas += cantidad;
        } else if (producto.equalsIgnoreCase("llaveros")) {
            llaveros += cantidad;
        } else {
            System.out.println("Producto no existe");
        }
    }

    public void restarStock(String producto, int cantidad) {

        // Este if pertenece al case 3 del swich
        if (producto.equalsIgnoreCase("mugs")) {
            mugs -= cantidad;
        } else if (producto.equalsIgnoreCase ("camisetas")) {
            camisetas -= cantidad;
        } else if (producto.equalsIgnoreCase("llaveros")) {
            llaveros -= cantidad;
        } else {
            System.out.println("Producto no existe");
        }
    }
}
