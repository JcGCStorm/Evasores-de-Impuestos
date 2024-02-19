public class Main {
    public static void main(String[] args){
        HVO_MAX hvo = new HVO_MAX();
       Usuario alicia = new Usuario("Alicia", 15000.00, 1);
       System.out.println(alicia.getDinero());
    hvo.cobrar(alicia);
       alicia.setHVO_Plan(2);
    hvo.cobrar(alicia);
        }
}
