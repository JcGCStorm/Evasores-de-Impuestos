public class Momazon implements Servicio {
    public double planNormal  = 110.0;
    public double planPremium = 150.0;

    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.obtenerPlan(4)){ 
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
