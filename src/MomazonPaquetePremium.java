public class MomazonPaquetePremium extends Momazon implements MomazonCobrador {
    private double precio;
    
    public MomazonPaquetePremium(double precio) {
        this.precio = 150;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}
