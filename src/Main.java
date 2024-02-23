     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    public static void main(String[] args){

      

       Usuario alicia = new Usuario("Alicia", 15000, new int[]{0,0,0,0,0});
       Usuario bob = new Usuario("Bob", 240, new int[]{0,0,0,0,0}); 
       HVO_MAXPaqueteNormal hvo = new HVO_MAXPaqueteNormal(0);
       HVO_MAXPaqueteGratis hvoGratis = new HVO_MAXPaqueteGratis(0);
       MomazonPaquetePremium momazon = new MomazonPaquetePremium(0);
       MemeflixPaqueteCuatro memeflix = new MemeflixPaqueteCuatro(0);
       ThisneyPaqueteNormal thisney = new ThisneyPaqueteNormal(0);
       ThisneyPaqueteTresMeses thisney3meses = new ThisneyPaqueteTresMeses(0);
       SpootifyPaquetePremium spootify = new SpootifyPaquetePremium(0);
    //   hvo.cobrar(alicia);
   //    momazon.cobrar(alicia);
    //   memeflix.cobrar(alicia);
    //   spootify.cobrar(alicia);
    //   thisney.cobrar(alicia);

   //    hvoGratis.cobrar(bob);
   //    hvoGratis.cobrar(bob);
    //   hvoGratis.cobrar(bob);
   //    hvoGratis.cobrar(bob);
       thisney3meses.cobrar(bob);
       thisney3meses.cobrar(bob);
       thisney3meses.cobrar(bob);
       thisney3meses.cobrar(bob);

     //   Usuario cesar = new Usuario("César", 5000, new int[]{0,0,0,0,0}, new HVO_MAXPaqueteNormal(), null, new ThisneyPaqueteNormal(), 
       //                    SinPlan, null);

    }
}
