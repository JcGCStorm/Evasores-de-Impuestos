public class ThisneyPaqueteTresMeses extends Thisney implements ThisneyCobrador {
    private double precio;
    
    public ThisneyPaqueteTresMeses(double precio) {
        this.precio = 130;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción.");
    }
}