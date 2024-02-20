     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    public static void main(String[] args){

        /**
         * Creamos objetos del tipo de cada clase de los servicios y 1 del usuario
         * Además de instanciar valores para guardar en el arreglo del usuario, dicho
         * número nos va a ser de utilidad pues nos indica el plan que tiene el usuario
         * contratado.
         */
        HVO_MAX hvo = new HVO_MAX();
          int planHVO = 0;
        Memeflix memeflix = new Memeflix();
          int planMemeflix = 1;
        Momazon momazon = new Momazon();
          int planMomazon = 2;  
        Spootify spootify = new Spootify();
          int planSpootify = 3;
       Usuario alicia = new Usuario("Alicia", 15000.00, 0, new int[]{0,0,0,0,0});

       /**
        * Estp es solo de prueba, luego lo acomodamos
        */
       System.out.println(alicia.getDinero());
      alicia.cambiarPlan(planHVO, 2);
    hvo.cobrar(alicia);
      alicia.cambiarPlan(planMemeflix, 3);
    memeflix.cobrar(alicia);  
      alicia.cambiarPlan(planMomazon, 2);
    momazon.cobrar(alicia);
      alicia.cambiarPlan(planSpootify, 2);  
    spootify.cobrar(alicia);
    spootify.cobrar(alicia);
      alicia.cambiarPlan(planHVO, 1);
    hvo.cobrar(alicia);
        }
}
