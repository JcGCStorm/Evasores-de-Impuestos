public class ThisneyPaqueteNormal extends Thisney implements ThisneyCobrador {

    private double precio;
    
        public ThisneyPaqueteNormal(double precio) {
            this.precio = 160;
        }
    
        public double getPrecio() {
            return precio;
        }
    
           // meses de Thisney = 4
         
        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Cobrando " + precio + " por el plan de suscripción de Thisney.");
            usuario.realizarPago(usuario, precio);
        }
}