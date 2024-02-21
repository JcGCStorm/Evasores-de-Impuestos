public class MomazonPaqueteNormal extends Momazon implements MomazonCobrador {

    public int planNormal = 110;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Momazon individual de ");
        usuario.realizarPago(planNormal);
        usuario.actualizar();
    }
}
