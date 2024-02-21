public class MemeflixPaqueteDos extends Memeflix implements MemeflixCobrador {
 
    public int plan2Disp = 170;

    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Memeflix para dos dispositivos de ");
        usuario.realizarPago(plan2Disp);
        usuario.actualizar();
    }

}