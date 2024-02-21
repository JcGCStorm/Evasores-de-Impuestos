public class MemeflixPaqueteSolo extends Memeflix implements MemeflixCobrador {

    public double plan1Disp = 120.0;
    
    @Override
    public void cobrar(Usuario usuario){
        usuario.setDinero(usuario.getDinero() - plan1Disp);

    }
}
