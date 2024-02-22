public class SpootifyPaqueteGratis extends Spootify implements SpootifyCobrador {    
    
    private double precio;
    
    public SpootifyPaqueteGratis(double precio) {
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
