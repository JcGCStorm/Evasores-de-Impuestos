public class Memeflix implements Servicio {
   public double plan1Disp = 120.0;
     public double plan2Disp = 170.0;
     public double plan4Disp = 200.0;

     @Override
     public void cobrar(Usuario usuario) {
       switch (usuario.obtenerPlan(1)) {
         case 1:
           usuario.setDinero(usuario.getDinero() - plan1Disp);
           System.out.println("Se cobró su membresia\n" + usuario.getDinero());
           usuario.setMeses(usuario.getMeses() + 1);
           System.out.println("Lleva con nosotros un toal de " + usuario.getMeses() + " meses");
           break;
         case 2:
           usuario.setDinero(usuario.getDinero() - plan2Disp);
           System.out.println("Se cobró su membresia\n" + usuario.getDinero());
           usuario.setMeses(usuario.getMeses() + 1);
           System.out.println("Lleva con nosotros un toal de " + usuario.getMeses() + " meses");
           break;
         case 3:
           usuario.setDinero(usuario.getDinero() - plan4Disp);
           System.out.println("Se cobró su membresia\n" + usuario.getDinero());
           usuario.setMeses(usuario.getMeses() + 1);
           System.out.println("Lleva con nosotros un total de " + usuario.getMeses());
           break;
         default:
           System.out.println("Opcion no valida");
           break;

       }
     }

   }

   // metodos
