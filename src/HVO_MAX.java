public class HVO_MAX implements Servicio{

    public double pruebaGratuita = 0.0;
    public double planNormal = 140;

    @Override
    public void cobrar(Usuario usuario){ 
        switch(usuario.getHVO_Plan()){
          case 1:
             usuario.setDinero(usuario.getDinero() - pruebaGratuita);
             System.out.println("Su prueba gratuita de HVO_MAX comienza");
             break;
          case 2:  
             usuario.setDinero(usuario.getDinero() - planNormal); 
        }
       }
    }
    
    //metodos
