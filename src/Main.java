     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    public static void main(String[] args){

       Usuario alicia = new Usuario("Alicia", 15000, new int[]{0,0,0,0,0}, 
                new MemeflixPaqueteCuatro(), new HVO_MAXPaqueteGratis(), new MomazonPaquetePremium(), 
                new ThisneyPaqueteNormal(), new SpootifyPaqueteGratis());
            alicia.agregar();
       Usuario bob = new Usuario("Bob", 2400, new int[]{0,0,0,0,0}, 
                 new MemeflixPaqueteCuatro(), new HVO_MAXPaqueteNormal(), new MomazonPaquetePremium(),
                 new ThisneyPaqueteNormal(), new SpootifyPaquetePremium());
     //   Usuario cesar = new Usuario("César", 5000, new int[]{0,0,0,0,0}, new HVO_MAXPaqueteNormal(), null, new ThisneyPaqueteNormal(), 
       //                    SinPlan, null);
      HVO_MAX hvo = new HVO_MAX();
    alicia.cobrar();

    }
}
