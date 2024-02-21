public class MemeflixPaqueteDos extends Memeflix implements MemeflixCobrador {
 
    public double plan2Disp = 170.0;

    @Override
    public void cobrar(Usuario usuario){
        usuario.setDinero(usuario.getDinero() - plan2Disp);
    }

}