import java.util.List;
public class ThisneyPaqueteNormal extends Thisney implements ThisneyCobrador {

    private double precio;
    
        public ThisneyPaqueteNormal(double precio) {
            this.precio = 160;
        }
    
        public double getPrecio() {
            return precio;
        }

        public void procesarUsuarios(List<Usuario> usuarios) {
            for (Usuario usuario : usuarios) {
                ThisneyPaqueteNormal thisney = new ThisneyPaqueteNormal(precio);
                // Realizar alguna acción con el usuario actual
                thisney.cobrar(usuario);
                // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
            }
        }
    
           // meses de Thisney = 4
         
        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción de Thisney.");
            usuario.realizarPago(usuario, precio);
        }
}