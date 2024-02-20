/*
 * La clase HVO_MAX implementa a la interfaz {@Link Servicio] para seguir el patrón
 * Strategy, pues nuestro "ditto"  son los servicios, los cuáles comparten
 * el método {@Link #cobrar}, cada clase cobra de una manera distinta, aunque muy
 * similar una con la otra.
 */

public class HVO_MAX implements Servicio {

   /*
    * Usamos como atributos de la clase los planes disponibles
    * Según las especificaciones de la práctica, en este caso son:
    * - pruebaGratuita que es 0.0 por razones obvias.
    * - planNormal el cuál es el plan principal de HVO_MAX
    */
   public double pruebaGratuita = 0.0;
   public double planNormal = 140.0;
 
   /**
    * Implementación de la clase HVO_MAX que sobre escribe al metodo 
    * {@Link #cobrar} y lo implementa según el plan que el usuario elija
    * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
    * @param usuario el usuario al que se le está cobrando el servicio.
    */
   @Override
   public void cobrar(Usuario usuario) {
     switch (usuario.obtenerPlan(0)) {
       case 1:
       if (usuario.getMeses() <= 3) {
         usuario.setDinero(usuario.getDinero() - pruebaGratuita);
         System.out.println("Esperamos que disfrute de su prueba gratuita de HVO_MAX");
         usuario.setMeses(usuario.getMeses() + 1);
       }
       else {
         System.out.println("Tú prueba gratuita ha expirado, si deseas seguir disfrutando"
           + "de tus servicios PREMIUM considera pagar una de nuestras suscripciones");
       }
         break;
       case 2:
         usuario.setDinero(usuario.getDinero() - planNormal);
         System.out.println("Se cobró su membresia de HVO_MAX. Total:" + planNormal + "\n" + usuario.getDinero());
         usuario.setMeses(usuario.getMeses() + 1);
         System.out.println("Lleva con nosotros un total de " + usuario.getMeses() + " mes/es");
         break;
       default:
         System.out.println("Opcion no valida");
         break;
 
     }
   }
 
 } 
    //metodos
