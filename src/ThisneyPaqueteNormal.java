public class ThisneyPaqueteNormal extends Thisney implements ThisneyCobrador {

    public int planNormalD = 160;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Thisney normal para dos dispositivos de ");
        usuario.realizarPago(planNormalD);
        usuario.actualizar();
    }
}