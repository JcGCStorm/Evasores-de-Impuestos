import java.util.List;
public class MemeflixPaqueteSolo extends Memeflix implements MemeflixCobrador {
        private double precio;
    
        public MemeflixPaqueteSolo(double precio) {
            this.precio = 120;
        }
    
        public double getPrecio() {
            return precio;
        }

        public void procesarUsuarios(List<Usuario> usuarios) {
            for (Usuario usuario : usuarios) {
                MemeflixPaqueteSolo thisney = new MemeflixPaqueteSolo(precio);
                // Realizar alguna acción con el usuario actual
                thisney.cobrar(usuario);
                // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
            }
        }
    
        // meses de Memeflix = 1

        @Override
        public void cobrar(Usuario usuario) {
            System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción para un dispositivo de HVO_MAX.");
            usuario.realizarPago(usuario, precio);
        }
    }
