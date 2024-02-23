public class MomazonPaquetePremium extends Momazon implements MomazonCobrador {
    private double precio;
    
    public MomazonPaquetePremium(double precio) {
        this.precio = 150;
    }

    public double getPrecio() {
        return precio;
    }

        // meses de Momazon = 2

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción PREMIUM de Momazon.");
        usuario.realizarPago(usuario, precio);
    }
}
