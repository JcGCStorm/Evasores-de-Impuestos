public class MemeflixPaqueteCuatro extends Memeflix implements MemeflixCobrador{
 
    public double plan4Disp = 200.0;

    @Override
    public void cobrar(Usuario usuario){
        usuario.setDinero(usuario.getDinero() - plan4Disp);
        System.out.println("Total de Memeflix:" + usuario.getDinero());
    }
}
