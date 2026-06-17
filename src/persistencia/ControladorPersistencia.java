package persistencia;

public class ControladorPersistencia {
    public void guardarCliente (String nombre, String dni, int edad) {
        System.out.println("Guardando datos de forma permanente...");
        System.out.println("Cliente registrado: " + nombre + " DNI: " + dni + " Edad: " + edad);
        System.out.println("¡Guardado con éxito!");
    }
}
