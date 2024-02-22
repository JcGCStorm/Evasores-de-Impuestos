public class SpootifyPaqueteGratis extends Spootify implements SpootifyCobrador {

    public int planGratis = 0;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("La suscripciónn de Spootify gratuita de ");
        usuario.actualizar();
    }
}
