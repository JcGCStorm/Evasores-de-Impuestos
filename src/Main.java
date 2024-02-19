public class Main {
    public static void main(String[] args){
        HVO_MAX hvo       = new HVO_MAX();
        Memeflix memeflix = new Memeflix();
        Momazon momazon   = new Momazon();
        Spootify spootify = new Spootify();
       Usuario alicia = new Usuario("Alicia", 15000.00, 2, 3, 2, 2);
       System.out.println("Dinero Inicial:" +alicia.getDinero());
    hvo.cobrar(alicia);
    memeflix.cobrar(alicia);
    momazon.cobrar(alicia);
    spootify.cobrar(alicia);
        }
}
