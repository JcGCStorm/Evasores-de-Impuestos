public class MomazonPaquetePremium extends Momazon implements MomazonCobrador {

    public int planPremium = 150;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Momazon PREMIUM de ");
        usuario.realizarPago(planPremium);
        usuario.actualizar();
    }
}
