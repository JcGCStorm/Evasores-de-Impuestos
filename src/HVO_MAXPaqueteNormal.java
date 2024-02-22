public class HVO_MAXPaqueteNormal extends HVO_MAX implements HVO_MAXCobrador {

    public int planNormal = 140;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de HVO_MAX con paquete normal de ");
        usuario.realizarPago(planNormal);
        usuario.actualizar();
    }

    @Override
    public String getNotificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNotificacion'");
    }
}
