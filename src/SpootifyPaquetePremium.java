public class SpootifyPaquetePremium extends Spootify implements SpootifyCobrador {

    public int planPremiumS = 80;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Spootify PREMIUM de ");
        usuario.realizarPago(planPremiumS);
        usuario.actualizar();
    }
}