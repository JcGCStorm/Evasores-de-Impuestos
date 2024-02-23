     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    public static void main(String[] args){

      

       Usuario alicia = new Usuario("Alicia", 15000, new int[]{0,0,0,0,0});
       Usuario bob = new Usuario("Bob", 2400, new int[]{0,0,0,0,0}); 
       alicia.realizarPago(alicia, 12000);
       alicia.realizarPago(alicia, 3000);
     //   Usuario cesar = new Usuario("César", 5000, new int[]{0,0,0,0,0}, new HVO_MAXPaqueteNormal(), null, new ThisneyPaqueteNormal(), 
       //                    SinPlan, null);

    }
}
