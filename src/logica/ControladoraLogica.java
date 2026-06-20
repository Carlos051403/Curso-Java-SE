package logica;

public class ControladoraLogica {
    public int agua = 1000;
    public int cafe = 500;
    public int vasos = 10;

    public boolean servirCafe (String tipoCafe){
        boolean pedidoCorrecto = false;

        if (tipoCafe.equalsIgnoreCase("Expreso")) {
            agua -= 50;
            cafe -= 15;
            pedidoCorrecto = true;
        } else if (tipoCafe.equalsIgnoreCase("Largo")) {
            agua -= 100;
            cafe -= 20;
            pedidoCorrecto = true;
        }
        if (pedidoCorrecto) {
            vasos -= 1;
        }
        return pedidoCorrecto;
    }

    public boolean recargarSuministros (String producto, int cantidad){
        boolean productoCorrecto = false;

        if (producto.equalsIgnoreCase("agua")) {
            agua += cantidad;
            productoCorrecto = true;
        } else if (producto.equalsIgnoreCase("cafe")) {
            cafe += cantidad;
            productoCorrecto = true;
        } else if (producto.equalsIgnoreCase("vasos")) {
            vasos += cantidad;
            productoCorrecto = true;
        }
        return productoCorrecto;
    }
}


