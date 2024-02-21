public class MemeflixPaqueteSolo extends Memeflix implements MemeflixCobrador {

    public int plan1Disp = 120;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Memeflix con paquete individual de ");
        usuario.realizarPago(plan1Disp);
        usuario.actualizar();
    }
}
