public class Memeflix implements Servicio {

   /*
    * Usamos como atributos de la clase los planes disponibles
    * Según las especificaciones de la práctica, en este caso son:
    */
   public double plan1Disp = 120.0;
     public double plan2Disp = 170.0;
     public double plan4Disp = 200.0;


     /**
    * Implementación de la clase Memeflix que sobre escribe al metodo 
    * {@Link #cobrar} y lo implementa según el plan que el usuario elija
    * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
    * @param usuario el usuario al que se le está cobrando el servicio.
    */
     @Override
     public void cobrar(Usuario usuario) {
       switch (usuario.obtenerPlan(1)) {
         case 1:
           usuario.setDinero(usuario.getDinero() - plan1Disp);
           System.out.println("Se cobró su membresia de Memeflix. Total:" + plan1Disp + usuario.getDinero());
           usuario.setMeses(usuario.getMeses() + 1);
           System.out.println("Lleva con nosotros un total de " + usuario.getMeses() + " meses");
           break;
         case 2:
           usuario.setDinero(usuario.getDinero() - plan2Disp);
           System.out.println("Se cobró su membresia de Memeflix. Total:" + plan2Disp + usuario.getDinero());
           usuario.setMeses(usuario.getMeses() + 1);
           System.out.println("Lleva con nosotros un toal de " + usuario.getMeses() + " meses");
           break;
         case 3:
           usuario.setDinero(usuario.getDinero() - plan4Disp);
           System.out.println("Se cobró su membresia de Memeflix. Total:" + plan4Disp + usuario.getDinero());
           usuario.setMeses(usuario.getMeses() + 1);
           System.out.println("Lleva con nosotros un total de " + usuario.getMeses() + "mes/meses");
           break;
         default:
           System.out.println("Opcion no valida");
           break;

       }
     }

   }

   // metodos
