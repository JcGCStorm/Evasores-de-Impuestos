public class MemeflixPaqueteCuatro extends Memeflix implements MemeflixCobrador{
    private double precio;
    
    public MemeflixPaqueteCuatro(double precio) {
        this.precio = 200;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}
