     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    public static void main(String[] args){

       Usuario alicia = new Usuario("Alicia", 15000, 1, new MemeflixPaqueteCuatro(), new HVO_MAXPaqueteNormal(),
        new MomazonPaquetePremium(), new ThisneyPaqueteNormal(), new SpootifyPaqueteGratis());
       HVO_MAX hvo = new HVO_MAX();
       Memeflix memeflix = new Memeflix();
       hvo.cobrar(alicia);
    }
}
