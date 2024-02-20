public class Main {
    public static void main(String[] args){
        HVO_MAX hvo = new HVO_MAX();
        Memeflix memeflix = new Memeflix();
       Usuario alicia = new Usuario("Alicia", 15000.00, 0, new int[]{0,0,0,0,0,0});
       System.out.println(alicia.getDinero());
      alicia.cambiarPlan(0, 2);
    hvo.cobrar(alicia);
      alicia.cambiarPlan(1, 3);
    memeflix.cobrar(alicia);  
        }
}
