public class MemeflixPaqueteCuatro extends Memeflix implements MemeflixCobrador{
 
    public int plan4Disp = 200;

    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Memeflix para cuatro dispositivos de ");
        usuario.realizarPago(plan4Disp);
        usuario.actualizar();
    }
}
