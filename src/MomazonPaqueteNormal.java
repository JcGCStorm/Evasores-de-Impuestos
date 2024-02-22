public class MomazonPaqueteNormal extends Momazon implements MomazonCobrador {

    private double precio;
    
    public MomazonPaqueteNormal(double precio) {
        this.precio = 110;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}
