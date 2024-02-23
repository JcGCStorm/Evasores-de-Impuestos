import java.util.List;
public class MomazonPaquetePremium extends Momazon implements MomazonCobrador {
    private double precio;
    
    public MomazonPaquetePremium(double precio) {
        this.precio = 150;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            MomazonPaquetePremium momazon = new MomazonPaquetePremium(precio);
            // Realizar alguna acción con el usuario actual
            momazon.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }

        // meses de Momazon = 2

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción PREMIUM de Momazon.");
        usuario.realizarPago(usuario, precio);
    }
}
