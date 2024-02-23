public class ThisneyPaqueteNormal extends Thisney implements ThisneyCobrador {

    private double precio;
    
        public ThisneyPaqueteNormal(double precio) {
            this.precio = 160;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Cobrando " + precio + " por el plan de suscripción.");
        }
}