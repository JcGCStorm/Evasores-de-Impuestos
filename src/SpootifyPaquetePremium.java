public class SpootifyPaquetePremium extends Spootify implements SpootifyCobrador {

    private double precio;
    
    public SpootifyPaquetePremium(double precio) {
        this.precio = 80;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}