public class Spootify implements MemeflixCobrador{

   /*
    * Usamos como atributos de la clase los planes disponibles
    * Según las especificaciones de la práctica, en este caso son:
    */
    public double planGratuito  = 0.0;
    public double planPremium   = 80.0;


    /**
    * Implementación de la clase Spootifyque sobre escribe al metodo 
    * {@Link #cobrar} y lo implementa según el plan que el usuario elija
    * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
    * @param usuario el usuario al que se le está cobrando el servicio.
    */
    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.obtenerPlan(3)){ 
          case 1:
             usuario.setDinero(usuario.getDinero() - planGratuito);
             System.out.println("Su plan es gratuito pero con anuncios" +
                                "\n Aquí algunas recomendaciones:");
            System.out.println(usuario.getDinero());
             break;
          case 2:  
             usuario.setDinero(usuario.getDinero() - planPremium);
             System.out.println("Se cobró su membresia premium, gracias por usar spootify Total:" +planPremium +
                                "\n Aquí algunas recomendaciones:");
            usuario.setMeses(usuario.getMeses() + 1);
            System.out.println("Lleva con nosotros un total de " + usuario.getMeses() + " mes/es");
             System.out.println(usuario.getDinero());
             break;
          default:
             System.out.println("Opcion no valida");
             break;

        }
    }
}
