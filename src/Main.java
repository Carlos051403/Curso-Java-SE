import java.util.Scanner; //Traer la herramienta de escucha

public class Main {
    public static void main (String[] args){
        //RETO 1: EL CONTROL DE PUERTA (IF/ESLSE)

        // Se crea el micrófono llamado teclado o leer
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingrese la edad del cliente:");

        //Atrapamos el dato ingresado por el usuario
        int edad = teclado.nextInt();

        if (edad < 18) {
            System.out.println("Acceso Denegado!");
        }
        else if (edad == 18){
            System.out.println("Acceso permitido. ¡Felicidades por tu mayoría de edad, tienes una consumición gratis!");
        }
        else {
            System.out.println("Acceso permitido. Bienvenido al salón!");
        }
        teclado.close(); // Recomendado profesionalmente para liberar memoria, ya que apaga el teclado
    }
}