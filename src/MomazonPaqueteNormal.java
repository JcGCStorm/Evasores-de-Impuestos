public class MomazonPaqueteNormal extends Momazon implements MomazonCobrador {

    private double precio;
    
    public MomazonPaqueteNormal(double precio) {
        this.precio = 110;
    }

    public double getPrecio() {
        return precio;
    }

    // meses de Momazon = 2


    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción normal de Momazon.");
        usuario.realizarPago(usuario, precio);
    }
}
