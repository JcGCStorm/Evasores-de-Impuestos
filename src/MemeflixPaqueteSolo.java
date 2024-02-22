public class MemeflixPaqueteSolo extends Memeflix implements MemeflixCobrador {
        private double precio;
    
        public MemeflixPaqueteSolo(double precio) {
            this.precio = 120;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Cobrando " + precio + " por el plan de suscripción.");
        }
    }
