package logica;

import persistencia.ControladorPersistencia;

public class ControladorLogica {
    ControladorPersistencia controlPersis = new ControladorPersistencia();
   public void validarYRegistrarCliente (String nombre, String dni , int edad) {

       if (edad < 18){
           System.out.println("Acceso denegado. El cliente es menor de edad.");
       } else {
           System.out.println("Edad validada con éxito. Procediendo a guardar...");

           controlPersis.guardarCliente(nombre, dni, edad);
       }
   }
}
