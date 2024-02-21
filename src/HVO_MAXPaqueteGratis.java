public class HVO_MAXPaqueteGratis extends HVO_MAX implements HVO_MAXCobrador {

    public int planGratis = 0;
    Servicios servicio;
    Cliente cliente;

    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de HVO_MAX con paquete gratis de ");
        usuario.realizarPago(planGratis);
        usuario.actualizar();
    }

}
