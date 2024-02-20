public class Spootify implements Servicio{
    public double planGratuito  = 0.0;
    public double planPremium   = 80.0;

    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.obtenerPlan(5)){ 
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
             System.out.println(usuario.getDinero());
             break;
          default:
             System.out.println("Opcion no valida");
             break;

        }
    }
}
