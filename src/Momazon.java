public class Momazon implements MemeflixCobrador {

   /*
    * Usamos como atributos de la clase los planes disponibles
    * Según las especificaciones de la práctica, en este caso son:
    */
    public double planNormal  = 110.0;
    public double planPremium = 150.0;

    /**
    * Implementación de la clase Momazon que sobre escribe al metodo 
    * {@Link #cobrar} y lo implementa según el plan que el usuario elija
    * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
    * @param usuario el usuario al que se le está cobrando el servicio.
    */
    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.obtenerPlan(2)){ 
          case 1:
             usuario.setDinero(usuario.getDinero() - planNormal);
             System.out.println("Se cobró su membresia para un dispositivo\n Precio:" +planNormal +
                                "\nAquí algunas recomendaciones:");
            System.out.println(usuario.getDinero());
             break;
          case 2:  
             usuario.setDinero(usuario.getDinero() - planPremium);
             System.out.println("Se cobró su membresia para dos dispositivos. Total:" +planPremium +
                                 "\nAquí algunas recomendaciones:");
             System.out.println(usuario.getDinero());
             break;  
          default:
             System.out.println("Opcion no valida");
             break;

        }
     }
}
