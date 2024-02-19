public class Memeflix implements Servicio{
    public double plan1Disp  = 120.0;
    public double plan2Disp = 170.0;
    public double plan4Disp = 200.0;

    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.getPlanMemeflix()){ 
          case 1:
             usuario.setDinero(usuario.getDinero() - plan1Disp);
             System.out.println("Se cobró su membresia para un dispositivo de Memeflix" +plan1Disp +
                                "\n Aquí algunas recomendaciones;");
             break;
          case 2:  
             usuario.setDinero(usuario.getDinero() - plan2Disp);
             System.out.println("Se cobró su membresia para dos dispositivos de Memeflix, con precio de:" +plan2Disp + 
                               "Aquí algunas recomendaciones");
             System.out.println(usuario.getDinero());
             break;
          case 3:  
             usuario.setDinero(usuario.getDinero() - plan4Disp);
             System.out.println("Se cobró su membresia para cuatro dispositivos de Memeflix, con precio de:" +plan4Disp +
                                "\n Aquí algunas recomendaciones");
             System.out.println(usuario.getDinero());
             break;   
          default:
             System.out.println("Opcion no valida");
             break;

        }
       }
}
