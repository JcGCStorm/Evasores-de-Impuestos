public class MemeflixPaqueteSolo extends Memeflix implements MemeflixCobrador {
        private double precio;
    
        public MemeflixPaqueteSolo(double precio) {
            this.precio = 120;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        // meses de Memeflix = 1

        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Cobrando " + precio + " por el plan de suscripción para un dispositivo de HVO_MAX.");
            usuario.realizarPago(usuario, precio);
        }
    }
