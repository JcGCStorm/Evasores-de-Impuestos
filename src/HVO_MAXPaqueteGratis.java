public class HVO_MAXPaqueteGratis extends HVO_MAX implements HVO_MAXCobrador {

    private double precio;
    
    public HVO_MAXPaqueteGratis(double precio) {
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}
