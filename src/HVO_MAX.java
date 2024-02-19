public class HVO_MAX implements Servicio{

    public double pruebaGratuita = 0.0;
    public double planNormal = 140.0;

    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.getHVO_Plan()){
          case 1:
             usuario.setDinero(usuario.getDinero() - pruebaGratuita);
             System.out.println("Su prueba gratuita de HVO_MAX comienza, bienvenid@");
             break;
          case 2:  
             usuario.setDinero(usuario.getDinero() - planNormal);
             System.out.println("Se cobró su membresia\n" + usuario.getDinero()); 
             break;
          default:
             System.out.println("Opcion no valida");
             break;

        }
       }
          
    }
    
    //metodos
