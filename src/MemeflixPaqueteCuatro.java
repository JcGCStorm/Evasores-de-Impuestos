public class MemeflixPaqueteCuatro extends Memeflix implements MemeflixCobrador{
    private double precio = 200;
    
    public MemeflixPaqueteCuatro(double precio) {
        this.precio = 200;
    }

    public double getPrecio() {
        return precio;
    }

// meses de Memeflix = 1

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción para cuatro dispositivos de Memeflix.");
        usuario.realizarPago(usuario, precio);
    }
}
