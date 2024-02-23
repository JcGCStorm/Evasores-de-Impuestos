import java.util.List;
public class SpootifyPaquetePremium extends Spootify implements SpootifyCobrador {

    private double precio;
    
    public SpootifyPaquetePremium(double precio) {
        this.precio = 80;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            SpootifyPaquetePremium spoti = new SpootifyPaquetePremium(precio);
            // Realizar alguna acción con el usuario actual
            spoti.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }
    // meses de Spootify = 3

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción PREMIUM de Spootify.");
        usuario.realizarPago(usuario, precio);
    }
}