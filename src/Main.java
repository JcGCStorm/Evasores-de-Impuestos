     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    public static void main(String[] args){

       Usuario alicia = new Usuario("Alicia", 15000, new int[]{0,0,0,0,0}, new MemeflixPaqueteCuatro(), new HVO_MAXPaqueteGratis(),
        new MomazonPaquetePremium(), new ThisneyPaqueteNormal(), new SpootifyPaqueteGratis());
       HVO_MAX hvo = new HVO_MAX();
       Memeflix memeflix = new Memeflix();
       hvo.cobrar(alicia);
       hvo.cobrar(alicia);
       hvo.cobrar(alicia);
       hvo.cobrar(alicia);
       hvo.setNotificacion("Hola quancha");
       System.out.println(hvo.getNotificacion());

    }
}
