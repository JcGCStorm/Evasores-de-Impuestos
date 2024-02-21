public class Momazon extends Servicios {

   /**
    * Implementación de la clase Momazon que sobre escribe al metodo
    * {@Link #cobrar} y lo implementa según el plan que el usuario elija
    * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
    * 
    * @param usuario el usuario al que se le está cobrando el servicio.
    */
 
   /* Objeto de contexto. */
 
   public void cobrar(Usuario usuario) {
     MomazonCobrador plan = usuario.getPlanMomazon();
     plan.cobrar(usuario);
   }
 }
 
 // metodos
 
