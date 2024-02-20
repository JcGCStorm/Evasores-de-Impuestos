public class HVO_MAX implements Servicio {

   public double pruebaGratuita = 0.0;
   public double planNormal = 140.0;
 
   @Override
   public void cobrar(Usuario usuario) {
     switch (usuario.obtenerPlan(0)) {
       case 1:
         usuario.setDinero(usuario.getDinero() - pruebaGratuita);
         System.out.println("Su prueba gratuita de HVO_MAX comienza, bienvenid@");
         usuario.setMeses(usuario.getMeses() + 1);
         System.out.println("Lleva con nosotros un toal de " + usuario.getMeses() + " meses");
         break;
       case 2:
         usuario.setDinero(usuario.getDinero() - planNormal);
         System.out.println("Se cobró su membresia\n" + usuario.getDinero());
         usuario.setMeses(usuario.getMeses() + 1);
         System.out.println("Lleva con nosotros un toal de " + usuario.getMeses() + " meses");
         break;
       default:
         System.out.println("Opcion no valida");
         break;
 
     }
   }
 
 } 
    //metodos
